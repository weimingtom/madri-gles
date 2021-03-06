/*

**    Place holder for disclaimer.
*/

package gles.internal;

import static android.opengl.GLES20.*;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

import android.opengl.GLES20;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

import gles.emulator.Sys;
import gles.util.BufferInfo;

/**
 * OpenGL ES 2.0
 */
public class GLES20Pipeline 
 implements Pipeline, GLCommon {
      
   
        
        /** Includes **/
        //@off
        /*JNI
          #include <GLES2/gl2.h>
          #include <GLES2/gl2ext.h>
          #include <stdio.h>
          #include <stdlib.h>
          #include <vector>
          
          using namespace std;
          
          ////////////////////////////////////////
         */
        
        /**
         * static & native initialization
         */
        static{  }
        
        /**
         * Private constructor
         */
        protected GLES20Pipeline(){}

        /**
         * 
         */
        private static Pipeline instance;
        
    /**
     * Get a instance of this Pipeline implementation
     * 
     * @return a live instance of GLES10EXT
     */
    public static Pipeline getPipelineInstance() {
        if (instance == null) {
            instance = new GLES20Pipeline();
        }
        return instance;
    }
    
    

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("GLES20Pipeline [ ");
        
        if(Sys.isNativeLibsLoaded() && Sys.isGL20()){
        try {
            String vendor = glGetString(GLES20.GL_VENDOR);
            String version = glGetString(GLES20.GL_VERSION);
            
            builder.append("Vendor: ").append(vendor);
            builder.append(", Version: ").append(version);
            
        } catch (Exception e) {
           e.printStackTrace();
        }
        }
        builder.append("]");
        return builder.toString();
    }



    /**
     *<pre>
     * Delegate Method generated from GLES20._nativeClassInit();
     * 
     *  C function void glActiveTexture((GLenum) texture )

     * */
    protected static void GLES20ClassInit() {
        nGLES20ClassInit();
    }

    /**
     *<pre>
     * Native method generated from GLES20._nativeClassInit();
     * 
     *  C function void glActiveTexture((GLenum) texture )

     * */
    private static native void nGLES20ClassInit();/*  
         // hold
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glActiveTexture([int texture]);
     * 
     *  C function void glActiveTexture((GLenum) texture )

     * */
    public void glActiveTexture(int texture) {
        GLES20Pipeline.nGLActiveTexture(texture);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glActiveTexture([int texture]);
     * 
     *  C function void glActiveTexture((GLenum) texture )

     * */
    private static native void nGLActiveTexture(int texture);/*
                    glActiveTexture((GLenum) texture );
     */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glAttachShader([int program, int shader]);
     * 
     *  C function void glAttachShader((GLuint) program, (GLuint) shader )

     * */
    public void glAttachShader(int program, int shader) {
        GLES20Pipeline.nGLAttachShader(program, shader);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glAttachShader([int program, int shader]);
     * 
     *  C function void glAttachShader((GLuint) program, (GLuint) shader );

     * */
    private static native void nGLAttachShader(int program, int shader);/*
       glAttachShader((GLuint) program, (GLuint) shader );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glBindAttribLocation([int program, int index, String name]);
     * 
     *  C function void glBindAttribLocation((GLuint) program, (GLuint) index, const char *name )

     * */
    public void glBindAttribLocation(int program, int index, String name) {
        GLES20Pipeline.nGLBindAttribLocation(program, index, name);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glBindAttribLocation([int program, int index, String name]);
     * 
     *  C function void glBindAttribLocation((GLuint) program, (GLuint) index, const char *name );

     * */
    private static native void nGLBindAttribLocation(int program, int index, String name);/*            
                    glBindAttribLocation((GLuint) program, (GLuint) index, name);
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glBindBuffer([int target, int buffer]);
     * 
     *  C function void glBindBuffer((GLenum) target, (GLuint) buffer )

     * */
    public void glBindBuffer(int target, int buffer) {
        GLES20Pipeline.nGLBindBuffer(target, buffer);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glBindBuffer([int target, int buffer]);
     * 
     *  C function void glBindBuffer((GLenum) target, (GLuint) buffer )

     * */
    private static native void nGLBindBuffer(int target, int buffer);/*
            glBindBuffer((GLenum) target, (GLuint) buffer );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glBindFramebuffer([int target, int framebuffer]);
     * 
     *  C function void glBindFramebuffer((GLenum) target, (GLuint) framebuffer )

     * */
    public void glBindFramebuffer(int target, int framebuffer) {
        GLES20Pipeline.nGLBindFramebuffer(target, framebuffer);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glBindFramebuffer([int target, int framebuffer]);
     * 
     *  C function void glBindFramebuffer((GLenum) target, (GLuint) framebuffer )

     * */
    private static native void nGLBindFramebuffer(int target, int framebuffer);/*
            glBindFramebuffer((GLenum) target, (GLuint) framebuffer );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glBindRenderbuffer([int target, int renderbuffer]);
     * 
     *  C function void glBindRenderbuffer((GLenum) target, (GLuint) renderbuffer )

     * */
    public void glBindRenderbuffer(int target, int renderbuffer) {
        GLES20Pipeline.nGLBindRenderbuffer(target, renderbuffer);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glBindRenderbuffer([int target, int renderbuffer]);
     * 
     *  C function void glBindRenderbuffer((GLenum) target, (GLuint) renderbuffer )

     * */
    private static native void nGLBindRenderbuffer(int target, int renderbuffer);/*
          glBindRenderbuffer((GLenum) target, (GLuint) renderbuffer ); 
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glBindTexture([int target, int texture]);
     * 
     *  C function void glBindTexture((GLenum) target, (GLuint) texture )

     * */
    public void glBindTexture(int target, int texture) {
        GLES20Pipeline.nGLBindTexture(target, texture);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glBindTexture([int target, int texture]);
     * 
     *  C function void glBindTexture((GLenum) target, (GLuint) texture )

     * */
    private static native void nGLBindTexture(int target, int texture);/*
            glBindTexture((GLenum) target, (GLuint) texture );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glBlendColor([float red, float green, float blue, float alpha]);
     * 
     *  C function void glBlendColor(GLclampf red, GLclampf green, GLclampf blue, GLclampf alpha )

     * */
    public void glBlendColor(float red, float green, float blue, float alpha) {
        GLES20Pipeline.nGLBlendColor(red, green, blue, alpha);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glBlendColor([float red, float green, float blue, float alpha]);
     * 
     *  C function void glBlendColor(GLclampf red, GLclampf green, GLclampf blue, GLclampf alpha )

     * */
    private static native void nGLBlendColor(float red, float green, float blue, float alpha);/*
            glBlendColor((GLclampf) red, 
                           (GLclampf) green, 
                           (GLclampf) blue, 
                           (GLclampf) alpha );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glBlendEquation([int mode]);
     * 
     *  C function void glBlendEquation((GLenum) mode )

     * */
    public void glBlendEquation(int mode) {
        GLES20Pipeline.nGLBlendEquation(mode);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glBlendEquation([int mode]);
     * 
     *  C function void glBlendEquation((GLenum) mode )

     * */
    private static native void nGLBlendEquation(int mode);/*
                    glBlendEquation((GLenum) mode );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glBlendEquationSeparate([int modeRGB, int modeAlpha]);
     * 
     *  C function void glBlendEquationSeparate((GLenum) modeRGB, (GLenum) modeAlpha )

     * */
    public void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
        GLES20Pipeline.nGLBlendEquationSeparate(modeRGB, modeAlpha);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glBlendEquationSeparate([int modeRGB, int modeAlpha]);
     * 
     *  C function void glBlendEquationSeparate((GLenum) modeRGB, (GLenum) modeAlpha )

     * */
    private static native void nGLBlendEquationSeparate(int modeRGB, int modeAlpha);/*
           glBlendEquationSeparate((GLenum) modeRGB, (GLenum) modeAlpha );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glBlendFunc([int sfactor, int dfactor]);
     * 
     *  C function void glBlendFunc((GLenum) sfactor, (GLenum) dfactor )

     * */
    public void glBlendFunc(int sfactor, int dfactor) {
        GLES20Pipeline.nGLBlendFunc(sfactor, dfactor);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glBlendFunc([int sfactor, int dfactor]);
     * 
     *  C function void glBlendFunc((GLenum) sfactor, (GLenum) dfactor )

     * */
    private static native void nGLBlendFunc(int sfactor, int dfactor);/*
            glBlendFunc((GLenum) sfactor, (GLenum) dfactor );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glBlendFuncSeparate([int srcRGB, int dstRGB, int srcAlpha, int dstAlpha]);
     * 
     *  C function void glBlendFuncSeparate((GLenum) srcRGB, (GLenum) dstRGB, (GLenum) srcAlpha, (GLenum) dstAlpha )

     * */
    public void glBlendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        GLES20Pipeline.nGLBlendFuncSeparate(srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glBlendFuncSeparate([int srcRGB, int dstRGB, int srcAlpha, int dstAlpha]);
     * 
     *  C function void glBlendFuncSeparate((GLenum) srcRGB, (GLenum) dstRGB, (GLenum) srcAlpha, (GLenum) dstAlpha )

     * */
    private static native void nGLBlendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);/*
            glBlendFuncSeparate((GLenum) srcRGB, (GLenum) dstRGB, (GLenum) srcAlpha, (GLenum) dstAlpha );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glBufferData([int target, int size, java.nio.Buffer data, int usage]);
     * 
     *  C function void glBufferData((GLenum) target, GLsizeiptr size, const GLvoid *data, (GLenum) usage )

     * */
    public void glBufferData(int target,
                             int size,
                             java.nio.Buffer data,
                             int usage) {
        // data can be null !
        if(null==data){
            nGLBufferData(target, size, usage);
            return;
        }
        
        int shift = BufferInfo.getElementSizeShift(data);
        // size in bytes!
        checkBuffer(data, size<<shift, DATA);

        // now, the offset...
        if (data.isDirect()) {
            int offsetBytes = getOffset(data);
            nGLBufferData(target, size, data, offsetBytes, usage);
        } else {
            if(data instanceof ByteBuffer){
                ByteBuffer bb = (ByteBuffer)data;
                int offset = getOffset(bb);
                byte[] array = bb.array();
                nGLBufferData(target, size, array, offset, usage);
                return;
            }else if(data instanceof ShortBuffer){
                ShortBuffer bb = (ShortBuffer)data;
                int offset = getOffset(bb);
                short[] array = bb.array();
                nGLBufferData(target, size, array, offset, usage);
                return;
            }else if(data instanceof IntBuffer){
                IntBuffer bb = (IntBuffer)data;
                int offset = getOffset(bb);
                int[] array = bb.array();
                nGLBufferData(target, size, array, offset, usage);
                return;
            }else  if(data instanceof FloatBuffer){
                FloatBuffer bb = (FloatBuffer)data;
                int offset = getOffset(bb);
                float[] array = bb.array();
                nGLBufferData(target, size, array, offset, usage);
                return;
            }else 
            throw new RuntimeException("Invalid buffer.");
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glBufferData([int target, int size, java.nio.Buffer data, int usage]);
     * 
     *  C function void glBufferData((GLenum) target, GLsizeiptr size, const GLvoid *data, (GLenum) usage )

     * */
    private static native void nGLBufferData(int target, int size, java.nio.Buffer data, int offsetBytes, int usage);/*
         glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
    */
    
    private static native void nGLBufferData(int target, int size,  int usage);/*
      glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(NULL), (GLenum) usage );
    */
    
    private static native void nGLBufferData(int target, int size, byte[] data, int offsetBytes, int usage);/*
        glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
    */
  
    private static native void nGLBufferData(int target, int size, short[] data, int offsetBytes, int usage);/*
        glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
    */
    
    private static native void nGLBufferData(int target, int size, int[] data, int offsetBytes, int usage);/*
       glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
      */
    
    private static native void nGLBufferData(int target, int size, float[] data, int offsetBytes, int usage);/*
    glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
   */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glBufferSubData([int target, int offset, int size, java.nio.Buffer data]);
     * 
     *  C function void glBufferSubData((GLenum) target, GLintptr offset, GLsizeiptr size, const GLvoid *data )
     * */
    public void glBufferSubData(int target,
                                int offset,
                                int size,
                                java.nio.Buffer data) {
        
        int shift = BufferInfo.getElementSizeShift(data);
        // size in bytes!
        checkBuffer(data, size<<shift, DATA);
        // now, the offset...
        if (data.isDirect()) {
            int offsetBytes = getOffset(data);
            GLES20Pipeline.nGLBufferSubData(target,
                    offset, size,
                    data, offsetBytes);
        } else {
           if(data instanceof ByteBuffer){
               ByteBuffer bb = (ByteBuffer) data;
               byte[] array = bb.array();
               int offsetBuf = getOffset(bb);
               GLES20Pipeline.nGLBufferSubData(target,
                       offset, size,
                       array, offsetBuf);
               return;               
           }else if(data instanceof IntBuffer){
               IntBuffer bb = (IntBuffer) data;
               int[] array = bb.array();
               int offsetBuf = getOffset(bb);
               GLES20Pipeline.nGLBufferSubData(target,
                       offset, size,
                       array, offsetBuf);
               return;               
           }else if(data instanceof ShortBuffer){
               ShortBuffer bb = (ShortBuffer) data;
               short[] array = bb.array();
               int offsetBuf = getOffset(bb);
               GLES20Pipeline.nGLBufferSubData(target,
                       offset, size,
                       array, offsetBuf);
               return;               
           }else if(data instanceof FloatBuffer){
               FloatBuffer bb = (FloatBuffer) data;
               float[] array = bb.array();
               int offsetBuf = getOffset(bb);
               GLES20Pipeline.nGLBufferSubData(target,
                       offset, size,
                       array, offsetBuf);
               return;               
           }else throw new IllegalArgumentException("Invalid buffer.");
        }

    }

    /**
     *<pre>
     * Native method generated from GLES20.glBufferSubData([int target, int offset, int size, java.nio.Buffer data]);
     * 
     *  C function void glBufferSubData((GLenum) target, GLintptr offset, GLsizeiptr size, const GLvoid *data )

     * */
    private static native void nGLBufferSubData(int target, int offset, int size, java.nio.Buffer data, int offsetBytes);/*
                    glBufferSubData((GLenum) target, 
                                      (GLintptr) offset, 
                                      (GLsizeiptr) size, 
                                      (GLvoid *)(data + offsetBytes));
    */
    private static native void nGLBufferSubData(int target, int offset, int size);/*
    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(NULL));
   */
    
    private static native void nGLBufferSubData(int target, int offset, int size, byte[] data, int offsetBytes);/*
    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(data + offsetBytes));
   */
    
    private static native void nGLBufferSubData(int target, int offset, int size, short[] data, int offsetBytes);/*
    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(data + offsetBytes));
   */
    
    private static native void nGLBufferSubData(int target, int offset, int size, int[] data, int offsetBytes);/*
    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(data + offsetBytes));
   */
    
    private static native void nGLBufferSubData(int target, int offset, int size, float[] data, int offsetBytes);/*
    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(data + offsetBytes));
   */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glCheckFramebufferStatus([int target]);
     * 
     *  C function (GLenum) glCheckFramebufferStatus((GLenum) target )
     * */
    public int glCheckFramebufferStatus(int target) {
            return  nGLCheckFramebufferStatus(target);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glCheckFramebufferStatus([int target]);
     * 
     *  C function (GLenum) glCheckFramebufferStatus((GLenum) target )
     * */
    private static native int nGLCheckFramebufferStatus(int target);/*
          return (jint)glCheckFramebufferStatus((GLenum) target );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glClear([int mask]);
     * 
     *  C function void glClear(GLbitfield mask )

     * */
    public void glClear(int mask) {
        GLES20Pipeline.nGLClear(mask);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glClear([int mask]);
     * 
     *  C function void glClear(GLbitfield mask )

     * */
    private static native void nGLClear(int mask);/*
        glClear((GLbitfield) mask );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glClearColor([float red, float green, float blue, float alpha]);
     * 
     *  C function void glClearColor(GLclampf red, GLclampf green, GLclampf blue, GLclampf alpha )

     * */
    public void glClearColor(float red, float green, float blue, float alpha) {
        GLES20Pipeline.nGLClearColor(red, green, blue, alpha);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glClearColor([float red, float green, float blue, float alpha]);
     * 
     *  C function void glClearColor(GLclampf red, GLclampf green, GLclampf blue, GLclampf alpha )

     * */
    private static native void nGLClearColor(float red, float green, float blue, float alpha);/*
          glClearColor((GLclampf) red, (GLclampf) green, (GLclampf) blue, (GLclampf) alpha );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glClearDepthf([float depth]);
     * 
     *  C function void glClearDepthf(GLclampf depth )

     * */
    public void glClearDepthf(float depth) {
        GLES20Pipeline.nGLClearDepthf(depth);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glClearDepthf([float depth]);
     * 
     *  C function void glClearDepthf(GLclampf depth )
     * */
    private static native void nGLClearDepthf(float depth);/*
            glClearDepthf((GLclampf) depth );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glClearStencil([int s]);
     * 
     *  C function void glClearStencil((GLint) s )
     * */
    public void glClearStencil(int s) {
        GLES20Pipeline.nGLClearStencil(s);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glClearStencil([int s]);
     * 
     *  C function void glClearStencil((GLint) s )
     * */
    private static native void nGLClearStencil(int s);/*
            glClearStencil((GLint) s );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glColorMask([boolean red, boolean green, boolean blue, boolean alpha]);
     * 
     *  C function void glColorMask((GLboolean)  red, (GLboolean)  green, (GLboolean)  blue, (GLboolean)  alpha )
     * */
    public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        GLES20Pipeline.nGLColorMask(red, green, blue, alpha);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glColorMask([boolean red, boolean green, boolean blue, boolean alpha]);
     * 
     *  C function void glColorMask((GLboolean)  red, (GLboolean)  green, (GLboolean)  blue, (GLboolean)  alpha )

     * */
    private static native void nGLColorMask(boolean red, boolean green, boolean blue, boolean alpha);/*
              glColorMask((GLboolean)  red, (GLboolean)  green, (GLboolean)  blue, (GLboolean)  alpha );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glCompileShader([int shader]);
     * 
     *  C function void glCompileShader((GLuint) shader )

     * */
    public void glCompileShader(int shader) {
        GLES20Pipeline.nGLCompileShader(shader);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glCompileShader([int shader]);
     * 
     *  C function void glCompileShader((GLuint) shader )

     * */
    private static native void nGLCompileShader(int shader);/*
                    glCompileShader((GLuint) shader );
    */

    /**
     *<pre>
     * Delegate Method generated from 
     *    GLES20.glCompressedTexImage2D([int target, int level, int internalformat, int width, int height, int border, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexImage2D((GLenum) target, (GLint) level, (GLenum) internalformat, (GLsizei) width, (GLsizei) height, (GLint) border, (GLsizei) imageSize, const GLvoid *data )

     * */
    public void glCompressedTexImage2D(int target,
                                       int level,
                                       int internalformat,
                                       int width,  int height,
                                       int border,
                                       int imageSize,
                                       java.nio.Buffer data) {

        checkBuffer(data,imageSize, true, DATA);        
        if (data.isDirect()) {
            int offsetBytes = BufferInfo.getOffsetInBytes(data);
            nGLCompressedTexImage2D(target, level,
                    internalformat,
                    width, height,
                    border,  imageSize,
                    data,  offsetBytes);
        } else {
            if(data instanceof ByteBuffer){
                ByteBuffer bb = (ByteBuffer) data;
                byte[] array = bb.array();
                int offsetBuf = getOffset(bb);
                nGLCompressedTexImage2D(target, level,
                        internalformat,
                        width, height,
                        border,  imageSize,
                        array,  offsetBuf);
                return;               
            }else if(data instanceof IntBuffer){
                IntBuffer bb = (IntBuffer) data;
                int[] array = bb.array();
                int offsetBuf = getOffset(bb);
                nGLCompressedTexImage2D(target, level,
                        internalformat,
                        width, height,
                        border,  imageSize,
                        array,  offsetBuf);
                return;               
            }else if(data instanceof ShortBuffer){
                ShortBuffer bb = (ShortBuffer) data;
                short[] array = bb.array();
                int offsetBuf = getOffset(bb);
                nGLCompressedTexImage2D(target, level,
                        internalformat,
                        width, height,
                        border,  imageSize,
                        array,  offsetBuf);
                return;               
            }else throw new IllegalArgumentException("Invalid buffer.");
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glCompressedTexImage2D([int target, int level, int internalformat, int width, int height, int border, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexImage2D((GLenum) target, 
     *  (GLint) level, 
     *  (GLenum) internalformat, 
     *  (GLsizei) width, 
     *  (GLsizei) height, 
     *  (GLint) border, 
     *  (GLsizei) imageSize,
     *   const GLvoid *data )

     * */
    private static native void nGLCompressedTexImage2D(int target, 
                    int level, 
                    int internalformat, 
                    int width,        int height, 
                    int border, 
                    int imageSize, 
                    java.nio.Buffer data, int offsetBytes);/*            
            // raw java.nio.Buffer is translated as (char *)
           glCompressedTexImage2D((GLenum) target, 
                                  (GLint) level,
                                  (GLenum) internalformat,
                                  (GLsizei) width, (GLsizei) height,
                                  (GLint) border,
                                  (GLsizei) imageSize,
                                 (GLvoid *) (data + offsetBytes));
    */
    
    private static native void nGLCompressedTexImage2D(int target, 
                                                       int level, 
                                                       int internalformat, 
                                                       int width,        int height, 
                                                       int border, 
                                                       int imageSize, 
                                                       byte[] data, int offsetBytes);/*            
        // raw java.nio.Buffer is translated as (char *)
        glCompressedTexImage2D((GLenum) target, 
                               (GLint) level,
                               (GLenum) internalformat,
                               (GLsizei) width, (GLsizei) height,
                               (GLint) border,
                               (GLsizei) imageSize,
                               (GLvoid *) (data + offsetBytes));
     */
    
    private static native void nGLCompressedTexImage2D(int target, 
                                                       int level, 
                                                       int internalformat, 
                                                       int width,        int height, 
                                                       int border, 
                                                       int imageSize, 
                                                       short[] data, int offsetBytes);/*            
       // raw java.nio.Buffer is translated as (char *)
        glCompressedTexImage2D((GLenum) target, 
                               (GLint) level,
                               (GLenum) internalformat,
                               (GLsizei) width, (GLsizei) height,
                               (GLint) border,
                               (GLsizei) imageSize,
                              (GLvoid *) (data + offsetBytes));
     */
    
    private static native void nGLCompressedTexImage2D(int target, 
                                                       int level, 
                                                       int internalformat, 
                                                       int width,        int height, 
                                                       int border, 
                                                       int imageSize, 
                                                       int[] data, int offsetBytes);/*            
        // raw java.nio.Buffer is translated as (char *)
        glCompressedTexImage2D((GLenum) target, 
                               (GLint) level,
                               (GLenum) internalformat,
                               (GLsizei) width, (GLsizei) height,
                               (GLint) border,
                               (GLsizei) imageSize,
                              (GLvoid *) (data + offsetBytes));
       */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glCompressedTexSubImage2D(
     * [int target, int level,
     *  int xoffset, int yoffset, 
     *  int width, int height, int format, 
     *  int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexSubImage2D((GLenum) target, 
     *                                            (GLint) level, 
     *                                            (GLint) xoffset, (GLint) yoffset,
     *                                            (GLsizei) width, (GLsizei) height, 
     *                                            (GLenum) format, (GLsizei) imageSize, 
     *                                            const GLvoid *data );
     * */
    public void glCompressedTexSubImage2D(int target,
                                          int level,
                                          int xoffset, int yoffset,
                                          int width,   int height,
                                          int format,
                                          int imageSize,
                                          java.nio.Buffer data) {  
                
        checkBuffer(data, imageSize, true, DATA);
        if (data.isDirect()) {
            int offsetBytes = BufferInfo.getOffsetInBytes(data);
            nGLCompressedTexSubImage2D( target, level,
                    xoffset, yoffset,
                    width,   height,
                    format,  imageSize,
                    data,   offsetBytes);
        } else {
            if(data instanceof ByteBuffer){
                ByteBuffer bb = (ByteBuffer) data;
                byte[] array = bb.array();
                int offsetBuf = getOffset(bb);
                nGLCompressedTexSubImage2D( target, level,
                        xoffset, yoffset,
                        width,   height,
                        format,  imageSize,
                        array,   offsetBuf);
                return;               
            }else if(data instanceof IntBuffer){
                IntBuffer bb = (IntBuffer) data;
                int[] array = bb.array();
                int offsetBuf = getOffset(bb);
                nGLCompressedTexSubImage2D( target, level,
                        xoffset, yoffset,
                        width,   height,
                        format,  imageSize,
                        array,   offsetBuf);
                return;               
            }else if(data instanceof ShortBuffer){
                ShortBuffer bb = (ShortBuffer) data;
                short[] array = bb.array();
                int offsetBuf = getOffset(bb);
                nGLCompressedTexSubImage2D( target, level,
                        xoffset, yoffset,
                        width,   height,
                        format,  imageSize,
                        array,   offsetBuf);
                return;               
            }else throw new IllegalArgumentException("Invalid buffer.");
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glCompressedTexSubImage2D([int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexSubImage2D(
     *                                          GLenum target, 
     *                                          GLint level, 
     *                                          GLint xoffset, 
     *                                          GLint yoffset, 
     *                                          GLsizei width, 
     *                                          GLsizei height, 
     *                                          GLenum format, 
     *                                          GLsizei imageSize, 
     *                                          const GLvoid *data )
     * */
    private static native void nGLCompressedTexSubImage2D(
                    int target, 
                    int level, 
                    int xoffset,         int yoffset, 
                    int width,         int height, 
                    int format, 
                    int imageSize, 
                    java.nio.Buffer data, int offsetBytes);/*
                    //native code                    
                    glCompressedTexSubImage2D(
                                            (GLenum) target,
                                            (GLint) level, 
                                            (GLint) xoffset, 
                                            (GLint) yoffset, 
                                            (GLsizei) width, 
                                            (GLsizei) height, 
                                            (GLenum) format, 
                                            (GLsizei) imageSize, 
                                            (GLvoid *) (data + offsetBytes) );                    
    */
    
    private static native void nGLCompressedTexSubImage2D( int target, 
                                                          int level, 
                                                          int xoffset,         int yoffset, 
                                                          int width,         int height, 
                                                          int format, 
                                                          int imageSize, 
                                                          byte[] data, int offsetBytes);/*                                                                       
         glCompressedTexSubImage2D ((GLenum) target,
                                    (GLint) level, 
                                    (GLint) xoffset, 
                                    (GLint) yoffset, 
                                    (GLsizei) width, 
                                    (GLsizei) height, 
                                    (GLenum) format, 
                                    (GLsizei) imageSize, 
                                    (GLvoid *) (data + offsetBytes) );                    
      */
    
    private static native void nGLCompressedTexSubImage2D( int target, 
                                                           int level, 
                                                           int xoffset, int yoffset, 
                                                           int width,   int height, 
                                                           int format, 
                                                           int imageSize, 
                                                           short[] data, int offsetBytes);/*                                                                       
          glCompressedTexSubImage2D ((GLenum) target,
                                     (GLint) level, 
                                     (GLint) xoffset, (GLint) yoffset, 
                                     (GLsizei) width, (GLsizei) height, 
                                     (GLenum) format, 
                                     (GLsizei) imageSize, 
                                     (GLvoid *) (data + offsetBytes) );                    
       */
    
    private static native void nGLCompressedTexSubImage2D( int target, 
                                                           int level, 
                                                           int xoffset, int yoffset, 
                                                           int width,   int height, 
                                                           int format, 
                                                           int imageSize, 
                                                           int[] data, int offsetBytes);/*                                                                       
          glCompressedTexSubImage2D ((GLenum) target,
                                     (GLint) level, 
                                     (GLint) xoffset, (GLint) yoffset, 
                                     (GLsizei) width, (GLsizei) height, 
                                     (GLenum) format, 
                                     (GLsizei) imageSize, 
                                     (GLvoid *) (data + offsetBytes) );                    
       */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glCopyTexImage2D([int target, int level, int internalformat, int x, int y, int width, int height, int border]);
     * 
     *  C function void glCopyTexImage2D((GLenum) target, (GLint) level, (GLenum) internalformat, (GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height, (GLint) border )

     * */
    public void glCopyTexImage2D(int target, 
                                 int level, 
                                 int internalformat, 
                                 int x, int y, 
                                 int width, int height, 
                                 int border) {
        GLES20Pipeline.nGLCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glCopyTexImage2D([int target, int level, int internalformat, int x, int y, int width, int height, int border]);
     * 
     *  C function void glCopyTexImage2D((GLenum) target, (GLint) level, (GLenum) internalformat, (GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height, (GLint) border )

     * */
    private static native void nGLCopyTexImage2D(
                    int target, 
                    int level, 
                    int internalformat, 
                    int x, 
                    int y, 
                    int width, 
                    int height, 
                    int border);/*
                    //native code
                            glCopyTexImage2D(
                                            (GLenum) target, 
                                            (GLint) level,
                                            (GLenum) internalformat,
                                            (GLint) x, 
                                            (GLint) y, 
                                            (GLsizei) width, 
                                            (GLsizei) height, 
                                            (GLint) border );
                    
                    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glCopyTexSubImage2D([int target, int level, int xoffset, int yoffset, int x, int y, int width, int height]);
     * 
     *  C function void glCopyTexSubImage2D((GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height )

     * */
    public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        GLES20Pipeline.nGLCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glCopyTexSubImage2D([int target, int level, int xoffset, int yoffset, int x, int y, int width, int height]);
     * 
     *  C function void glCopyTexSubImage2D((GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height )

     * */
    private static native void nGLCopyTexSubImage2D(
                    int target, 
                    int level, 
                    int xoffset, 
                    int yoffset, 
                    int x, 
                    int y, 
                    int width, 
                    int height);/*
                    
                            glCopyTexSubImage2D (
                            (GLenum) target, 
                            (GLint) level, 
                            (GLint) xoffset, (GLint) yoffset, 
                            (GLint) x,       (GLint) y, 
                            (GLsizei) width, (GLsizei) height );
    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glCreateProgram();
     * 
     *  C function (GLuint) glCreateProgram(void )

     * */
    public int glCreateProgram() {
            return   GLES20Pipeline.nGLCreateProgram();
    }

    /**
     *<pre>
     * Native method generated from GLES20.glCreateProgram();
     * 
     *  C function (GLuint) glCreateProgram(void )

     * */
    private static native int nGLCreateProgram();/*
                    return (jint)glCreateProgram();
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glCreateShader([int type]);
     * 
     *  C function (GLuint) glCreateShader((GLenum) type )

     * */
    public int glCreateShader(int type) {
            return  GLES20Pipeline.nGLCreateShader(type);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glCreateShader([int type]);
     * 
     *  C function (GLuint) glCreateShader((GLenum) type )

     * */
    private static native int nGLCreateShader(int type);/*
            return (jint) glCreateShader((GLenum) type );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glCullFace([int mode]);
     * 
     *  C function void glCullFace((GLenum) mode )

     * */
    public void glCullFace(int mode) {
        GLES20Pipeline.nGLCullFace(mode);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glCullFace([int mode]);
     * 
     *  C function void glCullFace((GLenum) mode )

     * */
    private static native void nGLCullFace(int mode);/*
                    glCullFace((GLenum) mode );
    
    */
    

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDeleteBuffers([int n, int[] buffers, int offset]);
     * 
     *  C function void glDeleteBuffers((GLsizei) n, const (GLuint) *buffers )

     * */
    public void glDeleteBuffers(int n, int[] buffers, int offset) {
        GLES20Pipeline.nGLDeleteBuffers(n, buffers, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDeleteBuffers([int n, int[] buffers, int offset]);
     * 
     *  C function void glDeleteBuffers((GLsizei) n, const (GLuint) *buffers )

     * */
    private static native void nGLDeleteBuffers(int n, int[] buffers, int offset);/*
                    // native
                    glDeleteBuffers((GLsizei) n, ( GLuint *) (buffers + offset) );
    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDeleteBuffers([int n, java.nio.IntBuffer buffers]);
     * 
     *  C function void glDeleteBuffers((GLsizei) n, const (GLuint) *buffers )

     * */
    public void glDeleteBuffers(int n, java.nio.IntBuffer buffers) {

        checkBuffer(buffers, n, BUFFERS);
        int offset = getOffset(buffers);

        if (buffers.isDirect()) {
            GLES20Pipeline.nGLDeleteBuffers(n, buffers, offset);
        } else {
            int[] array = buffers.array();
            GLES20Pipeline.nGLDeleteBuffers(n, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDeleteBuffers([int n, java.nio.IntBuffer buffers]);
     * 
     *  C function void glDeleteBuffers((GLsizei) n, const (GLuint) *buffers )

     * */
    private static native void nGLDeleteBuffers(int n, java.nio.IntBuffer buffers, int offset);/*
            glDeleteBuffers((GLsizei) n, (const GLuint *) (buffers + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDeleteFramebuffers([int n, int[] framebuffers, int offset]);
     * 
     *  C function void glDeleteFramebuffers((GLsizei) n, const (GLuint) *framebuffers )

     * */
    public void glDeleteFramebuffers(int n, int[] framebuffers, int offset) {
        checkArray(framebuffers, offset, n, FRAMEBUFFER);
        GLES20Pipeline.nGLDeleteFramebuffers(n, framebuffers, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDeleteFramebuffers([int n, int[] framebuffers, int offset]);
     * 
     *  C function void glDeleteFramebuffers((GLsizei) n, const (GLuint) *framebuffers )

     * */
    private static native void nGLDeleteFramebuffers(int n, int[] framebuffers, int offset);/*
      glDeleteFramebuffers((GLsizei) n, (GLuint *) (framebuffers + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDeleteFramebuffers([int n, java.nio.IntBuffer framebuffers]);
     * 
     *  C function void glDeleteFramebuffers((GLsizei) n, const (GLuint) *framebuffers )

     * */
    public void glDeleteFramebuffers(int n, java.nio.IntBuffer framebuffers) {
        checkBuffer(framebuffers, n, FRAMEBUFFER);
        int offset = getOffset(framebuffers);
        // now, the offset...
        if (framebuffers.isDirect()) {
            nGLDeleteFramebuffers(n, framebuffers, offset);
        } else {
            nGLDeleteFramebuffers(n, framebuffers.array(), offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDeleteFramebuffers([int n, java.nio.IntBuffer framebuffers]);
     * 
     *  C function void glDeleteFramebuffers((GLsizei) n, const (GLuint) *framebuffers )

     * */
    private static native void nGLDeleteFramebuffers(int n, java.nio.IntBuffer framebuffers, int offset);/*
            glDeleteFramebuffers((GLsizei) n, (const GLuint *) (framebuffers + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDeleteProgram([int program]);
     * 
     *  C function void glDeleteProgram((GLuint) program )

     * */
    public void glDeleteProgram(int program) {
        GLES20Pipeline.nGLDeleteProgram(program);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDeleteProgram([int program]);
     * 
     *  C function void glDeleteProgram((GLuint) program )

     * */
    private static native void nGLDeleteProgram(int program);/*
      glDeleteProgram((GLuint) program );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDeleteRenderbuffers([int n, int[] renderbuffers, int offset]);
     * 
     *  C function void glDeleteRenderbuffers((GLsizei) n, const (GLuint) *renderbuffers )

     * */
    public void glDeleteRenderbuffers(int n, int[] renderbuffers, int offset) {
        checkArray(renderbuffers, offset, n, RENDERBUFFER);
        GLES20Pipeline.nGLDeleteRenderbuffers(n, renderbuffers, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDeleteRenderbuffers([int n, int[] renderbuffers, int offset]);
     * 
     *  C function void glDeleteRenderbuffers((GLsizei) n, const (GLuint) *renderbuffers )

     * */
    private static native void nGLDeleteRenderbuffers(int n, int[] renderbuffers, int offset);/*    
          glDeleteRenderbuffers((GLsizei) n, ( GLuint *) (renderbuffers + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDeleteRenderbuffers([int n, java.nio.IntBuffer renderbuffers]);
     * 
     *  C function void glDeleteRenderbuffers((GLsizei) n, const (GLuint) *renderbuffers )

     * */
    public void glDeleteRenderbuffers(int n, java.nio.IntBuffer renderbuffers) {
        checkBuffer(renderbuffers, n, RENDERBUFFER);
        int offset = getOffset(renderbuffers);
        // now, the offset...
        if (renderbuffers.isDirect()) {
            GLES20Pipeline.nGLDeleteRenderbuffers(n, renderbuffers, offset);
        } else {
            GLES20Pipeline.nGLDeleteRenderbuffers(n, renderbuffers.array(), offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDeleteRenderbuffers([int n, java.nio.IntBuffer renderbuffers]);
     * 
     *  C function void glDeleteRenderbuffers((GLsizei) n, const (GLuint) *renderbuffers )

     * */
    private static native void nGLDeleteRenderbuffers(int n, java.nio.IntBuffer renderbuffers, int offset);/*                            
           glDeleteRenderbuffers((GLsizei) n,(const GLuint *) (renderbuffers + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDeleteShader([int shader]);
     * 
     *  C function void glDeleteShader((GLuint) shader )

     * */
    public void glDeleteShader(int shader) {
        GLES20Pipeline.nGLDeleteShader(shader);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDeleteShader([int shader]);
     * 
     *  C function void glDeleteShader((GLuint) shader )
     * */
    private static native void nGLDeleteShader(int shader);/*
         glDeleteShader((GLuint) shader );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDeleteTextures([int n, int[] textures, int offset]);
     * 
     *  C function void glDeleteTextures((GLsizei) n, const GLuint *textures )

     * */
    public void glDeleteTextures(int n, int[] textures, int offset) {
        checkArray(textures, offset, n, TEXTURES);
        GLES20Pipeline.nGLDeleteTextures(n, textures, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDeleteTextures([int n, int[] textures, int offset]);
     * 
     *  C function void glDeleteTextures((GLsizei) n, const (GLuint) *textures )

     * */
    private static native void nGLDeleteTextures(int n, int[] textures, int offset);/*
      glDeleteTextures((GLsizei) n,(GLuint *) (textures + offset));                                              
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDeleteTextures([int n, java.nio.IntBuffer textures]);
     * 
     *  C function void glDeleteTextures((GLsizei) n, const (GLuint) *textures )

     * */
    public void glDeleteTextures(int n, java.nio.IntBuffer textures) {
        checkBuffer(textures, n, TEXTURES);
        int offset = getOffset(textures);
        if (textures.isDirect()) {
            GLES20Pipeline.nGLDeleteTextures(n, textures, offset);
        } else {
            GLES20Pipeline.nGLDeleteTextures(n, textures.array(), offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDeleteTextures([int n, java.nio.IntBuffer textures]);
     * 
     *  C function void glDeleteTextures((GLsizei) n, const (GLuint) *textures )

     * */
    private static native void nGLDeleteTextures(int n, java.nio.IntBuffer textures, int offset);/*
         glDeleteTextures((GLsizei) n, (const GLuint *)(textures + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDepthFunc([int func]);
     * 
     *  C function void glDepthFunc((GLenum) func )

     * */
    public void glDepthFunc(int func) {
        GLES20Pipeline.nGLDepthFunc(func);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDepthFunc([int func]);
     * 
     *  C function void glDepthFunc((GLenum) func )

     * */
    private static native void nGLDepthFunc(int func);/*
            glDepthFunc((GLenum) func );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDepthMask([boolean flag]);
     * 
     *  C function void glDepthMask((GLboolean)  flag )

     * */
    public void glDepthMask(boolean flag) {
        GLES20Pipeline.nGLDepthMask(flag);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDepthMask([boolean flag]);
     * 
     *  C function void glDepthMask((GLboolean)  flag )

     * */
    private static native void nGLDepthMask(boolean flag);/*
            glDepthMask((GLboolean)  flag );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDepthRangef([float zNear, float zFar]);
     * 
     *  C function void glDepthRangef(GLclampf zNear, GLclampf zFar )

     * */
    public void glDepthRangef(float zNear, float zFar) {
        GLES20Pipeline.nGLDepthRangef(zNear, zFar);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDepthRangef([float zNear, float zFar]);
     * 
     *  C function void glDepthRangef(GLclampf zNear, GLclampf zFar )

     * */
    private static native void nGLDepthRangef(float zNear, float zFar);/*
            glDepthRangef((GLclampf) zNear, (GLclampf) zFar );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDetachShader([int program, int shader]);
     * 
     *  C function void glDetachShader((GLuint) program, (GLuint) shader )

     * */
    public void glDetachShader(int program, int shader) {
        GLES20Pipeline.nGLDetachShader(program, shader);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDetachShader([int program, int shader]);
     * 
     *  C function void glDetachShader((GLuint) program, (GLuint) shader )

     * */
    private static native void nGLDetachShader(int program, int shader);/*
             glDetachShader((GLuint) program, (GLuint) shader );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDisable([int cap]);
     * 
     *  C function void glDisable((GLenum) cap )

     * */
    public void glDisable(int cap) {
        GLES20Pipeline.nGLDisable(cap);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDisable([int cap]);
     * 
     *  C function void glDisable((GLenum) cap )

     * */
    private static native void nGLDisable(int cap);/*
        glDisable((GLenum) cap );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDisableVertexAttribArray([int index]);
     * 
     *  C function void glDisableVertexAttribArray((GLuint) index )

     * */
    public void glDisableVertexAttribArray(int index) {
        GLES20Pipeline.nGLDisableVertexAttribArray(index);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDisableVertexAttribArray([int index]);
     * 
     *  C function void glDisableVertexAttribArray((GLuint) index )

     * */
    private static native void nGLDisableVertexAttribArray(int index);/*
         glDisableVertexAttribArray((GLuint) index );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDrawArrays([int mode, int first, int count]);
     * 
     *  C function void glDrawArrays((GLenum) mode, (GLint) first, (GLsizei) count )

     * */
    public void glDrawArrays(int mode, int first, int count) {
        GLES20Pipeline.nGLDrawArrays(mode, first, count);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDrawArrays([int mode, int first, int count]);
     * 
     *  C function void glDrawArrays((GLenum) mode, (GLint) first, (GLsizei) count )

     * */
    private static native void nGLDrawArrays(int mode, int first, int count);/*
       glDrawArrays((GLenum) mode, (GLint) first, (GLsizei) count );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDrawElements([int mode, int count, int type, int offset]);
     * 
     *  C function void glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type, (GLint) offset )

     * */
    public void glDrawElements(int mode, int count, int type, int offset) {
        GLES20Pipeline.nGLDrawElements(mode, count, type, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDrawElements([int mode, int count, int type, int offset]);
     * 
     *  C function void glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type, (GLint) offset )

     * */
    private static native void nGLDrawElements(int mode, int count, int type, int offset);/*
            glDrawElements((GLenum) mode,
                           (GLsizei) count, 
                           (GLenum) type, 
                           reinterpret_cast<GLvoid *>(offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glDrawElements([int mode, int count, int type, java.nio.Buffer indices]);
     * 
     *  C function void glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type, const GLvoid *indices )

     * */
    public void glDrawElements(int mode, int count, int type, java.nio.Buffer indices) {
        
        checkBuffer(indices, count, INDICES);
        if (indices.isDirect()) {
            int offset = getOffset(indices);
            nGLDrawElements(mode, count, type, indices, offset);
        } else {
            if(indices instanceof ByteBuffer){
                ByteBuffer bb = (ByteBuffer)indices;
                int offset = getOffset(bb);
                byte[] array = bb.array();
                nGLDrawElements(mode, count, type, array, offset);
                return;
            }else if(indices instanceof ShortBuffer){
                ShortBuffer bb = (ShortBuffer)indices;
                int offset = getOffset(bb);
                short[] array = bb.array();
                nGLDrawElements(mode, count, type, array, offset);
                return;
            }else if(indices instanceof IntBuffer){
                IntBuffer bb = (IntBuffer)indices;
                int offset = getOffset(bb);
                int[] array = bb.array();
                nGLDrawElements(mode, count, type, array, offset);
                return;
            }else 
            throw new RuntimeException("Invalid buffer.");
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glDrawElements([int mode, int count, int type, java.nio.Buffer indices]);
     * 
     *  C function void glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type, const GLvoid *indices )

     * */
    private static native void nGLDrawElements(int mode, int count, int type, java.nio.Buffer indices, int offset);/*    
          glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type,(GLvoid *) (indices + offset) );
    */
    
    private static native void nGLDrawElements(int mode, int count, int type, byte[] indices, int offset);/*    
           glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type,(GLvoid *) (indices + offset) );
     */
    
    private static native void nGLDrawElements(int mode, int count, int type, short[] indices, int offset);/*    
           glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type,(GLvoid *) (indices + offset) );
     */
    
    private static native void nGLDrawElements(int mode, int count, int type, int[] indices, int offset);/*    
           glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type,(GLvoid *) (indices + offset) );
    */
    
   
    /**
     *<pre>
     * Delegate Method generated from GLES20.glEnable([int cap]);
     * 
     *  C function void glEnable((GLenum) cap )

     * */
    public void glEnable(int cap) {
        GLES20Pipeline.nGLEnable(cap);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glEnable([int cap]);
     * 
     *  C function void glEnable((GLenum) cap )

     * */
    private static native void nGLEnable(int cap);/*
        glEnable((GLenum) cap );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glEnableVertexAttribArray([int index]);
     * 
     *  C function void glEnableVertexAttribArray((GLuint) index )
     * */
    public void glEnableVertexAttribArray(int index) {
        GLES20Pipeline.nGLEnableVertexAttribArray(index);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glEnableVertexAttribArray([int index]);
     * 
     *  C function void glEnableVertexAttribArray((GLuint) index )
     * */
    private static native void nGLEnableVertexAttribArray(int index);/*
         glEnableVertexAttribArray((GLuint) index );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glFinish();
     * 
     *  C function void glFinish(void )
     * */
    public void glFinish() {
        GLES20Pipeline.nGLFinish();
    }

    /**
     *<pre>
     * Native method generated from GLES20.glFinish();
     * 
     *  C function void glFinish(void )
     * */
    private static native void nGLFinish();/*
       glFinish();
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glFlush();
     * 
     *  C function void glFlush(void )
     * */
    public void glFlush() {
        GLES20Pipeline.nGLFlush();
    }

    /**
     *<pre>
     * Native method generated from GLES20.glFlush();
     * 
     *  C function void glFlush(void )
     * */
    private static native void nGLFlush();/*      
         glFlush ();
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glFramebufferRenderbuffer([int target, int attachment, int renderbuffertarget, int renderbuffer]);
     * 
     *  C function void glFramebufferRenderbuffer((GLenum) target, (GLenum) attachment, (GLenum) renderbuffertarget, (GLuint) renderbuffer )
     * */
    public void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        GLES20Pipeline.nGLFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glFramebufferRenderbuffer([int target, int attachment, int renderbuffertarget, int renderbuffer]);
     * 
     *  C function void glFramebufferRenderbuffer((GLenum) target, (GLenum) attachment, (GLenum) renderbuffertarget, (GLuint) renderbuffer )
     * */
    private static native void nGLFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer);/*
            glFramebufferRenderbuffer((GLenum) target, (GLenum) attachment, (GLenum) renderbuffertarget, (GLuint) renderbuffer );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glFramebufferTexture2D([int target, int attachment, int textarget, int texture, int level]);
     * 
     *  C function void glFramebufferTexture2D((GLenum) target, 
     *                                         (GLenum) attachment, 
     *                                         (GLenum) textarget, 
     *                                         (GLuint) texture, 
     *                                         (GLint) level );
     * */
    public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
        GLES20Pipeline.nGLFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glFramebufferTexture2D([int target, int attachment, int textarget, int texture, int level]);
     * 
     *  C function void glFramebufferTexture2D((GLenum) target, (GLenum) attachment, (GLenum) textarget, (GLuint) texture, (GLint) level )

     * */
    private static native void nGLFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level);/*
        glFramebufferTexture2D((GLenum) target, (GLenum) attachment, (GLenum) textarget, (GLuint) texture, (GLint) level );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glFrontFace([int mode]);
     * 
     *  C function void glFrontFace((GLenum) mode )

     * */
    public void glFrontFace(int mode) {
        GLES20Pipeline.nGLFrontFace(mode);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glFrontFace([int mode]);
     * 
     *  C function void glFrontFace((GLenum) mode )

     * */
    private static native void nGLFrontFace(int mode);/*
       glFrontFace((GLenum) mode );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGenBuffers([int n, int[] buffers, int offset]);
     * 
     *  C function void glGenBuffers((GLsizei) n, (GLuint) *buffers )

     * */
    public void glGenBuffers(int n, int[] buffers, int offset) {
        checkArray(buffers, offset, n, BUFFERS);
        GLES20Pipeline.nGLGenBuffers(n, buffers, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGenBuffers([int n, int[] buffers, int offset]);
     * 
     *  C function void glGenBuffers((GLsizei) n, (GLuint) *buffers )

     * */
    private static native void nGLGenBuffers(int n, int[] buffers, int offset);/* 
       glGenBuffers((GLsizei) n, (GLuint *) (buffers + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGenBuffers([int n, java.nio.IntBuffer buffers]);
     * 
     *  C function void glGenBuffers((GLsizei) n, (GLuint) *buffers )

     * */
    public void glGenBuffers(int n, java.nio.IntBuffer buffers) {
        checkBuffer(buffers, n, BUFFERS);
        int offset = getOffset(buffers);
        if (buffers.isDirect()) {
            GLES20Pipeline.nGLGenBuffers(n, buffers, offset);
        } else {
            int[] array = buffers.array();
            GLES20Pipeline.nGLGenBuffers(n, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGenBuffers([int n, java.nio.IntBuffer buffers]);
     * 
     *  C function void glGenBuffers((GLsizei) n, (GLuint) *buffers )

     * */
    private static native void nGLGenBuffers(int n, java.nio.IntBuffer buffers, int offset);/*
        glGenBuffers((GLsizei) n, (GLuint *)(buffers+offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGenerateMipmap([int target]);
     * 
     *  C function void glGenerateMipmap((GLenum) target )

     * */
    public void glGenerateMipmap(int target) {
        GLES20Pipeline.nGLGenerateMipmap(target);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGenerateMipmap([int target]);
     * 
     *  C function void glGenerateMipmap((GLenum) target )

     * */
    private static native void nGLGenerateMipmap(int target);/*
            glGenerateMipmap((GLenum) target );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGenFramebuffers([int n, int[] framebuffers, int offset]);
     * 
     *  C function void glGenFramebuffers((GLsizei) n, (GLuint) *framebuffers )

     * */
    public void glGenFramebuffers(int n, int[] framebuffers, int offset) {
        checkArray(framebuffers, offset, n, FRAMEBUFFER);
        GLES20Pipeline.nGLGenFramebuffers(n, framebuffers, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGenFramebuffers([int n, int[] framebuffers, int offset]);
     * 
     *  C function void glGenFramebuffers((GLsizei) n, (GLuint) *framebuffers )

     * */
    private static native void nGLGenFramebuffers(int n, int[] framebuffers, int offset);/*                               
            glGenFramebuffers((GLsizei) n, (GLuint *) (framebuffers + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGenFramebuffers([int n, java.nio.IntBuffer framebuffers]);
     * 
     *  C function void glGenFramebuffers((GLsizei) n, (GLuint) *framebuffers )
     */
    public void glGenFramebuffers(int n, java.nio.IntBuffer framebuffers) {
        checkBuffer(framebuffers, n, FRAMEBUFFER);
        int offset = getOffset(framebuffers);
        if (framebuffers.isDirect()) {
            GLES20Pipeline.nGLGenFramebuffers(n, framebuffers, offset);
        } else {
            int[] array = framebuffers.array();
            GLES20Pipeline.nGLGenFramebuffers(n, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGenFramebuffers([int n, java.nio.IntBuffer framebuffers]);
     * 
     *  C function void glGenFramebuffers((GLsizei) n, (GLuint) *framebuffers )
     * */
    private static native void nGLGenFramebuffers(int n, java.nio.IntBuffer framebuffers, int offset);/*
          glGenFramebuffers((GLsizei) n, (GLuint *)(framebuffers + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGenRenderbuffers([int n, int[] renderbuffers, int offset]);
     * 
     *  C function void glGenRenderbuffers((GLsizei) n, (GLuint) *renderbuffers )

     * */
    public void glGenRenderbuffers(int n, int[] renderbuffers, int offset) {
        checkArray(renderbuffers, offset, n, RENDERBUFFER);
        GLES20Pipeline.nGLGenRenderbuffers(n, renderbuffers, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGenRenderbuffers([int n, int[] renderbuffers, int offset]);
     * 
     *  C function void glGenRenderbuffers((GLsizei) n, (GLuint *) renderbuffers )

     * */
    private static native void nGLGenRenderbuffers(int n, int[] renderbuffers, int offset);/*
            glGenRenderbuffers((GLsizei) n, (GLuint *) (renderbuffers + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGenRenderbuffers([int n, java.nio.IntBuffer renderbuffers]);
     * 
     *  C function void glGenRenderbuffers((GLsizei) n, (GLuint *) renderbuffers )
     * */
    public void glGenRenderbuffers(int n, java.nio.IntBuffer renderbuffers) {
        int offset = getOffset(renderbuffers); 
        if(renderbuffers.isDirect()){
            GLES20Pipeline.nGLGenRenderbuffers(n, renderbuffers, offset);
        }else{
            int[] array = renderbuffers.array();
            GLES20Pipeline.nGLGenRenderbuffers(n, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGenRenderbuffers([int n, java.nio.IntBuffer renderbuffers]);
     * 
     *  C function void glGenRenderbuffers((GLsizei) n, (GLuint) *renderbuffers )

     * */
    private static native void nGLGenRenderbuffers(int n, java.nio.IntBuffer renderbuffers, int offset);/*
            glGenRenderbuffers((GLsizei) n, (GLuint *) (renderbuffers + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGenTextures([int n, int[] textures, int offset]);
     * 
     *  C function void glGenTextures((GLsizei) n, (GLuint) *textures )

     * */
    public void glGenTextures(int n, int[] textures, int offset) {
        checkArray(textures, offset, n, TEXTURES);
        GLES20Pipeline.nGLGenTextures(n, textures, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGenTextures([int n, int[] textures, int offset]);
     * 
     *  C function void glGenTextures((GLsizei) n, (GLuint) *textures )

     * */
    private static native void nGLGenTextures(int n, int[] textures, int offset);/*
            glGenTextures((GLsizei) n, (GLuint *) (textures + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGenTextures([int n, java.nio.IntBuffer textures]);
     * 
     *  C function void glGenTextures((GLsizei) n, (GLuint) *textures )

     * */
    public void glGenTextures(int n, java.nio.IntBuffer textures) {
        checkBuffer(textures, n, TEXTURES);
        int offset = getOffset(textures); 
        if(textures.isDirect()){
            GLES20Pipeline.nGLGenTextures(n, textures, offset);
        }else{
            int[] array = textures.array();
            GLES20Pipeline.nGLGenTextures(n, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGenTextures([int n, java.nio.IntBuffer textures]);
     * 
     *  C function void glGenTextures((GLsizei) n, (GLuint) *textures )

     * */
    private static native void nGLGenTextures(int n, java.nio.IntBuffer textures, int offset);/*
            glGenTextures((GLsizei) n, (GLuint *)(textures + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetActiveAttrib([int program, int index, int bufsize, int[] length, int lengthOffset, int[] size, int sizeOffset, int[] type, int typeOffset, byte[] name, int nameOffset]);
     * 
     *  C function void glGetActiveAttrib((GLuint) program, (GLuint) index, (GLsizei) bufsize, (GLsizei) *length, (GLint *) size, (GLenum) *type, char *name )

     * */
    public void glGetActiveAttrib(
                    int program,
                    int index, 
                    int bufsize, 
                    int[] length, int lengthOffset, 
                    int[] size,   int sizeOffset, 
                    int[] type,   int typeOffset, 
                    byte[] name,  int nameOffset) {
        
        checkArray(length, lengthOffset, 1, LENGTH);
        checkArray(size, sizeOffset, 1, SIZE);
        checkArray(type, typeOffset, 1, TYPE);
        checkArray(name, nameOffset, bufsize, NAME);
        nGLGetActiveAttrib(program, 
                index, 
                bufsize,
                length, lengthOffset, 
                size, sizeOffset, 
                type, typeOffset, 
                name, nameOffset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetActiveAttrib([int program, int index, int bufsize, int[] length, int lengthOffset, int[] size, int sizeOffset, int[] type, int typeOffset, byte[] name, int nameOffset]);
     * 
     *  C function void glGetActiveAttrib((GLuint) program, (GLuint) index, (GLsizei) bufsize, (GLsizei) *length, (GLint *) size, (GLenum) *type, char *name )

     * */
    private static native void nGLGetActiveAttrib(int program,
                                                  int index,
                                                  int bufsize,
                                                  int[] length, int lengthOffset,
                                                  int[] size, int sizeOffset,
                                                  int[] type, int typeOffset,
                                                  byte[] name, int nameOffset);/*
                 
                    glGetActiveAttrib((GLuint) program, 
                                            (GLuint) index, 
                                            (GLsizei) bufsize, 
                                            (GLsizei *) (length + lengthOffset), 
                                            (GLint *)  (size + sizeOffset), 
                                            (GLenum *) (type + typeOffset), 
                                            (char *) (name + nameOffset));
                    
                    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetActiveAttrib([int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name]);
     * 
     * C function void glGetActiveAttrib(GLuint program, GLuint index, GLsizei bufsize, GLsizei *length, GLint *size, GLenum *type, char *name )
     * 
     *  @hide Method is broken, but used to be public (b/6006380) 
     *  */
    @Deprecated
    public void glGetActiveAttrib(int program,
                                  int index,
                                  int bufsize,
                                  java.nio.IntBuffer length,
                                  java.nio.IntBuffer size,
                                  java.nio.IntBuffer type,
                                  byte name) {
            // GLES20Pipeline.nGLGetActiveAttrib(program, index, bufsize, length, size, type, name);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetActiveAttrib([int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name]);
     * 
     * C function void glGetActiveAttrib(GLuint program, GLuint index, GLsizei bufsize, GLsizei *length, GLint *size, GLenum *type, char *name )
     * 
     *  @hide Method is broken, but used to be public (b/6006380) 
     **/
    @Deprecated
    private static  void nGLGetActiveAttrib(
                    int program, 
                    int index, 
                    int bufsize, 
                    java.nio.IntBuffer length, 
                    java.nio.IntBuffer size, 
                    java.nio.IntBuffer type,
                    byte name){};/*
                    //no op
//              glGetActiveAttrib ((GLuint) program,
//                                 (GLuint) index, 
//                                 (GLsizei) bufsize, 
//                                 (GLsizei *) length, 
//                                 (GLint *) size, 
//                                 (GLenum *) type, 
//                                 (char *) &name );
            */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetActiveAttrib([int program, int index, int[] size, int sizeOffset, int[] type, int typeOffset]);
     * 
     *  C function void glGetActiveAttrib((GLuint) program, (GLuint) index, (GLsizei) bufsize, (GLsizei) *length, (GLint *) size, (GLenum) *type, char *name )

     * */
    public String glGetActiveAttrib(int program, int index, 
                                    int[] size, int sizeOffset, 
                                    int[] type, int typeOffset) 
    {        
        checkArray(size, sizeOffset, 1, SIZE);
        checkArray(type, typeOffset, 1, TYPE);        
        String res = nGLGetActiveAttrib(program, index, size, sizeOffset, type, typeOffset);
        if (res != null)
            res = res.trim();
        return res;
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetActiveAttrib([int program, int index, int[] size, int sizeOffset, int[] type, int typeOffset]);
     * 
     *  C function void glGetActiveAttrib((GLuint) program, (GLuint) index, (GLsizei) bufsize, (GLsizei) *length, (GLint *) size, (GLenum) *type, char *name )

     * */
    private static native String nGLGetActiveAttrib(int program,
                                                    int index,
                                                    int[] size, int sizeOffset,
                                                    int[] type, int typeOffset);/*
    GLint  max_length = 0; 
    //get max length of attribute
    glGetProgramiv((GLuint) program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH, &max_length);
    
    //alloc some space
    std::vector<GLchar> name(max_length + 1);
    
    // gles call
    glGetActiveAttrib ((GLuint) program,
                       (GLuint) index,
                       max_length + 1,  // bufSize
                       &max_length,     // length - not used after call
                       (GLint *)(size + sizeOffset),   // size 
                       (GLenum *)(type + typeOffset),  // type
                       &name[0]);
     
     jstring result = env->NewStringUTF(&name[0]);
     return result;
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetActiveAttrib([int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type]);
     * 
     *  C function void glGetActiveAttrib((GLuint) program, (GLuint) index, (GLsizei) bufsize, (GLsizei) *length, (GLint *) size, (GLenum) *type, char *name )

     * */
    public String glGetActiveAttrib(int program, 
                                    int index,
                                    java.nio.IntBuffer size, 
                                    java.nio.IntBuffer type) 
    {
        checkBuffer(type, 1, TYPE);
        checkBuffer(size, 1, SIZE);
        int sizeOffset = getOffset(size);
        int typeOffset = getOffset(type);

        if (size.isDirect() && type.isDirect()) {
           return GLES20Pipeline.nGLGetActiveAttrib(program, index, size, sizeOffset, type, typeOffset);
        } else {
            int[] arraySize = size.array();
            int[] arrayType = type.array();
            return GLES20Pipeline.nGLGetActiveAttrib(program, index, arraySize, sizeOffset, arrayType, typeOffset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetActiveAttrib([int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type]);
     * 
     *  C function void glGetActiveAttrib((GLuint) program, (GLuint) index, (GLsizei) bufsize, (GLsizei) *length, (GLint *) size, (GLenum) *type, char *name )

     * */
    private static native String nGLGetActiveAttrib(int program,
                                                    int index,
                                                    java.nio.IntBuffer size, int sizeOffset,
                                                    java.nio.IntBuffer type, int typeOffset);/*
    
     // used code snipet from
     // http://people.freedesktop.org/~idr/OpenGL_tutorials/05-attributes.html
     GLint  max_length = 0;

    //get max length of attribute
    glGetProgramiv((GLuint) program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH, &max_length);

    //alloc some space
    std::vector<GLchar> name(max_length + 1);
    
    // gles call
    glGetActiveAttrib((GLuint) program, 
                      (GLuint) index,
                       max_length + 1, 
                      &max_length, // not used after call
                      (GLint *)  (size + sizeOffset), 
                      (GLenum *) (type + typeOffset), 
                      &name[0]);
    jstring result = env->NewStringUTF(&name[0]);
    return result;
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetActiveUniform([int program, int index, int bufsize, int[] length, int lengthOffset, int[] size, int sizeOffset, int[] type, int typeOffset, byte[] name, int nameOffset]);
     * 
     *  C function void glGetActiveUniform((GLuint) program, (GLuint) index, (GLsizei) bufsize, (GLsizei) *length, (GLint *) size, (GLenum) *type, char *name )

     * */
    public void glGetActiveUniform(
                    int program, 
                    int index, 
                    int bufsize, 
                    int[] length, int lengthOffset, 
                    int[] size,   int sizeOffset, 
                    int[] type,   int typeOffset, 
                    byte[] name,  int nameOffset) {
        
        int needed = 1;
        checkArray(length, lengthOffset, needed, LENGTH);
        checkArray(size, sizeOffset, needed, SIZE);
        checkArray(type, typeOffset, needed, TYPE);
        checkArray(name, nameOffset, bufsize, NAME);        
        
        GLES20Pipeline.nGLGetActiveUniform(program, index, bufsize, 
                                            length, lengthOffset, 
                                            size, sizeOffset, 
                                            type, typeOffset, 
                                            name, nameOffset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetActiveUniform([int program, int
     * index, int bufsize, int[] length, int lengthOffset, int[] size, int
     * sizeOffset, int[] type, int typeOffset, byte[] name, int nameOffset]);
     * 
     * C function void glGetActiveUniform((GLuint) program,
     *                                    (GLuint) index,
     *                                    (GLsizei) bufsize,
     *                                    (GLsizei) *length,
     *                                    (GLint *) size,
     *                                    (GLenum) *type,
     *                                     char *name )
     * 
     * */
    private static native void nGLGetActiveUniform(int program,
                                                   int index,
                                                   int bufsize,
                                                   int[] length, int lengthOffset,
                                                   int[] size, int sizeOffset,
                                                   int[] type, int typeOffset,
                                                   byte[] name, int nameOffset);/*
            //gles call
            glGetActiveUniform ((GLuint) program, 
                                (GLuint) index, 
                                (GLsizei) bufsize, 
                                (GLsizei *) &length[lengthOffset], 
                                (GLint *)  &size[sizeOffset], 
                                (GLenum *) &type[typeOffset], 
                                (char *) &name[nameOffset] );
    */

    /**
     * 
     *<pre>
     * Delegate Method generated from 
     * GLES20.glGetActiveUniform([int program, 
     *                            int index, int bufsize, 
     *                            java.nio.IntBuffer length, 
     *                            java.nio.IntBuffer size, 
     *                            java.nio.IntBuffer type, 
     *                            byte name]);
     * 
     * C prototype:
     * void glGetActiveUniform(GLuint program,
     *                         GLuint index,
     *                         GLsizei bufSize,
     *                         GLsizei *length,
     *                         GLint *size,
     *                         GLenum *type,
     *                         GLchar *name);
     * 
     *   {@link #glGetActiveUniform(int, int, int, java.nio.IntBuffer, java.nio.IntBuffer, java.nio.IntBuffer, byte)}
     *  Use {@link #glGetActiveUniform(int, int, int[], int, int[], int)} instead
     * 
     *  @hide Method is broken, but used to be public (b/6006380) 
     *  */
    @Deprecated
    public void glGetActiveUniform(int program, 
                    int index, 
                    int bufsize, 
                    java.nio.IntBuffer length, 
                    java.nio.IntBuffer size, 
                    java.nio.IntBuffer type, 
                    byte name) {            
        
            Exception exc = new UnsupportedOperationException("Method "
                            + " void glGetActiveUniform(int, int, int, java.nio.IntBuffer, java.nio.IntBuffer, java.nio.IntBuffer, byte) is broken. "
                            + "Use: \n"
                            + " String glGetActiveUniform(int, int, int[], int, int[], int)");
            
             exc.printStackTrace();            
       // GLES20Pipeline.nGLGetActiveUniform(program, index, bufsize, length, size, type, name);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetActiveUniform([int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name]);
     * <pre>
     * C prototype:
     * void glGetActiveUniform(GLuint program,
     *                         GLuint index,
     *                         GLsizei bufSize,
     *                         GLsizei *length,
     *                         GLint *size,
     *                         GLenum *type,
     *                         GLchar *name);
     * </pre>
     *  @hide Method is broken, but used to be public (b/6006380) */
    @Deprecated
    private static void nGLGetActiveUniform(
                    int program, 
                    int index, int bufsize, 
                    java.nio.IntBuffer length, int lengthOffset,
                    java.nio.IntBuffer size, int sizeOffset,
                    java.nio.IntBuffer type, int typeOffset,
                    byte name){};/*
                    
             //gles call
            glGetActiveUniform ((GLuint) program, 
                                (GLuint) index, 
                                (GLsizei) bufsize, 
                                (GLsizei *) &length[lengthOffset], 
                                (GLint *)  &size[sizeOffset], 
                                (GLenum *) &type[typeOffset], 
                                (char *) &name[nameOffset] );       
                    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetActiveUniform([int program, int index, int[] size, int sizeOffset, int[] type, int typeOffset]);
     * <pre>
     *  Prototype:
     *  C function void glGetActiveUniform( (GLuint) program, 
     *                                      (GLuint) index, 
     *                                      (GLsizei) bufsize, 
     *                                      (GLsizei) *length, 
     *                                      (GLint *) size, 
     *                                      (GLenum) *type, 
     *                                      char *name )
     *</pre>
     * */
    public String glGetActiveUniform(int program,
                                     int index,
                                     int[] size, int sizeOffset,
                                     int[] type, int typeOffset) {
        checkArray(size, sizeOffset, 1, SIZE); 
        checkArray(type, typeOffset, 1, TYPE);
        return GLES20Pipeline.nGLGetActiveUniform(program, index, size, sizeOffset, type, typeOffset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetActiveUniform([int program, int index, int[] size, int sizeOffset, int[] type, int typeOffset]);
     * 
     *  C function void glGetActiveUniform((GLuint) program, (GLuint) index, (GLsizei) bufsize, (GLsizei) *length, (GLint *) size, (GLenum) *type, char *name )

     * */
    private static native String nGLGetActiveUniform(int program,
                                                     int index,
                                                     int[] size, int sizeOffset,
                                                     int[] type, int typeOffset);/*
            // used code snipet from
            // http://people.freedesktop.org/~idr/OpenGL_tutorials/05-attributes.html
            GLint  max_length = 0;
            
            //get max length of attribute
            glGetProgramiv((GLuint) program, GL_ACTIVE_UNIFORM_MAX_LENGTH, &max_length);
            //alloc some space
            std::vector<GLchar> name(max_length + 1);
    
            glGetActiveUniform( (GLuint) program, 
                                (GLuint) index, 
                                 max_length + 1, 
                                 &max_length, // not used after call
                                 (GLint *)  &size[sizeOffset], 
                                 (GLenum *) &type[typeOffset], 
                                  &name[0] );
                                
            jstring result = env->NewStringUTF(&name[0]);
            return result; 
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetActiveUniform([int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type]);
     * 
     *  C function void glGetActiveUniform((GLuint) program, (GLuint) index, (GLsizei) bufsize, (GLsizei) *length, (GLint *) size, (GLenum) *type, char *name )

     * */
    public String glGetActiveUniform(int program, 
                                     int index, 
                                     java.nio.IntBuffer size, 
                                     java.nio.IntBuffer type) {
        
        checkBuffer(type, 1, SIZE);
        checkBuffer(size, 1, TYPE);
        int sizeOffset = getOffset(size);
        int typeOffset = getOffset(type);

        if (size.isDirect() && type.isDirect()) {
            return GLES20Pipeline.nGLGetActiveUniform(program, index, size, sizeOffset, type, typeOffset);
        } else {
            int[] arraySize = size.array();
            int[] arrayType = type.array();
            return GLES20Pipeline.nGLGetActiveUniform(program, index, arraySize, sizeOffset, arrayType, typeOffset);
        }        
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetActiveUniform([int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type]);
     * 
     *  C function void glGetActiveUniform((GLuint) program, (GLuint) index, (GLsizei) bufsize, (GLsizei) *length, (GLint *) size, (GLenum) *type, char *name )

     * */
    private static native String nGLGetActiveUniform(int program, 
                                                     int index, 
                                                     java.nio.IntBuffer size, int sizeOffset,
                                                     java.nio.IntBuffer type, int typeOffset);/*
    
            // used code snipet from
            // http://people.freedesktop.org/~idr/OpenGL_tutorials/05-attributes.html
            GLint  max_length = 0;                            
                                                            
            //get max length of attribute
            glGetProgramiv((GLuint) program, GL_ACTIVE_UNIFORM_MAX_LENGTH, &max_length);
            
            //alloc some space
            std::vector<GLchar> name(max_length + 1);

            glGetActiveUniform ((GLuint) program,
                                (GLuint) index, 
                                (max_length + 1), 
                                &max_length, // not used after call
                                (GLint *) (size + sizeOffset), 
                                (GLenum *)(type + typeOffset), 
                                &name[0] );

             jstring result = env->NewStringUTF(&name[0]);
             return result;
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetAttachedShaders([int program, int maxcount, int[] count, int countOffset, int[] shaders, int shadersOffset]);
     * 
     *  C function void glGetAttachedShaders((GLuint) program, (GLsizei) maxcount, (GLsizei) *count, (GLuint) *shaders )

     * */
    public void glGetAttachedShaders(int program,
                                     int maxcount,
                                     int[] count, int countOffset,
                                     int[] shaders, int shadersOffset) {
        checkArray(count, countOffset, 1, COUNT2);
        checkArray(shaders, shadersOffset, maxcount, SHADERS2);
        GLES20Pipeline.nGLGetAttachedShaders(program, maxcount, count, countOffset, shaders, shadersOffset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetAttachedShaders([int program, int maxcount, int[] count, int countOffset, int[] shaders, int shadersOffset]);
     * 
     *  C function void glGetAttachedShaders((GLuint) program, (GLsizei) maxcount, (GLsizei) *count, (GLuint) *shaders )

     * */
    private static native void nGLGetAttachedShaders(int program,
                                                     int maxcount,
                                                     int[] count, int countOffset,
                                                     int[] shaders, int shadersOffset);/*
             glGetAttachedShaders((GLuint) program, 
                                  (GLsizei) maxcount, 
                                  (GLsizei *) &count[countOffset], 
                                  (GLuint *) &shaders[shadersOffset]);
    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetAttachedShaders([int program, int maxcount, java.nio.IntBuffer count, java.nio.IntBuffer shaders]);
     * 
     *  C function void glGetAttachedShaders((GLuint) program, (GLsizei) maxcount, (GLsizei) *count, (GLuint) *shaders )

     * */
    public void glGetAttachedShaders(int program,
                                     int maxcount, 
                                     java.nio.IntBuffer count, 
                                     java.nio.IntBuffer shaders) 
    {
        checkBuffer(count, 1, COUNT2);
        checkBuffer(shaders, maxcount, SHADERS2);        
        int countOffset = getOffset(count);
        int shadersOffset = getOffset(shaders);
        
        if (count.isDirect() && shaders.isDirect()) {
            GLES20Pipeline.nGLGetAttachedShaders(program, maxcount, count, countOffset, shaders, shadersOffset);
        } else {
            int[] arrayCount = count.array();
            int[] arrayShaders = shaders.array();
            GLES20Pipeline.nGLGetAttachedShaders(program, maxcount, arrayCount, countOffset, arrayShaders,
                    shadersOffset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetAttachedShaders([int program, int maxcount, java.nio.IntBuffer count, java.nio.IntBuffer shaders]);
     * 
     *  C function void glGetAttachedShaders((GLuint) program, (GLsizei) maxcount, (GLsizei) *count, (GLuint) *shaders )

     * */
    private static native void nGLGetAttachedShaders(int program, int maxcount, 
                                                     java.nio.IntBuffer count, int countOffset,
                                                     java.nio.IntBuffer shaders, int shadersOffset);/*
             glGetAttachedShaders((GLuint ) program, 
                                  (GLsizei) maxcount, 
                                  (GLsizei *) (count + countOffset), 
                                  (GLuint *) (shaders + shadersOffset));
    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetAttribLocation([int program, String name]);
     * 
     *  C function (GLint) glGetAttribLocation((GLuint) program, const char *name )

     * */
    public int glGetAttribLocation(int program, String name) {
            return  GLES20Pipeline.nGLGetAttribLocation(program, name);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetAttribLocation([int program, String name]);
     * 
     *  C function (GLint) glGetAttribLocation((GLuint) program, const char *name )

     * */
    private static native int nGLGetAttribLocation(int program, String name);/*
            // name is converted to (const char *)
            return (jint) glGetAttribLocation((GLuint) program, name );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetBooleanv([int pname, boolean[] params, int offset]);
     * 
     *  C function void glGetBooleanv((GLenum) pname, (GLboolean)  *params )

     * */
    public void glGetBooleanv(int pname, boolean[] params, int offset) {
        int needed = getNeededCount(pname);
        checkArray(params, offset, needed, PARAMS);
        GLES20Pipeline.nGLGetBooleanv(pname, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetBooleanv([int pname, boolean[] params, int offset]);
     * 
     *  C function void glGetBooleanv((GLenum) pname, (GLboolean *)params )
     * */
    private static native void nGLGetBooleanv(int pname, boolean[] params, int offset);/*
            glGetBooleanv((GLenum) pname, (GLboolean *) (params + offset) );
    */
    
    /**
     * same as {@link #nGLGetBooleanv(int, boolean[], int)}, but using int[]
     * @param pname
     * @param params
     * @param offset
     */
    private static native void nGLGetBooleanv(int pname, int[] params, int offset);/*
            glGetBooleanv((GLenum) pname, (GLboolean *) (params + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetBooleanv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetBooleanv((GLenum) pname, (GLboolean)  *params )

     * */
    public void glGetBooleanv(int pname, java.nio.IntBuffer params) {
        int needed = getNeededCount(pname);
        checkBuffer(params, needed, PARAMS);        
        int offset = BufferInfo.getOffset(params);
       
        if (params.isDirect()) {            
            GLES20Pipeline.nGLGetBooleanv(pname, params, offset);
        } else {           
            int[] array = params.array();
            GLES20Pipeline.nGLGetBooleanv(pname, array, offset);
        }         
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetBooleanv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetBooleanv((GLenum) pname, (GLboolean)  *params )

     * */
    private static native void nGLGetBooleanv(int pname, java.nio.IntBuffer params, int offset);/*    
            glGetBooleanv((GLenum) pname, (GLboolean *) (params + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetBufferParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetBufferParameteriv((GLenum) target, (GLenum) pname, (GLint *) params )

     * */
    public void glGetBufferParameteriv(int target, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES20Pipeline.nGLGetBufferParameteriv(target, pname, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetBufferParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetBufferParameteriv((GLenum) target, (GLenum) pname, (GLint *) params )

     * */
    private static native void nGLGetBufferParameteriv(int target, int pname, int[] params, int offset);/*
            glGetBufferParameteriv( (GLenum) target, 
                                    (GLenum) pname,
                                    (GLint *) (params + offset) );
     */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetBufferParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetBufferParameteriv((GLenum) target, (GLenum) pname, (GLint *) params )

     * */
    public void glGetBufferParameteriv(int target, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params); 
        if(params.isDirect()){
            GLES20Pipeline.nGLGetBufferParameteriv(target, pname, params, offset);
        }else{
            int[] array = params.array();
            GLES20Pipeline.nGLGetBufferParameteriv(target, pname, array, offset);
        }       
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetBufferParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetBufferParameteriv((GLenum) target, (GLenum) pname, (GLint *) params )

     * */
    private static native void nGLGetBufferParameteriv(int target, int pname, java.nio.IntBuffer params, int offset);/*                    
            glGetBufferParameteriv( (GLenum) target, 
                                    (GLenum) pname, 
                                    (GLint *)  (params + offset));    
     */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetError();
     * 
     *  C function (GLenum) glGetError(void )

     * */
    public int glGetError() {
       return  nGLGetError();
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetError();
     * 
     *  C function (GLenum) glGetError(void )

     * */
    private static native int nGLGetError();/*
            return (jint) glGetError();    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetFloatv([int pname, float[] params, int offset]);
     * 
     *  C function void glGetFloatv((GLenum) pname, (GLfloat) *params )

     * */
    public void glGetFloatv(int pname, float[] params, int offset) {
        int needed = getNeededCount(pname);
        checkArray(params, offset, needed, PARAMS); 
        GLES20Pipeline.nGLGetFloatv(pname, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetFloatv([int pname, float[] params, int offset]);
     * 
     *  C function void glGetFloatv((GLenum) pname, (GLfloat) *params )

     * */
    private static native void nGLGetFloatv(int pname, float[] params, int offset);/*
            glGetFloatv((GLenum) pname,  (GLfloat *) (params + offset));       
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetFloatv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetFloatv((GLenum) pname, (GLfloat) *params )

     * */
    public void glGetFloatv(int pname, java.nio.FloatBuffer values) {
        int needed = getNeededCount(pname);
        checkBuffer(values, needed, VALUES); 
        int offset = getOffset(values);

        if (values.isDirect()) {
            GLES20Pipeline.nGLGetFloatv(pname, values, offset);
        } else {
            float[] array = values.array();
            GLES20Pipeline.nGLGetFloatv(pname, array, offset);
        }    
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetFloatv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetFloatv((GLenum) pname, (GLfloat) *params )

     * */
    private static native void nGLGetFloatv(int pname, java.nio.FloatBuffer params, int offset);/*    
            glGetFloatv((GLenum) pname, (GLfloat *) (params + offset));    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetFramebufferAttachmentParameteriv([int target, 
     *  int attachment, int pname, int[] params, int offset]);
     * 
     *  C function void glGetFramebufferAttachmentParameteriv((GLenum) target, 
     *                                                          (GLenum) attachment, 
     *                                                          (GLenum) pname, 
     *                                                          (GLint *) params )

     * */
    public void glGetFramebufferAttachmentParameteriv(int target,
                                                      int attachment,
                                                      int pname,
                                                      int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        nGLGetFramebufferAttachmentParameteriv(target, attachment, pname, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetFramebufferAttachmentParameteriv([int target, 
     * int attachment, int pname, int[] params, int offset]);
     * 
     *  C function void glGetFramebufferAttachmentParameteriv((GLenum) target, 
     *                                                           (GLenum) attachment, 
     *                                                           (GLenum) pname, 
     *                                                           (GLint *) params )

     * */
    private static native void nGLGetFramebufferAttachmentParameteriv(int target,
                                                                      int attachment,
                                                                      int pname,
                                                                      int[] params, int offset);/*                                             
             glGetFramebufferAttachmentParameteriv((GLenum) target, 
                                                     (GLenum) attachment, 
                                                     (GLenum) pname, 
                                                     (GLint *) (params + offset) );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetFramebufferAttachmentParameteriv([int target, 
     * int attachment, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFramebufferAttachmentParameteriv((GLenum) target, 
     *                                                        (GLenum) attachment, 
     *                                                        (GLenum) pname, 
     *                                                        (GLint *) params )

     * */
    public void glGetFramebufferAttachmentParameteriv(int target, 
                                                      int attachment, 
                                                      int pname, 
                                                      java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params); 
        if(params.isDirect()){
            nGLGetFramebufferAttachmentParameteriv(target, attachment, pname, params, offset);
        }else{
            int[] array = params.array();
            nGLGetFramebufferAttachmentParameteriv(target, attachment, pname, array, offset);
        }       
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetFramebufferAttachmentParameteriv([int target, 
     * int attachment, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFramebufferAttachmentParameteriv((GLenum) target, 
     *                                                        (GLenum) attachment, 
     *                                                        (GLenum) pname, 
     *                                                        (GLint *) params )
     * */
    private static native void nGLGetFramebufferAttachmentParameteriv( int target, 
                                                                       int attachment, 
                                                                       int pname, 
                                                                       java.nio.IntBuffer params, 
                                                                       int offset);/*
            glGetFramebufferAttachmentParameteriv( (GLenum) target, 
                                                   (GLenum) attachment, 
                                                   (GLenum) pname, 
                                                   (GLint *) (params + offset) );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetIntegerv([int pname, int[] params, int offset]);
     * 
     *  C function void glGetIntegerv((GLenum) pname, (GLint *) params )
     * */
    public void glGetIntegerv(int pname, int[] params, int offset) {
        int needed = getNeededCount(pname);
        checkArray(params, offset, needed, PARAMS); 
        GLES20Pipeline.nGLGetIntegerv(pname, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetIntegerv([int pname, int[] params, int offset]);
     * 
     *  C function void glGetIntegerv((GLenum) pname, (GLint *) params )

     * */
    private static native void nGLGetIntegerv(int pname, int[] params, int offset);/*    
            glGetIntegerv((GLenum) pname,  (GLint *) (params +offset) );        
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetIntegerv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetIntegerv((GLenum) pname, (GLint *) params )

     * */
    public void glGetIntegerv(int pname, java.nio.IntBuffer params) {
        int needed = getNeededCount(pname);
        checkBuffer(params, needed, PARAMS);        
        int offset = getOffset(params);         
        if (params.isDirect()) {            
            GLES20Pipeline.nGLGetIntegerv(pname, params, offset);
        } else {           
            int[] array = params.array();
            GLES20Pipeline.nGLGetIntegerv(pname, array, offset);
        }         
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetIntegerv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetIntegerv((GLenum) pname, (GLint *) params )

     * */
    private static native void nGLGetIntegerv(int pname, java.nio.IntBuffer params, int offset);/*    
            glGetIntegerv((GLenum) pname, (GLint *) (params + offset));   
    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetProgramiv([int program, int pname, int[] params, int offset]);
     * 
     *  C function void glGetProgramiv((GLuint) program, (GLenum) pname, (GLint *) params )

     * */
    public void glGetProgramiv(int program, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES20Pipeline.nGLGetProgramiv(program, pname, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetProgramiv([int program, int pname, int[] params, int offset]);
     * 
     *  C function void glGetProgramiv((GLuint) program, (GLenum) pname, (GLint *) params )

     * */
    private static native void nGLGetProgramiv(int program, int pname, int[] params, int offset);/*
            glGetProgramiv( (GLuint) program, 
                            (GLenum) pname, 
                            (GLint *) (params + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetProgramiv([int program, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramiv((GLuint) program, (GLenum) pname, (GLint *) params )

     * */
    public void glGetProgramiv(int program, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params); 
        if(params.isDirect()){
            nGLGetProgramiv(program, pname, params, offset);
        }else{
            int[] array = params.array();
            nGLGetProgramiv(program, pname, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetProgramiv([int program, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramiv((GLuint) program, (GLenum) pname, (GLint *) params )

     * */
    private static native void nGLGetProgramiv(int program, int pname, java.nio.IntBuffer params, int offset);/*    
            glGetProgramiv( (GLuint) program, (GLenum) pname, (GLint *) (params + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetProgramInfoLog([int program]);
     * <pre>
     * Prototype:
     *  void glGetProgramInfoLog( GLuint program,
     *                            GLsizei maxLength,
     *                            GLsizei *length,
     *                            GLchar * infoLog);
     *  </pre>
     * */
    public String glGetProgramInfoLog(int program) {
            return  GLES20Pipeline.nGLGetProgramInfoLog(program);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetProgramInfoLog([int program]);
     * <pre:
     * Prototype:
     *  void glGetProgramInfoLog( GLuint program,
     *                            GLsizei maxLength,
     *                            GLsizei *length,
     *                            GLchar * infoLog);
     * </pre>  
     * */
    private static native String nGLGetProgramInfoLog(int program);/*    
            // Code based on example from https://www.opengl.org/wiki/Example_Code
            // get the log length                     
            GLint maxLength = 0;
            glGetProgramiv((GLuint)program, GL_INFO_LOG_LENGTH, &maxLength);
                               
            // allocate using  vector
            std::vector<GLchar> infoLog(maxLength + 1);
                
            // get the log with right buffer size
            glGetProgramInfoLog( (GLuint) program, 
                                 (GLsizei) (maxLength + 1), 
                                 (GLsizei *) &maxLength, 
                                 (GLchar *) &infoLog[0]);
                                                                                 
            // return the requested String                                 
            jstring result = env->NewStringUTF(&infoLog[0]);
            return result;    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetRenderbufferParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetRenderbufferParameteriv((GLenum) target, (GLenum) pname, (GLint *) params )

     * */
    public void glGetRenderbufferParameteriv(int target, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES20Pipeline.nGLGetRenderbufferParameteriv(target, pname, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetRenderbufferParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetRenderbufferParameteriv((GLenum) target, (GLenum) pname, (GLint *) params )

     * */
    private static native void nGLGetRenderbufferParameteriv(int target, int pname, int[] params, int offset);/*        
            glGetRenderbufferParameteriv((GLenum) target, 
                                           (GLenum) pname, 
                                           (GLint *) (params + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetRenderbufferParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetRenderbufferParameteriv((GLenum) target, (GLenum) pname, (GLint *) params )

     * */
    public void glGetRenderbufferParameteriv(int target, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if (params.isDirect()) {
            GLES20Pipeline.nGLGetRenderbufferParameteriv(target, pname, params, offset);
        } else {
            int[] array = params.array();
            GLES20Pipeline.nGLGetRenderbufferParameteriv(target, pname, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetRenderbufferParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetRenderbufferParameteriv((GLenum) target, (GLenum) pname, (GLint *) params )

     * */
    private static native void nGLGetRenderbufferParameteriv(int target,
                                                             int pname,
                                                             java.nio.IntBuffer params, int offset);/*       
            glGetRenderbufferParameteriv((GLenum) target, 
                                           (GLenum) pname, 
                                           (GLint *) (params + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetShaderiv([int shader, int pname, int[] params, int offset]);
     * 
     *  C function void glGetShaderiv((GLuint) shader, (GLenum) pname, (GLint *) params )

     * */
    public void glGetShaderiv(int shader, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES20Pipeline.nGLGetShaderiv(shader, pname, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetShaderiv([int shader, int pname, int[] params, int offset]);
     * 
     *  C function void glGetShaderiv((GLuint) shader, (GLenum) pname, (GLint *) params )

     * */
    private static native void nGLGetShaderiv(int shader, int pname, int[] params, int offset);/*
            glGetShaderiv( (GLuint) shader, 
                           (GLenum) pname, 
                           (GLint *) (params + offset) );
    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetShaderiv([int shader, 
     * int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetShaderiv( (GLuint) shader, 
     *                                 (GLenum) pname, 
     *                                 (GLint *) params );

     * */
    public void glGetShaderiv(int shader, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params); 
        if(params.isDirect()){
            GLES20Pipeline.nGLGetShaderiv(shader, pname, params, offset);
        }else{
            int[] array = params.array();
            GLES20Pipeline.nGLGetShaderiv(shader, pname, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetShaderiv([int shader, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetShaderiv((GLuint) shader, (GLenum) pname, (GLint *) params )

     * */
    private static native void nGLGetShaderiv( int shader, 
                                               int pname, 
                                               java.nio.IntBuffer params, int offset);/*    
             glGetShaderiv( (GLuint) shader, 
                            (GLenum) pname, 
                            (GLint *)(params + offset) );    
    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetShaderInfoLog([int shader]);
     * 
     * <pre>
     *  Prototype:
     *   void glGetShaderInfoLog(GLuint shader,
     *                           GLsizei maxLength,
     *                           GLsizei *length,
     *                           GLchar * infoLog);
     * </pre>
     * */
    public String glGetShaderInfoLog(int shader) {
            return  GLES20Pipeline.nGLGetShaderInfoLog(shader);
    }

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetShaderInfoLog([int shader]);
     * 
     * <pre>
     * Prototype:
     *  void glGetShaderInfoLog( GLuint shader,
     *                           GLsizei maxLength,
     *                           GLsizei *length,
     *                           GLchar * infoLog);
     * </pre>
     **/
    private static native String nGLGetShaderInfoLog(int shader);/*    
            // get string length
            GLint maxLength = 0;    
            glGetShaderiv( (GLuint) shader, (GLenum) GL_INFO_LOG_LENGTH, &maxLength);
                    
            // allocate 
            std::vector<GLchar> infoLog(maxLength + 1);
    
            glGetShaderInfoLog( (GLuint) shader,
                                maxLength + 1,
                                &maxLength,
                                &infoLog[0]);
            jstring result = env->NewStringUTF(&infoLog[0]);
            return result;
     */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetShaderPrecisionFormat([int shadertype, 
     * int precisiontype, int[] range, int rangeOffset, int[] precision, int precisionOffset]);
     * 
     *  C function void glGetShaderPrecisionFormat((GLenum) shadertype, 
     *                                              (GLenum) precisiontype, 
     *                                              (GLint *) range, 
     *                                              (GLint *) precision )

     * */
    public void glGetShaderPrecisionFormat(int shadertype, 
                                           int precisiontype, 
                                           int[] range, int rangeOffset, 
                                           int[] precision, int precisionOffset) {
        checkArray(range, rangeOffset, 1, "range");
        checkArray(precision, precisionOffset, 1, "precision");
        nGLGetShaderPrecisionFormat(shadertype, precisiontype, range, rangeOffset, precision, precisionOffset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetShaderPrecisionFormat([int shadertype, int precisiontype, int[] range, int rangeOffset, int[] precision, int precisionOffset]);
     * 
     *  C function void glGetShaderPrecisionFormat((GLenum) shadertype, (GLenum) precisiontype, (GLint *) range, (GLint *) precision )

     * */
    private static native void nGLGetShaderPrecisionFormat(int shadertype,
                                                           int precisiontype,
                                                           int[] range, int rangeOffset,
                                                           int[] precision, int precisionOffset);/*
            glGetShaderPrecisionFormat((GLenum) shadertype, 
                                         (GLenum) precisiontype, 
                                         (GLint *) &range[rangeOffset], 
                                         (GLint *) &precision[precisionOffset]);   
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetShaderPrecisionFormat([int shadertype, int precisiontype, java.nio.IntBuffer range, java.nio.IntBuffer precision]);
     * <pre>
     *  C function void glGetShaderPrecisionFormat((GLenum) shadertype, (GLenum) precisiontype, (GLint *) range, (GLint *) precision )
      * </pre>
     * */
    public void glGetShaderPrecisionFormat(int shadertype, 
                                           int precisiontype, 
                                           java.nio.IntBuffer range,
                                           java.nio.IntBuffer precision) {
        checkBuffer(range, 1, "range");
        checkBuffer(precision, 1, "precision");
        int rangeOffset = getOffset(range);
        int precisionOffset = getOffset(precision);
        
        if(range.isDirect() && precision.isDirect()){
            nGLGetShaderPrecisionFormat(shadertype, 
                                        precisiontype, 
                                        range, rangeOffset, 
                                        precision, precisionOffset); 
        }else{
            int[] rangeArray = range.array();
            int[] preArray = precision.array();
            nGLGetShaderPrecisionFormat(shadertype, 
                                        precisiontype, 
                                        rangeArray, rangeOffset, 
                                        preArray, precisionOffset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetShaderPrecisionFormat([int shadertype, int precisiontype, java.nio.IntBuffer range, java.nio.IntBuffer precision]);
     * 
     *  C function void glGetShaderPrecisionFormat((GLenum) shadertype, (GLenum) precisiontype, (GLint *) range, (GLint *) precision )

     * */
    private static native void nGLGetShaderPrecisionFormat(int shadertype, 
                                                           int precisiontype,  
                                                           java.nio.IntBuffer range, int rangeOffset,
                                                           java.nio.IntBuffer precision, int precisionOffset);/*      
      
          glGetShaderPrecisionFormat( (GLenum) shadertype, 
                                        (GLenum) precisiontype,         
                                        (GLint *) &range[rangeOffset], 
                                        (GLint *) &precision[precisionOffset]); 
      
    
    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetShaderSource([int shader, int bufsize, int[] length, int lengthOffset, byte[] source, int sourceOffset]);
     * 
     *  C function void glGetShaderSource((GLuint) shader, (GLsizei) bufsize, (GLsizei) *length, char *source )

     * */
    public void glGetShaderSource( int shader, int bufsize, 
                                   int[] length, int lengthOffset, 
                                   byte[] source, int sourceOffset) {
        
        checkArray(length, lengthOffset, 1, LENGTH);
        checkArray(source, sourceOffset, 1, "source");
        GLES20Pipeline.nGLGetShaderSource(shader, bufsize, length, lengthOffset, source, sourceOffset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetShaderSource([int shader, int bufsize, int[] length, int lengthOffset, byte[] source, int sourceOffset]);
     * 
     *  C function void glGetShaderSource((GLuint) shader, (GLsizei) bufsize, (GLsizei *) length, char *source )

     * */
    private static native void nGLGetShaderSource(int shader, 
                                                  int bufsize, 
                                                  int[] length, int lengthOffset, 
                                                  byte[] source, int sourceOffset);/*
           // get the source
            glGetShaderSource((GLuint) shader, 
                                (GLsizei) bufsize, 
                                (GLsizei *)(length + lengthOffset), 
                                (char *)(source +sourceOffset));                    
    */

    /**
     * 
     *<pre>
     * Delegate Method generated from GLES20.glGetShaderSource([int shader, int bufsize, java.nio.IntBuffer length, byte source]);
     * 
     *  @hide Method is broken, but used to be public (b/6006380) */
    @Deprecated
    public void glGetShaderSource(int shader, int bufsize, java.nio.IntBuffer length, byte source) {
       // GLES20Pipeline.nGLGetShaderSource(shader, bufsize, length, source);
            
            throw new UnsupportedOperationException("Method "
                            + " void glGetShaderSource(int, int, java.nio.IntBuffer, java.nio.IntBuffer, byte) is broken. "
                            + "Use: \n"
                            + " String glGetShaderSource(int )");
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetShaderSource([int shader, int bufsize, java.nio.IntBuffer length, byte source]);
     *  @hide Method is broken, but used to be public (b/6006380) */
    @Deprecated
    private static void nGLGetShaderSource(int shader, int bufsize, java.nio.IntBuffer length, byte source){}/*
                     //nop
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetShaderSource([int shader]);
     * 
     *  C function void glGetShaderSource((GLuint) shader, (GLsizei) bufsize, (GLsizei) *length, char *source )

     * */
    public String glGetShaderSource(int shader) {
            return  GLES20Pipeline.nGLGetShaderSource(shader);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetShaderSource([int shader]);
     * 
     *  C function void glGetShaderSource((GLuint) shader, (GLsizei) bufsize, (GLsizei) *length, char *source )

     * */
    private static native String nGLGetShaderSource(int shader);/*
            GLint maxLength = 0;
            glGetShaderiv(shader, GL_SHADER_SOURCE_LENGTH, &maxLength);
            
           // The maxLength includes the NULL character
           std::vector<GLchar> source(maxLength + 1);
    
           glGetShaderSource((GLuint) shader, maxLength + 1, &maxLength, &source[0]);
           jstring result = env->NewStringUTF(&source[0]);
           return result;        
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetString([int name]);
     * 
     *  C function const GLubyte * glGetString((GLenum) name )

     * */
    public String glGetString(int name) {
            return GLES20Pipeline.nGLGetString(name);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetString([int name]);
     * 
     *  C function const GLubyte * glGetString((GLenum) name )

     * */
    private static native String nGLGetString(int name);/*
             const GLubyte* value = glGetString( (GLenum) name);
             const char * valueCast = reinterpret_cast<const char*>(value);
             jstring result = env->NewStringUTF( valueCast );
             return result;    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetTexParameterfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexParameterfv((GLenum) target, (GLenum) pname, (GLfloat) *params )

     * */
    public void glGetTexParameterfv(int target, int pname, float[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES20Pipeline.nGLGetTexParameterfv(target, pname, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetTexParameterfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexParameterfv((GLenum) target, (GLenum) pname, (GLfloat *)params )
     * */
    private static native void nGLGetTexParameterfv(int target, int pname, float[] params, int offset);/*
            glGetTexParameterfv((GLenum) target, (GLenum) pname,  (GLfloat *)  (params + offset));    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetTexParameterfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexParameterfv((GLenum) target, (GLenum) pname, (GLfloat) *params )
     * */
    public void glGetTexParameterfv(int target, int pname, java.nio.FloatBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if (params.isDirect()) {
            nGLGetTexParameterfv(target, pname, params, offset);
        } else {
            float[] array = params.array();
            nGLGetTexParameterfv(target, pname, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetTexParameterfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexParameterfv((GLenum) target, (GLenum) pname, (GLfloat) *params )

     * */
    private static native void nGLGetTexParameterfv(int target, int pname, java.nio.FloatBuffer params, int offset);/*
            glGetTexParameterfv((GLenum) target, (GLenum) pname,  (GLfloat *)  (params + offset) );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetTexParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameteriv((GLenum) target, (GLenum) pname, (GLint *) params )

     * */
    public void glGetTexParameteriv(int target, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES20Pipeline.nGLGetTexParameteriv(target, pname, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetTexParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameteriv((GLenum) target, (GLenum) pname, (GLint *) params )

     * */
    private static native void nGLGetTexParameteriv(int target, int pname, int[] params, int offset);/*
            glGetTexParameteriv((GLenum) target, (GLenum) pname,  (GLint *)  (params + offset) );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetTexParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameteriv((GLenum) target, (GLenum) pname, (GLint *) params )

     * */
    public void glGetTexParameteriv(int target, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES20Pipeline.nGLGetTexParameteriv(target, pname, params, offset);
        }else{
            int[] array = params.array();
            GLES20Pipeline.nGLGetTexParameteriv(target, pname, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetTexParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameteriv((GLenum) target, (GLenum) pname, (GLint *) params )

     * */
    private static native void nGLGetTexParameteriv(int target, int pname, java.nio.IntBuffer params, int offset);/*
            glGetTexParameteriv((GLenum) target, (GLenum) pname,  (GLint *)  (params + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetUniformfv([int program, int location, float[] params, int offset]);
     * 
     *  C function void glGetUniformfv((GLuint) program, (GLint) location, (GLfloat) *params )

     * */
    public void glGetUniformfv(int program, int location, float[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES20Pipeline.nGLGetUniformfv(program, location, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetUniformfv([int program, int location, float[] params, int offset]);
     * 
     *  C function void glGetUniformfv((GLuint) program, (GLint) location, (GLfloat) *params )

     * */
    private static native void nGLGetUniformfv(int program, int location, float[] params, int offset);/*
            glGetUniformfv((GLuint) program, (GLint) location, (GLfloat *) (params + offset) );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetUniformfv([int program, int location, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetUniformfv((GLuint) program, (GLint) location, (GLfloat) *params )

     * */
    public void glGetUniformfv(int program, int location, java.nio.FloatBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES20Pipeline.nGLGetUniformfv(program, location, params, offset);
        }else{
            float[] array = params.array();
            GLES20Pipeline.nGLGetUniformfv(program, location, array, offset);
        }        
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetUniformfv([int program, int location, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetUniformfv((GLuint) program, (GLint) location, (GLfloat) *params )

     * */
    private static native void nGLGetUniformfv(int program, int location, java.nio.FloatBuffer params, int offset);/*
            glGetUniformfv((GLuint) program, (GLint) location, (GLfloat *) (params + offset));    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetUniformiv([int program, int location, int[] params, int offset]);
     * 
     *  C function void glGetUniformiv((GLuint) program, (GLint) location, (GLint *) params )

     * */
    public void glGetUniformiv(int program, int location, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES20Pipeline.nGLGetUniformiv(program, location, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetUniformiv([int program, int location, int[] params, int offset]);
     * 
     *  C function void glGetUniformiv((GLuint) program, (GLint) location, (GLint *) params )

     * */
    private static native void nGLGetUniformiv(int program, int location, int[] params, int offset);/*
            glGetUniformiv((GLuint) program, (GLint) location, (GLint *) (params + offset)  );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetUniformiv([int program, int location, java.nio.IntBuffer params]);
     * 
     *  C function void glGetUniformiv((GLuint) program, (GLint) location, (GLint *) params )
     * */
    public void glGetUniformiv(int program, int location, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES20Pipeline.nGLGetUniformiv(program, location, params, offset);
        }else{
            int[] array = params.array();
            GLES20Pipeline.nGLGetUniformiv(program, location, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetUniformiv([int program, int location, java.nio.IntBuffer params]);
     * 
     *  C function void glGetUniformiv((GLuint) program, (GLint) location, (GLint *) params )
     * */
    private static native void nGLGetUniformiv(int program, int location, java.nio.IntBuffer params, int offset);/*
            glGetUniformiv((GLuint) program, (GLint) location, (GLint *) (params + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetUniformLocation([int program, String name]);
     * 
     *  C function (GLint) glGetUniformLocation((GLuint) program, const char *name )

     * */
    public int glGetUniformLocation(int program, String name) {
       if(null == name) throw new IllegalArgumentException("name == null"); 
       return  GLES20Pipeline.nGLGetUniformLocation(program, name);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetUniformLocation([int program, String name]);
     * 
     *  C function (GLint) glGetUniformLocation((GLuint) program, const char *name )

     * */
    private static native int nGLGetUniformLocation(int program, String name);/*
            return (jint) glGetUniformLocation((GLuint) program, name );                                    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetVertexAttribfv([int index, int pname, float[] params, int offset]);
     * 
     *  C function void glGetVertexAttribfv((GLuint) index, (GLenum) pname, (GLfloat) *params )

     * */
    public void glGetVertexAttribfv(int index, int pname, float[] params, int offset) {
        int needed = pname == GL_CURRENT_VERTEX_ATTRIB ? 4 : 1;        
        checkArray(params, offset, needed, PARAMS);
        GLES20Pipeline.nGLGetVertexAttribfv(index, pname, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetVertexAttribfv([int index, int pname, float[] params, int offset]);
     * 
     *  C function void glGetVertexAttribfv((GLuint) index, (GLenum) pname, (GLfloat) *params )

     * */
    private static native void nGLGetVertexAttribfv(int index, int pname, float[] params, int offset);/*                                    
            glGetVertexAttribfv((GLuint) index, (GLenum) pname,  (GLfloat *) (params + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetVertexAttribfv([int index, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetVertexAttribfv((GLuint) index, (GLenum) pname, (GLfloat) *params )

     * */
    public void glGetVertexAttribfv(int index, int pname, java.nio.FloatBuffer params) {
        int needed = pname == GL_CURRENT_VERTEX_ATTRIB ? 4 : 1;   
        checkBuffer(params, needed, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES20Pipeline.nGLGetVertexAttribfv(index, pname, params, offset);
        }else{
            float[] array = params.array();
            GLES20Pipeline.nGLGetVertexAttribfv(index, pname, array, offset);
        }       
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetVertexAttribfv([int index, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetVertexAttribfv((GLuint) index, (GLenum) pname, (GLfloat) *params )

     * */
    private static native void nGLGetVertexAttribfv(int index, int pname, java.nio.FloatBuffer params, int offset);/*
            glGetVertexAttribfv((GLuint) index, (GLenum) pname,  (GLfloat *)(params + offset) );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetVertexAttribiv([int index, int pname, int[] params, int offset]);
     * 
     *  C function void glGetVertexAttribiv((GLuint) index, (GLenum) pname, (GLint *) params )

     * */
    public void glGetVertexAttribiv(int index, int pname, int[] params, int offset) {
        int _needed = (pname == GL_CURRENT_VERTEX_ATTRIB) ? 4 : 1;        
        checkArray(params, offset, _needed, PARAMS);
        GLES20Pipeline.nGLGetVertexAttribiv(index, pname, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetVertexAttribiv([int index, int pname, int[] params, int offset]);
     * 
     *  C function void glGetVertexAttribiv((GLuint) index, (GLenum) pname, (GLint *) params )

     * */
    private static native void nGLGetVertexAttribiv(int index, int pname, int[] params, int offset);/*
            glGetVertexAttribiv((GLuint) index, (GLenum) pname,  (GLint *)  (params + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glGetVertexAttribiv([int index, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetVertexAttribiv((GLuint) index, (GLenum) pname, (GLint *) params )

     * */
    public void glGetVertexAttribiv(int index, int pname, java.nio.IntBuffer params) {
        int _needed = pname == GL_CURRENT_VERTEX_ATTRIB ? 4 : 1;   
        checkBuffer(params, _needed, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES20Pipeline.nGLGetVertexAttribiv(index, pname, params, offset);
        }else{
            int[] array = params.array();
            GLES20Pipeline.nGLGetVertexAttribiv(index, pname, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glGetVertexAttribiv([int index, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetVertexAttribiv((GLuint) index, (GLenum) pname, (GLint *) params )

     * */
    private static native void nGLGetVertexAttribiv(int index, int pname, java.nio.IntBuffer params, int offset);/*
            glGetVertexAttribiv((GLuint) index, (GLenum) pname,  (GLint *) (params + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glHint([int target, int mode]);
     * 
     *  C function void glHint((GLenum) target, (GLenum) mode )

     * */
    public void glHint(int target, int mode) {
        GLES20Pipeline.nGLHint(target, mode);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glHint([int target, int mode]);
     * 
     *  C function void glHint((GLenum) target, (GLenum) mode )

     * */
    private static native void nGLHint(int target, int mode);/*
            glHint((GLenum) target, (GLenum) mode );                                    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glIsBuffer([int buffer]);
     * 
     *  C function (GLboolean)  glIsBuffer((GLuint) buffer )

     * */
    public boolean glIsBuffer(int buffer) {
            return  GLES20Pipeline.nGLIsBuffer(buffer);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glIsBuffer([int buffer]);
     * 
     *  C function (GLboolean)  glIsBuffer((GLuint) buffer )

     * */
    private static native boolean nGLIsBuffer(int buffer);/*    
            return (jboolean)  glIsBuffer( (GLuint) buffer );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glIsEnabled([int cap]);
     * 
     *  C function (GLboolean)  glIsEnabled((GLenum) cap )

     * */
    public boolean glIsEnabled(int cap) {
            return  GLES20Pipeline.nGLIsEnabled(cap);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glIsEnabled([int cap]);
     * 
     *  C function (GLboolean)  glIsEnabled((GLenum) cap )

     * */
    private static native boolean nGLIsEnabled(int cap);/*
            return (jboolean)  glIsEnabled((GLenum) cap );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glIsFramebuffer([int framebuffer]);
     * 
     *  C function (GLboolean)  glIsFramebuffer((GLuint) framebuffer )
     * */
    public boolean glIsFramebuffer(int framebuffer) {
            return  GLES20Pipeline.nGLIsFramebuffer(framebuffer);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glIsFramebuffer([int framebuffer]);
     * 
     *  C function (GLboolean)  glIsFramebuffer((GLuint) framebuffer )
     * */
    private static native boolean nGLIsFramebuffer(int framebuffer);/*
          return (jboolean)  glIsFramebuffer((GLuint) framebuffer );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glIsProgram([int program]);
     * 
     *  C function (GLboolean)  glIsProgram((GLuint) program )
     * */
    public boolean glIsProgram(int program) {
            return  GLES20Pipeline.nGLIsProgram(program);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glIsProgram([int program]);
     * 
     *  C function (GLboolean)  glIsProgram((GLuint) program )
     * */
    private static native boolean nGLIsProgram(int program);/*
            return (jboolean)  glIsProgram((GLuint) program );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glIsRenderbuffer([int renderbuffer]);
     * 
     *  C function (GLboolean)  glIsRenderbuffer((GLuint) renderbuffer )
     * */
    public boolean glIsRenderbuffer(int renderbuffer) {
       return GLES20Pipeline.nGLIsRenderbuffer(renderbuffer);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glIsRenderbuffer([int renderbuffer]);
     * 
     *  C function (GLboolean)  glIsRenderbuffer((GLuint) renderbuffer )

     * */
    private static native boolean nGLIsRenderbuffer(int renderbuffer);/*
            return (jboolean)  glIsRenderbuffer((GLuint) renderbuffer );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glIsShader([int shader]);
     * 
     *  C function (GLboolean)  glIsShader((GLuint) shader )

     * */
    public boolean glIsShader(int shader) {
       return GLES20Pipeline.nGLIsShader(shader);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glIsShader([int shader]);
     * 
     *  C function (GLboolean)  glIsShader((GLuint) shader )

     * */
    private static native boolean nGLIsShader(int shader);/*    
            return (jboolean)  glIsShader((GLuint) shader );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glIsTexture([int texture]);
     * 
     *  C function (GLboolean)  glIsTexture((GLuint) texture )

     * */
    public boolean glIsTexture(int texture) {
       return GLES20Pipeline.nGLIsTexture(texture);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glIsTexture([int texture]);
     * 
     *  C function (GLboolean)  glIsTexture((GLuint) texture )

     * */
    private static native boolean nGLIsTexture(int texture);/*    
            return  (jboolean)  glIsTexture((GLuint) texture );
    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glLineWidth([float width]);
     * 
     *  C function void glLineWidth((GLfloat) width )

     * */
    public void glLineWidth(float width) {
        GLES20Pipeline.nGLLineWidth(width);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glLineWidth([float width]);
     * 
     *  C function void glLineWidth((GLfloat) width )

     * */
    private static native void nGLLineWidth(float width);/*
            glLineWidth( (GLfloat) width );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glLinkProgram([int program]);
     * 
     *  C function void glLinkProgram((GLuint) program )

     * */
    public void glLinkProgram(int program) {
        GLES20Pipeline.nGLLinkProgram(program);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glLinkProgram([int program]);
     * 
     *  C function void glLinkProgram((GLuint) program )

     * */
    private static native void nGLLinkProgram(int program);/*    
            glLinkProgram ((GLuint) program );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glPixelStorei([int pname, int param]);
     * 
     *  C function void glPixelStorei((GLenum) pname, (GLint) param )

     * */
    public void glPixelStorei(int pname, int param) {
        GLES20Pipeline.nGLPixelStorei(pname, param);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glPixelStorei([int pname, int param]);
     * 
     *  C function void glPixelStorei((GLenum) pname, (GLint) param )

     * */
    private static native void nGLPixelStorei(int pname, int param);/*
            glPixelStorei ((GLenum) pname, (GLint) param );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glPolygonOffset([float factor, float units]);
     * 
     *  C function void glPolygonOffset((GLfloat) factor, (GLfloat) units )

     * */
    public void glPolygonOffset(float factor, float units) {
        GLES20Pipeline.nGLPolygonOffset(factor, units);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glPolygonOffset([float factor, float units]);
     * 
     *  C function void glPolygonOffset((GLfloat) factor, (GLfloat) units )

     * */
    private static native void nGLPolygonOffset(float factor, float units);/*
            glPolygonOffset((GLfloat) factor, (GLfloat) units );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glReadPixels([int x, int y, int width, int height, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glReadPixels((GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height, (GLenum) format, (GLenum) type, GLvoid *pixels )

     * */
    public void glReadPixels( int x, int y, 
                              int width, int height, 
                              int format, 
                              int type, 
                              java.nio.Buffer pixels) {
        checkBuffer(pixels, 1, PIXELS);
        int offset = getOffset(pixels);
        if(pixels.isDirect()){
            GLES20Pipeline.nGLReadPixels(x, y, width, height, format, type, pixels, offset);
        }else{
           throw new  IllegalArgumentException("Invalid Buffer - pixels must be a direct Buffer"); 
        }        
    }

    /**
     *<pre>
     * Native method generated from GLES20.glReadPixels([int x, int y, int width, int height, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glReadPixels((GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height, (GLenum) format, (GLenum) type, GLvoid *pixels )

     * */
    private static native void nGLReadPixels( int x, int y, 
                                              int width, int height, 
                                              int format, int type, 
                                              java.nio.Buffer pixels, int offset);/*
            // apply correct offset
            unsigned char* pixBuffer = (pixels + offset); 
            // do the call              
            glReadPixels((GLint) x, 
                         (GLint) y, 
                         (GLsizei) width, 
                         (GLsizei) height, 
                         (GLenum) format, 
                         (GLenum) type, 
                         (GLvoid *) pixBuffer );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glReleaseShaderCompiler();
     * 
     *  C function void glReleaseShaderCompiler(void )

     * */
    public void glReleaseShaderCompiler() {
        GLES20Pipeline.nGLReleaseShaderCompiler();
    }

    /**
     *<pre>
     * Native method generated from GLES20.glReleaseShaderCompiler();
     * 
     *  C function void glReleaseShaderCompiler(void )

     * */
    private static native void nGLReleaseShaderCompiler();/*    
            glReleaseShaderCompiler();
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glRenderbufferStorage([int target, int internalformat, int width, int height]);
     * 
     *  C function void glRenderbufferStorage((GLenum) target, (GLenum) internalformat, (GLsizei) width, (GLsizei) height )

     * */
    public void glRenderbufferStorage(int target, int internalformat, int width, int height) {
        GLES20Pipeline.nGLRenderbufferStorage(target, internalformat, width, height);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glRenderbufferStorage([int target, int internalformat, int width, int height]);
     * 
     *  C function void glRenderbufferStorage((GLenum) target, (GLenum) internalformat, (GLsizei) width, (GLsizei) height )

     * */
    private static native void nGLRenderbufferStorage(int target, int internalformat, int width, int height);/*
            glRenderbufferStorage((GLenum) target, (GLenum) internalformat, (GLsizei) width, (GLsizei) height );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glSampleCoverage([float value, boolean invert]);
     * 
     *  C function void glSampleCoverage(GLclampf value, (GLboolean)  invert )

     * */
    public void glSampleCoverage(float value, boolean invert) {
        GLES20Pipeline.nGLSampleCoverage(value, invert);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glSampleCoverage([float value, boolean invert]);
     * 
     *  C function void glSampleCoverage(GLclampf value, (GLboolean)  invert )

     * */
    private static native void nGLSampleCoverage(float value, boolean invert);/*
            glSampleCoverage((GLclampf) value, (GLboolean)  invert );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glScissor([int x, int y, int width, int height]);
     * 
     *  C function void glScissor((GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height )

     * */
    public void glScissor(int x, int y, int width, int height) {
        GLES20Pipeline.nGLScissor(x, y, width, height);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glScissor([int x, int y, int width, int height]);
     * 
     *  C function void glScissor((GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height )

     * */
    private static native void nGLScissor(int x, int y, int width, int height);/*
            glScissor((GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glShaderBinary([int n, int[] shaders, int offset, int binaryformat, java.nio.Buffer binary, int length]);
     * 
     *  C function void glShaderBinary((GLsizei) n, const (GLuint) *shaders, (GLenum) binaryformat, const GLvoid *binary, (GLsizei) length )

     * */
    public void glShaderBinary( int n,
                                int[] shaders, int offset,
                                int binaryformat,
                                java.nio.Buffer binary, int length) 
    {
        checkArray(shaders, offset, 1, SHADERS2);
        checkBuffer(binary, length,  BUFFERS);   
        GLES20Pipeline.nGLShaderBinary(n, shaders, offset, binaryformat, binary, length, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glShaderBinary([int n, int[] shaders, int offset, int binaryformat, java.nio.Buffer binary, int length]);
     * 
     *  C function void glShaderBinary((GLsizei) n, const (GLuint) *shaders, (GLenum) binaryformat, const GLvoid *binary, (GLsizei) length )

     * */
    private static native void nGLShaderBinary(int n,
                                               int[] shaders, int offset,
                                               int binaryformat,
                                               java.nio.Buffer binary, int binaryOffset,
                                               int length);/*
             unsigned char * binBuffer = (binary + binaryOffset);                                  
             glShaderBinary((GLsizei) n, 
                              (GLuint *) &shaders[offset], 
                              (GLenum) binaryformat, 
                              (GLvoid *) binBuffer, 
                              (GLsizei) length );  
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glShaderBinary([int n, java.nio.IntBuffer shaders, int binaryformat, java.nio.Buffer binary, int length]);
     * 
     *  C function void glShaderBinary((GLsizei) n, const (GLuint) *shaders, (GLenum) binaryformat, const GLvoid *binary, (GLsizei) length )

     * */
    public void glShaderBinary(int n, 
                               java.nio.IntBuffer shaders, 
                               int binaryformat, 
                               java.nio.Buffer binary, 
                               int length) 
    {
        checkBuffer(shaders, 1, SHADERS2);
        checkBuffer(binary, length, "binary");
        
        int shadersOffset = getOffset(shaders);
        int binaryOffset = getOffset(binary);
       
        if (shaders.isDirect()) {
            GLES20Pipeline.nGLShaderBinary(n,
                    shaders, shadersOffset,
                    binaryformat,
                    binary, binaryOffset,
                    length);
        } else {
            int[] array = shaders.array();
            GLES20Pipeline.nGLShaderBinary(n,
                    array, shadersOffset,
                    binaryformat,
                    binary, binaryOffset,
                    length);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glShaderBinary([int n, java.nio.IntBuffer shaders, int binaryformat, java.nio.Buffer binary, int length]);
     * 
     *  C function void glShaderBinary((GLsizei) n, const (GLuint) *shaders, (GLenum) binaryformat, const GLvoid *binary, (GLsizei) length )

     * */
    private static native void nGLShaderBinary(int n,
            java.nio.IntBuffer shaders, int shadersOffset,  
            int binaryformat,
            java.nio.Buffer binary, int binaryOffset,
            int length);/*
                                                                   
            // native code        
            unsigned char * binBuffer = (unsigned char *) (binary + binaryOffset);        
            glShaderBinary(  (GLsizei) n, 
                             (GLuint *) (shaders + shadersOffset), 
                             (GLenum) binaryformat, 
                             (GLvoid *) binBuffer, 
                             (GLsizei) length );
    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glShaderSource([int shader, String string]);
     * 
     *  C function void glShaderSource((GLuint) shader, (GLsizei) count, const GLchar ** string, const GLint* length )

     * */
    public void glShaderSource(int shaderID, String string) {
        if(null == string) throw new IllegalArgumentException("string == null");
        GLES20Pipeline.nGLShaderSource(shaderID, string);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glShaderSource([int shader, String string]);
     * 
     *  C function void glShaderSource((GLuint) shader, (GLsizei) count, const GLchar ** string, const GLint* length )

     * */
    private static native void nGLShaderSource(int shader, String source);/*
            //Send the vertex shader source code to GL
            // GL expects an array of strings
            const char* strings[] = {source};                                                                
            glShaderSource((GLuint)shader, 1, strings, 0);
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glStencilFunc([int func, int ref, int mask]);
     * 
     *  C function void glStencilFunc((GLenum) func, (GLint) ref, (GLuint) mask )

     * */
    public void glStencilFunc(int func, int ref, int mask) {
        GLES20Pipeline.nGLStencilFunc(func, ref, mask);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glStencilFunc([int func, int ref, int mask]);
     * 
     *  C function void glStencilFunc((GLenum) func, (GLint) ref, (GLuint) mask )

     * */
    private static native void nGLStencilFunc(int func, int ref, int mask);/*     
               glStencilFunc((GLenum) func, (GLint) ref, (GLuint) mask );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glStencilFuncSeparate([int face, int func, int ref, int mask]);
     * 
     *  C function void glStencilFuncSeparate((GLenum) face, (GLenum) func, (GLint) ref, (GLuint) mask )

     * */
    public void glStencilFuncSeparate(int face, int func, int ref, int mask) {
        GLES20Pipeline.nGLStencilFuncSeparate(face, func, ref, mask);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glStencilFuncSeparate([int face, int func, int ref, int mask]);
     * 
     *  C function void glStencilFuncSeparate((GLenum) face, (GLenum) func, (GLint) ref, (GLuint) mask )

     * */
    private static native void nGLStencilFuncSeparate(int face, int func, int ref, int mask);/*
            glStencilFuncSeparate( (GLenum) face, (GLenum) func, (GLint) ref, (GLuint) mask );
     */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glStencilMask([int mask]);
     * 
     *  C function void glStencilMask((GLuint) mask )

     * */
    public void glStencilMask(int mask) {
        GLES20Pipeline.nGLStencilMask(mask);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glStencilMask([int mask]);
     * 
     *  C function void glStencilMask((GLuint) mask )

     * */
    private static native void nGLStencilMask(int mask);/*
            glStencilMask((GLuint) mask );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glStencilMaskSeparate([int face, int mask]);
     * 
     *  C function void glStencilMaskSeparate((GLenum) face, (GLuint) mask )
     * */
    public void glStencilMaskSeparate(int face, int mask) {
        GLES20Pipeline.nGLStencilMaskSeparate(face, mask);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glStencilMaskSeparate([int face, int mask]);
     * 
     *  C function void glStencilMaskSeparate((GLenum) face, (GLuint) mask )
     * */
    private static native void nGLStencilMaskSeparate(int face, int mask);/*
            glStencilMaskSeparate( (GLenum) face, (GLuint) mask );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glStencilOp([int fail, int zfail, int zpass]);
     * 
     *  C function void glStencilOp((GLenum) fail, (GLenum) zfail, (GLenum) zpass )
     * */
    public void glStencilOp(int fail, int zfail, int zpass) {
        GLES20Pipeline.nGLStencilOp(fail, zfail, zpass);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glStencilOp([int fail, int zfail, int zpass]);
     * 
     *  C function void glStencilOp((GLenum) fail, (GLenum) zfail, (GLenum) zpass )

     * */
    private static native void nGLStencilOp(int fail, int zfail, int zpass);/*
             glStencilOp( (GLenum) fail, (GLenum) zfail, (GLenum) zpass );
     */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glStencilOpSeparate([int face, int fail, int zfail, int zpass]);
     * 
     *  C function void glStencilOpSeparate((GLenum) face, (GLenum) fail, (GLenum) zfail, (GLenum) zpass )

     * */
    public void glStencilOpSeparate(int face, int fail, int zfail, int zpass) {
        GLES20Pipeline.nGLStencilOpSeparate(face, fail, zfail, zpass);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glStencilOpSeparate([int face, int fail, int zfail, int zpass]);
     * 
     *  C function void glStencilOpSeparate((GLenum) face, (GLenum) fail, (GLenum) zfail, (GLenum) zpass )

     * */
    private static native void nGLStencilOpSeparate(int face, int fail, int zfail, int zpass);/*
            glStencilOpSeparate((GLenum) face, (GLenum) fail, (GLenum) zfail, (GLenum) zpass );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glTexImage2D([int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexImage2D((GLenum) target, 
     *                                 (GLint) level, 
     *                                 (GLint) internalformat, 
     *                                 (GLsizei) width, (GLsizei) height, 
     *                                 (GLint) border, 
     *                                 (GLenum) format, 
     *                                 (GLenum) type, const GLvoid *pixels )

     * */
    public void glTexImage2D(int target, 
                    int level, 
                    int internalformat,
                    int width, int height, 
                    int border, int format, 
                    int type, 
                    java.nio.Buffer pixels) 
    {
        checkBuffer(pixels, width * height, PIXELS);
        
        if (pixels.isDirect()) {
            int offsetBytes = getOffset(pixels);
            GLES20Pipeline.nGLTexImage2D(target, 
                    level, 
                    internalformat, 
                    width, height, 
                    border, format, 
                    type, 
                    pixels, offsetBytes);
        } else {
            if(pixels instanceof ByteBuffer){
                ByteBuffer bb = (ByteBuffer)pixels;
                int offset = getOffset(bb);
                byte[] array = bb.array();
                GLES20Pipeline.nGLTexImage2D(target, 
                        level, 
                        internalformat, 
                        width, height, 
                        border, format, 
                        type, 
                        array, offset);
                return;
            }else if(pixels instanceof ShortBuffer){
                ShortBuffer bb = (ShortBuffer)pixels;
                int offset = getOffset(bb);
                short[] array = bb.array();
                GLES20Pipeline.nGLTexImage2D(target, 
                        level, 
                        internalformat, 
                        width, height, 
                        border, format, 
                        type, 
                        array, offset);
                return;
            } else if(pixels instanceof IntBuffer){
                IntBuffer bb = (IntBuffer)pixels;
                int offset = getOffset(bb);
                int[] array = bb.array();
                GLES20Pipeline.nGLTexImage2D(target, 
                        level, 
                        internalformat, 
                        width, height, 
                        border, format, 
                        type, 
                        array, offset);
                return;
            }else if(pixels instanceof FloatBuffer){
                FloatBuffer bb = (FloatBuffer)pixels;
                int offset = getOffset(bb);
                float[] array = bb.array();
                GLES20Pipeline.nGLTexImage2D(target, 
                        level, 
                        internalformat, 
                        width, height, 
                        border, format, 
                        type, 
                        array, offset);
                return;
            }else        
            throw new RuntimeException("Invalid Buffer!");
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glTexImage2D([int target, int level, 
     *   int internalformat, int width, int height, int border, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexImage2D((GLenum) target, 
     *                                 (GLint) level, 
     *                                 (GLint) internalformat, 
     *                                 (GLsizei) width, 
     *                                 (GLsizei) height, 
     *                                 (GLint) border, 
     *                                 (GLenum) format, 
     *                                 (GLenum) type, 
     *                                 (const GLvoid *) pixels );

     * */
    private static native void nGLTexImage2D(int target, 
                    int level, 
                    int internalformat, 
                    int width,  int height, 
                    int border, int format, 
                    int type, 
                    java.nio.Buffer pixels, int offsetBytes);/*

           // offset       
            char * pixels0 = (char *) (pixels + offsetBytes);        
                    
            glTexImage2D((GLenum) target, 
                           (GLint) level, 
                           (GLint) internalformat, 
                           (GLsizei) width, 
                           (GLsizei) height,
                           (GLint) border,
                           (GLenum) format, 
                           (GLenum) type, 
                           (GLvoid *) pixels0 );
                                                    
      */
    
    private static native void nGLTexImage2D(int target, 
                                             int level, 
                                             int internalformat, 
                                             int width,  int height, 
                                             int border, int format, 
                                             int type, 
                                             byte[] pixels, int offset);/*
           glTexImage2D( (GLenum) target, 
                         (GLint) level, 
                         (GLint) internalformat, 
                         (GLsizei) width, 
                         (GLsizei) height,
                         (GLint) border,
                         (GLenum) format, 
                         (GLenum) type, 
                         (GLvoid *) (pixels + offset));
    */
    
    private static native void nGLTexImage2D(int target, 
                                             int level, 
                                             int internalformat, 
                                             int width,  int height, 
                                             int border, int format, 
                                             int type, 
                                             short[] pixels, int offset);/*
           glTexImage2D( (GLenum) target, 
                         (GLint) level, 
                         (GLint) internalformat, 
                         (GLsizei) width, 
                         (GLsizei) height,
                         (GLint) border,
                         (GLenum) format, 
                         (GLenum) type, 
                         (GLvoid *) (pixels + offset));
    */
    
    private static native void nGLTexImage2D(int target, 
                                             int level, 
                                             int internalformat, 
                                             int width,  int height, 
                                             int border, int format, 
                                             int type, 
                                             int[] pixels, int offset);/*
           glTexImage2D( (GLenum) target, 
                         (GLint) level, 
                         (GLint) internalformat, 
                         (GLsizei) width, 
                         (GLsizei) height,
                         (GLint) border,
                         (GLenum) format, 
                         (GLenum) type, 
                         (GLvoid *) (pixels + offset));
    */
    
    private static native void nGLTexImage2D(int target, 
                                             int level, 
                                             int internalformat, 
                                             int width,  int height, 
                                             int border, int format, 
                                             int type, 
                                             float[] pixels, int offset);/*
           glTexImage2D( (GLenum) target, 
                         (GLint) level, 
                         (GLint) internalformat, 
                         (GLsizei) width, 
                         (GLsizei) height,
                         (GLint) border,
                         (GLenum) format, 
                         (GLenum) type, 
                         (GLvoid *) (pixels + offset));
    */
   

    /**
     *<pre>
     * Delegate Method generated from GLES20.glTexParameterf([int target, int pname, float param]);
     * 
     *  C function void glTexParameterf((GLenum) target, (GLenum) pname, (GLfloat) param )

     * */
    public void glTexParameterf(int target, int pname, float param) {
        GLES20Pipeline.nGLTexParameterf(target, pname, param);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glTexParameterf([int target, int pname, float param]);
     * 
     *  C function void glTexParameterf((GLenum) target, (GLenum) pname, (GLfloat) param )

     * */
    private static native void nGLTexParameterf(int target, int pname, float param);/*
            glTexParameterf((GLenum) target, (GLenum) pname, (GLfloat) param );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glTexParameterfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glTexParameterfv((GLenum) target, (GLenum) pname, (const (GLfloat) *)params )

     * */
    public void glTexParameterfv(int target, int pname, float[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES20Pipeline.nGLTexParameterfv(target, pname, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glTexParameterfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glTexParameterfv((GLenum) target, (GLenum) pname, (const (GLfloat) *)params )

     * */
    private static native void nGLTexParameterfv(int target, int pname, float[] params, int offset);/*
            glTexParameterfv( (GLenum) target, (GLenum) pname, (GLfloat *) (params + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glTexParameterfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glTexParameterfv((GLenum) target, (GLenum) pname, (const (GLfloat) *)params )
     * */
    public void glTexParameterfv(int target, int pname, java.nio.FloatBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES20Pipeline.nGLTexParameterfv(target, pname, params, offset);
        }else{
            GLES20Pipeline.nGLTexParameterfv(target, pname, params.array(), offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glTexParameterfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glTexParameterfv((GLenum) target, (GLenum) pname, (const (GLfloat) *)params )
     * */
    private static native void nGLTexParameterfv(int target, int pname, java.nio.FloatBuffer params, int offset);/*
            glTexParameterfv( (GLenum) target, (GLenum) pname, (GLfloat *)(params + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glTexParameteri([int target, int pname, int param]);
     * 
     *  C function void glTexParameteri((GLenum) target, (GLenum) pname, (GLint) param )

     * */
    public void glTexParameteri(int target, int pname, int param) {
        GLES20Pipeline.nGLTexParameteri(target, pname, param);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glTexParameteri([int target, int pname, int param]);
     * 
     *  C function void glTexParameteri((GLenum) target, (GLenum) pname, (GLint) param )

     * */
    private static native void nGLTexParameteri(int target, int pname, int param);/*
             glTexParameteri((GLenum) target, (GLenum) pname, (GLint) param );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glTexParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameteriv((GLenum) target, (GLenum) pname, const (GLint *) params )

     * */
    public void glTexParameteriv(int target, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES20Pipeline.nGLTexParameteriv(target, pname, params, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glTexParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameteriv((GLenum) target, (GLenum) pname, const (GLint *) params )

     * */
    private static native void nGLTexParameteriv(int target, int pname, int[] params, int offset);/*                            
            glTexParameteriv((GLenum) target, (GLenum) pname, (const GLint *) (params + offset));    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glTexParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameteriv((GLenum) target, (GLenum) pname, const (GLint *) params )

     * */
    public void glTexParameteriv(int target, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES20Pipeline.nGLTexParameteriv(target, pname, params, offset);
        }else{
            GLES20Pipeline.nGLTexParameteriv(target, pname, params.array(), offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glTexParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameteriv((GLenum) target, (GLenum) pname, const (GLint *) params )

     * */
    private static native void nGLTexParameteriv(int target, int pname, java.nio.IntBuffer params, int offset);/*
            glTexParameteriv((GLenum) target, (GLenum) pname, (GLint *) (params + offset) );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glTexSubImage2D([int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexSubImage2D((GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLsizei) width, (GLsizei) height, (GLenum) format, (GLenum) type, const GLvoid *pixels )

     * */
    public void glTexSubImage2D(int target,
                                int level,
                                int xoffset, int yoffset,
                                int width, int height,
                                int format,
                                int type,
                                java.nio.Buffer pixels) 
    {
        checkBuffer(pixels, width * height, PIXELS);
        if (pixels.isDirect()) {
            int offsetBytes = getOffset(pixels);
            GLES20Pipeline.nGLTexSubImage2D(target, level, 
                                            xoffset, yoffset, 
                                            width, height, 
                                            format, type, pixels, offsetBytes);
        } else {           
                if(pixels instanceof ByteBuffer){
                    ByteBuffer bb = (ByteBuffer)pixels;
                    int offset = getOffset(bb);
                    byte[] array = bb.array();
                    nGLTexSubImage2D(target, level, 
                            xoffset, yoffset, 
                            width, height, 
                            format, type, array, offset);
                    return;
                }else if(pixels instanceof ShortBuffer){
                    ShortBuffer bb = (ShortBuffer)pixels;
                    int offset = getOffset(bb);
                    short[] array = bb.array();
                    nGLTexSubImage2D(target, level, 
                            xoffset, yoffset, 
                            width, height, 
                            format, type, array, offset);
                    return;
                } else if(pixels instanceof IntBuffer){
                    IntBuffer bb = (IntBuffer)pixels;
                    int offset = getOffset(bb);
                    int[] array = bb.array();
                    nGLTexSubImage2D(target, level, 
                            xoffset, yoffset, 
                            width, height, 
                            format, type, array, offset);
                    return;
                }else if(pixels instanceof FloatBuffer){
                    FloatBuffer bb = (FloatBuffer)pixels;
                    int offset = getOffset(bb);
                    float[] array = bb.array();
                    nGLTexSubImage2D(target, level, 
                            xoffset, yoffset, 
                            width, height, 
                            format, type, array, offset);
                    return;
                }else       
                throw new RuntimeException("Invalid Buffer!");
            }        
    }

    /**
     *<pre>
     * Native method generated from GLES20.glTexSubImage2D([int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexSubImage2D((GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLsizei) width, (GLsizei) height, (GLenum) format, (GLenum) type, const GLvoid *pixels )

     * */
    private static native void nGLTexSubImage2D(int target,
                                                int level,
                                                int xoffset, int yoffset,
                                                int width, int height,
                                                int format,
                                                int type,
                                                java.nio.Buffer pixels, int offsetBytes);/*
            // native code        
            unsigned char * pixels0 = (unsigned char *) (pixels + offsetBytes);        
            glTexSubImage2D((GLenum) target, 
                            (GLint) level, 
                            (GLint) xoffset, 
                            (GLint) yoffset, 
                            (GLsizei) width, 
                            (GLsizei) height, 
                            (GLenum) format, 
                            (GLenum) type, 
                            (GLvoid *) pixels0 );  
    */

    
    private static native void nGLTexSubImage2D(int target,
                                                int level,
                                                int xoffset, int yoffset,
                                                int width, int height,
                                                int format,
                                                int type,
                                                byte[] pixels, int offset);/*           
            glTexSubImage2D((GLenum) target, 
                            (GLint) level, 
                            (GLint) xoffset, 
                            (GLint) yoffset, 
                            (GLsizei) width, 
                            (GLsizei) height, 
                            (GLenum) format, 
                            (GLenum) type, 
                            (GLvoid *) (pixels + offset));  
    */
    
    private static native void nGLTexSubImage2D(int target,
                                                int level,
                                                int xoffset, int yoffset,
                                                int width, int height,
                                                int format,
                                                int type,
                                                short[] pixels, int offset);/*
            glTexSubImage2D((GLenum) target, 
                            (GLint) level, 
                            (GLint) xoffset, 
                            (GLint) yoffset, 
                            (GLsizei) width, 
                            (GLsizei) height, 
                            (GLenum) format, 
                            (GLenum) type, 
                            (GLvoid *) (pixels + offset));  
    */
    
    private static native void nGLTexSubImage2D(int target,
                                                int level,
                                                int xoffset, int yoffset,
                                                int width, int height,
                                                int format,
                                                int type,
                                                int[] pixels, int offset);/*
            glTexSubImage2D((GLenum) target, 
                            (GLint) level, 
                            (GLint) xoffset, 
                            (GLint) yoffset, 
                            (GLsizei) width, 
                            (GLsizei) height, 
                            (GLenum) format, 
                            (GLenum) type, 
                            (GLvoid *) (pixels + offset));  
    */
    private static native void nGLTexSubImage2D(int target,
                                                int level,
                                                int xoffset, int yoffset,
                                                int width, int height,
                                                int format,
                                                int type,
                                                float[] pixels, int offset);/*
            glTexSubImage2D((GLenum) target, 
                            (GLint) level, 
                            (GLint) xoffset, 
                            (GLint) yoffset, 
                            (GLsizei) width, 
                            (GLsizei) height, 
                            (GLenum) format, 
                            (GLenum) type, 
                            (GLvoid *) (pixels + offset));  
    */
    
    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform1f([int location, float x]);
     * 
     *  C function void glUniform1f((GLint) location, (GLfloat) x )

     * */
    public void glUniform1f(int location, float x) {
        GLES20Pipeline.nGLUniform1f(location, x);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform1f([int location, float x]);
     * 
     *  C function void glUniform1f((GLint) location, (GLfloat) x )

     * */
    private static native void nGLUniform1f(int location, float x);/*    
            glUniform1f( (GLint) location, (GLfloat) x );
    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform1fv([int location, int count, float[] v, int offset]);
     * 
     *  C function void glUniform1fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )

     * */
    public void glUniform1fv(int location, int count, float[] v, int offset) {
        checkArray(v, offset, count, VALUES);
        GLES20Pipeline.nGLUniform1fv(location, count, v, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform1fv([int location, int count, float[] v, int offset]);
     * 
     *  C function void glUniform1fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )
     * */
    private static native void nGLUniform1fv(int location, int count, float[] v, int offset);/*
            glUniform1fv( (GLint) location, (GLsizei) count, (GLfloat *) (v +offset) );                                    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform1fv([int location, int count, java.nio.FloatBuffer v]);
     * 
     *  C function void glUniform1fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )
     * */
    public void glUniform1fv(int location, int count, java.nio.FloatBuffer v) {
        checkBuffer(v, count, VALUES);
        int offset = getOffset(v);
        if(v.isDirect()){
            GLES20Pipeline.nGLUniform1fv(location, count, v, offset);
        }else{
            float[] array = v.array();
            GLES20Pipeline.nGLUniform1fv(location, count, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform1fv([int location, int count, java.nio.FloatBuffer v]);
     * 
     *  C function void glUniform1fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )

     * */
    private static native void nGLUniform1fv(int location, int count, java.nio.FloatBuffer v, int offset);/*
            glUniform1fv((GLint) location, (GLsizei) count, (GLfloat *)(v + offset) );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform1i([int location, int x]);
     * 
     *  C function void glUniform1i((GLint) location, (GLint) x )

     * */
    public void glUniform1i(int location, int x) {
        GLES20Pipeline.nGLUniform1i(location, x);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform1i([int location, int x]);
     * 
     *  C function void glUniform1i((GLint) location, (GLint) x )

     * */
    private static native void nGLUniform1i(int location, int x);/*
            glUniform1i((GLint) location, (GLint) x );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform1iv([int location, int count, int[] v, int offset]);
     * 
     *  C function void glUniform1iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    public void glUniform1iv(int location, int count, int[] v, int offset) {
        checkArray(v, offset, count, VALUES);       
        GLES20Pipeline.nGLUniform1iv(location, count, v, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform1iv([int location, int count, int[] v, int offset]);
     * 
     *  C function void glUniform1iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    private static native void nGLUniform1iv(int location, int count, int[] v, int offset);/*
             glUniform1iv((GLint) location, (GLsizei) count, (GLint *) (v + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform1iv([int location, int count, java.nio.IntBuffer v]);
     * 
     *  C function void glUniform1iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    public void glUniform1iv(int location, int count, java.nio.IntBuffer v) {
        checkBuffer(v, count, VALUES);
        int offset = getOffset(v);
        if(v.isDirect()){
            nGLUniform1iv(location, count, v, offset);
        }else{
            nGLUniform1iv(location, count, v.array(), offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform1iv([int location, int count, java.nio.IntBuffer v]);
     * 
     *  C function void glUniform1iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    private static native void nGLUniform1iv(int location, int count, java.nio.IntBuffer v, int offset);/*
            glUniform1iv((GLint) location, (GLsizei) count, (GLint *)(v + offset) );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform2f([int location, float x, float y]);
     * 
     *  C function void glUniform2f((GLint) location, (GLfloat) x, (GLfloat) y )

     * */
    public void glUniform2f(int location, float x, float y) {
        GLES20Pipeline.nGLUniform2f(location, x, y);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform2f([int location, float x, float y]);
     * 
     *  C function void glUniform2f((GLint) location, (GLfloat) x, (GLfloat) y )

     * */
    private static native void nGLUniform2f(int location, float x, float y);/*
            glUniform2f((GLint) location, (GLfloat) x, (GLfloat) y );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform2fv([int location, int count, float[] v, int offset]);
     * 
     *  C function void glUniform2fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )

     * */
    public void glUniform2fv(int location, int count, float[] v, int offset) {
        checkArray(v, offset, 2 * count, VALUES);
        nGLUniform2fv(location, count, v, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform2fv([int location, int count, float[] v, int offset]);
     * 
     *  C function void glUniform2fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )

     * */
    private static native void nGLUniform2fv(int location, int count, float[] v, int offset);/*
            glUniform2fv( (GLint) location, (GLsizei) count, (GLfloat *) (v + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform2fv([int location, int count, java.nio.FloatBuffer v]);
     * 
     *  C function void glUniform2fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )

     * */
    public void glUniform2fv(int location,
                             int count,
                             java.nio.FloatBuffer values) {
        checkBuffer(values, 2 * count, VALUES);
        int offset = getOffset(values);
        if (values.isDirect()) {
            GLES20Pipeline.nGLUniform2fv(location, count, values, offset);
        } else {
            float[] array = values.array();
            GLES20Pipeline.nGLUniform2fv(location, count, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform2fv([int location, int count, java.nio.FloatBuffer v]);
     * 
     *  C function void glUniform2fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )

     * */
    private static native void nGLUniform2fv(int location, int count, java.nio.FloatBuffer values, int offset);/*            
            glUniform2fv( (GLint) location, (GLsizei) count, (GLfloat *) (values + offset));    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform2i([int location, int x, int y]);
     * 
     *  C function void glUniform2i((GLint) location, (GLint) x, (GLint) y )

     * */
    public void glUniform2i(int location, int x, int y) {
        GLES20Pipeline.nGLUniform2i(location, x, y);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform2i([int location, int x, int y]);
     * 
     *  C function void glUniform2i((GLint) location, (GLint) x, (GLint) y )

     * */
    private static native void nGLUniform2i(int location, int x, int y);/*
            glUniform2i((GLint) location, (GLint) x, (GLint) y );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform2iv([int location, int count, int[] v, int offset]);
     * 
     *  C function void glUniform2iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    public void glUniform2iv(int location, int count, int[] v, int offset) {
        checkArray(v, offset, 2*count, VALUES);
        GLES20Pipeline.nGLUniform2iv(location, count, v, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform2iv([int location, int count, int[] v, int offset]);
     * 
     *  C function void glUniform2iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    private static native void nGLUniform2iv(int location, int count, int[] v, int offset);/*
            glUniform2iv((GLint) location, (GLsizei) count, (GLint *) (v + offset) );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform2iv([int location, int count, java.nio.IntBuffer v]);
     * 
     *  C function void glUniform2iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    public void glUniform2iv(int location, int count, java.nio.IntBuffer values) {
        checkBuffer(values, 2*count,VALUES);
        int offset = getOffset(values);

        if (values.isDirect()) {
            GLES20Pipeline.nGLUniform2iv(location, count, values, offset);
        } else {
            int[] array = values.array();
            GLES20Pipeline.nGLUniform2iv(location, count, array, offset);            
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform2iv([int location, int count, java.nio.IntBuffer v]);
     * 
     *  C function void glUniform2iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    private static native void nGLUniform2iv(int location, int count, java.nio.IntBuffer values, int offset);/*
              glUniform2iv((GLint) location, (GLsizei) count, (GLint *) (values + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform3f([int location, float x, float y, float z]);
     * 
     *  C function void glUniform3f((GLint) location, (GLfloat) x, (GLfloat) y, (GLfloat) z )

     * */
    public void glUniform3f(int location, float x, float y, float z) {
        GLES20Pipeline.nGLUniform3f(location, x, y, z);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform3f([int location, float x, float y, float z]);
     * 
     *  C function void glUniform3f((GLint) location, (GLfloat) x, (GLfloat) y, (GLfloat) z )

     * */
    private static native void nGLUniform3f(int location, float x, float y, float z);/*    
            glUniform3f((GLint) location, (GLfloat) x, (GLfloat) y, (GLfloat) z );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform3fv([int location, int count, float[] v, int offset]);
     * 
     *  C function void glUniform3fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )

     * */
    public void glUniform3fv(int location, int count, float[] value, int offset) {
        checkArray(value, offset, 3*count, VALUES);
        GLES20Pipeline.nGLUniform3fv(location, count, value, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform3fv([int location, int count, float[] v, int offset]);
     * 
     *  C function void glUniform3fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )

     * */
    private static native void nGLUniform3fv(int location, int count, float[] v, int offset);/*
            glUniform3fv((GLint) location, (GLsizei) count, (const GLfloat *) &v[offset] );   
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform3fv([int location, int count, java.nio.FloatBuffer v]);
     * 
     *  C function void glUniform3fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )

     * */
    public void glUniform3fv(int location, int count, java.nio.FloatBuffer values) {
        checkBuffer(values, 3 * count, VALUES);
        int offset = getOffset(values);
        if (values.isDirect()) {
            GLES20Pipeline.nGLUniform3fv(location, count, values, offset);
        } else {
            float[] array = values.array();
            GLES20Pipeline.nGLUniform3fv(location, count, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform3fv([int location, int count, java.nio.FloatBuffer v]);
     * 
     *  C function void glUniform3fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )

     * */
    private static native void nGLUniform3fv(int location, int count, java.nio.FloatBuffer values, int offset);/*
            glUniform3fv((GLint) location, (GLsizei) count, (GLfloat *) (values + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform3i([int location, int x, int y, int z]);
     * 
     *  C function void glUniform3i((GLint) location, (GLint) x, (GLint) y, (GLint) z )

     * */
    public void glUniform3i(int location, int x, int y, int z) {     
        GLES20Pipeline.nGLUniform3i(location, x, y, z);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform3i([int location, int x, int y, int z]);
     * 
     *  C function void glUniform3i((GLint) location, (GLint) x, (GLint) y, (GLint) z )

     * */
    private static native void nGLUniform3i(int location, int x, int y, int z);/*
            glUniform3i((GLint) location, (GLint) x, (GLint) y, (GLint) z );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform3iv([int location, int count, int[] v, int offset]);
     * 
     *  C function void glUniform3iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    public void glUniform3iv(int location, int count, int[] value, int offset) {
        checkArray(value, offset, 3*count, VALUES);
        GLES20Pipeline.nGLUniform3iv(location, count, value, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform3iv([int location, int count, int[] v, int offset]);
     * 
     *  C function void glUniform3iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    private static native void nGLUniform3iv(int location, int count, int[] value, int offset);/*    
            glUniform3iv((GLint) location, (GLsizei) count, (const GLint *) (value + offset) );  
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform3iv([int location, int count, java.nio.IntBuffer v]);
     * 
     *  C function void glUniform3iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    public void glUniform3iv(int location, int count, java.nio.IntBuffer values) {
        checkBuffer(values, 4 * count, VALUES);
        int offset = BufferInfo.getOffset(values);
        if (values.isDirect()) {
            GLES20Pipeline.nGLUniform3iv(location, count, values, offset);

        } else {
            int[] array = values.array();
            GLES20Pipeline.nGLUniform3iv(location, count, array, offset);
        }

    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform3iv([int location, int count, java.nio.IntBuffer v]);
     * 
     *  C function void glUniform3iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    private static native void nGLUniform3iv(int location, int count, java.nio.IntBuffer values, int offset);/*
             glUniform3iv((GLint) location, (GLsizei) count,(GLint *) (values + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform4f([int location, float x, float y, float z, float w]);
     * 
     *  C function void glUniform4f((GLint) location, (GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) w )

     * */
    public void glUniform4f(int location, float x, float y, float z, float w) {
        GLES20Pipeline.nGLUniform4f(location, x, y, z, w);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform4f([int location, float x, float y, float z, float w]);
     * 
     *  C function void glUniform4f((GLint) location, (GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) w )

     * */
    private static native void nGLUniform4f(int location, float x, float y, float z, float w);/*
             glUniform4f((GLint) location, (GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) w );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform4fv([int location, int count, float[] v, int offset]);
     * 
     *  C function void glUniform4fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )

     * */
    public void glUniform4fv(int location, int count, float[] v, int offset) {
        checkArray(v, offset, 4*count, VALUES);
        GLES20Pipeline.nGLUniform4fv(location, count, v, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform4fv([int location, int count, float[] v, int offset]);
     * 
     *  C function void glUniform4fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )

     * */
    private static native void nGLUniform4fv(int location, int count, float[] v, int offset);/*
            glUniform4fv((GLint) location, (GLsizei) count, (GLfloat *) (v + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform4fv([int location, int count, java.nio.FloatBuffer v]);
     * 
     *  C function void glUniform4fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )

     * */
    public void glUniform4fv(int location, int count, java.nio.FloatBuffer values) {
        checkBuffer(values, 4 * count, VALUES);
        int offset = getOffset(values);
        if (values.isDirect()) {
            GLES20Pipeline.nGLUniform4fv(location, count, values, offset);
        } else {
            float[] array = values.array();
            GLES20Pipeline.nGLUniform4fv(location, count, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform4fv([int location, int count, java.nio.FloatBuffer v]);
     * 
     *  C function void glUniform4fv((GLint) location, (GLsizei) count, (const (GLfloat) *)v )

     * */
    private static native void nGLUniform4fv(int location, int count, java.nio.FloatBuffer values, int offset);/*
            glUniform4fv((GLint) location, (GLsizei) count, (GLfloat *) (values + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform4i([int location, int x, int y, int z, int w]);
     * 
     *  C function void glUniform4i((GLint) location, (GLint) x, (GLint) y, (GLint) z, (GLint) w )

     * */
    public void glUniform4i(int location, int x, int y, int z, int w) {
        GLES20Pipeline.nGLUniform4i(location, x, y, z, w);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform4i([int location, int x, int y, int z, int w]);
     * 
     *  C function void glUniform4i((GLint) location, (GLint) x, (GLint) y, (GLint) z, (GLint) w )

     * */
    private static native void nGLUniform4i(int location, int x, int y, int z, int w);/*
            glUniform4i((GLint) location, (GLint) x, (GLint) y, (GLint) z, (GLint) w );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform4iv([int location, int count, int[] v, int offset]);
     * 
     *  C function void glUniform4iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    public void glUniform4iv(int location, int count, int[] v, int offset) {
        checkArray(v, offset, 4*count, VALUES);
        GLES20Pipeline.nGLUniform4iv(location, count, v, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform4iv([int location, int count, int[] v, int offset]);
     * 
     *  C function void glUniform4iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    private static native void nGLUniform4iv(int location, int count, int[] v, int offset);/*
            glUniform4iv((GLint) location, (GLsizei) count, (GLint *) &v[offset] );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniform4iv([int location, int count, java.nio.IntBuffer v]);
     * 
     *  C function void glUniform4iv((GLint) location, (GLsizei) count, const (GLint *) v )

     * */
    public void glUniform4iv(int location, int count, java.nio.IntBuffer values) {
        checkBuffer(values, 4 * count, VALUES);
        int offset = getOffset(values);
        if (values.isDirect()) {
            GLES20Pipeline.nGLUniform4iv(location, count, values, offset);
        } else {
            int[] array = values.array();
            GLES20Pipeline.nGLUniform4iv(location, count, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniform4iv([int location, int count, java.nio.IntBuffer v]);
     * 
     *  C function void glUniform4iv((GLint) location, (GLsizei) count, const (GLint *) v )
     * */
    private static native void nGLUniform4iv(int location, int count, java.nio.IntBuffer values, int offset);/*
            glUniform4iv((GLint) location, (GLsizei) count, (GLint *) (values + offset) );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniformMatrix2fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix2fv((GLint) location, 
     *                                       (GLsizei) count, 
     *                                       (GLboolean)  transpose, 
     *                                       (GLfloat *)value )

     * */
    public void glUniformMatrix2fv(int location,
                                   int count,
                                   boolean transpose,
                                   float[] value,  int offset) {
        checkArray(value, offset,  4 * count, VALUES);
        nGLUniformMatrix2fv(location, count, transpose, value, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniformMatrix2fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix2fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (const (GLfloat) *)value )

     * */
    private static native void nGLUniformMatrix2fv(int location, int count, boolean transpose, float[] value, int offset);/*
             glUniformMatrix2fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (GLfloat *) (value + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniformMatrix2fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix2fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (const (GLfloat) *)value )

     * */
    public void glUniformMatrix2fv(int location, int count, boolean transpose, java.nio.FloatBuffer values) {
        checkBuffer(values, 4 * count, VALUES);
        int offset = getOffset(values);
        if (values.isDirect()) {
            nGLUniformMatrix2fv(location, count, transpose, values, offset);
        } else {
            float[] array = values.array();
            nGLUniformMatrix2fv(location, count, transpose, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniformMatrix2fv([int location, 
     * int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix2fv( (GLint) location, 
     *                                      (GLsizei) count, 
     *                                      (GLboolean)  transpose, 
     *                                      (GLfloat *)value )

     * */
    private static native void nGLUniformMatrix2fv(int location,
                                                   int count,
                                                   boolean transpose,
                                                   java.nio.FloatBuffer value,
                                                   int offset);/*
             glUniformMatrix2fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (GLfloat *) (value + offset) );    
    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniformMatrix3fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix3fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (const (GLfloat) *)value )

     * */
    public void glUniformMatrix3fv(int location, int count, boolean transpose, float[] value, int offset) {
        checkArray(value, offset, 9*count, VALUES);
        GLES20Pipeline.nGLUniformMatrix3fv(location, count, transpose, value, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniformMatrix3fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix3fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (const (GLfloat) *)value )

     * */
    private static native void nGLUniformMatrix3fv(int location, int count, boolean transpose, float[] value, int offset);/*
            glUniformMatrix3fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (GLfloat *) (value + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniformMatrix3fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix3fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (const (GLfloat) *)value )

     * */
    public void glUniformMatrix3fv(int location, 
                                   int count, boolean transpose,
                                   java.nio.FloatBuffer value) {
        checkBuffer(value, 9 * count, VALUES);
        int offset = getOffset(value);

        if (value.isDirect()) {
            GLES20Pipeline.nGLUniformMatrix3fv(location, count, transpose, value, offset);
        } else {
            float[] array = value.array();
            GLES20Pipeline.nGLUniformMatrix3fv(location, count, transpose, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniformMatrix3fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix3fv((GLint) location, 
     *                                       (GLsizei) count, 
     *                                       (GLboolean)  transpose, 
     *                                       (const (GLfloat) *)value )
     * */
    private static native void nGLUniformMatrix3fv(int location, 
                                                   int count, 
                                                   boolean transpose, 
                                                   java.nio.FloatBuffer value, int offset);/*
            glUniformMatrix3fv( (GLint) location, 
                                (GLsizei) count, 
                                (GLboolean)  transpose, 
                                (GLfloat *) (value + offset) );   
    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniformMatrix4fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix4fv((GLint) location, 
     *                                     (GLsizei) count, 
     *                                     (GLboolean)  transpose, 
     *                                     (const (GLfloat) *)value )

     * */
    public void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value, int offset) {
        checkArray(value, offset, 16*count, VALUES);
        GLES20Pipeline.nGLUniformMatrix4fv(location, count, transpose, value, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniformMatrix4fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix4fv((GLint) location, 
     *                                     (GLsizei) count, 
     *                                     (GLboolean) transpose, 
     *                                     (GLfloat *) value )

     * */
    private static native void nGLUniformMatrix4fv(int location, 
                                                   int count, 
                                                   boolean transpose, 
                                                   float[] value, int offset);/*
            glUniformMatrix4fv((GLint) location, 
                               (GLsizei) count, 
                               (GLboolean)  transpose, 
                               (GLfloat *) (value + offset) );
    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUniformMatrix4fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix4fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (const (GLfloat) *)value )

     * */
    public void glUniformMatrix4fv(int location, int count, boolean transpose, java.nio.FloatBuffer values) {
        checkBuffer(values, 16 * count, "values");
        int offset = getOffset(values);
        if (values.isDirect()) {
            GLES20Pipeline.nGLUniformMatrix4fv(location, count, transpose,
                    values, offset);
        } else {
            float[] array = values.array();
            GLES20Pipeline.nGLUniformMatrix4fv(location, count, transpose,
                    array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUniformMatrix4fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix4fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (const (GLfloat) *)value )

     * */
    private static native void nGLUniformMatrix4fv(int location, int count, boolean transpose, java.nio.FloatBuffer value, int offset);/*
            glUniformMatrix4fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (GLfloat *) (value + offset));    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glUseProgram([int program]);
     * 
     *  C function void glUseProgram((GLuint) program )

     * */
    public void glUseProgram(int program) {
        GLES20Pipeline.nGLUseProgram(program);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glUseProgram([int program]);
     * 
     *  C function void glUseProgram((GLuint) program )

     * */
    private static native void nGLUseProgram(int program);/*
            glUseProgram((GLuint) program );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glValidateProgram([int program]);
     * 
     *  C function void glValidateProgram((GLuint) program )

     * */
    public void glValidateProgram(int program) {
        GLES20Pipeline.nGLValidateProgram(program);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glValidateProgram([int program]);
     * 
     *  C function void glValidateProgram((GLuint) program )

     * */
    private static native void nGLValidateProgram(int program);/*
            glValidateProgram((GLuint) program );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glVertexAttrib1f([int indx, float x]);
     * 
     *  C function void glVertexAttrib1f((GLuint) indx, (GLfloat) x )

     * */
    public void glVertexAttrib1f(int indx, float x) {
        GLES20Pipeline.nGLVertexAttrib1f(indx, x);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glVertexAttrib1f([int indx, float x]);
     * 
     *  C function void glVertexAttrib1f((GLuint) indx, (GLfloat) x )

     * */
    private static native void nGLVertexAttrib1f(int indx, float x);/*
           glVertexAttrib1f((GLuint) indx, (GLfloat) x );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glVertexAttrib1fv([int indx, float[] values, int offset]);
     * 
     *  C function void glVertexAttrib1fv((GLuint) indx, (const (GLfloat) *)values )

     * */
    public void glVertexAttrib1fv(int indx, float[] values, int offset) {
        checkArray(values, offset, 1, VALUES);
        GLES20Pipeline.nGLVertexAttrib1fv(indx, values, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glVertexAttrib1fv([int indx, float[] values, int offset]);
     * 
     *  C function void glVertexAttrib1fv((GLuint) indx, (const GLfloat *)values )

     * */
    private static native void nGLVertexAttrib1fv(int indx, float[] values, int offset);/*
            glVertexAttrib1fv((GLuint) indx, (GLfloat *) (values + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glVertexAttrib1fv([int indx, java.nio.FloatBuffer values]);
     * 
     *  C function void glVertexAttrib1fv((GLuint) indx, (const (GLfloat) *)values )

     * */
    public void glVertexAttrib1fv(int indx, java.nio.FloatBuffer values) {
        checkBuffer(values, 1, VALUES);
        int offset = getOffset(values);
        if (values.isDirect()) {
            GLES20Pipeline.nGLVertexAttrib1fv(indx, values, offset);
        } else {
            float[] array = values.array();
            GLES20Pipeline.nGLVertexAttrib1fv(indx, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glVertexAttrib1fv([int indx, java.nio.FloatBuffer values]);
     * 
     *  C function void glVertexAttrib1fv((GLuint) indx, (const (GLfloat) *)values )

     * */
    private static native void nGLVertexAttrib1fv(int indx, java.nio.FloatBuffer values, int offset);/*
             glVertexAttrib1fv ((GLuint) indx, (GLfloat *)(values + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glVertexAttrib2f([int indx, float x, float y]);
     * 
     *  C function void glVertexAttrib2f((GLuint) indx, (GLfloat) x, (GLfloat) y )

     * */
    public void glVertexAttrib2f(int indx, float x, float y) {
        GLES20Pipeline.nGLVertexAttrib2f(indx, x, y);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glVertexAttrib2f([int indx, float x, float y]);
     * 
     *  C function void glVertexAttrib2f((GLuint) indx, (GLfloat) x, (GLfloat) y )

     * */
    private static native void nGLVertexAttrib2f(int indx, float x, float y);/*
         glVertexAttrib2f((GLuint) indx, (GLfloat) x, (GLfloat) y );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glVertexAttrib2fv([int indx, float[] values, int offset]);
     * 
     *  C function void glVertexAttrib2fv((GLuint) indx, (const GLfloat *)values )

     * */
    public void glVertexAttrib2fv(int indx, float[] values, int offset) {
        checkArray(values, offset, 2, VALUES);
        GLES20Pipeline.nGLVertexAttrib2fv(indx, values, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glVertexAttrib2fv([int indx, float[] values, int offset]);
     * 
     *  C function void glVertexAttrib2fv((GLuint) indx, (const (GLfloat) *)values )

     * */
    private static native void nGLVertexAttrib2fv(int indx, float[] values, int offset);/*    
            glVertexAttrib2fv((GLuint) indx, ( GLfloat *)(values + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glVertexAttrib2fv([int indx, java.nio.FloatBuffer values]);
     * 
     *  C function void glVertexAttrib2fv((GLuint) indx, (const (GLfloat) *)values )

     * */
    public void glVertexAttrib2fv(int indx, java.nio.FloatBuffer values) {
        checkBuffer(values, 2, VALUES);
        int offset = getOffset(values);

        if (values.isDirect()) {
            GLES20Pipeline.nGLVertexAttrib2fv(indx, values, offset);
        } else {
            float[] array = values.array();
            GLES20Pipeline.nGLVertexAttrib2fv(indx, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glVertexAttrib2fv([int indx, java.nio.FloatBuffer values]);
     * 
     *  C function void glVertexAttrib2fv((GLuint) indx, (const GLfloat *)values )

     * */
    private static native void nGLVertexAttrib2fv(int indx, java.nio.FloatBuffer values, int offset);/*    
            glVertexAttrib2fv((GLuint) indx,  ( GLfloat *)(values + offset) );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glVertexAttrib3f([int indx, float x, float y, float z]);
     * 
     *  C function void glVertexAttrib3f((GLuint) indx, (GLfloat) x, (GLfloat) y, (GLfloat) z )

     * */
    public void glVertexAttrib3f(int indx, float x, float y, float z) {
        GLES20Pipeline.nGLVertexAttrib3f(indx, x, y, z);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glVertexAttrib3f([int indx, float x, float y, float z]);
     * 
     *  C function void glVertexAttrib3f((GLuint) indx, (GLfloat) x, (GLfloat) y, (GLfloat) z )

     * */
    private static native void nGLVertexAttrib3f(int indx, float x, float y, float z);/*
            glVertexAttrib3f((GLuint) indx, (GLfloat) x, (GLfloat) y, (GLfloat) z );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glVertexAttrib3fv([int indx, float[] values, int offset]);
     * 
     *  C function void glVertexAttrib3fv((GLuint) indx, (const (GLfloat) *)values )

     * */
    public void glVertexAttrib3fv(int indx, float[] values, int offset) {
        checkArray(values, offset, 3, VALUES);
        GLES20Pipeline.nGLVertexAttrib3fv(indx, values, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glVertexAttrib3fv([int indx, float[] values, int offset]);
     * 
     *  C function void glVertexAttrib3fv((GLuint) indx, (const (GLfloat) *)values )

     * */
    private static native void nGLVertexAttrib3fv(int indx, float[] values, int offset);/*
            glVertexAttrib3fv((GLuint) indx, (GLfloat *)(values + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glVertexAttrib3fv([int indx, java.nio.FloatBuffer values]);
     * 
     *  C function void glVertexAttrib3fv((GLuint) indx, (const (GLfloat) *)values )

     * */
    public void glVertexAttrib3fv(int indx, java.nio.FloatBuffer values) {
        checkBuffer(values, 3, VALUES);
        int offset = getOffset(values);
        if (values.isDirect()) {
            GLES20Pipeline.nGLVertexAttrib3fv(indx, values, offset);
        } else {
            float[] array = values.array();
            GLES20Pipeline.nGLVertexAttrib3fv(indx, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glVertexAttrib3fv([int indx, java.nio.FloatBuffer values]);
     * 
     *  C function void glVertexAttrib3fv((GLuint) indx, (const (GLfloat) *)values )

     * */
    private static native void nGLVertexAttrib3fv(int indx, java.nio.FloatBuffer values, int offset);/*
            glVertexAttrib3fv((GLuint) indx, (GLfloat *) (values + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glVertexAttrib4f([int indx, float x, float y, float z, float w]);
     * 
     *  C function void glVertexAttrib4f((GLuint) indx, (GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) w )

     * */
    public void glVertexAttrib4f(int indx, float x, float y, float z, float w) {
        GLES20Pipeline.nGLVertexAttrib4f(indx, x, y, z, w);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glVertexAttrib4f([int indx, float x, float y, float z, float w]);
     * 
     *  C function void glVertexAttrib4f((GLuint) indx, (GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) w )

     * */
    private static native void nGLVertexAttrib4f(int indx, float x, float y, float z, float w);/*
            glVertexAttrib4f((GLuint) indx, (GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) w );    
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glVertexAttrib4fv([int indx, float[] values, int offset]);
     * 
     *  C function void glVertexAttrib4fv((GLuint) indx, (const (GLfloat) *)values )

     * */
    public void glVertexAttrib4fv(int indx, float[] values, int offset) {
        checkArray(values, offset, 4, VALUES);
        GLES20Pipeline.nGLVertexAttrib4fv(indx, values, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glVertexAttrib4fv([int indx, float[] values, int offset]);
     * 
     *  C function void glVertexAttrib4fv((GLuint) indx, (const (GLfloat) *)values )

     * */
    private static native void nGLVertexAttrib4fv(int indx, float[] values, int offset);/*
            glVertexAttrib4fv((GLuint) indx, (GLfloat *)(values + offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glVertexAttrib4fv([int indx, java.nio.FloatBuffer values]);
     * 
     *  C function void glVertexAttrib4fv((GLuint) indx, (const (GLfloat) *)values )

     * */
    public void glVertexAttrib4fv(int indx, java.nio.FloatBuffer values) {
        checkBuffer(values, 4, VALUES);
        int offset = getOffset(values);
        if (values.isDirect()) {
            GLES20Pipeline.nGLVertexAttrib4fv(indx, values, offset);
        } else {
            float[] array = values.array();
            GLES20Pipeline.nGLVertexAttrib4fv(indx, array, offset);
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glVertexAttrib4fv([int indx, java.nio.FloatBuffer values]);
     * 
     *  C function void glVertexAttrib4fv((GLuint) indx, (const (GLfloat) *)values )

     * */
    private static native void nGLVertexAttrib4fv(int indx, java.nio.FloatBuffer values, int offset);/*
            glVertexAttrib4fv( (GLuint) indx, (GLfloat *)(values + offset));
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glVertexAttribPointer([int indx, int size, int type, boolean normalized, int stride, int offset]);
     * 
     *  C function void glVertexAttribPointer((GLuint) indx, (GLint) size, (GLenum) type, (GLboolean)  normalized, (GLsizei) stride, (GLint) offset )

     * */
    public void glVertexAttribPointer(int indx, int size, int type, boolean normalized, int stride, int offset) {
        GLES20Pipeline.nGLVertexAttribPointer(indx, size, type, normalized, stride, offset);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glVertexAttribPointer(
     * [int indx, int size, int type, boolean normalized, int stride, int offset]);
     * 
     *  C function void glVertexAttribPointer((GLuint) indx,
     *   (GLint) size, (GLenum) type, (GLboolean)  normalized, (GLsizei) stride, (GLint) offset )

     * */
    private static native void nGLVertexAttribPointer(
            int indx, 
            int size, 
            int type, 
            boolean normalized, 
            int stride, 
            int offset);/*
            glVertexAttribPointer((GLuint) indx, 
                                            (GLint) size, 
                                            (GLenum) type, 
                                            (GLboolean)  normalized, 
                                            (GLsizei) stride, 
                                             reinterpret_cast<GLvoid *>(offset) );
    */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glVertexAttribPointerBounds([int indx, int size, int type, 
     * boolean normalized, int stride, java.nio.Buffer ptr, int remaining]);
     * 
     *  C function void glVertexAttribPointer( (GLuint) indx, 
     *                                         (GLint) size, 
     *                                         (GLenum) type, 
     *                                         (GLboolean)  normalized, 
     *                                         (GLsizei) stride, const GLvoid *ptr )
     * */
    public void glVertexAttribPointerBounds( int indx,
                                             int size, 
                                             int type, 
                                             boolean normalized, 
                                             int stride, 
                                             java.nio.Buffer ptr, int remaining) 
    {
        checkBuffer(ptr, 1, PTR);
        int offsetBytes = getOffset(ptr);
        if (ptr.isDirect()) {
            // parameter int remaining is unused
            GLES20Pipeline.nGLVertexAttribPointerBounds(indx, size, type,  normalized, stride, ptr, offsetBytes);
        } else {
            throw new RuntimeException("Invalid buffer.");
        }
    }

    /**
     *<pre>
     * Native method generated from GLES20.glVertexAttribPointerBounds([int indx, int size, int type, boolean normalized, int stride, java.nio.Buffer ptr, int remaining]);
     * 
     *  C function void glVertexAttribPointer((GLuint) indx, (GLint) size, (GLenum) type, (GLboolean)  normalized, (GLsizei) stride, const GLvoid *ptr )

     * */
    private static native void nGLVertexAttribPointerBounds(
                    int indx, 
                    int size, 
                    int type, 
                    boolean normalized, 
                    int stride, 
                    java.nio.Buffer ptr, int offsetBytes);/*                    
           // native code        
           char * data0 = (char *) (ptr + offsetBytes);                    
           // param remaining is unused.                    
           glVertexAttribPointer((GLuint) indx, 
                                 (GLint) size, 
                                 (GLenum) type, 
                                 (GLboolean) normalized, 
                                 (GLsizei) stride, 
                                 (GLvoid *)data0 );        
            
            */

    /**
     *<pre>
     * Delegate Method generated from GLES20.glViewport([int x, int y, int width, int height]);
     * 
     *  C function void glViewport((GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height )

     * */
    public void glViewport(int x, int y, int width, int height) {
        GLES20Pipeline.nGLViewport(x, y, width, height);
    }

    /**
     *<pre>
     * Native method generated from GLES20.glViewport([int x, int y, int width, int height]);
     * 
     *  C function void glViewport((GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height )

     * */
    private static native void nGLViewport(int x, int y, int width, int height);/*
            glViewport((GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height );
    */
    
    
    /**
     * returns the number of values glGet returns for a given pname.
     *
     * The code below is written such that pnames requiring only one values
     * are the default (and are not explicitely tested for). This makes the
     * checking code much shorter/readable/efficient.
     *
     * This means that unknown pnames (e.g.: extensions) will default to 1. If
     * that unknown pname needs more than 1 value, then the validation check
     * is incomplete and the app may crash if it passed the wrong number params.
     */
    protected  int getNeededCount(int pname) {
        int needed = 1;
           
        // GLES 2.x pnames
        switch (pname) {
            case GL_ALIASED_LINE_WIDTH_RANGE:
            case GL_ALIASED_POINT_SIZE_RANGE:
            case GL_DEPTH_RANGE: // not available at Android code
                needed = 2;
                break;
                
            case GL_BLEND_COLOR:
            case GL_COLOR_CLEAR_VALUE:
            case GL_COLOR_WRITEMASK:
            case GL_SCISSOR_BOX:
            case GL_VIEWPORT:
                needed = 4;
                break;
            case GL_COMPRESSED_TEXTURE_FORMATS:
            {
                int[] value = {1};
                nGLGetIntegerv(GL_NUM_COMPRESSED_TEXTURE_FORMATS, value, 0);
                needed = value[0];
            }
                break;
            case GL_SHADER_BINARY_FORMATS:
            {
                int[] value = {1};
                nGLGetIntegerv(GL_NUM_SHADER_BINARY_FORMATS, value, 0);
                needed = value[0];
            }
                break;
        }
 
        // GLES 1.x pnames
//        switch (pname) {
//            case GL_ALIASED_LINE_WIDTH_RANGE:
//            case GL_ALIASED_POINT_SIZE_RANGE:
//            case GL_DEPTH_RANGE:
//            case GL_SMOOTH_LINE_WIDTH_RANGE:
//            case GL_SMOOTH_POINT_SIZE_RANGE:
//                needed = 2;
//                break;
//            case GL_CURRENT_NORMAL:
//            case GL_POINT_DISTANCE_ATTENUATION:
//                needed = 3;
//                break;
//            case GL_COLOR_CLEAR_VALUE:
//            case GL_COLOR_WRITEMASK:
//            case GL_CURRENT_COLOR:
//            case GL_CURRENT_TEXTURE_COORDS:
//            case GL_FOG_COLOR:
//            case GL_LIGHT_MODEL_AMBIENT:
//            case GL_SCISSOR_BOX:
//            case GL_VIEWPORT:
//                needed = 4;
//                break;
//            case GL_MODELVIEW_MATRIX:
//            case GL_PROJECTION_MATRIX:
//            case GL_TEXTURE_MATRIX:
//                needed = 16;
//                break;
//            case GL_COMPRESSED_TEXTURE_FORMATS:
//                glGetIntegerv(GL_NUM_COMPRESSED_TEXTURE_FORMATS, value,0);
//                break;
//        }
 
        return needed;
    }
    
    //////////////////////////////////////////////////////////////////////////////
    //
    ////////////////////////////////////////////////////////////////////////////
    
    /**
     * Check a parameter array
     * 
     * @param array - array to check
     * @param offset - array offset
     * @param needed -  count elements required
     * @param arrayName - array name to print exception
     * 
     *  @throws IllegalArgumentException in following cases:
     *  <li>if array is null;
     *  <li>if offset < 0;
     *  <li>if array.length - offset < needed.
     */
    protected static void checkArray(byte[] array, int offset, int needed, String arrayName){
        if (null == array) throw new IllegalArgumentException(arrayName + " == null");
        if (offset < 0) throw new IllegalArgumentException(arrayName + " offset < 0");
        if (array.length - offset < needed)
            throw new IllegalArgumentException(arrayName+".length - offset < needed = " + needed);        
    }
    
    /**
     * Check a parameter array
     * 
     * @param array - array to check
     * @param offset - array offset
     * @param needed -  count elements required
     * @param arrayName - array name to print exception
     * 
     *  @throws IllegalArgumentException in following cases:
     *  <li>if array is null;
     *  <li>if offset < 0;
     *  <li>if array.length - offset < needed.
     */
    protected static void checkArray(int[] array, int offset, int needed, String arrayName){
        if (null == array) throw new IllegalArgumentException(arrayName + " == null");
        if (offset < 0) throw new IllegalArgumentException(arrayName + " offset < 0");
        if (array.length - offset < needed)
            throw new IllegalArgumentException(arrayName+".length - offset < needed = " + needed);        
    }
    
    /**
     * Check a parameter array
     * 
     * @param array - array to check
     * @param offset - array offset
     * @param needed -  count elements required
     * @param arrayName - array name to print exception
     * 
     *  @throws IllegalArgumentException in following cases:
     *  <li>if array is null;
     *  <li>if offset < 0;
     *  <li>if array.length - offset < needed.
     */
    protected static void checkArray(float[] array, int offset, int needed, String arrayName){
        if (null == array) throw new IllegalArgumentException(arrayName + " == null");
        if (offset < 0) throw new IllegalArgumentException(arrayName + " offset < 0");
        if (array.length - offset < needed)
            throw new IllegalArgumentException(arrayName+".length - offset < needed = " + needed);        
    }
    
    /**
     * Check a parameter array
     * 
     * @param array - array to check
     * @param offset - array offset
     * @param needed -  count elements required
     * @param arrayName - array name to print exception
     * 
     *  @throws IllegalArgumentException in following cases:
     *  <li>if array is null;
     *  <li>if offset < 0;
     *  <li>if array.length - offset < needed.
     */
    protected static void checkArray(long[] array, int offset, int needed, String arrayName){
        if (null == array) throw new IllegalArgumentException(arrayName + " == null");
        if (offset < 0) throw new IllegalArgumentException(arrayName + " offset < 0");
        if (array.length - offset < needed)
            throw new IllegalArgumentException(arrayName+".length - offset < needed = " + needed);        
    }
    
    /**
     * Check a parameter array
     * 
     * @param array - array to check
     * @param offset - array offset
     * @param needed -  count elements required
     * @param arrayName - array name to print exception
     * 
     *  @throws IllegalArgumentException in following cases:
     *  <li>if array is null;
     *  <li>if offset < 0;
     *  <li>if array.length - offset < needed.
     */
    protected static void checkArray(boolean[] array, int offset, int needed, String arrayName){
        if (null == array) throw new IllegalArgumentException(arrayName + " == null");
        if (offset < 0) throw new IllegalArgumentException(arrayName + " offset < 0");
        if (array.length - offset < needed)
            throw new IllegalArgumentException(arrayName+".length - offset < needed = " + needed);        
    }
    
    /**
     * Check a parameter buffer
     * 
     * @param values buffer with values to check
     * @param needed
     * @param bufferName
     * 
     *  @throws IllegalArgumentException in following cases:
     *  <li>if values is null;
     *  <li>if offset < 0;
     *  <li>if array length < 1.
     */
    protected static void checkBuffer(java.nio.ByteBuffer values, int needed, String bufferName){
        if (null == values) throw new IllegalArgumentException(bufferName + " == null");       
        if (values.remaining() < needed)
            throw new IllegalArgumentException(bufferName+".remaining() < needed = " + needed);        
    }
    
    
    /**
     * Check a parameter buffer
     * 
     * @param values - buffer with values to check
     * @param needed - remaining element count needed
     * @param bufferName string with buffer name to print errors, if any.
     * 
     *  @throws IllegalArgumentException in following cases:
     *  <li>if values is null;
     *  <li>if offset < 0;
     *  <li>if array length < 1.
     */
    protected static void checkBuffer(java.nio.Buffer values, int needed, String bufferName){
        if (null == values) throw new IllegalArgumentException(bufferName + " == null");       
        if (values.remaining() < needed)
            throw new IllegalArgumentException(bufferName+".remaining() < needed = " + needed);        
    }
    
    /**
     * Check a parameter buffer.
     * Allows parameter <b>needed</b> as byte values, if useByteSize is  true.
     * 
     * @param values - buffer to evaluate size and null
     * @param needed - minimum remaing elements or bytes 
     * @param useByteSize - set true if needed is in bytes; false if neede is element count
     * @param bufferName - string with buffer name to print errors, if any.
     * 
     *  @throws IllegalArgumentException in following cases:
     *  <li>if values is null;
     *  <li>if offset < 0;
     *  <li>if array length < 1.
     */
    protected static void checkBuffer(java.nio.Buffer values, int needed, boolean useByteSize, String bufferName){
        if (null == values) throw new IllegalArgumentException(bufferName + " == null");
        int remains = values.remaining();
        if(useByteSize){
            int shift = BufferInfo.getElementSizeShift(values);
            remains = remains << shift;
        }
        if (remains < needed)
            throw new IllegalArgumentException(bufferName+".remaining() < needed = " + needed);        
    }
    
    /**
     * Check a parameter buffer
     * 
     * @param values buffer with values to check
     * @param needed
     * @param bufferName
     * 
     *  @throws IllegalArgumentException in following cases:
     *  <li>if values is null;
     *  <li>if offset < 0;
     *  <li>if array length < 1.
     */
    protected static void checkBuffer(java.nio.IntBuffer values, int needed, String bufferName){
        if (null == values) throw new IllegalArgumentException(bufferName + " == null");       
        if (values.remaining() < needed)
            throw new IllegalArgumentException(bufferName+".remaining() < needed = " + needed);        
    }
    
    /**
     * Check a parameter buffer
     * 
     * @param values buffer with values to check
     * @param needed
     * @param bufferName
     * 
     *  @throws IllegalArgumentException in following cases:
     *  <li>if values is null;
     *  <li>if offset < 0;
     *  <li>if array length < 1.
     */
    protected static void checkBuffer(java.nio.ShortBuffer values, int needed, String bufferName){
        if (null == values) throw new IllegalArgumentException(bufferName + " == null");       
        if (values.remaining() < needed)
            throw new IllegalArgumentException(bufferName+".remaining() < needed = " + needed);        
    }
    
    /**
     * Check a parameter buffer
     * 
     * @param values buffer with values to check
     * @param needed
     * @param bufferName
     * 
     *  @throws IllegalArgumentException in following cases:
     *  <li>if values is null;
     *  <li>if offset < 0;
     *  <li>if array length < 1.
     */
    protected static void checkBuffer(java.nio.LongBuffer values, int needed, String bufferName){
        if (null == values) throw new IllegalArgumentException(bufferName + " == null");       
        if (values.remaining() < needed)
            throw new IllegalArgumentException(bufferName+".remaining() < needed = " + needed);        
    }
    
    /**
     * Check a parameter buffer
     * 
     * @param values buffer with values to check
     * @param needed
     * @param bufferName
     * 
     *  @throws IllegalArgumentException in following cases:
     *  <li>if values is null;
     *  <li>if offset < 0;
     *  <li>if array length < 1.
     */
    protected static void checkBuffer(java.nio.FloatBuffer values, int needed, String bufferName){
        if (null == values) throw new IllegalArgumentException(bufferName + " == null");       
        if (values.remaining() < needed)
            throw new IllegalArgumentException(bufferName+".remaining() < needed = " + needed);        
    }
    
    /**
     * Get offset in float elements
     * @param values FloatBuffer instance
     * @return offset in float elements
     */
    protected static int getOffset(java.nio.FloatBuffer values){
        if (null == values) throw new IllegalArgumentException("FloatBuffer == null");       
        return BufferInfo.getOffset(values);       
    }
    
    /**
     * get Buffer Offset in int values
     * @param values IntBuffer values
     * @return offset in int elements
     */
    protected static int getOffset(java.nio.IntBuffer values){
        if (null == values) throw new IllegalArgumentException("IntBuffer == null");       
        return BufferInfo.getOffset(values);       
    }
    
    /**
     * Get the offset in bytes from a buffer
     * @param values - generic Buffer.
     * @return offset in bytes
     */
    protected static int getOffset(java.nio.Buffer values){
        if (null == values) throw new IllegalArgumentException("Buffer == null");       
        return BufferInfo.getOffset(values);       
    }
    
    /**
     * Get the offset in bytes from a buffer.
     * @param values - ByteBuffer instance
     * @return offset in bytes
     */
    protected static int getOffset(java.nio.ByteBuffer values){
        if (null == values) throw new IllegalArgumentException("Buffer == null");       
        return BufferInfo.getOffset(values);       
    }
    
    /**
     * Get the offset in short elements from a buffer.
     * @param values - ByteBuffer instance
     * @return offset in short elements
     */
    protected static int getOffset(java.nio.ShortBuffer values){
        if (null == values) throw new IllegalArgumentException("Buffer == null");       
        return BufferInfo.getOffset(values);       
    }
    
    /**
     * Copy remaining buffer values to a array.
     * Position is preserved. 
     * Mark value is undefined.
     * @param src - source buffer to be copied
     * @return array with buffer values
     */
    protected static int[] copyToArray(IntBuffer src){
        int len = src.remaining();
        int[] dst = new int[len];
        src.mark();
        src.get(dst);
        src.reset();
        return dst;
    }
    
    /**
     * Copy remaining buffer values to a array.<br>
     * Position is preserved. <br>    
     * 
     * @param src - source buffer to be copied
     * @param len - length of int[] to copy to
     * 
     * @return array with buffer values
     */
    protected static int[] copyToArray(IntBuffer src, int len){       
        int[] dst = new int[len];
        src.mark();
        src.get(dst,0,len);
        src.reset();
        return dst;
    }
    
    /**
     * Commit, or put back, an array of values to buffer.<br>
     * Position is preserved.<br>
     *      
     * @param src - source array with values to copy to buff 
     * @param dst - dst buffer to receive values.
     */
    protected static void copyFromArray(int[] src, IntBuffer dst){
        dst.mark();
        dst.put(src);
        dst.reset();
    }
    
    /**
     * Convert a generic Buffer to ByteBuffer.<br>
     * To be used on heap Buffer, as direct Buffer are treated as 
     *  (char *) on native side.
     * 
     * @param src - Source of generic Buffer type
     * @return a ByteBuffer instance
     */
    protected static ByteBuffer toByteBuffer(java.nio.Buffer src){        
        // best case
        if(src instanceof ByteBuffer){
            return (ByteBuffer)src;
        }    
        
        int shift = BufferInfo.getElementSizeShift(src);
        int capacity = src.remaining() << shift;
        boolean isDirect = src.isDirect();  
        
        ByteBuffer dst = isDirect ? ByteBuffer.allocateDirect(capacity)
                                  : ByteBuffer.allocate(capacity);
        src.mark();
        dst.mark();
        // IntBuffer case
        if(src instanceof IntBuffer){
            if(isDirect){
                dst.order(((IntBuffer) src).order());
            }
            IntBuffer srcM = (IntBuffer)src;            
            while(srcM.hasRemaining()){             
                dst.putInt(srcM.get());
            }
        } 
        // ShortBuffer case
        else if(src instanceof ShortBuffer){
            if(isDirect){
                dst.order(((ShortBuffer) src).order());
            }
            ShortBuffer srcM = (ShortBuffer)src;            
            while(srcM.hasRemaining()){               
                dst.putShort(srcM.get());
            }
        }
        
     // FloatBuffer case
        else if(src instanceof FloatBuffer){
            if(isDirect){
                dst.order(((FloatBuffer) src).order());
            }
            FloatBuffer srcM = (FloatBuffer)src;           
            while(srcM.hasRemaining()){               
                dst.putFloat(srcM.get());
            }
        }
        //LongBuffer case
        else if(src instanceof LongBuffer){
            if(isDirect){
                dst.order(((LongBuffer) src).order());
            }
            LongBuffer srcM = (LongBuffer)src;          
            while(srcM.hasRemaining()){                
                dst.putLong(srcM.get());
            }
        }
        //CharBuffer case
        else if(src instanceof CharBuffer){
            if(isDirect){
                dst.order(((CharBuffer) src).order());
            }
            CharBuffer srcM = (CharBuffer)src;          
            while(srcM.hasRemaining()){               
                dst.putChar(srcM.get());
            }
        }
        
        src.reset();
        dst.reset();
        return dst;
    }
    
    /**
     * Put values from src ByteBuffer to dst Buffer
     * @param dst - destiny generic Buffer to copy to.
     * @param src - source bytebuffer to copy from.
     */
    protected static void putByteBuffer(java.nio.Buffer dst, ByteBuffer src){
        dst.mark();
        src.mark();
        if(dst instanceof ByteBuffer){
            ByteBuffer dstM = (ByteBuffer)dst;
            while(src.hasRemaining()){
                dstM.put(src.get());
            }
        }
        
        else if(dst instanceof ShortBuffer){
            ShortBuffer dst2 = (ShortBuffer)dst;
            ShortBuffer src2 = src.asShortBuffer();
            while(src2.hasRemaining()){
                dst2.put(src2.get());
            }
        }
        
        else if(dst instanceof IntBuffer){
            IntBuffer dst2 = (IntBuffer)dst;
            IntBuffer src2 = src.asIntBuffer();
            while(src2.hasRemaining()){
                dst2.put(src2.get());
            }
        }
        
        else if(dst instanceof FloatBuffer){
            FloatBuffer dst2 = (FloatBuffer)dst;
            FloatBuffer src2 = src.asFloatBuffer();
            while(src2.hasRemaining()){
                dst2.put(src2.get());
            }
        }
        else if(dst instanceof LongBuffer){
            LongBuffer dst2 = (LongBuffer)dst;
            LongBuffer src2 = src.asLongBuffer();
            while(src2.hasRemaining()){
                dst2.put(src2.get());
            }
        }  
        else if(dst instanceof CharBuffer){
            CharBuffer dst2 = (CharBuffer)dst;
            CharBuffer src2 = src.asCharBuffer();
            while(src2.hasRemaining()){
                dst2.put(src2.get());
            }
        }    
        dst.reset();
        src.reset();
    }
    
    /**
     * Some String constants
     */
    protected static String PTR = "ptr";
    protected static String SHADERS2 = "shaders";
    protected static String COUNT2 = "count";
    protected static String LENGTH = "length";
    protected static String NAME = "name";
    protected static String TYPE = "type";
    protected static String SIZE = "size";
    protected static String BUFFERS = "buffers";
    protected static String PARAMS = "params";
    protected static String INDICES = "indices";
    protected static String DATA = "data";
    protected static String FRAMEBUFFER = "framebuffer";
    protected static String RENDERBUFFER = "renderbuffer";
    protected static String TEXTURES = "textures";
    protected static String VALUES = "values";
    protected static String PIXELS = "pixels";
    protected static String INVALID_BUFFER = "Invalid buffer type: ";
    
    
}
