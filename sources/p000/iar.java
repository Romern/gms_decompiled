package p000;

import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.internal.VerificationToken;
import com.google.android.gms.auth.api.phone.p024ui.UserConsentPromptChimeraActivity;

/* renamed from: iar */
public final /* synthetic */ class iar implements aubw {

    /* renamed from: a */
    private final UserConsentPromptChimeraActivity f20648a;

    /* renamed from: b */
    private final String f20649b;

    /* renamed from: c */
    private final VerificationToken f20650c;

    public iar(UserConsentPromptChimeraActivity userConsentPromptChimeraActivity, String str, VerificationToken verificationToken) {
        this.f20648a = userConsentPromptChimeraActivity;
        this.f20649b = str;
        this.f20650c = verificationToken;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        UserConsentPromptChimeraActivity userConsentPromptChimeraActivity = this.f20648a;
        String str = this.f20649b;
        VerificationToken verificationToken = this.f20650c;
        RequestResult requestResult = (RequestResult) obj;
        int i = requestResult.f10260a;
        if (i == 1) {
            userConsentPromptChimeraActivity.f10291d = requestResult;
            userConsentPromptChimeraActivity.f10290c.mo12887a(userConsentPromptChimeraActivity, ibh.m15179b(str, System.currentTimeMillis() - verificationToken.f10277a));
            userConsentPromptChimeraActivity.mo7515a(str, requestResult, verificationToken.f10278b);
        } else if (i == 2) {
            userConsentPromptChimeraActivity.f10290c.mo12887a(userConsentPromptChimeraActivity, ibh.m15178b(str, 9));
            userConsentPromptChimeraActivity.finish();
        } else if (i != 3) {
            userConsentPromptChimeraActivity.f10289b.mo25418e("Result canceled: %s", requestResult);
            userConsentPromptChimeraActivity.finish();
        } else {
            userConsentPromptChimeraActivity.f10290c.mo12887a(userConsentPromptChimeraActivity, ibh.m15178b(str, 7));
            userConsentPromptChimeraActivity.finish();
        }
    }
}
