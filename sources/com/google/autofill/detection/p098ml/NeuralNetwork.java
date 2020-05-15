package com.google.autofill.detection.p098ml;

import com.google.autofill.detection.p098ml.Layer;
import com.google.autofill.detection.p098ml.flatbuffers.QuantizedMatrix;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.autofill.detection.ml.NeuralNetwork */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NeuralNetwork {
    final bngx layers;

    public NeuralNetwork(Iterable iterable) {
        this(iterable, true);
    }

    public static NeuralNetwork createFromFlatBuffer(ByteBuffer byteBuffer) {
        return internalCreateFromFlatBuffer(byteBuffer, true);
    }

    private static NeuralNetwork internalCreateFromFlatBuffer(ByteBuffer byteBuffer, boolean z) {
        Layer.ActivationFunction activationFunction;
        com.google.autofill.detection.p098ml.flatbuffers.NeuralNetwork rootAsNeuralNetwork = com.google.autofill.detection.p098ml.flatbuffers.NeuralNetwork.getRootAsNeuralNetwork(byteBuffer);
        int layersLength = rootAsNeuralNetwork.layersLength();
        bngs b = bngx.m109371b(layersLength);
        for (int i = 0; i < layersLength; i++) {
            com.google.autofill.detection.p098ml.flatbuffers.Layer layers2 = rootAsNeuralNetwork.layers(i);
            QuantizedMatrix createFromFlatBuffer = createFromFlatBuffer(layers2.weights());
            QuantizedMatrix createFromFlatBuffer2 = createFromFlatBuffer(layers2.biases());
            if (layers2.activationFunction() != 0) {
                activationFunction = resolveActivationFunction(layers2.activationFunction());
            } else if (i != layersLength - 1) {
                activationFunction = Layer.ActivationFunction.RELU;
            } else {
                activationFunction = Layer.ActivationFunction.SIGMOID;
            }
            b.mo67668c(new Layer(createFromFlatBuffer, createFromFlatBuffer2, activationFunction));
        }
        return new NeuralNetwork(b.mo67664a(), z);
    }

    @Deprecated
    public static NeuralNetwork obsoleteCreateFromFlatBuffer(ByteBuffer byteBuffer) {
        return internalCreateFromFlatBuffer(byteBuffer, false);
    }

    private static Layer.ActivationFunction resolveActivationFunction(byte b) {
        if (b == 1) {
            return Layer.ActivationFunction.SIGMOID;
        }
        if (b == 2) {
            return Layer.ActivationFunction.RELU;
        }
        if (b == 3) {
            return Layer.ActivationFunction.ELU;
        }
        if (b == 4) {
            return Layer.ActivationFunction.TANH;
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Unknown activation type : ");
        sb.append((int) b);
        throw new IllegalStateException(sb.toString());
    }

    public Matrix execute(Matrix matrix) {
        try {
            bnre i = this.layers.listIterator();
            while (i.hasNext()) {
                matrix = ((Layer) i.next()).execute(matrix);
            }
            return matrix;
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }

    public bngx getLayers() {
        return this.layers;
    }

    private NeuralNetwork(Iterable iterable, boolean z) {
        if (z) {
            Iterator it = iterable.iterator();
            int i = -1;
            while (it.hasNext()) {
                Layer layer = (Layer) it.next();
                if (i == -1 || i == layer.inputSize()) {
                    i = layer.outputSize();
                } else {
                    int inputSize = layer.inputSize();
                    StringBuilder sb = new StringBuilder(90);
                    sb.append("Input size of layer: ");
                    sb.append(inputSize);
                    sb.append(" does not match output size of previous layer: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        this.layers = bngx.m109355a(iterable);
    }

    private static QuantizedMatrix createFromFlatBuffer(QuantizedMatrix quantizedMatrix) {
        return new QuantizedMatrix(quantizedMatrix.rows(), quantizedMatrix.cols(), quantizedMatrix.dataAsByteBuffer(), (float) quantizedMatrix.originalMin(), (float) quantizedMatrix.originalMax());
    }
}
