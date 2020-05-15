package p000;

import com.google.android.gms.auth.api.phone.internal.ConsentPromptUserResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: iaf */
public final /* synthetic */ class iaf implements roo {

    /* renamed from: a */
    private final ConsentPromptUserResponse f20628a;

    public iaf(ConsentPromptUserResponse consentPromptUserResponse) {
        this.f20628a = consentPromptUserResponse;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        ConsentPromptUserResponse consentPromptUserResponse = this.f20628a;
        int i = iai.f20630a;
        ((hyx) ((iaj) obj).mo25289B()).mo12824a(consentPromptUserResponse);
        rpc.m34201a(Status.f30107a, (aucf) obj2);
    }
}
