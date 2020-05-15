package com.google.autofill.detection.p098ml.flatbuffers;

import com.google.autofill.detection.p098ml.flatbuffers.Layer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.autofill.detection.ml.flatbuffers.NeuralNetwork */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NeuralNetwork extends brtm {

    /* renamed from: com.google.autofill.detection.ml.flatbuffers.NeuralNetwork$Vector */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Vector extends brtf {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public NeuralNetwork get(int i) {
            NeuralNetwork neuralNetwork = new NeuralNetwork();
            get(neuralNetwork, i);
            return neuralNetwork;
        }

        public NeuralNetwork get(NeuralNetwork neuralNetwork, int i) {
            neuralNetwork.__assign(brtm.__indirect(__element(i), this.f143313bb), this.f143313bb);
            return neuralNetwork;
        }
    }

    public static void ValidateVersion() {
    }

    public static void addLayers(brtj brtj, int i) {
        brtj.mo69883c(0, i);
    }

    public static int createLayersVector(brtj brtj, int[] iArr) {
        int length = iArr.length;
        brtj.mo69870a(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return brtj.mo69876b();
            }
            brtj.mo69882c(iArr[length]);
        }
    }

    public static int createNeuralNetwork(brtj brtj, int i) {
        brtj.mo69885d(1);
        addLayers(brtj, i);
        return endNeuralNetwork(brtj);
    }

    public static int endNeuralNetwork(brtj brtj) {
        return brtj.mo69886e();
    }

    public static void finishNeuralNetworkBuffer(brtj brtj, int i) {
        brtj.mo69889f(i);
    }

    public static NeuralNetwork getRootAsNeuralNetwork(ByteBuffer byteBuffer) {
        NeuralNetwork neuralNetwork = new NeuralNetwork();
        getRootAsNeuralNetwork(byteBuffer, neuralNetwork);
        return neuralNetwork;
    }

    public static void startLayersVector(brtj brtj, int i) {
        brtj.mo69870a(4, i, 4);
    }

    public static void startNeuralNetwork(brtj brtj) {
        brtj.mo69885d(1);
    }

    public NeuralNetwork __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public Layer layers(int i) {
        return layers(new Layer(), i);
    }

    public int layersLength() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public Layer.Vector layersVector() {
        return layersVector(new Layer.Vector());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: brtj.a(int, boolean):void
     arg types: [int, int]
     candidates:
      brtj.a(int, double):void
      brtj.a(int, int):void
      brtj.a(int, java.lang.String):void
      brtj.a(int, short):void
      brtj.a(int, boolean):void */
    public static void finishSizePrefixedNeuralNetworkBuffer(brtj brtj, int i) {
        brtj.mo69874a(i, true);
    }

    public static NeuralNetwork getRootAsNeuralNetwork(ByteBuffer byteBuffer, NeuralNetwork neuralNetwork) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        neuralNetwork.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return neuralNetwork;
    }

    public Layer layers(Layer layer, int i) {
        int __offset = __offset(4);
        if (__offset == 0) {
            return null;
        }
        layer.__assign(__indirect(__vector(__offset) + (i * 4)), this.f143329bb);
        return layer;
    }

    public Layer.Vector layersVector(Layer.Vector vector) {
        int __offset = __offset(4);
        if (__offset == 0) {
            return null;
        }
        vector.__assign(__vector(__offset), 4, this.f143329bb);
        return vector;
    }
}
