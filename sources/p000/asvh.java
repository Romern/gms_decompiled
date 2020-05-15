package p000;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;

/* renamed from: asvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asvh implements View.OnClickListener {

    /* renamed from: a */
    public final asvg f89808a;

    /* renamed from: b */
    private final Activity f89809b;

    /* renamed from: c */
    private final rjx f89810c;

    public asvh(Activity activity, rjx rjx, asvg asvg) {
        this.f89809b = activity;
        this.f89810c = rjx;
        this.f89808a = asvg;
    }

    public void onClick(View view) {
        CardInfo cardInfo = (CardInfo) view.getTag();
        TokenStatus tokenStatus = cardInfo.f108345f;
        int i = tokenStatus.f108459b;
        if (i != 3) {
            if (i != 5) {
                if (i != 6) {
                    return;
                }
            } else if (!tokenStatus.f108460c) {
                cardInfo.mo59217a();
                this.f89810c.mo24746g(cardInfo.f108340a).mo50371a(new asvf(this, cardInfo));
                return;
            } else if (cardInfo.mo59217a()) {
                rjx rjx = this.f89810c;
                String str = cardInfo.f108340a;
                roz b = rpa.m34196b();
                b.f43472a = new asmr(str);
                rjx.mo24732b(b.mo24977a()).mo50371a(new asve(this, cardInfo));
                return;
            } else {
                return;
            }
        }
        this.f89810c.mo24719a(this.f89809b, cardInfo.f108340a);
    }
}
