package p000;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.p045ui.AuthenticateChimeraActivity;

/* renamed from: ybv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ybv implements xxh {

    /* renamed from: a */
    final /* synthetic */ AuthenticateChimeraActivity f53574a;

    public ybv(AuthenticateChimeraActivity authenticateChimeraActivity) {
        this.f53574a = authenticateChimeraActivity;
    }

    /* renamed from: a */
    public final void mo14253a() {
        this.f53574a.mo29792c();
    }

    /* renamed from: a */
    public final void mo14256a(String str) {
        AuthenticateChimeraActivity authenticateChimeraActivity = this.f53574a;
        authenticateChimeraActivity.mo29789a(str, authenticateChimeraActivity.f52327b);
    }

    /* renamed from: a */
    public final void mo14254a(ErrorResponseData errorResponseData) {
        this.f53574a.mo18877a(errorResponseData);
    }

    /* renamed from: a */
    public final void mo30218a(RegisterResponseData registerResponseData) {
        this.f53574a.mo18877a(registerResponseData);
    }

    /* renamed from: a */
    public final void mo14257a(xhx xhx, int i) {
        this.f53574a.mo29790a(xhx, i);
    }
}
