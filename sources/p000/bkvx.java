package p000;

import java.util.List;

/* renamed from: bkvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkvx implements bkwk {
    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq2.mo66389b();
        String str = b.f126523c;
        if (str.equals(b2.f126523c)) {
            bkwq2.mo66390c();
            return;
        }
        blhv d = bkwq2.mo66389b().mo66533d();
        List b3 = d.mo66563b();
        int i = d.f126584b;
        int size = b3.size();
        blgn blgn = null;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (bkta.m106589a(str, (blhp) b3.get(i3))) {
                if (blgn == null) {
                    blgn = blgo.m107143b();
                }
                if (i3 > i2) {
                    blgn.mo66498a(bksz.m106582b(b2.f126523c, i + i2, b3.subList(i2, i3)));
                }
                int i4 = i + i3;
                blgn.mo66498a(bksz.m106566a(b2.f126523c, i4, i4 + 1));
                i2 = i3 + 1;
                i--;
            }
        }
        if (blgn != null) {
            if (i2 < size) {
                blgn.mo66498a(bksz.m106582b(b2.f126523c, i + i2, b3.subList(i2, size)));
            }
            bkwq2.mo66388a(bksz.m106564a(blgn));
        }
    }
}
