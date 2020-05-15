package p000;

import android.text.TextUtils;
import android.widget.TextView;

/* renamed from: bkha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkha extends bkgj {
    public bkha(CharSequence charSequence) {
        super(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65760a(TextView textView) {
        String charSequence = textView.getText().toString();
        return TextUtils.isEmpty(charSequence) || bjzi.m104984m(charSequence);
    }
}
