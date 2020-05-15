package com.google.autofill.detection.p098ml.flatbuffers;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.autofill.detection.ml.flatbuffers.QuantizedMatrix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class QuantizedMatrix extends brtm {

    /* renamed from: com.google.autofill.detection.ml.flatbuffers.QuantizedMatrix$Vector */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Vector extends brtf {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public QuantizedMatrix get(int i) {
            QuantizedMatrix quantizedMatrix = new QuantizedMatrix();
            get(quantizedMatrix, i);
            return quantizedMatrix;
        }

        public QuantizedMatrix get(QuantizedMatrix quantizedMatrix, int i) {
            quantizedMatrix.__assign(brtm.__indirect(__element(i), this.f143313bb), this.f143313bb);
            return quantizedMatrix;
        }
    }

    public static void ValidateVersion() {
    }

    public static void addCols(brtj brtj, int i) {
        brtj.mo69873a(1, (short) i);
    }

    public static void addData(brtj brtj, int i) {
        brtj.mo69883c(2, i);
    }

    public static void addOriginalMax(brtj brtj, double d) {
        brtj.mo69868a(4, d);
    }

    public static void addOriginalMin(brtj brtj, double d) {
        brtj.mo69868a(3, d);
    }

    public static void addRows(brtj brtj, int i) {
        brtj.mo69873a(0, (short) i);
    }

    public static int createQuantizedMatrix(brtj brtj, int i, int i2, int i3, double d, double d2) {
        brtj.mo69885d(5);
        addOriginalMax(brtj, d2);
        addOriginalMin(brtj, d);
        addData(brtj, i3);
        addCols(brtj, i2);
        addRows(brtj, i);
        return endQuantizedMatrix(brtj);
    }

    public static int endQuantizedMatrix(brtj brtj) {
        return brtj.mo69886e();
    }

    public static QuantizedMatrix getRootAsQuantizedMatrix(ByteBuffer byteBuffer) {
        QuantizedMatrix quantizedMatrix = new QuantizedMatrix();
        getRootAsQuantizedMatrix(byteBuffer, quantizedMatrix);
        return quantizedMatrix;
    }

    public static void startDataVector(brtj brtj, int i) {
        brtj.mo69870a(1, i, 1);
    }

    public static void startQuantizedMatrix(brtj brtj) {
        brtj.mo69885d(5);
    }

    public QuantizedMatrix __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public int cols() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return (char) this.f143329bb.getShort(__offset + this.bb_pos);
        }
        return 0;
    }

    public int data(int i) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f143329bb.get(__vector(__offset) + i) & 255;
        }
        return 0;
    }

    public ByteBuffer dataAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer dataInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }

    public int dataLength() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public brtg dataVector() {
        return dataVector(new brtg());
    }

    public double originalMax() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return this.f143329bb.getDouble(__offset + this.bb_pos);
        }
        return 0.0d;
    }

    public double originalMin() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.f143329bb.getDouble(__offset + this.bb_pos);
        }
        return 0.0d;
    }

    public int rows() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return (char) this.f143329bb.getShort(__offset + this.bb_pos);
        }
        return 0;
    }

    public static int createDataVector(brtj brtj, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        brtj.mo69870a(1, remaining, 1);
        ByteBuffer byteBuffer2 = brtj.f143315a;
        int i = brtj.f143316b - remaining;
        brtj.f143316b = i;
        byteBuffer2.position(i);
        brtj.f143315a.put(byteBuffer);
        return brtj.mo69876b();
    }

    public static QuantizedMatrix getRootAsQuantizedMatrix(ByteBuffer byteBuffer, QuantizedMatrix quantizedMatrix) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        quantizedMatrix.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return quantizedMatrix;
    }

    public brtg dataVector(brtg brtg) {
        int __offset = __offset(8);
        if (__offset == 0) {
            return null;
        }
        brtg.__reset(__vector(__offset), 1, this.f143329bb);
        return brtg;
    }

    public static int createDataVector(brtj brtj, byte[] bArr) {
        return brtj.mo69864a(bArr);
    }
}
