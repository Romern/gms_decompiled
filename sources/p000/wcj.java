package p000;

import android.accounts.Account;

/* renamed from: wcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wcj implements cayy {

    /* renamed from: a */
    private final cijl f50491a;

    /* renamed from: b */
    private final cijl f50492b;

    /* renamed from: c */
    private final cijl f50493c;

    public wcj(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f50491a = cijl;
        this.f50492b = cijl2;
        this.f50493c = cijl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        int i;
        bycs bycs = (bycs) this.f50491a.mo6445a();
        Account[] accountArr = (Account[]) this.f50492b.mo6445a();
        wdn b = ((wdo) this.f50493c).mo6445a();
        bxvd da = bydg.f165780g.mo74144da();
        bxvt bxvt = bycs.f165693l;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bydg bydg = (bydg) da.f164949b;
        if (!bydg.f165782a.mo73666a()) {
            bydg.f165782a = bxvk.m124019a(bydg.f165782a);
        }
        bxsy.m123078a(bxvt, bydg.f165782a);
        int i2 = bycs.f165694m;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bydg) da.f164949b).f165783b = i2;
        boolean z = !b.mo29048a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bydg bydg2 = (bydg) da.f164949b;
        bydg2.f165784c = z;
        bydg2.f165785d = !bycs.f165684c;
        int length = accountArr.length;
        if (length != 0) {
            i = length != 1 ? 5 : 4;
        } else {
            i = 3;
        }
        bydg2.f165786e = i - 2;
        cazf.m127593a(da, "Cannot return null from a non-@Nullable @Provides method");
        return da;
    }
}
