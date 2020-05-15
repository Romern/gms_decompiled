package p000;

import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;

/* renamed from: agqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agqn {

    /* renamed from: a */
    public final GetConsentInformationResponse f66282a;

    public agqn() {
        this.f66282a = new GetConsentInformationResponse();
    }

    /* renamed from: a */
    public final void mo35941a(ConsentAgreementText consentAgreementText) {
        this.f66282a.f80277b = consentAgreementText;
    }

    /* renamed from: a */
    public final void mo35942a(ConsentStatus consentStatus) {
        this.f66282a.f80276a = consentStatus;
    }

    /* renamed from: a */
    public final void mo35943a(Integer num) {
        this.f66282a.f80281f = num;
    }

    /* renamed from: a */
    public final void mo35944a(Long l) {
        this.f66282a.f80278c = l;
    }

    /* renamed from: b */
    public final void mo35945b(Integer num) {
        this.f66282a.f80279d = num;
    }

    /* renamed from: b */
    public final void mo35946b(Long l) {
        this.f66282a.f80280e = l;
    }

    public agqn(GetConsentInformationResponse getConsentInformationResponse) {
        GetConsentInformationResponse getConsentInformationResponse2 = new GetConsentInformationResponse();
        this.f66282a = getConsentInformationResponse2;
        getConsentInformationResponse2.f80276a = getConsentInformationResponse.f80276a;
        getConsentInformationResponse2.f80277b = getConsentInformationResponse.f80277b;
        getConsentInformationResponse2.f80278c = getConsentInformationResponse.f80278c;
        getConsentInformationResponse2.f80279d = getConsentInformationResponse.f80279d;
        getConsentInformationResponse2.f80280e = getConsentInformationResponse.f80280e;
        getConsentInformationResponse2.f80281f = getConsentInformationResponse.f80281f;
    }
}
