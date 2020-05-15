package p000;

/* renamed from: bkwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkwg implements bkwk {

    /* renamed from: a */
    private final boolean f125342a;

    public bkwg(boolean z) {
        this.f125342a = z;
    }

    /* renamed from: a */
    private static final int m106734a(String str, blhd blhd, blhd blhd2, boolean z) {
        int i;
        int i2;
        int i3 = blhd.f126501c;
        if (blhd.f126502d.equals(blhd2.f126502d) && ((i = blhd2.f126501c) < (i2 = blhd.f126501c) || (!z && i == i2))) {
            i3++;
        }
        return (!blhd.f126502d.equals(str) || blhd2.f126500b >= blhd.f126501c) ? i3 : i3 - 1;
    }

    /* renamed from: a */
    private static final int m106735a(String str, String str2, blhd blhd, blhd blhd2) {
        int i = blhd.f126500b;
        if (str.equals(blhd2.f126502d) && blhd2.f126501c <= blhd.f126500b) {
            i++;
        }
        return (!str.equals(str2) || blhd2.f126500b >= blhd.f126500b) ? i : i - 1;
    }

    /* renamed from: a */
    private static final blhg m106736a(String str, int i, String str2, int i2) {
        if (str.equals(str2) && i == i2) {
            return bksz.m106563a();
        }
        return bksz.m106569a(str, i, str2, i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkwg.a(java.lang.String, blhd, blhd, boolean):int
     arg types: [java.lang.String, blhd, blhd, int]
     candidates:
      bkwg.a(java.lang.String, java.lang.String, blhd, blhd):int
      bkwg.a(java.lang.String, int, java.lang.String, int):blhg
      bkwg.a(java.lang.String, blhd, blhd, boolean):int */
    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        bkwq bkwq3;
        boolean z = this.f125342a;
        if (!z) {
            bkwq3 = bkwq2;
        } else {
            bkwq3 = bkwq;
        }
        if (z) {
            bkwq = bkwq2;
        }
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq3.mo66389b();
        String str = b.f126523c;
        String str2 = b2.f126523c;
        blhd f = bkwq.mo66389b().mo66536f();
        blhd f2 = bkwq3.mo66389b().mo66536f();
        if (!str.equals(str2) || f.f126500b != f2.f126500b) {
            blhg a = m106736a(str, m106735a(str, str2, f, f2), f.f126502d, m106734a(str2, f, f2, false));
            blhg a2 = m106736a(str2, m106735a(str2, str, f2, f), f2.f126502d, m106734a(str, f2, f, true));
            bkwq.mo66388a(a);
            bkwq3.mo66388a(a2);
            return;
        }
        int i = f.f126501c;
        if (str2.equals(f.f126502d) && f2.f126500b < f.f126501c) {
            i--;
        }
        blhg a3 = bksz.m106563a();
        blhg a4 = m106736a(f.f126502d, i, f2.f126502d, m106734a(str, f2, f, true));
        bkwq.mo66388a(a3);
        bkwq3.mo66388a(a4);
    }
}
