package com.google.autofill.detection.p098ml;

/* renamed from: com.google.autofill.detection.ml.Layer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Layer {
    final ActivationFunction activationFunction;
    final Matrix biases;
    final Matrix weights;

    /* renamed from: com.google.autofill.detection.ml.Layer$1 */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    /* synthetic */ class C16881 {

        /* renamed from: $SwitchMap$com$google$autofill$detection$ml$Layer$ActivationFunction */
        static final /* synthetic */ int[] f152325x7dfe5fdd;

        static {
            int[] iArr = new int[ActivationFunction.values().length];
            f152325x7dfe5fdd = iArr;
            try {
                iArr[ActivationFunction.RELU.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f152325x7dfe5fdd[ActivationFunction.SIGMOID.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f152325x7dfe5fdd[ActivationFunction.ELU.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f152325x7dfe5fdd[ActivationFunction.TANH.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* renamed from: com.google.autofill.detection.ml.Layer$ActivationFunction */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum ActivationFunction {
        RELU,
        SIGMOID,
        ELU,
        TANH
    }

    public Layer(Matrix matrix, Matrix matrix2, ActivationFunction activationFunction2) {
        if (matrix.cols() == matrix2.cols()) {
            this.weights = matrix;
            this.biases = matrix2;
            this.activationFunction = activationFunction2;
            return;
        }
        throw new IllegalArgumentException("Weight and bias matrices are incompatible.");
    }

    private static void elu(Matrix matrix) {
        for (int i = 0; i < matrix.cols(); i++) {
            float f = matrix.get(0, i);
            if (f <= 0.0f) {
                f = (float) Math.expm1((double) f);
            }
            matrix.set(0, i, f);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    private static void relu(Matrix matrix) {
        for (int i = 0; i < matrix.cols(); i++) {
            matrix.set(0, i, Math.max(0.0f, matrix.get(0, i)));
        }
    }

    private static void sigmoid(Matrix matrix) {
        for (int i = 0; i < matrix.cols(); i++) {
            double d = (double) matrix.get(0, i);
            Double.isNaN(d);
            matrix.set(0, i, 1.0f / (((float) Math.exp(-d)) + 1.0f));
        }
    }

    private static void tanh(Matrix matrix) {
        for (int i = 0; i < matrix.cols(); i++) {
            float f = matrix.get(0, i);
            double exp = Math.exp((double) f);
            double exp2 = Math.exp((double) (-f));
            matrix.set(0, i, (float) ((exp - exp2) / (exp + exp2)));
        }
    }

    public Matrix execute(Matrix matrix) {
        ArrayMatrix multiply = Matrices.multiply(matrix, this.weights);
        multiply.add(this.biases);
        ActivationFunction activationFunction2 = ActivationFunction.RELU;
        int ordinal = this.activationFunction.ordinal();
        if (ordinal == 0) {
            relu(multiply);
        } else if (ordinal == 1) {
            sigmoid(multiply);
        } else if (ordinal == 2) {
            elu(multiply);
        } else if (ordinal == 3) {
            tanh(multiply);
        }
        return multiply;
    }

    public ActivationFunction getActivationFunction() {
        return this.activationFunction;
    }

    public Matrix getBiases() {
        return this.biases;
    }

    public Matrix getWeights() {
        return this.weights;
    }

    public int inputSize() {
        return this.weights.rows();
    }

    public int outputSize() {
        return this.biases.cols();
    }
}
