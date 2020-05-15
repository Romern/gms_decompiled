package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: kuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kuq implements cayy {

    /* renamed from: a */
    private final cijl f25130a;

    /* renamed from: b */
    private final cijl f25131b;

    /* renamed from: c */
    private final cijl f25132c;

    public kuq(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f25130a = cijl;
        this.f25131b = cijl2;
        this.f25132c = cijl3;
    }

    /* renamed from: a */
    public static kuq m18598a(cijl cijl, cijl cijl2, cijl cijl3) {
        return new kuq(cijl, cijl2, cijl3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        Context context = (Context) this.f25130a.mo6445a();
        kdi kdi = (kdi) ((cayz) this.f25131b).f176439a;
        bnhe bnhe = (bnhe) this.f25132c.mo6445a();
        if (!ccjv.m130166b()) {
            obj = ktv.m18569a(context, kdi, 4, qqs.m32664d());
        } else {
            Account account = kdi.f23888d;
            obj = account != null ? bmxv.m108567c((kfe) bnhe.get(account)) : bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
