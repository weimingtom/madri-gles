/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class gles_emulator_util_JAWT */

#ifndef _Included_gles_emulator_util_JAWT
#define _Included_gles_emulator_util_JAWT
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     gles_emulator_util_JAWT
 * Method:    getAWT0
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_gles_emulator_util_JAWT_getAWT0
  (JNIEnv *, jclass);

/*
 * Class:     gles_emulator_util_JAWT
 * Method:    getDrawingSurfaceInfo0
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_gles_emulator_util_JAWT_getDrawingSurfaceInfo0
  (JNIEnv *, jclass, jlong);

/*
 * Class:     gles_emulator_util_JAWT
 * Method:    getDrawingSurfaceAWT0
 * Signature: (Ljava/awt/Component;J)J
 */
JNIEXPORT jlong JNICALL Java_gles_emulator_util_JAWT_getDrawingSurfaceAWT0
  (JNIEnv *, jclass, jobject, jlong);

/*
 * Class:     gles_emulator_util_JAWT
 * Method:    getDrawingSurfaceWindowIdAWT
 * Signature: (Ljava/awt/Component;JJJI)J
 */
JNIEXPORT jlong JNICALL Java_gles_emulator_util_JAWT_getDrawingSurfaceWindowIdAWT
  (JNIEnv *, jclass, jobject, jlong, jlong, jlong, jint);

/*
 * Class:     gles_emulator_util_JAWT
 * Method:    lockGlobal0
 * Signature: (J)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_lockGlobal0
  (JNIEnv *, jclass, jlong);

/*
 * Class:     gles_emulator_util_JAWT
 * Method:    unlockGlobal0
 * Signature: (J)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_unlockGlobal0
  (JNIEnv *, jclass, jlong);

/*
 * Class:     gles_emulator_util_JAWT
 * Method:    freeResource
 * Signature: (JJJ)V
 */
JNIEXPORT void JNICALL Java_gles_emulator_util_JAWT_freeResource
  (JNIEnv *, jclass, jlong, jlong, jlong);

#ifdef __cplusplus
}
#endif
#endif