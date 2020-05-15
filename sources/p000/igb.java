package p000;

import android.accounts.Account;
import com.google.android.gms.auth.authzen.AuthzenPublicKey;
import com.google.android.gms.auth.authzen.api.service.internaldata.CryptauthInternalDataChimeraService;

/* renamed from: igb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class igb extends iif implements aaai {

    /* renamed from: a */
    private final CryptauthInternalDataChimeraService f20907a;

    /* renamed from: b */
    private final aaag f20908b;

    public igb(CryptauthInternalDataChimeraService cryptauthInternalDataChimeraService, aaag aaag) {
        this.f20907a = cryptauthInternalDataChimeraService;
        this.f20908b = aaag;
    }

    /* renamed from: a */
    public final void mo12981a(C1077iid iid, Account account, int i, int i2) {
        this.f20908b.mo16659a(this.f20907a, new ifv(iid, account, i, i2));
    }

    /* renamed from: a */
    public final void mo12982a(C1077iid iid, Account account, boolean z) {
        this.f20908b.mo16659a(this.f20907a, new ifs(iid, account, z));
    }

    /* renamed from: a */
    public final void mo12983a(C1077iid iid, Account account, boolean z, int i) {
        this.f20908b.mo16659a(this.f20907a, new ifu(iid, account, z, i));
    }

    /* renamed from: a */
    public final void mo12984a(iie iie) {
        this.f20908b.mo16659a(this.f20907a, new ifw(iie));
    }

    /* renamed from: a */
    public final void mo12985a(iie iie, AuthzenPublicKey authzenPublicKey) {
        this.f20908b.mo16659a(this.f20907a, new ifx(iie, authzenPublicKey));
    }
}
