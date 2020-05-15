package p000;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.wallet.p097ui.creditcard.CreditCardNumberEditText;

/* renamed from: bkhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkhl extends bkgj {

    /* renamed from: a */
    final /* synthetic */ String f124222a;

    /* renamed from: e */
    final /* synthetic */ CreditCardNumberEditText f124223e;

    public bkhl(CreditCardNumberEditText creditCardNumberEditText, String str) {
        this.f124223e = creditCardNumberEditText;
        this.f124222a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ CharSequence mo65759a() {
        return !TextUtils.isEmpty(this.f124223e.f152259d) ? this.f124223e.f152259d : this.f124222a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65760a(TextView textView) {
        return !this.f124223e.f152265j.isEmpty();
    }
}
