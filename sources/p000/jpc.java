package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.Feature;

/* renamed from: jpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jpc extends rjx {

    /* renamed from: a */
    private static final rjo f22963a = new rjo("ProximityAuth.DeviceSyncApi", f22965c, f22964b);

    /* renamed from: b */
    private static final rje f22964b = new rje();

    /* renamed from: c */
    private static final rjl f22965c = new jox();

    public jpc(Context context) {
        super(context, f22963a, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo13965a() {
        return mo24701a((rpa) new joz());
    }

    /* renamed from: b */
    public final void mo13969b(Account account) {
        roz b = rpa.m34196b();
        b.f43472a = new jou(account);
        b.f43473b = new Feature[]{kba.f23680a};
        mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo13966a(Account account) {
        return mo24701a((rpa) new jow(account));
    }

    /* renamed from: a */
    public final aucb mo13967a(bsni bsni, Account account) {
        roz b = rpa.m34196b();
        b.f43472a = new jot(bsni, account);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo13968a(bsni bsni, boolean z, Account account) {
        return mo24732b(new jpa(bsni, z, account));
    }
}
