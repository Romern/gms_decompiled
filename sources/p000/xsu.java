package p000;

import com.google.android.gms.fido.fido2.pollux.CableAuthenticatorChimeraService;

/* renamed from: xsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xsu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ xjm f53005a;

    /* renamed from: b */
    final /* synthetic */ CableAuthenticatorChimeraService f53006b;

    public xsu(CableAuthenticatorChimeraService cableAuthenticatorChimeraService, xjm xjm) {
        this.f53006b = cableAuthenticatorChimeraService;
        this.f53005a = xjm;
    }

    public final void run() {
        this.f53006b.f31842b.remove(this.f53005a);
    }
}
