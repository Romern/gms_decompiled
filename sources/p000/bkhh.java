package p000;

import android.widget.TextView;
import com.google.android.wallet.p097ui.common.FormEditText;
import java.util.regex.Pattern;

/* renamed from: bkhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkhh extends bkgj {

    /* renamed from: a */
    private final Pattern f124220a;

    public bkhh(CharSequence charSequence, Pattern pattern) {
        super(charSequence);
        if (pattern != null) {
            this.f124220a = pattern;
            return;
        }
        throw new IllegalArgumentException("pattern must not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65760a(TextView textView) {
        FormEditText formEditText = (FormEditText) textView;
        return formEditText.mo71938n() == 0 || this.f124220a.matcher(formEditText.mo71937m()).matches();
    }
}
