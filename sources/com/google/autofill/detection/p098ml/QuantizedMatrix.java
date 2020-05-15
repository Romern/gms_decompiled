package com.google.autofill.detection.p098ml;

import java.nio.ByteBuffer;

/* renamed from: com.google.autofill.detection.ml.QuantizedMatrix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class QuantizedMatrix extends Matrix {
    private final ByteBuffer backingBuffer;
    private final float originalMin;
    private final float windowSize;

    public QuantizedMatrix(int i, int i2, ByteBuffer byteBuffer, float f, float f2) {
        super(i, i2);
        this.backingBuffer = byteBuffer;
        this.originalMin = f;
        this.windowSize = (f2 - f) / 255.0f;
    }

    private int bufferOffset(int i, int i2) {
        return this.backingBuffer.position() + (i * this.width) + i2;
    }

    private int getQuantizedValue(int i, int i2) {
        bmxy.m108584a(i, this.height);
        bmxy.m108584a(i2, this.width);
        return this.backingBuffer.get(bufferOffset(i, i2)) & 255;
    }

    public float get(int i, int i2) {
        return this.originalMin + (((float) getQuantizedValue(i, i2)) * this.windowSize);
    }

    public void set(int i, int i2, float f) {
        throw new UnsupportedOperationException("Quantized matrices are immutable.");
    }
}
