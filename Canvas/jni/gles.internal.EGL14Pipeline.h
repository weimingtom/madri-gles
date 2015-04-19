/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class gles_internal_EGL14Pipeline */

#ifndef _Included_gles_internal_EGL14Pipeline
#define _Included_gles_internal_EGL14Pipeline
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    nativeClassInit
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_gles_internal_EGL14Pipeline_nativeClassInit
  (JNIEnv *, jclass);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    nEGLGetError
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_gles_internal_EGL14Pipeline_nEGLGetError
  (JNIEnv *, jclass);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglGetDisplay0
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglGetDisplay0
  (JNIEnv *, jclass, jlong);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglInitialize0
 * Signature: (J[II[II)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglInitialize0
  (JNIEnv *, jclass, jlong, jintArray, jint, jintArray, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglTerminate0
 * Signature: (J)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglTerminate0
  (JNIEnv *, jclass, jlong);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglQueryString0
 * Signature: (JI)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_gles_internal_EGL14Pipeline_eglQueryString0
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglGetConfigs0
 * Signature: (J[JI[I)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglGetConfigs0
  (JNIEnv *, jclass, jlong, jlongArray, jint, jintArray);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglChooseConfig0
 * Signature: (J[II[JII[II)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglChooseConfig0
  (JNIEnv *, jclass, jlong, jintArray, jint, jlongArray, jint, jint, jintArray, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglGetConfigAttrib0
 * Signature: (JJI[II)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglGetConfigAttrib0
  (JNIEnv *, jclass, jlong, jlong, jint, jintArray, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglCreateWindowSurface0
 * Signature: (JJJ[II)J
 */
JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglCreateWindowSurface0
  (JNIEnv *, jclass, jlong, jlong, jlong, jintArray, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglCreateWindowSurfaceTexture0
 * Signature: (JJJ[II)J
 */
JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglCreateWindowSurfaceTexture0
  (JNIEnv *, jclass, jlong, jlong, jlong, jintArray, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglCreatePbufferSurface0
 * Signature: (JJ[II)J
 */
JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglCreatePbufferSurface0
  (JNIEnv *, jclass, jlong, jlong, jintArray, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglCreatePixmapSurface0
 * Signature: (JJI[II)Landroid/opengl/EGLSurface;
 */
JNIEXPORT jobject JNICALL Java_gles_internal_EGL14Pipeline_eglCreatePixmapSurface0
  (JNIEnv *, jclass, jlong, jlong, jint, jintArray, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglDestroySurface0
 * Signature: (JJ)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglDestroySurface0
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglQuerySurface0
 * Signature: (JJI[II)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglQuerySurface0
  (JNIEnv *, jclass, jlong, jlong, jint, jintArray, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglBindAPI0
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglBindAPI0
  (JNIEnv *, jclass, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglQueryAPI0
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_gles_internal_EGL14Pipeline_eglQueryAPI0
  (JNIEnv *, jclass);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglWaitClient0
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglWaitClient0
  (JNIEnv *, jclass);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglReleaseThread0
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglReleaseThread0
  (JNIEnv *, jclass);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglCreatePbufferFromClientBuffer0
 * Signature: (JIJJ[II)J
 */
JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglCreatePbufferFromClientBuffer0
  (JNIEnv *, jclass, jlong, jint, jlong, jlong, jintArray, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglSurfaceAttrib0
 * Signature: (JJII)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglSurfaceAttrib0
  (JNIEnv *, jclass, jlong, jlong, jint, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglBindTexImage0
 * Signature: (JJI)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglBindTexImage0
  (JNIEnv *, jclass, jlong, jlong, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglReleaseTexImage0
 * Signature: (JJI)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglReleaseTexImage0
  (JNIEnv *, jclass, jlong, jlong, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglSwapInterval0
 * Signature: (JI)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglSwapInterval0
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglCreateContext0
 * Signature: (JJJ[II)J
 */
JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglCreateContext0
  (JNIEnv *, jclass, jlong, jlong, jlong, jintArray, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglDestroyContext0
 * Signature: (JJ)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglDestroyContext0
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglMakeCurrent0
 * Signature: (JJJJ)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglMakeCurrent0
  (JNIEnv *, jclass, jlong, jlong, jlong, jlong);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglGetCurrentContext0
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglGetCurrentContext0
  (JNIEnv *, jclass);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglGetCurrentSurface0
 * Signature: (I)J
 */
JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglGetCurrentSurface0
  (JNIEnv *, jclass, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglGetCurrentDisplay0
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglGetCurrentDisplay0
  (JNIEnv *, jclass);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglQueryContext0
 * Signature: (JJI[II)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglQueryContext0
  (JNIEnv *, jclass, jlong, jlong, jint, jintArray, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglWaitGL0
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglWaitGL0
  (JNIEnv *, jclass);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglWaitNative0
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglWaitNative0
  (JNIEnv *, jclass, jint);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglSwapBuffers0
 * Signature: (JJ)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglSwapBuffers0
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     gles_internal_EGL14Pipeline
 * Method:    eglCopyBuffers0
 * Signature: (JJJ)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglCopyBuffers0
  (JNIEnv *, jclass, jlong, jlong, jlong);

#ifdef __cplusplus
}
#endif
#endif
