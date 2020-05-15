package p000;

import android.accounts.Account;

/* renamed from: kvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kvc implements cayy {

    /* renamed from: a */
    private final cijl f25154a;

    /* renamed from: b */
    private final cijl f25155b;

    /* renamed from: c */
    private final cijl f25156c;

    public kvc(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f25154a = cijl;
        this.f25155b = cijl2;
        this.f25156c = cijl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        kpk kpk = (kpk) this.f25155b.mo6445a();
        bnhe bnhe = (bnhe) this.f25156c.mo6445a();
        Account account = ((kdi) ((cayz) this.f25154a).f176439a).f23888d;
        if (account != null) {
            obj = bmxv.m108567c((kbj) bnhe.get(account));
        } else {
            obj = bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
