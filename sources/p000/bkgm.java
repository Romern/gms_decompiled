package p000;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.wallet.p097ui.common.FormEditText;

/* renamed from: bkgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkgm extends bkgj {
    public bkgm(CharSequence charSequence) {
        super(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65760a(TextView textView) {
        String m = ((FormEditText) textView).mo71937m();
        if (!TextUtils.isEmpty(m)) {
            return bjzi.m104973b(bjyw.m104938a((CharSequence) m));
        }
        return true;
    }
}
