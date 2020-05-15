package p000;

import com.google.autofill.detection.p098ml.ExecutionException;
import java.util.function.Function;

/* renamed from: knb */
final /* synthetic */ class knb implements Function {

    /* renamed from: a */
    private final knh f24509a;

    public knb(knh knh) {
        this.f24509a = knh;
    }

    public final Object apply(Object obj) {
        kom kom = (kom) obj;
        try {
            return new kng(kom, this.f24509a.f24520a.predict(kom).getFieldPredictions());
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
