package com.google.autofill.detection.p098ml.flatbuffers;

/* renamed from: com.google.autofill.detection.ml.flatbuffers.ActivationFunction */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ActivationFunction {
    public static final byte ELU = 3;
    public static final byte RELU = 2;
    public static final byte SIGMOID = 1;
    public static final byte TANH = 4;
    public static final byte UNSPECIFIED = 0;
    public static final String[] names = {"UNSPECIFIED", "SIGMOID", "RELU", "ELU", "TANH"};

    private ActivationFunction() {
    }

    public static String name(int i) {
        return names[i];
    }
}
