package p000;

import java.util.Collection;

/* renamed from: bkux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkux extends bktj {

    /* renamed from: a */
    private final bkui f125308a = new bkui(new bkuo());

    /* renamed from: b */
    private final bkuh f125309b = new bkuw();

    public bkux() {
        super(11);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkuh.a(bkxi, java.lang.Object):void
     arg types: [bkxi, blhu]
     candidates:
      bkuh.a(java.lang.Object, java.lang.Object):void
      bkuh.a(bkxi, java.lang.Object):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66345a(bkxi bkxi) {
        blhu c = blhv.m107183c();
        String g = bkxi.mo66434g();
        c.f126581a = bkxi.mo66429b();
        this.f125309b.mo66358a(bkxi, (Object) c);
        return bksz.m106574a(g, c.mo66561a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkui.a(bkxh, java.util.Collection):void
     arg types: [bkxh, java.util.List]
     candidates:
      bkui.a(bkxh, java.lang.Object):void
      bktf.a(bkxh, java.lang.Object):void
      bkui.a(bkxh, java.util.Collection):void */
    /* renamed from: a */
    public final void mo66346a(bkxh bkxh, blhg blhg) {
        blhv d = blhg.mo66533d();
        mo66348a(bkxh);
        bkxh.mo66422b(blhg.f126523c);
        bkxh.mo66418a(d.f126584b);
        this.f125308a.mo66346a(bkxh, (Collection) d.mo66563b());
        bkxh.mo66421b();
    }
}
