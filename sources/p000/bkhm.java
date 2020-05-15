package p000;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.wallet.p097ui.creditcard.CreditCardNumberEditText;

/* renamed from: bkhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkhm extends bkgj {

    /* renamed from: a */
    final /* synthetic */ String f124224a;

    /* renamed from: e */
    final /* synthetic */ CreditCardNumberEditText f124225e;

    public bkhm(CreditCardNumberEditText creditCardNumberEditText, String str) {
        this.f124225e = creditCardNumberEditText;
        this.f124224a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ CharSequence mo65759a() {
        return !TextUtils.isEmpty(this.f124225e.f152260e) ? this.f124225e.f152260e : this.f124224a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65760a(TextView textView) {
        CreditCardNumberEditText creditCardNumberEditText = this.f124225e;
        return creditCardNumberEditText.f152266k != null && creditCardNumberEditText.mo65775cO() && bjvn.m104719a(this.f124225e.f152257b, 3);
    }
}
