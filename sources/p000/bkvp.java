package p000;

/* renamed from: bkvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkvp implements bkwk {
    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq2.mo66389b();
        String str = b.f126523c;
        String str2 = b2.f126523c;
        if (str.equals(str2)) {
            blgu c = bkwq.mo66389b().mo66532c();
            blgu c2 = bkwq2.mo66389b().mo66532c();
            int i = c.f126475b;
            int i2 = c.f126476c;
            int a = bkwm.m106749a(i, c2);
            int a2 = bkwm.m106749a(i2, c2);
            if (a < a2) {
                bkwq.mo66388a(bksz.m106566a(str, a, a2));
            } else {
                bkwq.mo66388a(bksz.m106563a());
            }
            int i3 = c2.f126475b;
            int i4 = c2.f126476c;
            int a3 = bkwm.m106749a(i3, c);
            int a4 = bkwm.m106749a(i4, c);
            if (a3 < a4) {
                bkwq2.mo66388a(bksz.m106566a(str2, a3, a4));
            } else {
                bkwq2.mo66388a(bksz.m106563a());
            }
        }
    }
}
