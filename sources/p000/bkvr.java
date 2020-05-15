package p000;

/* renamed from: bkvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkvr implements bkwk {
    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq2.mo66389b();
        blgu c = bkwq.mo66389b().mo66532c();
        blhb b3 = bkwq2.mo66389b().mo66531b();
        if (b.f126523c.equals(b2.f126523c)) {
            int i = b3.f126493b;
            if (i <= c.f126475b || i >= c.f126476c) {
                int a = bkwm.m106749a(i, c);
                blha c2 = b3.mo66524c();
                c2.f126489a = a;
                bkwq2.mo66388a(bksz.m106573a(b2.f126523c, c2.mo66520a()));
            } else {
                bkwq2.mo66388a(bksz.m106563a());
            }
            int i2 = c.f126476c;
            int a2 = bkwm.m106750a(c.f126475b, b3, true);
            int a3 = bkwm.m106750a(i2, b3, false);
            blgt a4 = c.mo66509a();
            a4.f126472a = a2;
            a4.f126473b = a3;
            bkwq.mo66388a(bksz.m106571a(b.f126523c, a4.mo66508a()));
        }
    }
}
