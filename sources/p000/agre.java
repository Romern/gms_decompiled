package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;

/* renamed from: agre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class agre extends dck implements agrf {
    public agre() {
        super("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
    }

    /* renamed from: a */
    public void mo35767a(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo35969b(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo35762a(Status status, MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo35763a(Status status, MdpDataPlanStatusResponse mdpDataPlanStatusResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo35765a(Status status, MdpPurchaseOfferResponse mdpPurchaseOfferResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo35764a(Status status, MdpUpsellOfferResponse mdpUpsellOfferResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo35766a(Status status, GetConsentInformationResponse getConsentInformationResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo35762a((Status) dcl.m8163a(parcel, Status.CREATOR), (MdpCarrierPlanIdResponse) dcl.m8163a(parcel, MdpCarrierPlanIdResponse.CREATOR));
                return true;
            case 2:
                mo35763a((Status) dcl.m8163a(parcel, Status.CREATOR), (MdpDataPlanStatusResponse) dcl.m8163a(parcel, MdpDataPlanStatusResponse.CREATOR));
                return true;
            case 3:
                mo35764a((Status) dcl.m8163a(parcel, Status.CREATOR), (MdpUpsellOfferResponse) dcl.m8163a(parcel, MdpUpsellOfferResponse.CREATOR));
                return true;
            case 4:
                mo35765a((Status) dcl.m8163a(parcel, Status.CREATOR), (MdpPurchaseOfferResponse) dcl.m8163a(parcel, MdpPurchaseOfferResponse.CREATOR));
                return true;
            case 5:
                mo35969b((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 6:
                mo35766a((Status) dcl.m8163a(parcel, Status.CREATOR), (GetConsentInformationResponse) dcl.m8163a(parcel, GetConsentInformationResponse.CREATOR));
                return true;
            case 7:
                mo35767a((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
