package p000;

/* renamed from: bkwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkwb implements bkwk {
    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq2.mo66389b();
        String str = b.f126523c;
        String str2 = b2.f126523c;
        if (str.equals(str2)) {
            blhb b3 = b.mo66531b();
            blhb b4 = b2.mo66531b();
            int a = bkwm.m106750a(b3.f126493b, b4, false);
            if (a != b3.f126493b) {
                blha c = b3.mo66524c();
                c.f126489a = a;
                bkwq.mo66388a(bksz.m106573a(str, c.mo66520a()));
            }
            int a2 = bkwm.m106750a(b4.f126493b, b3, true);
            if (a2 != b4.f126493b) {
                blha c2 = b4.mo66524c();
                c2.f126489a = a2;
                bkwq2.mo66388a(bksz.m106573a(str2, c2.mo66520a()));
            }
        }
    }
}
