package p000;

import android.os.Looper;
import com.google.android.gms.fido.fido2.pollux.CableAuthenticatorChimeraService;

/* renamed from: xst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xst implements xth {

    /* renamed from: a */
    final /* synthetic */ CableAuthenticatorChimeraService f53004a;

    public xst(CableAuthenticatorChimeraService cableAuthenticatorChimeraService) {
        this.f53004a = cableAuthenticatorChimeraService;
    }

    /* renamed from: a */
    public final void mo30110a() {
        CableAuthenticatorChimeraService.f31840d.mo25414c("Authenticator session terminated...", new Object[0]);
        this.f53004a.f31843c = null;
    }

    /* renamed from: a */
    public final void mo30111a(xjm xjm) {
        CableAuthenticatorChimeraService.f31840d.mo25414c("User actively rejected login...", new Object[0]);
        CableAuthenticatorChimeraService.f31840d.mo25414c("Blacklisting future sessions founded on this caBLE session data from re-prompting the user...", new Object[0]);
        CableAuthenticatorChimeraService cableAuthenticatorChimeraService = this.f53004a;
        bmxy.m108581a(xjm);
        cableAuthenticatorChimeraService.f31842b.add(xjm);
        new adzt(Looper.getMainLooper()).postDelayed(new xsu(cableAuthenticatorChimeraService, xjm), 120000);
    }
}
