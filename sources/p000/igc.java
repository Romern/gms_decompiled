package p000;

import android.accounts.Account;
import com.google.android.gms.auth.authzen.api.service.key.CryptauthKeyChimeraService;

/* renamed from: igc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class igc extends iih implements aaai {

    /* renamed from: a */
    private final CryptauthKeyChimeraService f20909a;

    /* renamed from: b */
    private final aaag f20910b;

    public igc(CryptauthKeyChimeraService cryptauthKeyChimeraService, aaag aaag) {
        this.f20909a = cryptauthKeyChimeraService;
        this.f20910b = aaag;
    }

    /* renamed from: a */
    public final void mo12986a(iie iie) {
        this.f20910b.mo16659a(this.f20909a, new ifz(iie));
    }

    /* renamed from: a */
    public final void mo12987a(iie iie, Account account, int i, byte[] bArr) {
        this.f20910b.mo16659a(this.f20909a, new iga(iie, account, i, bArr));
    }
}
