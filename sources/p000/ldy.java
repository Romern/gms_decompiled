package p000;

import android.view.autofill.AutofillId;
import java.util.Map;
import java.util.function.Predicate;

/* renamed from: ldy */
final /* synthetic */ class ldy implements Predicate {

    /* renamed from: a */
    private final Map f25856a;

    public ldy(Map map) {
        this.f25856a = map;
    }

    public final boolean test(Object obj) {
        return this.f25856a.containsKey((AutofillId) obj);
    }
}
