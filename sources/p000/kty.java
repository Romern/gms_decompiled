package p000;

import android.accounts.Account;
import java.util.Map;

/* renamed from: kty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kty implements cayy {

    /* renamed from: a */
    private final cijl f25059a;

    /* renamed from: b */
    private final cijl f25060b;

    /* renamed from: c */
    private final cijl f25061c;

    public kty(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f25059a = cijl;
        this.f25060b = cijl2;
        this.f25061c = cijl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bnhe bnhe = (bnhe) this.f25060b.mo6445a();
        kpk kpk = (kpk) this.f25061c.mo6445a();
        bnha bnha = new bnha();
        bnrd a = ((bnhe) this.f25059a.mo6445a()).entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            kbj kbj = (kbj) bnhe.get(entry.getKey());
            if (kbj != null) {
                bnha.mo67695b((Account) entry.getKey(), new kfx((kfe) entry.getValue(), kbj, kpk, bmxv.m108566b((Account) entry.getKey())));
            }
        }
        bnhe b = bnha.mo67618b();
        cazf.m127593a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
