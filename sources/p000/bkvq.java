package p000;

/* renamed from: bkvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkvq implements bkwk {
    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq2.mo66389b();
        String str = b.f126523c;
        String str2 = b2.f126523c;
        blgu c = b.mo66532c();
        blgz g = b2.mo66537g();
        int i = g.f126487c;
        if (str.equals(g.f126486b)) {
            if (g.f126488d == blgs.SHIFT_AFTER_DELETE) {
                i = bkwm.m106749a(i, c);
            } else {
                i = bkqu.m106334a(i, c, g.f126488d, 2);
            }
        }
        blgy a = g.mo66517a();
        a.f126483b = i;
        bkwq2.mo66388a(bksz.m106572a(str2, a.mo66516a()));
    }
}
