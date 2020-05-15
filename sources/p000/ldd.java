package p000;

import com.google.android.gms.autofill.fill.FillForm;
import java.util.Objects;
import java.util.function.Predicate;

/* renamed from: ldd */
final /* synthetic */ class ldd implements Predicate {

    /* renamed from: a */
    static final Predicate f25835a = new ldd();

    private ldd() {
    }

    public final boolean test(Object obj) {
        return Objects.nonNull((FillForm) obj);
    }
}
