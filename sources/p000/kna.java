package p000;

import com.google.autofill.detection.p098ml.Model;
import java.util.function.ToDoubleFunction;

/* renamed from: kna */
final /* synthetic */ class kna implements ToDoubleFunction {

    /* renamed from: a */
    static final ToDoubleFunction f24508a = new kna();

    private kna() {
    }

    public final double applyAsDouble(Object obj) {
        return (double) ((Model.Result.FieldPrediction) obj).getConfidence();
    }
}
