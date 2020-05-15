package p000;

import android.accounts.Account;

/* renamed from: lmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lmd implements lis {

    /* renamed from: a */
    private final kdi f26361a;

    public lmd(kdi kdi) {
        this.f26361a = kdi;
    }

    /* renamed from: a */
    public final Object mo15181a() {
        return "passphrase_resolution";
    }

    /* renamed from: b */
    public final bqgg mo15182b() {
        Account account = this.f26361a.f23888d;
        if (account != null) {
            return bqdx.m112673a(lqv.m19545a(qqs.m32661a().mo24210a(account).mo24750i()), lmc.f26360a, bqfb.INSTANCE);
        }
        return bqga.m112775a(bmvz.f131120a);
    }
}
