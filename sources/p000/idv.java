package p000;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.p025ui.SignInChimeraActivity;
import com.google.android.gms.common.api.Status;

/* renamed from: idv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class idv implements bqfp {

    /* renamed from: a */
    final /* synthetic */ SignInChimeraActivity f20780a;

    public idv(SignInChimeraActivity signInChimeraActivity) {
        this.f20780a = signInChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        SignInChimeraActivity signInChimeraActivity = this.f20780a;
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) ((bmxv) obj).mo66815c();
        signInChimeraActivity.f10364e = new Intent();
        if (googleSignInAccount != null) {
            sdo.m34959a(googleSignInAccount);
            signInChimeraActivity.f10364e.putExtra("signInAccount", new SignInAccount("<<default account>>", googleSignInAccount, "<<default user id>>"));
        }
        signInChimeraActivity.mo7539a(-1, signInChimeraActivity.f10364e);
        signInChimeraActivity.mo7538a(0);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        SignInChimeraActivity signInChimeraActivity = this.f20780a;
        Status b = idw.m15306b(idw.m15305a(th));
        signInChimeraActivity.f10364e = new Intent();
        signInChimeraActivity.f10364e.putExtra("errorCode", b.f30115i);
        signInChimeraActivity.mo7539a(0, signInChimeraActivity.f10364e);
        signInChimeraActivity.mo7538a(b.f30115i);
    }
}
