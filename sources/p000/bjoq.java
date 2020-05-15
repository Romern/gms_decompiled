package p000;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;

/* renamed from: bjoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjoq {
    /* renamed from: a */
    public static int m104173a(int i, bjop bjop) {
        int i2;
        boolean z;
        int i3 = i - 1;
        if (i3 == 1) {
            i2 = bjop.mo65417a();
        } else if (i3 != 2) {
            i2 = bjop.mo65419c();
        } else {
            i2 = bjop.mo65418b();
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, String.format(Locale.US, "Styleable provides invalid layout resource id with type %s.", Integer.valueOf(i3)));
        return i2;
    }

    /* renamed from: a */
    public static void m104174a(TextInputLayout textInputLayout, EditText editText, bjon bjon) {
        editText.setHint(bjon.mo65414G());
        textInputLayout.mo71259a(bjon.mo65415H());
        if (bjon.f123053p == null) {
            bjon.f123053p = bjon.mo65416I();
        }
        textInputLayout.mo71265b(bjon.f123053p);
        editText.setFocusableInTouchMode(true);
        editText.setFocusable(true);
    }
}
