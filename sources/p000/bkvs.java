package p000;

import java.util.List;

/* renamed from: bkvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkvs implements bkwk {
    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        blhg blhg;
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq2.mo66389b();
        if (b.f126523c.equals(b2.f126523c)) {
            blgu c = bkwq.mo66389b().mo66532c();
            blhv d = bkwq2.mo66389b().mo66533d();
            int i = d.f126584b;
            int a = d.mo66562a();
            int i2 = (i + a) - 1;
            int i3 = c.f126475b;
            int i4 = c.f126476c - i3;
            int i5 = (i3 + i4) - 1;
            List b3 = d.mo66563b();
            blhg blhg2 = null;
            if (i3 > i) {
                blhg = bksz.m106582b(b2.f126523c, i, b3.subList(0, a - Math.max(0, (i2 - i3) + 1)));
            } else {
                blhg = null;
            }
            if (i5 < i2) {
                int max = Math.max(0, (i5 - i) + 1);
                blhg2 = bksz.m106582b(b2.f126523c, i - (i4 - max), b3.subList(max, a));
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
