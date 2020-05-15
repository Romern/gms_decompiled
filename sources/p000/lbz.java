package p000;

import android.view.autofill.AutofillId;
import java.util.function.Function;
import java.util.regex.Pattern;

/* renamed from: lbz */
final /* synthetic */ class lbz implements Function {

    /* renamed from: a */
    private final AutofillId f25767a;

    public lbz(AutofillId autofillId) {
        this.f25767a = autofillId;
    }

    public final Object apply(Object obj) {
        return kcc.m17626a(this.f25767a, (Pattern) obj);
    }
}
