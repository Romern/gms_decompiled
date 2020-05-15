package p000;

/* renamed from: bkwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkwd implements bkwk {
    /* renamed from: a */
    private static final blhg m106728a(String str, int i, int i2) {
        if (i2 != 0) {
            return bksz.m106566a(str, i, i2 + i);
        }
        return bksz.m106563a();
    }

    /* renamed from: b */
    private static final blhg m106730b(String str, int i, String str2, int i2) {
        if (str.equals(str2)) {
            return m106728a(str, i, 1);
        }
        blgn b = blgo.m107143b();
        b.mo66498a(m106729a(str, i, str2, i2));
        b.mo66498a(m106728a(str2, i2, 1));
        return bksz.m106565a(b.mo66500b());
    }

    /* renamed from: a */
    private static final blhg m106729a(String str, int i, String str2, int i2) {
        if (i == -1 || (str.equals(str2) && i == i2)) {
            return bksz.m106563a();
        }
        return bksz.m106569a(str, i, str2, i2);
    }

    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        blhg blhg;
        bkwq bkwq3 = bkwq;
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq2.mo66389b();
        blhd f = b.mo66536f();
        blgu c = b2.mo66532c();
        String str = b.f126523c;
        String str2 = f.f126502d;
        String str3 = b2.f126523c;
        int i = f.f126500b;
        int i2 = f.f126501c;
        int i3 = c.f126475b;
        int i4 = c.f126476c - i3;
        int i5 = -1;
        int i6 = (i3 + i4) - 1;
        if (!str.equals(str3) || !str2.equals(str3) || i < i3 || i > i6 || i2 < i3 || i2 > i6) {
            if (str.equals(str3)) {
                if (f.f126500b < c.f126475b) {
                    i3--;
                } else if (i >= i3 && i <= i6) {
                    i4--;
                    i5 = bksz.m106561a(b);
                    i = -1;
                } else {
                    i -= i4;
                }
            }
            boolean z = false;
            if (str2.equals(str3)) {
                int i7 = c.f126475b;
                if (i2 <= i7) {
                    i3++;
                } else if (i2 > i6) {
                    i2 -= i4;
                    i5 -= i4;
                } else {
                    i4++;
                    z = true;
                    i2 = i7;
                }
            }
            if (!z) {
                blhg = m106729a(str, i, str2, i2);
            } else {
                blhg = m106730b(str, i, str2, i2);
            }
            blhg a = m106728a(str3, i3, i4);
            if (i5 >= 0) {
                blgn b3 = blgo.m107143b();
                b3.mo66498a(a);
                b3.mo66498a(m106730b(str2, i5, str, f.f126500b));
                a = bksz.m106565a(b3.mo66500b());
            }
            bkwq3.mo66388a(blhg);
            bkwq2.mo66388a(a);
            return;
        }
        bkwq3.mo66388a(bksz.m106563a());
    }
}
