package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;

/* renamed from: agrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agrd extends dcj implements agrf {
    public agrd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
    }

    /* renamed from: a */
    public final void mo35767a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(7, bj);
    }

    /* renamed from: b */
    public final void mo35969b(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo35762a(Status status, MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, mdpCarrierPlanIdResponse);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo35763a(Status status, MdpDataPlanStatusResponse mdpDataPlanStatusResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, mdpDataPlanStatusResponse);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo35765a(Status status, MdpPurchaseOfferResponse mdpPurchaseOfferResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, mdpPurchaseOfferResponse);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo35764a(Status status, MdpUpsellOfferResponse mdpUpsellOfferResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, mdpUpsellOfferResponse);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo35766a(Status status, GetConsentInformationResponse getConsentInformationResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getConsentInformationResponse);
        mo8530c(6, bj);
    }
}
