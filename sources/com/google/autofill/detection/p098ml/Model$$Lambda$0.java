package com.google.autofill.detection.p098ml;

import java.util.function.IntFunction;

/* renamed from: com.google.autofill.detection.ml.Model$$Lambda$0 */
final /* synthetic */ class Model$$Lambda$0 implements IntFunction {
    private final Model arg$1;
    private final Matrix arg$2;

    public Model$$Lambda$0(Model model, Matrix matrix) {
        this.arg$1 = model;
        this.arg$2 = matrix;
    }

    public Object apply(int i) {
        return this.arg$1.lambda$buildResult$0$Model(this.arg$2, i);
    }
}
