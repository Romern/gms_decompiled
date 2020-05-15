package p000;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;

/* renamed from: agrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface agrf extends IInterface {
    /* renamed from: a */
    void mo35767a(Status status);

    /* renamed from: a */
    void mo35762a(Status status, MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse);

    /* renamed from: a */
    void mo35763a(Status status, MdpDataPlanStatusResponse mdpDataPlanStatusResponse);

    /* renamed from: a */
    void mo35765a(Status status, MdpPurchaseOfferResponse mdpPurchaseOfferResponse);

    /* renamed from: a */
    void mo35764a(Status status, MdpUpsellOfferResponse mdpUpsellOfferResponse);

    /* renamed from: a */
    void mo35766a(Status status, GetConsentInformationResponse getConsentInformationResponse);

    /* renamed from: b */
    void mo35969b(Status status);
}
