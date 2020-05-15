package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: kup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kup implements cayy {

    /* renamed from: a */
    private final cijl f25127a;

    /* renamed from: b */
    private final cijl f25128b;

    /* renamed from: c */
    private final cijl f25129c;

    public kup(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f25127a = cijl;
        this.f25128b = cijl2;
        this.f25129c = cijl3;
    }

    /* renamed from: a */
    public static kup m18596a(cijl cijl, cijl cijl2, cijl cijl3) {
        return new kup(cijl, cijl2, cijl3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        Context context = (Context) this.f25127a.mo6445a();
        kdi kdi = (kdi) ((cayz) this.f25128b).f176439a;
        bnhe bnhe = (bnhe) this.f25129c.mo6445a();
        if (!ccjv.m130166b()) {
            obj = ktv.m18569a(context, kdi, 1, qqs.m32663c());
        } else {
            Account account = kdi.f23888d;
            obj = account != null ? bmxv.m108567c((kfe) bnhe.get(account)) : bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
