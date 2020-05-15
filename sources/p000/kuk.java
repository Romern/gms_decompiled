package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: kuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kuk implements cayy {

    /* renamed from: a */
    private final cijl f25103a;

    /* renamed from: b */
    private final cijl f25104b;

    /* renamed from: c */
    private final cijl f25105c;

    public kuk(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f25103a = cijl;
        this.f25104b = cijl2;
        this.f25105c = cijl3;
    }

    /* renamed from: a */
    public static kuk m18590a(cijl cijl, cijl cijl2, cijl cijl3) {
        return new kuk(cijl, cijl2, cijl3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        Context context = (Context) this.f25103a.mo6445a();
        bnhe bnhe = (bnhe) this.f25105c.mo6445a();
        Account account = ((kdi) ((cayz) this.f25104b).f176439a).f23888d;
        if (account != null) {
            obj = bmxv.m108567c((kfe) bnhe.get(account));
        } else {
            obj = bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
