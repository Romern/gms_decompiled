package p000;

import android.view.View;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: atwo */
final /* synthetic */ class atwo implements View.OnClickListener {

    /* renamed from: a */
    private final atwq f91053a;

    /* renamed from: b */
    private final int f91054b;

    /* renamed from: c */
    private final CardInfo f91055c;

    public atwo(atwq atwq, int i, CardInfo cardInfo) {
        this.f91053a = atwq;
        this.f91054b = i;
        this.f91055c = cardInfo;
    }

    public void onClick(View view) {
        atwq atwq = this.f91053a;
        int i = this.f91054b;
        CardInfo cardInfo = this.f91055c;
        if (i != 4) {
            atwq.f91057a.mo24746g(cardInfo.f108340a);
        }
        atwq.mo50283a();
    }
}
