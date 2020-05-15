package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialPickerChimeraActivity;

/* renamed from: htb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class htb implements bqfp {

    /* renamed from: a */
    final /* synthetic */ CredentialPickerChimeraActivity f20392a;

    public htb(CredentialPickerChimeraActivity credentialPickerChimeraActivity) {
        this.f20392a = credentialPickerChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        this.f20392a.m6372a(-1, (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, (Credential) obj);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f20392a.mo7431a(0, 205);
    }
}
