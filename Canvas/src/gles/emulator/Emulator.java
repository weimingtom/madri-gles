/**
 * 
 */
package gles.emulator;

import gles.internal.Sys;
import gles.internal.Sys.SDK;

import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import android.app.Activity;
import android.app.ActivityHelper;
import android.opengl.*;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.InputDevice;
import android.view.MotionEvent;

/**
 * The emulator Window.
 * TODO make it as simple and used as Java3D's MainFrame
 * @author Alessandro Borges
 *
 */
@SuppressWarnings("serial")
public class Emulator extends JFrame {

   
    protected static String SUB_TITLE = "GLES Emulator"; 
    protected static String DIV = " - ";
    protected CanvasEGL myCanvasEGL;
    protected JPanel controlPanel;
    
    /**
     * Window Size
     */
    protected int mHeight = 480, mWidth=512;

    /**
     * 
     * @param title
     * @throws HeadlessException
     */
    public Emulator(String title) throws HeadlessException {
        super(SUB_TITLE + DIV + title);
        jbInit();
    }
    
    /**
     * 
     * @param title
     * @param app
     * @param width
     * @param height
     */
    public Emulator(String title, Activity app, int width, int height) {
        super(SUB_TITLE + DIV +  title);  
        this.mHeight = height;
        this.mWidth = width;
        addActivity(app);
        jbInit();
        
    }
    
    /**
     * 
     * @param title
     * @param app
     * @param gc
     * @param width
     * @param height
     */
    public Emulator(String title, Activity app, GraphicsConfiguration gc, int width, int height) {
        super(SUB_TITLE + DIV +  title, gc);  
        this.mHeight = height;
        this.mWidth = width;
        addActivity(app);
        jbInit();
        
    }

   
    protected void jbInit(){        
        Dimension size = new Dimension(mWidth, mHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myCanvasEGL = new CanvasEGL();
        Sys.saveCanvas(myCanvasEGL);
        myCanvasEGL.setPreferredSize(size);  
      
        setLayout(new BorderLayout());
        add(myCanvasEGL,BorderLayout.CENTER);
        pack();
        //this.setResizable(false);
        
        addWindowListener(myWindowAdapter);
        this.setVisible(true);
        
      //  checkWM();
    }
    
    /**
     * Called when windows is opened, it calls a invoke later 
     * CanvasEGL.nativeBinding(); 
     */
   protected void opened(){
       System.out.println("Window opened");
       this.setAutoRequestFocus(true);
       this.toFront();
       
       // TODO - let the GLThread do it, in lazy mode       
       SwingUtilities.invokeLater(runJAWT);       
       
       if(app != null){
           if(Activity.ActivityStatus.NONE == app.getCurrentState()){               
               app.onCreate(savedInstanceState);
               app.getCanvasEGL().onCreate();
               app.onStart();
               app.getCanvasEGL().requestLayout();
               app.onRestoredInstanceState(savedInstanceState);
               app.onResume();
           }          
       }       
    }
    
    /**
     * Called when window is closing.
     */
    protected void closing(){
        System.out.println("Window closing");
        
        if(app!=null){
            if(Activity.ActivityStatus.RUNNING == app.getCurrentState()){
                app.onPause();                
            }
            if(Activity.ActivityStatus.PAUSED == app.getCurrentState()){               
                app.onStop();               
            }
            if(Activity.ActivityStatus.STOPPED == app.getCurrentState()){
                app.getCanvasEGL().onDestroy();
                app.onDestroy();               
            }            
        }
        
        if (doEGLCheck) {
            EGL14LogWrapper egl = new EGL14LogWrapper(false, false, System.out);
            EGLDisplay eglDisplay = myCanvasEGL.getEGLDisplay();
            if (eglDisplay == null) {
                eglDisplay = egl.eglGetCurrentDisplay();
            }
            EGLContext eglCtx = (EGLContext) egl.eglGetCurrentContext();
            egl.eglDestroyContext(eglDisplay, eglCtx);
            egl.eglTerminate(eglDisplay);
        }
    }
   
   /**
    * Action to perform when Emulator is minimized 
    */
   protected void minimized(){
        System.out.println("Window minimized");
        if(app != null){
            if(Activity.ActivityStatus.RUNNING == app.getCurrentState()){
                app.onSaveInstanceState(savedInstanceState);
                app.onPause();
            }
        }
    }
   
   /**
    * action to perform when Emulator is restores from minimized state
    */
    protected void maximized(){
        System.out.println("Window maximized");
        if(app != null){
            if(Activity.ActivityStatus.PAUSED == app.getCurrentState()){
              //  app.onSaveInstanceState();
                app.onResume();
            }
        }
    }
    
    
    
    final WindowAdapter myWindowAdapter = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e){
            closing();
        }
        
        @Override
        public void windowOpened(WindowEvent e){           
             opened();
        }
        
        @Override
        public void windowIconified(WindowEvent e){           
            minimized();
       }       
        
        @Override
        public void windowDeiconified(WindowEvent e){           
            maximized();
       }   
    };
    
    /**
     * Maps a AWT mouse click to Android's onTouch event
     * @param ev
     */
     protected void onTouch(MouseEvent ev){
         long eventTime = SystemClock.uptimeMillis();
         long downTime =  eventTime;
         int action = MotionEvent.ACTION_DOWN;
         int x = ev.getX();
         int y = ev.getY();
         float pressure = 0.5f;
         float size = 0.1f;
         int metaState = 0;
         float xPrecision = 0.1f;
         float yPrecision = 0.1f;
         int deviceId = InputDevice.GLES_MOUSE;
         int edgeFlags = 0;
         
       MotionEvent andMotionEvent = MotionEvent.obtain(downTime, eventTime, action, x, y, pressure, size, metaState, xPrecision, yPrecision, deviceId, edgeFlags);
       app.onTouch(andMotionEvent);
     }
    
    /**
     * 
     */
    final Runnable runJAWT = new Runnable() {
        @Override
        public void run() {            
            myCanvasEGL.nativeBinding();
            if(doEGLCheck){
                myCanvasEGL.lockCanvas();
               
                GLESInfo info = new GLESInfo();            
                myCanvasEGL.unlockCanvasAndPost(null);
                System.out.println(info.toString());
            }
           
        }
    };
    
    
    void print(String msg) {
        //display.append(msg + newline);
        System.out.println(msg);
    }

    /**
     * Add a activity to emulate
     * @param app
     */
    public void addActivity(Activity app){
        this.app = new ActivityHelper(app);
    }
    
    /**
     * prepare app running
     */
    @Deprecated
    public void runApp(){
        Bundle bundle = new Bundle();
        
        app.onCreate(bundle);
        app.onStart();
        Thread.yield();
        
    }
    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
      
        final Runnable doRun =  new Runnable() {
            public void run() {
                Log.i("EMULATOR", "starting main()");
                Sys.setSDK(SDK.PowerVR);
                final Emulator emulator = new Emulator("Emulator");                
            }
        };           
        SwingUtilities.invokeLater(doRun);
    }

    /**
     * The wrapped Activity
     */
    private ActivityHelper app;
    /**
     * Activity's Bundle 
     * TODO - to something with this
     */
    private Bundle savedInstanceState = new Bundle();
    
    private final boolean doEGLCheck = false;
      
    
}