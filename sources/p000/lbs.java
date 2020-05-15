package p000;

import com.google.android.gms.autofill.fill.FillField;
import java.util.function.Function;
import java.util.regex.Pattern;

/* renamed from: lbs */
final /* synthetic */ class lbs implements Function {

    /* renamed from: a */
    private final FillField f25752a;

    public lbs(FillField fillField) {
        this.f25752a = fillField;
    }

    public final Object apply(Object obj) {
        FillField fillField = this.f25752a;
        srn srn = lbu.f25754a;
        return kcc.m17626a(fillField.f11631a, (Pattern) obj);
    }
}
