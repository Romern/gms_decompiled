package p000;

import android.os.Bundle;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;

/* renamed from: agpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agpa {

    /* renamed from: a */
    public String f66221a;

    /* renamed from: b */
    public String f66222b;

    /* renamed from: c */
    public String f66223c;

    /* renamed from: d */
    public String f66224d;

    /* renamed from: e */
    public MdpUpsellPlan[] f66225e;

    /* renamed from: f */
    public Bundle f66226f;

    /* renamed from: g */
    public Integer f66227g;

    /* renamed from: h */
    public Long f66228h;

    /* renamed from: i */
    private final PaymentForm[] f66229i;

    public agpa() {
        this.f66221a = null;
        this.f66222b = null;
        this.f66223c = null;
        this.f66224d = null;
        this.f66225e = null;
        this.f66226f = null;
        this.f66227g = null;
        this.f66228h = null;
        this.f66229i = null;
    }

    /* renamed from: a */
    public final MdpUpsellOfferResponse mo35814a() {
        return new MdpUpsellOfferResponse(this.f66221a, this.f66222b, this.f66223c, this.f66224d, this.f66225e, this.f66226f, this.f66227g, this.f66228h, this.f66229i);
    }

    public agpa(MdpUpsellOfferResponse mdpUpsellOfferResponse) {
        this.f66221a = mdpUpsellOfferResponse.f80223a;
        this.f66222b = mdpUpsellOfferResponse.f80224b;
        this.f66223c = mdpUpsellOfferResponse.f80225c;
        this.f66224d = mdpUpsellOfferResponse.f80226d;
        this.f66225e = mdpUpsellOfferResponse.f80227e;
        this.f66226f = mdpUpsellOfferResponse.f80228f;
        this.f66227g = mdpUpsellOfferResponse.f80229g;
        this.f66228h = mdpUpsellOfferResponse.f80230h;
        this.f66229i = mdpUpsellOfferResponse.f80231i;
    }
}
