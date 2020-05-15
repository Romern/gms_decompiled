package p000;

import android.os.Build;
import com.google.android.gms.trustagent.GoogleTrustAgentChimeraService;

/* renamed from: aukl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aukl implements auoz {

    /* renamed from: a */
    final /* synthetic */ GoogleTrustAgentChimeraService f91983a;

    public aukl(GoogleTrustAgentChimeraService googleTrustAgentChimeraService) {
        this.f91983a = googleTrustAgentChimeraService;
    }

    /* renamed from: a */
    public final void mo50609a(bohi bohi) {
    }

    /* renamed from: b */
    public final void mo50612b(boolean z) {
    }

    /* renamed from: a */
    public final void mo50610a(boolean z) {
        aunx aunx = GoogleTrustAgentChimeraService.f109110a;
        Boolean valueOf = Boolean.valueOf(z);
        aunx.mo50711a("Can provide trust state change to:%b.", valueOf).mo50708c();
        aunw a = GoogleTrustAgentChimeraService.f109110a.mo50711a("setManagingTrust(%b)", valueOf);
        a.mo50708c();
        a.mo50707b();
        this.f91983a.setManagingTrust(z);
    }

    /* renamed from: a */
    public final void mo50611a(boolean z, boolean z2, boolean z3, String str) {
        aunw a = GoogleTrustAgentChimeraService.f109110a.mo50711a("Trust state changed, trusted: %b reason: %s", Boolean.valueOf(z), str);
        a.mo50708c();
        a.mo50707b();
        if (!z) {
            GoogleTrustAgentChimeraService.f109110a.mo50711a("revokeTrust()", new Object[0]).mo50707b();
            this.f91983a.revokeTrust();
            return;
        }
        if (str == null) {
            str = "";
        }
        GoogleTrustAgentChimeraService.f109110a.mo50711a("grantTrust(\"%s\", userInitiated: %b, dismissKeyguard:%b).", str, Boolean.valueOf(z2), Boolean.valueOf(z3)).mo50707b();
        int i = Build.VERSION.SDK_INT;
        if (z3) {
            z2 |= true;
        }
        this.f91983a.grantTrust(str, 0, z2 ? 1 : 0);
    }
}
