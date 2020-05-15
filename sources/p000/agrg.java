package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;
import com.google.android.gms.mobiledataplan.internal.EventListenerRequest;

/* renamed from: agrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agrg extends dcj implements agri {
    public agrg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mobiledataplan.internal.IMobileDataPlanService");
    }

    /* renamed from: a */
    public final void mo35970a(agrf agrf, MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, agrf);
        dcl.m8165a(bj, mdpCarrierPlanIdRequest);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo35976a(agrf agrf, EventListenerRequest eventListenerRequest) {
        throw null;
    }

    /* renamed from: a */
    public final void mo35971a(agrf agrf, MdpDataPlanStatusRequest mdpDataPlanStatusRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, agrf);
        dcl.m8165a(bj, mdpDataPlanStatusRequest);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo35972a(agrf agrf, MdpPurchaseOfferRequest mdpPurchaseOfferRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, agrf);
        dcl.m8165a(bj, mdpPurchaseOfferRequest);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo35973a(agrf agrf, MdpUpsellOfferRequest mdpUpsellOfferRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, agrf);
        dcl.m8165a(bj, mdpUpsellOfferRequest);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo35974a(agrf agrf, GetConsentInformationRequest getConsentInformationRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, agrf);
        dcl.m8165a(bj, getConsentInformationRequest);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo35975a(agrf agrf, SetConsentStatusRequest setConsentStatusRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, agrf);
        dcl.m8165a(bj, setConsentStatusRequest);
        mo8528b(7, bj);
    }
}
