package p000;

import android.os.Bundle;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;

/* renamed from: agoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agoy {

    /* renamed from: a */
    public String f66216a;

    /* renamed from: b */
    public Bundle f66217b;

    /* renamed from: c */
    public Integer f66218c;

    /* renamed from: d */
    public Long f66219d;

    /* renamed from: e */
    private final PaymentForm[] f66220e;

    public agoy() {
        this.f66216a = null;
        this.f66217b = null;
        this.f66218c = null;
        this.f66219d = null;
        this.f66220e = null;
    }

    /* renamed from: a */
    public final MdpUpsellOfferRequest mo35811a() {
        return new MdpUpsellOfferRequest(this.f66216a, this.f66217b, this.f66218c, this.f66219d, this.f66220e);
    }

    public agoy(MdpUpsellOfferRequest mdpUpsellOfferRequest) {
        this.f66216a = mdpUpsellOfferRequest.f80218a;
        this.f66217b = mdpUpsellOfferRequest.f80219b;
        this.f66218c = mdpUpsellOfferRequest.f80220c;
        this.f66219d = mdpUpsellOfferRequest.f80221d;
        this.f66220e = mdpUpsellOfferRequest.f80222e;
    }
}
