package p000;

import java.util.List;

/* renamed from: bkwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkwl implements bkwk {
    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        blhg blhg;
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq2.mo66389b();
        if (b.f126523c.equals(b2.f126523c)) {
            blhv d = b.mo66533d();
            blhv d2 = b2.mo66533d();
            int a = d.mo66562a();
            int i = d.f126584b;
            int i2 = (a + i) - 1;
            int a2 = d2.mo66562a();
            int i3 = d2.f126584b;
            int i4 = (i3 + a2) - 1;
            List b3 = d2.mo66563b();
            blhg blhg2 = null;
            if (i3 < i) {
                blhg = bksz.m106582b(b2.f126523c, i3, b3.subList(0, a2 - Math.max(0, (i4 - i) + 1)));
            } else {
                blhg = null;
            }
            if (i4 > i2) {
                int max = Math.max(0, (i2 - i3) + 1);
                blhg2 = bksz.m106582b(b2.f126523c, i3 + max, b3.subList(max, a2));
            }
            if (blhg != null && blhg2 != null) {
                blgn b4 = blgo.m107143b();
                b4.mo66498a(blhg);
                b4.mo66498a(blhg2);
                blhg = bksz.m106565a(b4.mo66500b());
            } else if (blhg == null) {
                blhg = blhg2 == null ? bksz.m106563a() : blhg2;
            }
            bkwq2.mo66388a(blhg);
        }
    }
}
