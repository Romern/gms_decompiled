package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: kvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kvb implements cayy {

    /* renamed from: a */
    private final cijl f25152a;

    /* renamed from: b */
    private final cijl f25153b;

    public kvb(cijl cijl, cijl cijl2) {
        this.f25152a = cijl;
        this.f25153b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bnhe bnhe;
        Context context = (Context) ((cayz) this.f25152a).f176439a;
        adyd b = ((ktm) this.f25153b).mo6445a();
        if (ccjv.m130166b()) {
            Account[] a = lqo.m19535a(b);
            bnha bnha = new bnha();
            for (Account account : a) {
                awbt awbt = new awbt();
                awbt.f94149b = account;
                awbt.mo51835a(ccip.m129872l() ^ true ? 1 : 0);
                bnha.mo67695b(account, new awkh(context, awbt.mo51834a()));
            }
            bnhe = bnha.mo67618b();
        } else {
            bnhe = bnoj.f131912b;
        }
        cazf.m127593a(bnhe, "Cannot return null from a non-@Nullable @Provides method");
        return bnhe;
    }
}
