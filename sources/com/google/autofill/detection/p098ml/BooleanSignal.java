package com.google.autofill.detection.p098ml;

/* renamed from: com.google.autofill.detection.ml.BooleanSignal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class BooleanSignal implements Signal {
    public static final double FALSE_VALUE = 0.0d;
    public static final double TRUE_VALUE = 1.0d;

    public final double generate(kom kom) {
        return generateBoolean(kom) ? 1.0d : 0.0d;
    }

    /* access modifiers changed from: protected */
    public abstract boolean generateBoolean(kom kom);
}
