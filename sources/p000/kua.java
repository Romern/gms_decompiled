package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: kua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kua implements cayy {

    /* renamed from: a */
    private final cijl f25066a;

    /* renamed from: b */
    private final cijl f25067b;

    public kua(cijl cijl, cijl cijl2) {
        this.f25066a = cijl;
        this.f25067b = cijl2;
    }

    /* renamed from: a */
    public static kua m18580a(cijl cijl, cijl cijl2) {
        return new kua(cijl, cijl2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bnhe bnhe;
        Context context = (Context) this.f25066a.mo6445a();
        adyd b = ((ktm) this.f25067b).mo6445a();
        if (ccjv.m130166b()) {
            Account[] a = lqo.m19535a(b);
            int length = a.length;
            bnha a2 = bnhe.m109406a(length);
            for (Account account : a) {
                a2.mo67695b(account, new kfe(context, 4, (qqa) qqs.m32664d().mo24210a(account)));
            }
            bnhe = a2.mo67618b();
        } else {
            bnhe = bnoj.f131912b;
        }
        cazf.m127593a(bnhe, "Cannot return null from a non-@Nullable @Provides method");
        return bnhe;
    }
}
