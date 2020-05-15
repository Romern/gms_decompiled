package p000;

/* renamed from: bkwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkwf implements bkwk {
    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        blhg blhg;
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq2.mo66389b();
        String str = b.f126523c;
        String str2 = b2.f126523c;
        blhd f = b.mo66536f();
        blhb b3 = b2.mo66531b();
        int i = f.f126500b;
        int i2 = f.f126501c;
        int i3 = b3.f126493b;
        int a = bksz.m106560a(b3);
        if (str.equals(str2)) {
            if (i < i3) {
                i3--;
            } else {
                i += a;
            }
        }
        if (f.f126502d.equals(str2)) {
            if (i2 <= i3) {
                i3++;
            } else {
                i2 += a;
            }
        }
        String str3 = f.f126502d;
        if (str.equals(str3) && i == i2) {
            blhg = bksz.m106563a();
        } else {
            blhg = bksz.m106569a(str, i, str3, i2);
        }
        blha c = b3.mo66524c();
        c.f126489a = i3;
        blhg a2 = bksz.m106573a(str2, c.mo66520a());
        bkwq.mo66388a(blhg);
        bkwq2.mo66388a(a2);
    }
}
