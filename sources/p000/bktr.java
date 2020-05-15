package p000;

import java.util.Collection;

/* renamed from: bktr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bktr extends bktj {

    /* renamed from: a */
    private final bkui f125273a;

    /* renamed from: b */
    private final bkuh f125274b = new bktq();

    public bktr(bkum bkum) {
        super(4);
        this.f125273a = new bkui(bkum);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkuh.a(bkxi, java.lang.Object):void
     arg types: [bkxi, blgn]
     candidates:
      bkuh.a(java.lang.Object, java.lang.Object):void
      bkuh.a(bkxi, java.lang.Object):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66345a(bkxi bkxi) {
        blgn b = blgo.m107143b();
        this.f125274b.mo66358a(bkxi, (Object) b);
        String g = bkxi.mo66434g();
        if (g == null) {
            g = "";
        }
        b.f126448b = g;
        if (!bkxi.mo66433f()) {
            b.f126449c = bkxi.mo66432e();
        }
        return bksz.m106565a(b.mo66500b());
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
        blgo h = blhg.mo66538h();
        mo66348a(bkxh);
        this.f125273a.mo66346a(bkxh, (Collection) h.mo66501a());
        bkxh.mo66422b(h.f126451b);
        bkxh.mo66420a(h.f126452c);
        bkxh.mo66420a(true);
        bkxh.mo66421b();
    }
}
