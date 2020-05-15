package p000;

import android.accounts.Account;

/* renamed from: wce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wce implements cayy {

    /* renamed from: a */
    private final cijl f50482a;

    /* renamed from: b */
    private final cijl f50483b;

    public wce(cijl cijl, cijl cijl2) {
        this.f50482a = cijl;
        this.f50483b = cijl2;
    }

    /* renamed from: a */
    public static bmxv m41751a(bycs bycs, Account[] accountArr) {
        bmxv bmxv;
        if (bycs.f165696o && accountArr.length != 0) {
            bmxv = bmxv.m108566b(accountArr[0]);
        } else {
            bmxv = bmvz.f131120a;
        }
        cazf.m127593a(bmxv, "Cannot return null from a non-@Nullable @Provides method");
        return bmxv;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        return m41751a((bycs) this.f50482a.mo6445a(), (Account[]) this.f50483b.mo6445a());
    }
}
