package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: ktv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ktv {
    /* renamed from: a */
    public static bmxv m18569a(Context context, kdi kdi, int i, qqr qqr) {
        Account account = kdi.f23888d;
        return account != null ? bmxv.m108566b(new kfe(context, i, (qqa) qqr.mo24210a(account))) : bmvz.f131120a;
    }

    /* renamed from: a */
    public static void m18570a(bnha bnha, Class cls, bmxv bmxv) {
        if (bmxv.mo66813a()) {
            bnha.mo67695b(cls, (keo) bmxv.mo66814b());
        }
    }

    /* renamed from: a */
    public static void m18571a(bnhp bnhp, Class cls, bmxv bmxv) {
        if (bmxv.mo66813a()) {
            bnhp.mo67730b(cls, (keo) bmxv.mo66814b());
        }
    }
}
