package p000;

import android.view.autofill.AutofillId;
import java.util.Map;
import java.util.function.Function;

/* renamed from: ldz */
final /* synthetic */ class ldz implements Function {

    /* renamed from: a */
    private final Map f25857a;

    public ldz(Map map) {
        this.f25857a = map;
    }

    public final Object apply(Object obj) {
        return this.f25857a.get((AutofillId) obj);
    }
}
