package com.google.autofill.detection.p098ml;

/* renamed from: com.google.autofill.detection.ml.Matrix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class Matrix {
    protected final int height;
    protected final int width;

    protected Matrix(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Matrices can not have a size less than 1");
        }
        this.width = i2;
        this.height = i;
    }

    public final int cols() {
        return this.width;
    }

    public abstract float get(int i, int i2);

    public final int rows() {
        return this.height;
    }

    public abstract void set(int i, int i2, float f);
}
