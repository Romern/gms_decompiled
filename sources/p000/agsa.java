package p000;

import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;
import com.google.android.gms.mobiledataplan.internal.EventListenerRequest;
import com.google.android.gms.mobiledataplan.service.MobileDataPlanApiChimeraService;

/* renamed from: agsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agsa extends agrh implements aaai {

    /* renamed from: a */
    private final MobileDataPlanApiChimeraService f66344a;

    /* renamed from: b */
    private final aaag f66345b;

    public agsa(MobileDataPlanApiChimeraService mobileDataPlanApiChimeraService, aaag aaag) {
        this.f66344a = mobileDataPlanApiChimeraService;
        this.f66345b = aaag;
    }

    /* renamed from: a */
    public final void mo35970a(agrf agrf, MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest) {
        this.f66345b.mo16659a(this.f66344a, new agth(agrf, mdpCarrierPlanIdRequest));
    }

    /* renamed from: a */
    public final void mo35971a(agrf agrf, MdpDataPlanStatusRequest mdpDataPlanStatusRequest) {
        this.f66345b.mo16659a(this.f66344a, new agtj(agrf, mdpDataPlanStatusRequest));
    }

    /* renamed from: a */
    public final void mo35972a(agrf agrf, MdpPurchaseOfferRequest mdpPurchaseOfferRequest) {
        this.f66345b.mo16659a(this.f66344a, new agtl(agrf, mdpPurchaseOfferRequest));
    }

    /* renamed from: a */
    public final void mo35973a(agrf agrf, MdpUpsellOfferRequest mdpUpsellOfferRequest) {
        this.f66345b.mo16659a(this.f66344a, new agtk(agrf, mdpUpsellOfferRequest));
    }

    /* renamed from: a */
    public final void mo35974a(agrf agrf, GetConsentInformationRequest getConsentInformationRequest) {
        this.f66345b.mo16659a(this.f66344a, new agti(agrf, getConsentInformationRequest));
    }

    /* renamed from: a */
    public final void mo35975a(agrf agrf, SetConsentStatusRequest setConsentStatusRequest) {
        this.f66345b.mo16659a(this.f66344a, new agto(agrf, setConsentStatusRequest));
    }

    /* renamed from: a */
    public final void mo35976a(agrf agrf, EventListenerRequest eventListenerRequest) {
        this.f66345b.mo16659a(this.f66344a, new agtp(agrf, eventListenerRequest));
    }
}
