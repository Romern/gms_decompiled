package p000;

import java.util.Collection;

/* renamed from: bkud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkud extends bktj {

    /* renamed from: a */
    private final bkva f125284a = new bkva();

    /* renamed from: b */
    private final bkui f125285b = new bkui(new bkuo());

    /* renamed from: c */
    private final bkuh f125286c = new bkuc();

    public bkud() {
        super(5);
    }

    /* renamed from: b */
    public final blhg mo66345a(bkxi bkxi) {
        blhg blhg;
        String g = bkxi.mo66434g();
        int b = bkxi.mo66429b();
        bkxi.mo66430c();
        if (bkxi.mo66429b() == 0) {
            blha d = blhb.m107158d();
            d.f126489a = b;
            this.f125286c.mo66359b(bkxi, d);
            blhg = bksz.m106573a(g, d.mo66520a());
        } else {
            blhg = bksz.m106568a(g, b, bkxi.mo66434g());
        }
        bkxi.mo66431d();
        return blhg;
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
        blhb b = blhg.mo66531b();
        mo66348a(bkxh);
        if (b.mo66522a() > 0) {
            bkxh.mo66422b(blhg.f126523c);
            bkxh.mo66418a(b.f126493b);
            this.f125285b.mo66346a(bkxh, (Collection) b.mo66523b());
        } else if (!b.f126495d.isEmpty()) {
            bkxh.mo66422b(blhg.f126523c);
            bkxh.mo66418a(b.f126493b);
            this.f125284a.mo66346a(bkxh, b.f126495d);
        } else {
            throw new IllegalArgumentException();
        }
        bkxh.mo66421b();
    }
}
