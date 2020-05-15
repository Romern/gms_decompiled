package p000;

import android.service.autofill.LuhnChecksumValidator;
import android.service.autofill.RegexValidator;
import android.service.autofill.Validator;
import android.view.autofill.AutofillId;
import java.util.regex.Pattern;

/* renamed from: kcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kcc {
    /* renamed from: a */
    public static Validator m17626a(AutofillId autofillId, Pattern pattern) {
        return new RegexValidator(autofillId, pattern);
    }

    /* renamed from: a */
    public static Validator m17627a(AutofillId... autofillIdArr) {
        return new LuhnChecksumValidator(autofillIdArr);
    }
}
