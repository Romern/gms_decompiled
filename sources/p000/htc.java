package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialPickerChimeraActivity;

/* renamed from: htc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class htc implements bqfp {

    /* renamed from: a */
    final /* synthetic */ gvl f20393a;

    /* renamed from: b */
    final /* synthetic */ CredentialPickerChimeraActivity f20394b;

    public htc(CredentialPickerChimeraActivity credentialPickerChimeraActivity, gvl gvl) {
        this.f20394b = credentialPickerChimeraActivity;
        this.f20393a = gvl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        this.f20393a.f19079c = bngx.m109356a((IdToken) obj);
        this.f20394b.m6372a(-1, (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, this.f20393a.mo12267a());
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f20394b.m6372a(-1, 101, this.f20393a.mo12267a());
    }
}
