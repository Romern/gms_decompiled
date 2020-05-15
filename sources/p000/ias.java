package p000;

import com.google.android.gms.auth.api.phone.p024ui.UserConsentPromptChimeraActivity;

/* renamed from: ias */
public final /* synthetic */ class ias implements aubt {

    /* renamed from: a */
    private final UserConsentPromptChimeraActivity f20651a;

    public ias(UserConsentPromptChimeraActivity userConsentPromptChimeraActivity) {
        this.f20651a = userConsentPromptChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        UserConsentPromptChimeraActivity userConsentPromptChimeraActivity = this.f20651a;
        userConsentPromptChimeraActivity.f10289b.mo25417e("Internal service failed: %s", exc, new Object[0]);
        userConsentPromptChimeraActivity.finish();
    }
}
