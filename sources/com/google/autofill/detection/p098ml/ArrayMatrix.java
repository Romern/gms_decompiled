package com.google.autofill.detection.p098ml;

/* renamed from: com.google.autofill.detection.ml.ArrayMatrix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ArrayMatrix extends Matrix {
    private final float[] data;

    public ArrayMatrix(int i, int i2) {
        super(i, i2);
        this.data = new float[(i2 * i)];
    }

    private int arrayOffset(int i, int i2) {
        return (i * this.width) + i2;
    }

    public void add(int i, int i2, float f) {
        bmxy.m108584a(i, this.height);
        bmxy.m108584a(i2, this.width);
        int arrayOffset = arrayOffset(i, i2);
        float[] fArr = this.data;
        fArr[arrayOffset] = fArr[arrayOffset] + f;
    }

    public float get(int i, int i2) {
        bmxy.m108584a(i, this.height);
        bmxy.m108584a(i2, this.width);
        return this.data[arrayOffset(i, i2)];
    }

    public void set(int i, int i2, float f) {
        bmxy.m108584a(i, this.height);
        bmxy.m108584a(i2, this.width);
        this.data[arrayOffset(i, i2)] = f;
    }

    public void add(Matrix matrix) {
        if (this.width == matrix.width && this.height == matrix.height) {
            for (int i = 0; i < this.height; i++) {
                for (int i2 = 0; i2 < this.width; i2++) {
                    int arrayOffset = arrayOffset(i, i2);
                    float[] fArr = this.data;
                    fArr[arrayOffset] = fArr[arrayOffset] + matrix.get(i, i2);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Matrices are different sizes");
    }
}
