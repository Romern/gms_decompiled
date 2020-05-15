package p000;

import android.accounts.Account;

/* renamed from: wcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wcs implements cazw {

    /* renamed from: a */
    public cazn f50503a;

    /* renamed from: b */
    final /* synthetic */ wbh f50504b;

    /* renamed from: c */
    private cijl f50505c;

    /* renamed from: d */
    private cazn f50506d;

    /* renamed from: e */
    private cazn f50507e;

    /* renamed from: f */
    private cazn f50508f;

    /* renamed from: g */
    private cazn f50509g;

    wcs() {
    }

    /* renamed from: a */
    public final void mo14461a(boolean z) {
        cbac.m127646a(this.f50509g, z);
        cbac.m127646a(this.f50508f, z);
        cbac.m127646a(this.f50507e, z);
        cbac.m127646a(this.f50506d, z);
    }

    public wcs(wbh wbh, Account account) {
        this.f50504b = wbh;
        cayy a = cayz.m127582a(account);
        this.f50505c = a;
        this.f50506d = cbac.m127645a(a);
        wbh wbh2 = this.f50504b;
        this.f50507e = new wcu(wbh2.f50388b, wbh2.f50389c, this.f50506d, wbh2.f50390d.f50428l);
        wbh wbh3 = this.f50504b;
        cijl cijl = wbh3.f50388b;
        cijl cijl2 = wbh3.f50389c;
        cazn cazn = this.f50506d;
        wbi wbi = wbh3.f50390d;
        this.f50508f = new wcw(cijl, cijl2, cazn, wbi.f50429m, wbi.f50427k);
        wbh wbh4 = this.f50504b;
        wcv wcv = new wcv(wbh4.f50388b, wbh4.f50389c, this.f50506d, this.f50507e, this.f50508f);
        this.f50509g = wcv;
        this.f50503a = cbac.m127644a(wcv, this);
    }
}
