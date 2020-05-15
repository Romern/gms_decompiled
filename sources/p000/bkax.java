package p000;

import android.widget.TextView;
import com.google.android.wallet.p097ui.card.CardNumberEditText;

/* renamed from: bkax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkax extends bkgj {

    /* renamed from: a */
    final /* synthetic */ CardNumberEditText f123905a;

    public bkax(CardNumberEditText cardNumberEditText) {
        this.f123905a = cardNumberEditText;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ CharSequence mo65759a() {
        return this.f123905a.f151882g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65760a(TextView textView) {
        CardNumberEditText cardNumberEditText = this.f123905a;
        bmhq bmhq = cardNumberEditText.f151886k;
        if (bmhq == null) {
            return false;
        }
        String str = cardNumberEditText.f151874a;
        int a = bmhp.m108040a(bmhq.f129467h);
        if (a == 0) {
            a = 1;
        }
        if (bjvn.m104719a(str, a)) {
            return true;
        }
        return false;
    }
}
