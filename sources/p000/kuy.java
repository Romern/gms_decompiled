package p000;

import android.accounts.Account;

/* renamed from: kuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kuy implements cayy {

    /* renamed from: a */
    private final cijl f25144a;

    /* renamed from: b */
    private final cijl f25145b;

    public kuy(cijl cijl, cijl cijl2) {
        this.f25144a = cijl;
        this.f25145b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        kpk kpk = (kpk) this.f25144a.mo6445a();
        Account[] a = lqo.m19535a(((ktm) this.f25145b).mo6445a());
        bnha bnha = new bnha();
        for (Account account : a) {
            bnha.mo67695b(account, new kbm(qqs.m32665e().mo24210a(account), kpk));
        }
        bnhe b = bnha.mo67618b();
        cazf.m127593a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
