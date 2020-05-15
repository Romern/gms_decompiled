package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.p044ui.AuthenticateChimeraActivity;

/* renamed from: xvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xvc implements xoo {

    /* renamed from: a */
    final /* synthetic */ AuthenticateChimeraActivity f53215a;

    public xvc(AuthenticateChimeraActivity authenticateChimeraActivity) {
        this.f53215a = authenticateChimeraActivity;
    }

    /* renamed from: a */
    public final void mo14253a() {
        this.f53215a.mo29792c();
    }

    /* renamed from: a */
    public final void mo14261a(String str) {
        AuthenticateChimeraActivity authenticateChimeraActivity = this.f53215a;
        authenticateChimeraActivity.mo29789a(str, authenticateChimeraActivity.f52327b);
    }

    /* renamed from: b */
    public final void mo14262b() {
        this.f53215a.f52327b.mo14325a();
    }

    /* renamed from: a */
    public final void mo14259a(AuthenticatorErrorResponse authenticatorErrorResponse) {
        xpw xpw = new xpw();
        xpw.f52903a = authenticatorErrorResponse;
        this.f53215a.mo18787a(xpw.mo30021a());
    }

    /* renamed from: a */
    public final void mo14260a(PublicKeyCredential publicKeyCredential) {
        this.f53215a.mo18787a(publicKeyCredential);
    }

    /* renamed from: a */
    public final void mo14257a(xhx xhx, int i) {
        this.f53215a.mo29790a(xhx, i);
    }
}
