/*
 * Copyright (C) 2006 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.graphics;

import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.io.PrintWriter;

import android.util.Log;
import android.util.VecPool;


/**
 * The Matrix class holds a 3x3 matrix for transforming coordinates.
 */
public class Matrix {
    
    private static final String TAG = "android.graphics.Matrix";
    
    /** Pool for temporary float[9] */
    private static VecPool vecPool = new VecPool(9); 

    public static final int MSCALE_X = 0;   //!< use with getValues/setValues
    public static final int MSKEW_X  = 1;   //!< use with getValues/setValues
    public static final int MTRANS_X = 2;   //!< use with getValues/setValues
    public static final int MSKEW_Y  = 3;   //!< use with getValues/setValues
    public static final int MSCALE_Y = 4;   //!< use with getValues/setValues
    public static final int MTRANS_Y = 5;   //!< use with getValues/setValues
    public static final int MPERSP_0 = 6;   //!< use with getValues/setValues
    public static final int MPERSP_1 = 7;   //!< use with getValues/setValues
    public static final int MPERSP_2 = 8;   //!< use with getValues/setValues

    private final static int MATRIX_SIZE = 9;
    private float mValues[] = new float[MATRIX_SIZE];
    
    /** @hide */
    public static Matrix IDENTITY_MATRIX = new Matrix() {
        void oops() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override
        public void set(Matrix src) {
            oops();
        }

        @Override
        public void reset() {
            oops();
        }

        @Override
        public void setTranslate(float dx, float dy) {
            oops();
        }

        @Override
        public void setScale(float sx, float sy, float px, float py) {
            oops();
        }

        @Override
        public void setScale(float sx, float sy) {
            oops();
        }

        @Override
        public void setRotate(float degrees, float px, float py) {
            oops();
        }

        @Override
        public void setRotate(float degrees) {
            oops();
        }

        @Override
        public void setSinCos(float sinValue, float cosValue, float px, float py) {
            oops();
        }

        @Override
        public void setSinCos(float sinValue, float cosValue) {
            oops();
        }

        @Override
        public void setSkew(float kx, float ky, float px, float py) {
            oops();
        }

        @Override
        public void setSkew(float kx, float ky) {
            oops();
        }

        @Override
        public boolean setConcat(Matrix a, Matrix b) {
            oops();
            return false;
        }

        @Override
        public boolean preTranslate(float dx, float dy) {
            oops();
            return false;
        }

        @Override
        public boolean preScale(float sx, float sy, float px, float py) {
            oops();
            return false;
        }

        @Override
        public boolean preScale(float sx, float sy) {
            oops();
            return false;
        }

        @Override
        public boolean preRotate(float degrees, float px, float py) {
            oops();
            return false;
        }

        @Override
        public boolean preRotate(float degrees) {
            oops();
            return false;
        }

        @Override
        public boolean preSkew(float kx, float ky, float px, float py) {
            oops();
            return false;
        }

        @Override
        public boolean preSkew(float kx, float ky) {
            oops();
            return false;
        }

        @Override
        public boolean preConcat(Matrix other) {
            oops();
            return false;
        }

        @Override
        public boolean postTranslate(float dx, float dy) {
            oops();
            return false;
        }

        @Override
        public boolean postScale(float sx, float sy, float px, float py) {
            oops();
            return false;
        }

        @Override
        public boolean postScale(float sx, float sy) {
            oops();
            return false;
        }

        @Override
        public boolean postRotate(float degrees, float px, float py) {
            oops();
            return false;
        }

        @Override
        public boolean postRotate(float degrees) {
            oops();
            return false;
        }

        @Override
        public boolean postSkew(float kx, float ky, float px, float py) {
            oops();
            return false;
        }

        @Override
        public boolean postSkew(float kx, float ky) {
            oops();
            return false;
        }

        @Override
        public boolean postConcat(Matrix other) {
            oops();
            return false;
        }

//        @Override
//        public boolean setRectToRect(RectF src, RectF dst, ScaleToFit stf) {
//            oops();
//            return false;
//        }

        @Override
        public boolean setPolyToPoly(float[] src, int srcIndex, float[] dst, int dstIndex,
                int pointCount) {
            oops();
            return false;
        }

        @Override
        public void setValues(float[] values) {
            oops();
        }
    };

    /**
     * @hide
     */
    public long native_instance;

    /**
     * Create an identity matrix
     */
    public Matrix() {
       native_instance = native_create(0);
    }

    /**
     * Create a matrix that is a (deep) copy of src
     * @param src The matrix to copy into this matrix
     */
    public Matrix(Matrix src) {
        if(null != src){
            System.arraycopy(src.mValues, 0, this.mValues, 0, MATRIX_SIZE);
        }
        
        //native_instance = native_create(src != null ? src.native_instance : 0);
    }

    /**
     * Returns true if the matrix is identity.
     * This maybe faster than testing if (getType() == 0)
     */
    public boolean isIdentity() {
        for (int i = 0, k = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++, k++) {
                if (mValues[k] != ((i==j) ? 1 : 0)) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Gets whether this matrix is affine. An affine matrix preserves
     * straight lines and has no perspective.
     *
     * @return Whether the matrix is affine.
     */
    public boolean isAffine() {
        return (computeTypeMask() & kPerspective_Mask) == 0;
        //return native_isAffine(native_instance);
    }

    /**
     * Returns true if will map a rectangle to another rectangle. This can be
     * true if the matrix is identity, scale-only, or rotates a multiple of 90
     * degrees.
     */
    public boolean rectStaysRect() {
        return (computeTypeMask() & kRectStaysRect_Mask) != 0;
    }

    /**
     * (deep) copy the src matrix into this matrix. If src is null, reset this
     * matrix to the identity matrix.
     */
    public void set(Matrix src) {
        if (src == null) {
            reset();
        } else {
            System.arraycopy(src.mValues, 0, mValues, 0, MATRIX_SIZE);
        }
    }

    /** Returns true iff obj is a Matrix and its values equal our values.
    */
    @Override
    public boolean equals(Object obj) {
        //if (obj == this) return true;     -- NaN value would mean matrix != itself
        if (obj == null || !(obj instanceof Matrix)) return false;
       //return native_equals(native_instance, ((Matrix)obj).native_instance);
        
        Matrix other = (Matrix)obj;
        for (int i = 0; i < MATRIX_SIZE; i++) {
            if(mValues[i] != other.mValues[i]) return false;
    }
        return true;        
    }

    @Override
    public int hashCode() {
        // This should generate the hash code by performing some arithmetic operation on all
        // the matrix elements -- our equals() does an element-by-element comparison, and we
        // need to ensure that the hash code for two equal objects is the same.  We're not
        // really using this at the moment, so we take the easy way out.
        return 44;
    }

    /** Set the matrix to identity */
    public void reset() {
        reset(this.mValues);
        //native_reset(native_instance);
    }
    
    /**
     * Reset a matrix to the identity
     */
    private static void reset(float[] mtx) {
        for (int i = 0, k = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++, k++) {
                mtx[k] = ((i==j) ? 1 : 0);
            }
        }
    }

    /** Set the matrix to translate by (dx, dy). */
    public void setTranslate(float dx, float dy) {
       // native_setTranslate(native_instance, dx, dy);
        float[] m = this.mValues;
        m[0] = 1;
        m[1] = 0;
        m[2] = dx;
        m[3] = 0;
        m[4] = 1;
        m[5] = dy;
        m[6] = 0;
        m[7] = 0;
        m[8] = 1;
    }
    
   

    /**
     * Set the matrix to scale by sx and sy, with a pivot point at (px, py).
     * The pivot point is the coordinate that should remain unchanged by the
     * specified transformation.
     */
    public void setScale(float sx, float sy, float px, float py) {
       // native_setScale(native_instance, sx, sy, px, py);        
       setScale(this.mValues, sx, sy, px, py);  
    }
    
   
  
    
    
    
    
    private static float[] setScale(float[] dest, float sx, float sy, float px,  float py) {
        // translate tmp so that the pivot is in 0,0
        setTranslate(dest, -px, -py);
        float[] tmp = vecPool.get();
        // scale into dest
        multiply(dest, dest, setScale(tmp, sx, sy));
        // translate back the pivot back into dest
        multiply(dest, dest, setTranslate(tmp, px, py));
        vecPool.recycle(tmp);
        return dest;
    }
    
        
    /**
     * Apply scale factors to float matrix.
     * 
     * @param dest - 3x3 float matrix, to set scale factors
     * @param sx - scale in x axis
     * @param sy - scale in y axis
     * 
     * @return matrix - dest with scale factors
     */
    private static float[] setScale(float[] dest, float sx, float sy) {             
             //return new float[] { sx, 0, 0, 0, sy, 0, 0, 0, 1 };
             dest[0] = sx;
             dest[1] = 0;
             dest[2] = 0;
             dest[3] = 0;
             dest[4] = sy;
             dest[5] = 0;
             dest[6] = 0;
             dest[7] = 0;
             dest[8] = 1;
             return dest;
     }
    
    
    
    /**
     * Apply translate factors to a array.
     * 
     * @param dest - 3x3 matrix to set translate factors.
     * @param dx - translation in x axis.
     * @param dy - translation in y axis.
     * 
     * @return matrix dest with translate factors set
     */
    private static float[] setTranslate(float[] dest, float dx, float dy) {
                dest[0] = 1;
                dest[1] = 0;
                dest[2] = dx;
                dest[3] = 0;
                dest[4] = 1;
                dest[5] = dy;
                dest[6] = 0;
                dest[7] = 0;
                dest[8] = 1;
                return dest;
     }
    
    /**
     * multiply two matrices and store them in a 3rd.
     * <p/>This in effect does dest = a*b
     * dest can be the same as a or b.
     */
     private static void multiply(float dest[], float[] a, float[] b) {
             // first row
             float d0 = b[0] * a[0] + b[1] * a[3] + b[2] * a[6];
             float d1 = b[0] * a[1] + b[1] * a[4] + b[2] * a[7];
             float d2 = b[0] * a[2] + b[1] * a[5] + b[2] * a[8];
     
             // 2nd row
             float d3 = b[3] * a[0] + b[4] * a[3] + b[5] * a[6];
             float d4 = b[3] * a[1] + b[4] * a[4] + b[5] * a[7];
             float d5 = b[3] * a[2] + b[4] * a[5] + b[5] * a[8];
     
             // 3rd row
             float d6 = b[6] * a[0] + b[7] * a[3] + b[8] * a[6];
             float d7 = b[6] * a[1] + b[7] * a[4] + b[8] * a[7];
             float d8 = b[6] * a[2] + b[7] * a[5] + b[8] * a[8];
             
             dest[0] = d0;
             dest[1] = d1;
             dest[2] = d2;
             dest[3] = d3;
             dest[4] = d4;
             dest[5] = d5;
             dest[6] = d6;
             dest[7] = d7;
             dest[8] = d8;
    }

    /** Set the matrix to scale by sx and sy. */
    public void setScale(float sx, float sy) {
       // native_setScale(native_instance, sx, sy);
        mValues[0] = sx;
        mValues[1] = 0;
        mValues[2] = 0;
        mValues[3] = 0;
        mValues[4] = sy;
        mValues[5] = 0;
        mValues[6] = 0;
        mValues[7] = 0;
        mValues[8] = 1;
    }

    /**
     * Set the matrix to rotate by the specified number of degrees, with a pivot
     * point at (px, py). The pivot point is the coordinate that should remain
     * unchanged by the specified transformation.
     */
    public void setRotate(float degrees, float px, float py) {
        //native_setRotate(native_instance, degrees, px, py);
        double rad = Math.toRadians(degrees);
        float sin = (float)Math.sin(rad);
        float cos = (float)Math.cos(rad);
        setSinCos(sin, cos, px, py);
    }

    /**
     * Set the matrix to rotate about (0,0) by the specified number of degrees.
     */
    public void setRotate(float degrees) {
       // native_setRotate(native_instance, degrees);        
       setRotate(mValues, degrees);
    }
    
    private static float[] setRotate(float[] dest, float degrees) {
        // native_setRotate(native_instance, degrees);
         double rad = Math.toRadians(degrees);
         float sin = (float)Math.sin(rad);
         float cos = (float)Math.cos(rad);
         return setRotate(dest,sin,cos);
     }
    
       
    private static float[] setRotate(float[] dest, float sin, float cos) {
                 dest[0] = cos;
                 dest[1] = -sin;
                 dest[2] = 0;
                 dest[3] = sin;
                 dest[4] = cos;
                 dest[5] = 0;
                 dest[6] = 0;
                 dest[7] = 0;
                 dest[8] = 1;
                 return dest;
      }
    
    /**
     * set rotate with translation
     * @param dest
     * @param degrees
     * @param px
     * @param py
     * @return dest
     */
    private static float[] setRotate(float[] dest, float degrees, float px, float py) {
        float[] tmp = dest;
        float[] tmp2 = vecPool.get();
        
        // translate so that the pivot is in 0,0
        setTranslate(tmp, -px, -py);
        // rotate into tmp2
        double rad = Math.toRadians(degrees);
        float cos = (float)Math.cos(rad);
        float sin = (float)Math.sin(rad);
        
        multiply(tmp, tmp, setRotate(tmp2, sin, cos));
        // translate back the pivot back into tmp
        multiply(tmp, tmp2, setTranslate(tmp2,px, py));

        return tmp;
    }
    
  

    /**
     * Set the matrix to rotate by the specified sine and cosine values, with a
     * pivot point at (px, py). The pivot point is the coordinate that should
     * remain unchanged by the specified transformation.
     */
    public void setSinCos(float sinValue, float cosValue, float px, float py) {
        //native_setSinCos(native_instance, sinValue, cosValue, px, py);
        // translate so that the pivot is in 0,0
        setTranslate(mValues, -px, -py);
         
        // scale
        float[] tmp = vecPool.get();        
            postTransform(setRotate(tmp, sinValue, cosValue));
            // translate back the pivot
            postTransform(setTranslate(tmp, px, py));
        vecPool.recycle(tmp);
    }

     
    /**
     * Adds the given transformation to the current Matrix.
    *  This in effect does this = this*matrix
    * @param matrix
    */
    private void postTransform(float[] matrix) {
            multiply(mValues, mValues, matrix);
    }
    
    /**
     * Adds the given transformation to the current Matrix
     * This in effect does this = matrix*this
     * @param matrix
     */
    private void preTransform(float[] matrix) {           
            multiply(mValues, matrix, mValues);                      
    }

    /** Set the matrix to rotate by the specified sine and cosine values. */
    public void setSinCos(float sinValue, float cosValue) {
        //native_setSinCos(native_instance, sinValue, cosValue);
       setRotate(mValues, sinValue, cosValue);
    }

    /**
     * Set the matrix to skew by sx and sy, with a pivot point at (px, py).
     * The pivot point is the coordinate that should remain unchanged by the
     * specified transformation.
     */
    public void setSkew(float sx, float sy, float px, float py) {
        //native_setSkew(native_instance, kx, ky, px, py);
        setSkew(mValues, sx, sy, px, py);
    }
    
    /**
     * TODO - fix it
     * @param dst
     * @param kx
     * @param ky
     * @param px
     * @param py
     * @return
     */
    private static float[] setSkew(float[] dst, float kx, float ky, float px, float py) {
        float[] mtx = dst;      

        // translate so that the pivot is in 0,0
        setTranslate(mtx, -px, -py);

        // skew into mtx
        float[] tmp = vecPool.get();
            tmp = setSkew(tmp, kx, ky);        
            multiply(mtx, mtx, tmp);
        // translate back the pivot back into tmp  
            tmp = setTranslate(tmp, px, py);
            multiply(mtx, mtx, tmp);
        vecPool.recycle(tmp);
        return mtx;
    }

    /** Set the matrix to skew by sx and sy. */
    public void setSkew(float kx, float ky) {
        // native_setSkew(native_instance, kx, ky);
       setSkew(mValues, kx, ky);
    }

    /**
     * Set the matrix to skew by sx and sy. 
     * 
     * @return float[] { 1, kx, 0, ky, 1, 0, 0, 0, 1 }
     * */
    private static float[] setSkew(float[] m, float kx, float ky) {
        // native_setSkew(native_instance, kx, ky);
        m[0] = 1;
        m[1] = kx;
        m[2] = 0;
        m[3] = ky;
        m[4] = 1;
        m[5] = 0;
        m[6] = 0;
        m[7] = 0;
        m[8] = 1;
        return m;
    }

    /**
     * Set the matrix to the concatenation of the two specified matrices and
     * return true.
     *
     * <p>Either of the two matrices may also be the target matrix, that is
     * <code>matrixA.setConcat(matrixA, matrixB);</code> is valid.</p>
     *
     * <p class="note">In {@link android.os.Build.VERSION_CODES#GINGERBREAD_MR1} and below, this
     * function returns true only if the result can be represented. In
     * {@link android.os.Build.VERSION_CODES#HONEYCOMB} and above, it always returns true.</p>
     */
    public boolean setConcat(Matrix a, Matrix b) {
        //native_setConcat(native_instance, a.native_instance, b.native_instance);
        if(null==a || null ==b) return false;
        
        //if(this==a) return preConcat(b);
        //if(this==b) return postConcat(a);
        
        multiply(mValues, a.mValues, b.mValues);        
        return true;
    }

    /**
     * Preconcats the matrix with the specified translation.
     * M' = M * T(dx, dy)
     */
    public boolean preTranslate(float dx, float dy) {
        //native_preTranslate(native_instance, dx, dy);
        float[] tmp = vecPool.get();
            tmp = setTranslate(tmp, dx,dy);
            preTransform(tmp);
        vecPool.recycle(tmp);
        return true;
    }

    /**
     * Preconcats the matrix with the specified scale.
     * M' = M * S(sx, sy, px, py)
     */
    public boolean preScale(float sx, float sy, float px, float py) {
       // native_preScale(native_instance, sx, sy, px, py);
        float[] tmp = vecPool.get();
        tmp = setScale(tmp, sx, sy, px, py);
        preTransform(tmp);
        vecPool.recycle(tmp);
        return true;
    }

    /**
     * Preconcats the matrix with the specified scale.
     * M' = M * S(sx, sy)
     */
    public boolean preScale(float sx, float sy) {
        //native_preScale(native_instance, sx, sy);
        float[] tmp = vecPool.get();
        setScale(tmp, sx, sy);
        preTransform(tmp);
        vecPool.recycle(tmp);
        return true;
    }

    /**
     * Preconcats the matrix with the specified rotation.
     * M' = M * R(degrees, px, py)
     */
    public boolean preRotate(float degrees, float px, float py) {
       // native_preRotate(native_instance, degrees, px, py);
        float[] tmp = vecPool.get();
        setRotate(tmp, degrees, px, py);
        preTransform(tmp);
        vecPool.recycle(tmp);
        return true;
    }

    /**
     * Preconcats the matrix with the specified rotation.
     * M' = M * R(degrees)
     */
    public boolean preRotate(float degrees) {
        //native_preRotate(native_instance, degrees);        
        float[] tmp = vecPool.get();
        setRotate(tmp, degrees);
        preTransform(tmp);
        vecPool.recycle(tmp);
        return true;
    }

    /**
     * Preconcats the matrix with the specified skew.
     * M' = M * K(kx, ky, px, py)
     */
    public boolean preSkew(float kx, float ky, float px, float py) {
       // native_preSkew(native_instance, kx, ky, px, py);
        float[] tmp = vecPool.get();
        setSkew(tmp, kx, ky, px, py);
        preTransform(tmp);
        vecPool.recycle(tmp);
        return true;
    }

    /**
     * Preconcats the matrix with the specified skew.
     * M' = M * K(kx, ky)
     */
    public boolean preSkew(float kx, float ky) {
        //native_preSkew(native_instance, kx, ky);
        float[] tmp = vecPool.get();
        setSkew(tmp, kx, ky);
        preTransform(tmp);
        vecPool.recycle(tmp);
        return true;
    }

    /**
     * Preconcats the matrix with the specified matrix.
     * M' = M * other
     */
    public boolean preConcat(Matrix other) {
        //native_preConcat(native_instance, other.native_instance);
        if(null==other) return false;
        preTransform(other.mValues);
        return true;
    }

    /**
     * Postconcats the matrix with the specified translation.
     * M' = T(dx, dy) * M
     */
    public boolean postTranslate(float dx, float dy) {
        //native_postTranslate(native_instance, dx, dy);
        float[] temp = vecPool.get();
            setTranslate(temp,dx,dy);
            postTransform(temp);
        vecPool.recycle(temp);
        return true;
    }

    /**
     * Postconcats the matrix with the specified scale.
     * M' = S(sx, sy, px, py) * M
     */
    public boolean postScale(float sx, float sy, float px, float py) {
        //native_postScale(native_instance, sx, sy, px, py);
        float[] temp = vecPool.get();
            setScale(temp, sx, sy, px, py);
            postTransform(temp);
        vecPool.recycle(temp);
        return true;
    }

    /**
     * Postconcats the matrix with the specified scale.
     * M' = S(sx, sy) * M
     */
    public boolean postScale(float sx, float sy) {
        //native_postScale(native_instance, sx, sy);   
        float[] tmp = vecPool.get();
            postTransform(setScale(tmp,sx,sy));
        vecPool.recycle(tmp);
        return true;
    }

    /**
     * Postconcats the matrix with the specified rotation.
     * M' = R(degrees, px, py) * M
     */
    public boolean postRotate(float degrees, float px, float py) {
        //native_postRotate(native_instance, degrees, px, py);
        float[] temp = vecPool.get();
            setRotate(temp, degrees, px, py);
            postTransform(temp);
        vecPool.recycle(temp);
        return true;
    }

    /**
     * Postconcats the matrix with the specified rotation.
     * M' = R(degrees) * M
     */
    public boolean postRotate(float degrees) {
       // native_postRotate(native_instance, degrees);
        float[] temp = vecPool.get();
            setRotate(temp, degrees);
            postTransform(temp);
        vecPool.recycle(temp);
        return true;
    }

    /**
     * Postconcats the matrix with the specified skew.
     * M' = K(kx, ky, px, py) * M
     */
    public boolean postSkew(float kx, float ky, float px, float py) {
        //native_postSkew(native_instance, kx, ky, px, py);
        float[] temp = vecPool.get();
            setSkew(temp, kx, ky, px, py);
            postTransform(temp);
        vecPool.recycle(temp);
        return true;
    }

    /**
     * Postconcats the matrix with the specified skew.
     * M' = K(kx, ky) * M
     */
    public boolean postSkew(float kx, float ky) {
        //native_postSkew(native_instance, kx, ky);
        float[] temp = vecPool.get();
            setSkew(temp, kx, ky);
            postTransform(temp);
        vecPool.recycle(temp);
        return true;
    }

    /**
     * Postconcats the matrix with the specified matrix.
     * M' = other * M
     */
    public boolean postConcat(Matrix other) {
        //native_postConcat(native_instance, other.native_instance);
        if(null==other) return false;
        
        postTransform(other.mValues);
        return true;
    }

    //////////////////////////////////////////////////////////////////////
    
    @SuppressWarnings("unused")
    private final static int kIdentity_Mask      = 0;
    private final static int kTranslate_Mask     = 0x01;  //!< set if the matrix has translation
    private final static int kScale_Mask         = 0x02;  //!< set if the matrix has X or Y scale
    private final static int kAffine_Mask        = 0x04;  //!< set if the matrix skews or rotates
    private final static int kPerspective_Mask   = 0x08;  //!< set if the matrix is in perspective
    private final static int kRectStaysRect_Mask = 0x10;
    @SuppressWarnings("unused")
    private final static int kUnknown_Mask       = 0x80;

    @SuppressWarnings("unused")
    private final static int kAllMasks           = kTranslate_Mask |
                                                   kScale_Mask |
                                                   kAffine_Mask |
                                                   kPerspective_Mask |
                                                   kRectStaysRect_Mask;

    // these guys align with the masks, so we can compute a mask from a variable 0/1
    @SuppressWarnings("unused")
    private final static int kTranslate_Shift = 0;
    @SuppressWarnings("unused")
    private final static int kScale_Shift = 1;
    @SuppressWarnings("unused")
    private final static int kAffine_Shift = 2;
    @SuppressWarnings("unused")
    private final static int kPerspective_Shift = 3;
    private final static int kRectStaysRect_Shift = 4;

    private int computeTypeMask() {
        int mask = 0;

        if (mValues[6] != 0. || mValues[7] != 0. || mValues[8] != 1.) {
            mask |= kPerspective_Mask;
        }

        if (mValues[2] != 0. || mValues[5] != 0.) {
            mask |= kTranslate_Mask;
        }

        float m00 = mValues[0];
        float m01 = mValues[1];
        float m10 = mValues[3];
        float m11 = mValues[4];

        if (m01 != 0. || m10 != 0.) {
            mask |= kAffine_Mask;
        }

        if (m00 != 1. || m11 != 1.) {
            mask |= kScale_Mask;
        }

        if ((mask & kPerspective_Mask) == 0) {
            // map non-zero to 1
            int im00 = m00 != 0 ? 1 : 0;
            int im01 = m01 != 0 ? 1 : 0;
            int im10 = m10 != 0 ? 1 : 0;
            int im11 = m11 != 0 ? 1 : 0;

            // record if the (p)rimary and (s)econdary diagonals are all 0 or
            // all non-zero (answer is 0 or 1)
            int dp0 = (im00 | im11) ^ 1;  // true if both are 0
            int dp1 = im00 & im11;        // true if both are 1
            int ds0 = (im01 | im10) ^ 1;  // true if both are 0
            int ds1 = im01 & im10;        // true if both are 1

            // return 1 if primary is 1 and secondary is 0 or
            // primary is 0 and secondary is 1
            mask |= ((dp0 & ds1) | (dp1 & ds0)) << kRectStaysRect_Shift;
        }

        return mask;
    }
    
    /////////////////////////////////////////////////////////////////////
    
    
    /** Controlls how the src rect should align into the dst rect for
        setRectToRect().
    */
    public enum ScaleToFit {
        /**
         * Scale in X and Y independently, so that src matches dst exactly.
         * This may change the aspect ratio of the src.
         */
        FILL    (0),
        /**
         * Compute a scale that will maintain the original src aspect ratio,
         * but will also ensure that src fits entirely inside dst. At least one
         * axis (X or Y) will fit exactly. START aligns the result to the
         * left and top edges of dst.
         */
        START   (1),
        /**
         * Compute a scale that will maintain the original src aspect ratio,
         * but will also ensure that src fits entirely inside dst. At least one
         * axis (X or Y) will fit exactly. The result is centered inside dst.
         */
        CENTER  (2),
        /**
         * Compute a scale that will maintain the original src aspect ratio,
         * but will also ensure that src fits entirely inside dst. At least one
         * axis (X or Y) will fit exactly. END aligns the result to the
         * right and bottom edges of dst.
         */
        END     (3);

        // the native values must match those in SkMatrix.h
        ScaleToFit(int nativeInt) {
            this.nativeInt = nativeInt;
        }
        final int nativeInt;
    }

    /**
     * Set the matrix to the scale and translate values that map the source
     * rectangle to the destination rectangle, returning true if the the result
     * can be represented.
     *
     * @param src the source rectangle to map from.
     * @param dst the destination rectangle to map to.
     * @param stf the ScaleToFit option
     * @return true if the matrix can be represented by the rectangle mapping.
     */
    public boolean setRectToRect(RectF src, RectF dst, ScaleToFit stf_obj) {
        if (dst == null || src == null) {
            throw new NullPointerException();
        }
        //return native_setRectToRect(native_instance, src, dst, stf.nativeInt);
        
        if (src.isEmpty()) {
            reset(mValues);
            return false;
        }
        
        int stf = stf_obj.nativeInt;
        
        if (dst.isEmpty()) {
            mValues[0] = mValues[1] = mValues[2] = mValues[3] = mValues[4] = mValues[5]
               = mValues[6] = mValues[7] = 0;
            mValues[8] = 1;
        } else {
            float    tx, sx = dst.width() / src.width();
            float    ty, sy = dst.height() / src.height();
            boolean  xLarger = false;

            if (stf != ScaleToFit.FILL.nativeInt) {
                if (sx > sy) {
                    xLarger = true;
                    sx = sy;
                } else {
                    sy = sx;
                }
            }

            tx = dst.left - src.left * sx;
            ty = dst.top - src.top * sy;
            if (stf == ScaleToFit.CENTER.nativeInt || stf == ScaleToFit.END.nativeInt) {
                float diff;

                if (xLarger) {
                    diff = dst.width() - src.width() * sy;
                } else {
                    diff = dst.height() - src.height() * sy;
                }

                if (stf == ScaleToFit.CENTER.nativeInt) {
                    diff = diff / 2;
                }

                if (xLarger) {
                    tx += diff;
                } else {
                    ty += diff;
                }
            }

            mValues[0] = sx;
            mValues[4] = sy;
            mValues[2] = tx;
            mValues[5] = ty;
            mValues[1]  = mValues[3] = mValues[6] = mValues[7] = 0;

        }
        // shared cleanup
        mValues[8] = 1;
        
        return true;
    }

    // private helper to perform range checks on arrays of "points"
    private static void checkPointArrays(float[] src, int srcIndex,
                                         float[] dst, int dstIndex,
                                         int pointCount) {
        // check for too-small and too-big indices
        int srcStop = srcIndex + (pointCount << 1);
        int dstStop = dstIndex + (pointCount << 1);
        if ((pointCount | srcIndex | dstIndex | srcStop | dstStop) < 0 ||
                srcStop > src.length || dstStop > dst.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /**
     * Set the matrix such that the specified src points would map to the
     * specified dst points. The "points" are represented as an array of floats,
     * order [x0, y0, x1, y1, ...], where each "point" is 2 float values.
     *
     * @param src   The array of src [x,y] pairs (points)
     * @param srcIndex Index of the first pair of src values
     * @param dst   The array of dst [x,y] pairs (points)
     * @param dstIndex Index of the first pair of dst values
     * @param pointCount The number of pairs/points to be used. Must be [0..4]
     * @return true if the matrix was set to the specified transformation
     */
    public boolean setPolyToPoly(float[] src, int srcIndex,
                                 float[] dst, int dstIndex,
                                 int pointCount) {
        if (pointCount > 4) {
            throw new IllegalArgumentException();
        }
        checkPointArrays(src, srcIndex, dst, dstIndex, pointCount);
//        return native_setPolyToPoly(native_instance, src, srcIndex,
//                                    dst, dstIndex, pointCount);
        Log.d(TAG, "Matrix.setPolyToPoly is not supported.");
        return false;
    }
    
    public AffineTransform getAffineTransform() {
                return getAffineTransform(mValues);
      }
    
    private static AffineTransform getAffineTransform(float[] matrix) {
        // the AffineTransform constructor takes the value in a different order
        // for a matrix [ 0 1 2 ]
        // [ 3 4 5 ]
        // the order is 0, 3, 1, 4, 2, 5...
        return new AffineTransform( matrix[0], matrix[3], matrix[1],
                                    matrix[4], matrix[2], matrix[5]);
    }
        

    /**
     * If this matrix can be inverted, return true and if inverse is not null,
     * set inverse to be the inverse of this matrix. If this matrix cannot be
     * inverted, ignore inverse and return false.
     */
    public boolean invert(Matrix inverse) {
        //return native_invert(native_instance, inverse.native_instance);
        
        try {
            AffineTransform affineTransform = getAffineTransform();
            AffineTransform inverseTransform = affineTransform.createInverse();
            inverse.mValues[0] = (float)inverseTransform.getScaleX();
            inverse.mValues[1] = (float)inverseTransform.getShearX();
            inverse.mValues[2] = (float)inverseTransform.getTranslateX();
            inverse.mValues[3] = (float)inverseTransform.getScaleX();
            inverse.mValues[4] = (float)inverseTransform.getShearY();
            inverse.mValues[5] = (float)inverseTransform.getTranslateY();

            return true;
        } catch (NoninvertibleTransformException e) {
            return false;
        }
    }

    /**
    * Apply this matrix to the array of 2D points specified by src, and write
     * the transformed points into the array of points specified by dst. The
     * two arrays represent their "points" as pairs of floats [x, y].
     *
     * @param dst   The array of dst points (x,y pairs)
     * @param dstIndex The index of the first [x,y] pair of dst floats
     * @param src   The array of src points (x,y pairs)
     * @param srcIndex The index of the first [x,y] pair of src floats
     * @param pointCount The number of points (x,y pairs) to transform
     */
    public void mapPoints(float[] dst, int dstIndex, float[] src, int srcIndex, int pointCount) {
        checkPointArrays(src, srcIndex, dst, dstIndex, pointCount);
        //native_mapPoints(native_instance, dst, dstIndex, src, srcIndex, pointCount, true);
        mapPoints0(dst, dstIndex, src, srcIndex, pointCount);
    }

    /**
    * Apply this matrix to the array of 2D vectors specified by src, and write
     * the transformed vectors into the array of vectors specified by dst. The
     * two arrays represent their "vectors" as pairs of floats [x, y].
     *
     * Note: this method does not apply the translation associated with the matrix. Use
     * {@link Matrix#mapPoints(float[], int, float[], int, int)} if you want the translation
     * to be applied.
     *
     * @param dst   The array of dst vectors (x,y pairs)
     * @param dstIndex The index of the first [x,y] pair of dst floats
     * @param src   The array of src vectors (x,y pairs)
     * @param srcIndex The index of the first [x,y] pair of src floats
     * @param vectorCount The number of vectors (x,y pairs) to transform
     */
    public void mapVectors(float[] dst, int dstIndex, float[] src, int srcIndex,  int vectorCount) {
        checkPointArrays(src, srcIndex, dst, dstIndex, vectorCount);
        //native_mapPoints(native_instance, dst, dstIndex, src, srcIndex, vectorCount, false);
        mapVectors0(dst, dstIndex, src, srcIndex, vectorCount);
    }
    
    
    private void mapVectors0(float[] dst, int dstIndex, float[] src, int srcIndex, int vectorCount) {
        if (hasPerspective()) {
            // transform the (0,0) point
            float[] origin = new float[] { 0.f, 0.f };
            mapPoints(origin);

            // translate the vector data as points
            mapPoints(dst, dstIndex, src, srcIndex, vectorCount);

            // then substract the transformed origin.
            final int count = vectorCount * 2;
            for (int i = 0; i < count; i += 2) {
                dst[dstIndex + i    ] = dst[dstIndex + i    ] - origin[0];
                dst[dstIndex + i + 1] = dst[dstIndex + i + 1] - origin[1];
            }
        } else {
            // make a copy of the matrix
            Matrix copy = new Matrix(this);
            // remove the translation
            setTranslate(copy.mValues, 0, 0);
            // map the content as points.
            copy.mapPoints(dst, dstIndex, src, srcIndex, vectorCount);
    }
    }
    
    public boolean hasPerspective() {
           return (mValues[6] != 0 || mValues[7] != 0 || mValues[8] != 1);
    }

    /**
     * Apply this matrix to the array of 2D points specified by src, and write
     * the transformed points into the array of points specified by dst. The two
     * arrays represent their "points" as pairs of floats [x, y].
     *
     * @param dst
     *            The array of dst points (x,y pairs)
     * @param dstIndex
     *            The index of the first [x,y] pair of dst floats
     * @param src
     *            The array of src points (x,y pairs)
     * @param srcIndex
     *            The index of the first [x,y] pair of src floats
     * @param pointCount
     *            The number of points (x,y pairs) to transform
     */

    private void mapPoints0(float[] dst, int dstIndex, float[] src,  int srcIndex, int pointCount) {
        final int count = pointCount * 2;

        float[] tmpDest = dst;
        boolean inPlace = (dst == src);
        if (inPlace) {
            tmpDest = new float[count];
        }

        for (int i = 0; i < count; i += 2) {
            // just in case we are doing in place, we better put this in temp
            // vars
            float x = mValues[0] * src[i + srcIndex] + mValues[1] * src[i + srcIndex + 1] + mValues[2];
            float y = mValues[3] * src[i + srcIndex] + mValues[4] * src[i + srcIndex + 1] + mValues[5];
            
            int pos = inPlace ? i : (i + dstIndex);
            tmpDest[pos    ] = x;
            tmpDest[pos + 1] = y;
        }

        if (inPlace) {
            System.arraycopy(tmpDest, 0, dst, dstIndex, count);
        }
    }

    /**
     * Apply this matrix to the array of 2D points specified by src, and write
     * the transformed points into the array of points specified by dst. The
     * two arrays represent their "points" as pairs of floats [x, y].
     *
     * @param dst   The array of dst points (x,y pairs)
     * @param src   The array of src points (x,y pairs)
     */
    public void mapPoints(float[] dst, float[] src) {
        if (dst.length != src.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        mapPoints(dst, 0, src, 0, dst.length >> 1);
    }

    /**
     * Apply this matrix to the array of 2D vectors specified by src, and write
     * the transformed vectors into the array of vectors specified by dst. The
     * two arrays represent their "vectors" as pairs of floats [x, y].
     *
     * Note: this method does not apply the translation associated with the matrix. Use
     * {@link Matrix#mapPoints(float[], float[])} if you want the translation to be applied.
     *
     * @param dst   The array of dst vectors (x,y pairs)
     * @param src   The array of src vectors (x,y pairs)
     */
    public void mapVectors(float[] dst, float[] src) {
        if (dst.length != src.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        mapVectors(dst, 0, src, 0, dst.length >> 1);
    }

    /**
     * Apply this matrix to the array of 2D points, and write the transformed
     * points back into the array
     *
     * @param pts The array [x0, y0, x1, y1, ...] of points to transform.
     */
    public void mapPoints(float[] pts) {
        mapPoints(pts, 0, pts, 0, pts.length >> 1);
    }

    /**
     * Apply this matrix to the array of 2D vectors, and write the transformed
     * vectors back into the array.
     *
     * Note: this method does not apply the translation associated with the matrix. Use
     * {@link Matrix#mapPoints(float[])} if you want the translation to be applied.
     *
     * @param vecs The array [x0, y0, x1, y1, ...] of vectors to transform.
     */
    public void mapVectors(float[] vecs) {
        mapVectors(vecs, 0, vecs, 0, vecs.length >> 1);
    }

    /**
     * Apply this matrix to the src rectangle, and write the transformed
     * rectangle into dst. This is accomplished by transforming the 4 corners of
     * src, and then setting dst to the bounds of those points.
     *
     * @param dst Where the transformed rectangle is written.
     * @param src The original rectangle to be transformed.
     * @return the result of calling rectStaysRect()
     */
    public boolean mapRect(RectF dst, RectF src) {
        if (dst == null || src == null) {
            throw new NullPointerException();
        }

        // array with 4 corners
        float[] corners = new float[] { src.left, src.top, 
                                        src.right, src.top,
                                        src.right, src.bottom, 
                                        src.left, src.bottom, };
        
//        float c0 = src.left,  c1 = src.top,
//              c2 = src.right, c3 = src.top,
//              c4 = src.right, c5 = src.bottom,
//              c6 = src.left,  c7 = src.bottom
        

        // apply the transform to them.
        mapPoints(corners);

        // now put the result in the rect. We take the min/max of Xs and min/max
        // of Ys
        dst.left = Math.min(Math.min(corners[0], corners[2]), Math.min(corners[4], corners[6]));
        dst.right = Math.max(Math.max(corners[0], corners[2]),Math.max(corners[4], corners[6]));

        dst.top = Math.min(Math.min(corners[1], corners[3]), Math.min(corners[5], corners[7]));
        dst.bottom = Math.max(Math.max(corners[1], corners[3]), Math.max(corners[5], corners[7]));

        return (computeTypeMask() & kRectStaysRect_Mask) != 0;

        // return native_mapRect(native_instance, dst, src);
    }

    /**
     * Apply this matrix to the rectangle, and write the transformed rectangle
     * back into it. This is accomplished by transforming the 4 corners of rect,
     * and then setting it to the bounds of those points
     *
     * @param rect The rectangle to transform.
     * @return the result of calling rectStaysRect()
     */
    public boolean mapRect(RectF rect) {
        return mapRect(rect, rect);
    }

    /**
     * Return the mean radius of a circle after it has been mapped by
     * this matrix. NOTE: in perspective this value assumes the circle
     * has its center at the origin.
     */
    public float mapRadius(float radius) {
        //return native_mapRadius(native_instance, radius);
        float[] src = new float[] { radius, 0.f, 0.f, radius };
        mapVectors(src, 0, src, 0, 2);
         
        float l1 = getPointLength(src, 0);
        float l2 = getPointLength(src, 2);
         
        return (float) Math.sqrt(l1 * l2);
    }
    
    /**
     * 
     * @param src
     * @param index
     * @return
     */
    private static float getPointLength(float[] src, int index) {
             return (float) Math.sqrt(src[index] * src[index] + src[index + 1] * src[index + 1]);
    }

    /** Copy 9 values from the matrix into the array.
    */
    public void getValues(float[] values) {
        if (values.length < 9) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.arraycopy(mValues, 0, values, 0, MATRIX_SIZE);
        //native_getValues(native_instance, values);
    }

    /** Copy 9 values from the array into the matrix.
        Depending on the implementation of Matrix, these may be
        transformed into 16.16 integers in the Matrix, such that
        a subsequent call to getValues() will not yield exactly
        the same values.
    */
    public void setValues(float[] values) {
        if (values.length < 9) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.arraycopy(values, 0, mValues, 0, MATRIX_SIZE);
        //native_setValues(native_instance, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("Matrix{");
        toShortString(sb);
        sb.append('}');
        return sb.toString();

    }

    public String toShortString() {
        StringBuilder sb = new StringBuilder(64);
        toShortString(sb);
        return sb.toString();
    }

    /**
     * @hide
     */
    public void toShortString(StringBuilder sb) {
        float[] values = new float[9];
        getValues(values);
        sb.append('[');
        sb.append(values[0]); sb.append(", "); sb.append(values[1]); sb.append(", ");
        sb.append(values[2]); sb.append("][");
        sb.append(values[3]); sb.append(", "); sb.append(values[4]); sb.append(", ");
        sb.append(values[5]); sb.append("][");
        sb.append(values[6]); sb.append(", "); sb.append(values[7]); sb.append(", ");
        sb.append(values[8]); sb.append(']');
    }

    /**
     * Print short string, to optimize dumping.
     * @hide
     */
    public void printShortString(PrintWriter pw) {
        float[] values = new float[9];
        getValues(values);
        pw.print('[');
        pw.print(values[0]); pw.print(", "); pw.print(values[1]); pw.print(", ");
                pw.print(values[2]); pw.print("][");
        pw.print(values[3]); pw.print(", "); pw.print(values[4]); pw.print(", ");
                pw.print(values[5]); pw.print("][");
        pw.print(values[6]); pw.print(", "); pw.print(values[7]); pw.print(", ");
                pw.print(values[8]); pw.print(']');

    }

    @Override
    protected void finalize() throws Throwable {
//        try {            
//            finalizer(native_instance);
//        } finally {
//            super.finalize();
//        }
        }

    /*package*/ final long ni() {
        return native_instance;
    }

    /**
     * TO be used by transform
     */
    private float[] temp = new float[2];
    /**
     * apply transform [M] * [x,y,1]
     * @param x - x coordinate
     * @param y - y coordinate
     * @return float[] with x' and y' values.
     */
    private final float[] transform(float x, float y){
         float[] m = mValues;
         temp[0] = m[0] * x + m[1] * y + m[2];
         temp[1] = m[3] * x + m[4] * y + m[5];
         
         return temp;        
    }
    
    private static long snativeID = 0;
    private static long native_create(long native_src_or_zero){
        return ++snativeID;
    }

//    private static native long native_create(long native_src_or_zero);
//
//    private static native boolean native_isIdentity(long native_object);
//
//    private static native boolean native_isAffine(long native_object);
//
//    private static native boolean native_rectStaysRect(long native_object);
//
//    private static native void native_reset(long native_object);
//
//    private static native void native_set(long native_object,
//                                          long native_other);
//
//    private static native void native_setTranslate(long native_object,
//                                                   float dx, float dy);
//
//    private static native void native_setScale(long native_object,
//                                               float sx, float sy, float px, float py);
//
//    private static native void native_setScale(long native_object,
//                                               float sx, float sy);
//
//    private static native void native_setRotate(long native_object,
//                                                float degrees, float px, float py);
//
//    private static native void native_setRotate(long native_object,
//                                                float degrees);
//
//    private static native void native_setSinCos(long native_object,
//                                                float sinValue, float cosValue, float px, float py);
//
//    private static native void native_setSinCos(long native_object,
//                                                float sinValue, float cosValue);
//
//    private static native void native_setSkew(long native_object,
//                                              float kx, float ky, float px, float py);
//
//    private static native void native_setSkew(long native_object,
//                                              float kx, float ky);
//
//    private static native void native_setConcat(long native_object,
//                                                long native_a,
//                                                long native_b);
//
//    private static native void native_preTranslate(long native_object,
//                                                   float dx, float dy);
//
//    private static native void native_preScale(long native_object,
//                                               float sx, float sy, float px, float py);
//
//    private static native void native_preScale(long native_object,
//                                               float sx, float sy);
//
//    private static native void native_preRotate(long native_object,
//                                                float degrees, float px, float py);
//
//    private static native void native_preRotate(long native_object,
//                                                float degrees);
//
//    private static native void native_preSkew(long native_object,
//                                              float kx, float ky, float px, float py);
//
//    private static native void native_preSkew(long native_object,
//                                              float kx, float ky);
//
//    private static native void native_preConcat(long native_object,
//                                                long native_other_matrix);
//
//    private static native void native_postTranslate(long native_object,
//                                                    float dx, float dy);
//
//    private static native void native_postScale(long native_object,
//                                                float sx, float sy, float px, float py);
//
//    private static native void native_postScale(long native_object,
//                                                float sx, float sy);
//
//    private static native void native_postRotate(long native_object,
//                                                 float degrees, float px, float py);
//
//    private static native void native_postRotate(long native_object,
//                                                 float degrees);
//
//    private static native void native_postSkew(long native_object,
//                                               float kx, float ky, float px, float py);
//
//    private static native void native_postSkew(long native_object,
//                                               float kx, float ky);
//
//    private static native void native_postConcat(long native_object,
//                                                 long native_other_matrix);
//
//    private static native boolean native_setRectToRect(long native_object,
//                                                       RectF src, RectF dst, int stf);
//
//    private static native boolean native_setPolyToPoly(
//                                                       long native_object,
//                                                           float[] src,
//                                                           int srcIndex,
//                                                           float[] dst,
//                                                           int dstIndex,
//                                                           int pointCount);
//
//    private static native boolean native_invert(long native_object,
//                                                long native_inverse);
//
//    private static native void native_mapPoints(long native_object,
//                                                float[] dst, int dstIndex, float[] src, int srcIndex,
//                                                int ptCount, boolean isPts);
//
//    private static native boolean native_mapRect(long native_object,
//                                                 RectF dst, RectF src);
//
//    private static native float native_mapRadius(long native_object,
//                                                 float radius);
//
//    private static native void native_getValues(long native_object,
//                                                float[] values);
//
//    private static native void native_setValues(long native_object,
//                                                float[] values);
//
//    private static native boolean native_equals(long native_a, long native_b);
//
//    private static native void finalizer(long native_instance);
//
    }
