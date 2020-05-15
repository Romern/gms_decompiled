package p000;

import android.os.IInterface;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;
import com.google.android.gms.mobiledataplan.internal.EventListenerRequest;

/* renamed from: agri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface agri extends IInterface {
    /* renamed from: a */
    void mo35970a(agrf agrf, MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest);

    /* renamed from: a */
    void mo35971a(agrf agrf, MdpDataPlanStatusRequest mdpDataPlanStatusRequest);

    /* renamed from: a */
    void mo35972a(agrf agrf, MdpPurchaseOfferRequest mdpPurchaseOfferRequest);

    /* renamed from: a */
    void mo35973a(agrf agrf, MdpUpsellOfferRequest mdpUpsellOfferRequest);

    /* renamed from: a */
    void mo35974a(agrf agrf, GetConsentInformationRequest getConsentInformationRequest);

    /* renamed from: a */
    void mo35975a(agrf agrf, SetConsentStatusRequest setConsentStatusRequest);

    /* renamed from: a */
    void mo35976a(agrf agrf, EventListenerRequest eventListenerRequest);
}
