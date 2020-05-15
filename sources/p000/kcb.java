package p000;

import android.service.autofill.CharSequenceTransformation;
import android.service.autofill.ImageTransformation;
import android.service.autofill.Transformation;
import android.view.autofill.AutofillId;
import java.util.regex.Pattern;

/* renamed from: kcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kcb {
    /* renamed from: a */
    public static Transformation m17624a(AutofillId autofillId, Pattern pattern, int i) {
        return new ImageTransformation.Builder(autofillId, pattern, i).build();
    }

    /* renamed from: a */
    public static Transformation m17625a(AutofillId autofillId, Pattern pattern, String str) {
        return new CharSequenceTransformation.Builder(autofillId, pattern, str).build();
    }
}
