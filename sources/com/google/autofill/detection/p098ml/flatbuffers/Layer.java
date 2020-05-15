package com.google.autofill.detection.p098ml.flatbuffers;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.autofill.detection.ml.flatbuffers.Layer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Layer extends brtm {

    /* renamed from: com.google.autofill.detection.ml.flatbuffers.Layer$Vector */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Vector extends brtf {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public Layer get(int i) {
            Layer layer = new Layer();
            get(layer, i);
            return layer;
        }

        public Layer get(Layer layer, int i) {
            layer.__assign(brtm.__indirect(__element(i), this.f143313bb), this.f143313bb);
            return layer;
        }
    }

    public static void ValidateVersion() {
    }

    public static void addActivationFunction(brtj brtj, byte b) {
        if (b != 0) {
            brtj.mo69865a(b);
            brtj.mo69887e(2);
        }
    }

    public static void addBiases(brtj brtj, int i) {
        brtj.mo69883c(1, i);
    }

    public static void addWeights(brtj brtj, int i) {
        brtj.mo69883c(0, i);
    }

    public static int createLayer(brtj brtj, int i, int i2, byte b) {
        brtj.mo69885d(3);
        addBiases(brtj, i2);
        addWeights(brtj, i);
        addActivationFunction(brtj, b);
        return endLayer(brtj);
    }

    public static int endLayer(brtj brtj) {
        return brtj.mo69886e();
    }

    public static Layer getRootAsLayer(ByteBuffer byteBuffer) {
        Layer layer = new Layer();
        getRootAsLayer(byteBuffer, layer);
        return layer;
    }

    public static void startLayer(brtj brtj) {
        brtj.mo69885d(3);
    }

    public Layer __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public byte activationFunction() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f143329bb.get(__offset + this.bb_pos);
        }
        return 0;
    }

    public QuantizedMatrix biases() {
        return biases(new QuantizedMatrix());
    }

    public QuantizedMatrix weights() {
        return weights(new QuantizedMatrix());
    }

    public static Layer getRootAsLayer(ByteBuffer byteBuffer, Layer layer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        layer.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return layer;
    }

    public QuantizedMatrix biases(QuantizedMatrix quantizedMatrix) {
        int __offset = __offset(6);
        if (__offset == 0) {
            return null;
        }
        quantizedMatrix.__assign(__indirect(__offset + this.bb_pos), this.f143329bb);
        return quantizedMatrix;
    }

    public QuantizedMatrix weights(QuantizedMatrix quantizedMatrix) {
        int __offset = __offset(4);
        if (__offset == 0) {
            return null;
        }
        quantizedMatrix.__assign(__indirect(__offset + this.bb_pos), this.f143329bb);
        return quantizedMatrix;
    }
}
