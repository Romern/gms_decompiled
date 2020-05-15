package p000;

import android.content.Intent;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import com.google.android.gms.mobiledataplan.p055ui.MobileDataPlanSettingsChimeraActivity;

/* renamed from: aguw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aguw implements aubw {

    /* renamed from: a */
    final /* synthetic */ agtw f66607a;

    public aguw(agtw agtw) {
        this.f66607a = agtw;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        GetConsentInformationResponse getConsentInformationResponse = (GetConsentInformationResponse) obj;
        if (getConsentInformationResponse == null) {
            ((bnsl) agve.f66617a.mo68388c()).mo68405a("GetConsentInformation API call returned null");
            this.f66607a.mo36095a(new NullPointerException());
            return;
        }
        agtw agtw = this.f66607a;
        MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity = agtw.f66529a;
        if (mobileDataPlanSettingsChimeraActivity != null) {
            agtw.f66546r = getConsentInformationResponse;
            int i = getConsentInformationResponse.f80276a.f80270a;
            if (!(i == 1 || i == 3)) {
                switch (i) {
                    case 6:
                    case 7:
                        agtw.f66550v = true;
                        break;
                    case 8:
                        break;
                    case 9:
                        mobileDataPlanSettingsChimeraActivity.mo44114a(agvf.OPTED_OUT);
                        return;
                    default:
                        ConsentAgreementText consentAgreementText = getConsentInformationResponse.f80277b;
                        Intent className = new Intent("com.google.android.gms.mobiledataplan.ui.CONSENT").setClassName(mobileDataPlanSettingsChimeraActivity, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity");
                        if (cfmq.m140234e() && agvh.m55172b() != null) {
                            className.putExtra("EventFlowId", agvh.m55172b());
                        }
                        sef.m35071a(consentAgreementText, className, "AgreementText");
                        className.putExtra("ComeFrom", "com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
                        mobileDataPlanSettingsChimeraActivity.f80333d = true;
                        mobileDataPlanSettingsChimeraActivity.startActivityForResult(className, 2333);
                        return;
                }
            }
            agtw.mo36096a(agtw.f66540l.f80156f);
            agve.m55167b(agtw.f66540l.f80151a, agtw);
        }
    }
}
