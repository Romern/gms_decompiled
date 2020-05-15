package p000;

import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;

/* renamed from: agqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agqr {

    /* renamed from: a */
    public final SetConsentStatusRequest f66284a;

    public agqr() {
        this.f66284a = new SetConsentStatusRequest();
    }

    /* renamed from: a */
    public final void mo35951a(ConsentStatus consentStatus) {
        this.f66284a.f80285c = consentStatus;
    }

    /* renamed from: a */
    public final void mo35952a(Integer num) {
        this.f66284a.f80288f = num;
    }

    public agqr(SetConsentStatusRequest setConsentStatusRequest) {
        SetConsentStatusRequest setConsentStatusRequest2 = new SetConsentStatusRequest();
        this.f66284a = setConsentStatusRequest2;
        setConsentStatusRequest2.f80283a = setConsentStatusRequest.f80283a;
        setConsentStatusRequest2.f80284b = setConsentStatusRequest.f80284b;
        setConsentStatusRequest2.f80285c = setConsentStatusRequest.f80285c;
        setConsentStatusRequest2.f80286d = setConsentStatusRequest.f80286d;
        setConsentStatusRequest2.f80287e = setConsentStatusRequest.f80287e;
        setConsentStatusRequest2.f80288f = setConsentStatusRequest.f80288f;
        setConsentStatusRequest2.f80289g = setConsentStatusRequest.f80289g;
        setConsentStatusRequest2.f80290h = setConsentStatusRequest.f80290h;
    }
}
