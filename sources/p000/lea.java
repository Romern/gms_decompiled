package p000;

import com.google.android.gms.autofill.fill.FillField;
import java.util.Objects;
import java.util.function.Predicate;

/* renamed from: lea */
final /* synthetic */ class lea implements Predicate {

    /* renamed from: a */
    static final Predicate f25858a = new lea();

    private lea() {
    }

    public final boolean test(Object obj) {
        return Objects.nonNull((FillField) obj);
    }
}
