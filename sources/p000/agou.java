package p000;

import android.os.Bundle;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;

/* renamed from: agou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agou {

    /* renamed from: a */
    public String f66196a;

    /* renamed from: b */
    public String f66197b;

    /* renamed from: c */
    public String f66198c;

    /* renamed from: d */
    public String f66199d;

    /* renamed from: e */
    public Bundle f66200e;

    /* renamed from: f */
    public Integer f66201f;

    /* renamed from: g */
    public Long f66202g;

    /* renamed from: h */
    public int f66203h;

    /* renamed from: i */
    private final PaymentForm[] f66204i;

    /* renamed from: j */
    private final String f66205j;

    public agou() {
        this.f66196a = null;
        this.f66197b = null;
        this.f66198c = null;
        this.f66199d = null;
        this.f66200e = null;
        this.f66201f = null;
        this.f66202g = null;
        this.f66203h = 0;
        this.f66204i = null;
        this.f66205j = null;
    }

    /* renamed from: a */
    public final MdpPurchaseOfferRequest mo35806a() {
        return new MdpPurchaseOfferRequest(this.f66196a, this.f66197b, this.f66198c, this.f66199d, this.f66200e, this.f66201f, this.f66202g, this.f66203h, this.f66204i, this.f66205j);
    }

    public agou(MdpPurchaseOfferRequest mdpPurchaseOfferRequest) {
        this.f66196a = mdpPurchaseOfferRequest.f80198a;
        this.f66197b = mdpPurchaseOfferRequest.f80199b;
        this.f66198c = mdpPurchaseOfferRequest.f80200c;
        this.f66199d = mdpPurchaseOfferRequest.f80201d;
        this.f66200e = mdpPurchaseOfferRequest.f80202e;
        this.f66201f = mdpPurchaseOfferRequest.f80203f;
        this.f66202g = mdpPurchaseOfferRequest.f80204g;
        this.f66203h = mdpPurchaseOfferRequest.f80205h;
        this.f66204i = mdpPurchaseOfferRequest.f80206i;
        this.f66205j = mdpPurchaseOfferRequest.f80207j;
    }
}
