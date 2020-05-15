package com.google.autofill.detection.p098ml;

import java.util.function.ToIntFunction;

/* renamed from: com.google.autofill.detection.ml.ModelConfig$FieldConfig$$Lambda$0 */
final /* synthetic */ class ModelConfig$FieldConfig$$Lambda$0 implements ToIntFunction {
    private final bngj arg$1;

    private ModelConfig$FieldConfig$$Lambda$0(bngj bngj) {
        this.arg$1 = bngj;
    }

    static ToIntFunction get$Lambda(bngj bngj) {
        return new ModelConfig$FieldConfig$$Lambda$0(bngj);
    }

    public int applyAsInt(Object obj) {
        return ((Number) this.arg$1.get((kpb) obj)).intValue();
    }
}
