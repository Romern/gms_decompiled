package com.google.autofill.detection.p098ml;

import com.google.autofill.detection.p098ml.Model;
import java.util.function.ToDoubleFunction;

/* renamed from: com.google.autofill.detection.ml.Model$Result$$Lambda$0 */
final /* synthetic */ class Model$Result$$Lambda$0 implements ToDoubleFunction {
    static final ToDoubleFunction $instance = new Model$Result$$Lambda$0();

    private Model$Result$$Lambda$0() {
    }

    public double applyAsDouble(Object obj) {
        return (double) ((Model.Result.FieldPrediction) obj).getConfidence();
    }
}
