package p000;

import android.view.View;
import com.google.android.gms.auth.api.phone.p024ui.UserConsentPromptChimeraActivity;

/* renamed from: iat */
public final /* synthetic */ class iat implements View.OnClickListener {

    /* renamed from: a */
    private final UserConsentPromptChimeraActivity f20652a;

    public iat(UserConsentPromptChimeraActivity userConsentPromptChimeraActivity) {
        this.f20652a = userConsentPromptChimeraActivity;
    }

    public void onClick(View view) {
        bhfq bhfq = this.f20652a.f10293f;
        if (bhfq != null) {
            bhfq.cancel();
        }
    }
}
