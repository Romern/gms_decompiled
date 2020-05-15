package p000;

/* renamed from: bkwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkwc implements bkwk {
    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        blhg blhg;
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq2.mo66389b();
        String str = b.f126523c;
        String str2 = b2.f126523c;
        if (str.equals(str2)) {
            blhb b3 = b.mo66531b();
            blhv d = b2.mo66533d();
            int i = d.f126584b;
            int a = d.mo66562a();
            int i2 = (i + a) - 1;
            int a2 = bksz.m106560a(b3);
            int i3 = b3.f126493b;
            int i4 = d.f126584b;
            if (i3 <= i4) {
                blhg = bksz.m106582b(str2, i4 + a2, d.mo66563b());
            } else if (i3 <= i2) {
                int i5 = i3 - i;
                blhg b4 = bksz.m106582b(str2, i4, d.mo66563b().subList(0, i5));
                blhg b5 = bksz.m106582b(str2, d.f126584b + i5 + a2, d.mo66563b().subList(i5, a));
                blgn b6 = blgo.m107143b();
                b6.mo66498a(b4);
                b6.mo66498a(b5);
                blhg = bksz.m106565a(b6.mo66500b());
            } else {
                blhg = bkwq2.mo66389b();
            }
            bkwq2.mo66388a(blhg);
        }
    }
}
