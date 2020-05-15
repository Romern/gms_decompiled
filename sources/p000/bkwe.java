package p000;

/* renamed from: bkwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkwe implements bkwk {
    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq2.mo66389b();
        String str = b.f126523c;
        String str2 = b2.f126523c;
        blhd f = b.mo66536f();
        blgz g = b2.mo66537g();
        int i = f.f126500b;
        int i2 = f.f126501c;
        int i3 = g.f126487c;
        String str3 = g.f126486b;
        boolean z = false;
        if (str.equals(str3)) {
            if (i < i3) {
                i3--;
            } else if (i == i3) {
                str3 = f.f126502d;
                i3 = bksz.m106561a(b);
                z = true;
            }
        }
        if (f.f126502d.equals(str3) && !z && i2 <= g.f126487c) {
            i3++;
        }
        if (i3 != g.f126487c || !str3.equals(g.f126486b)) {
            bkwq2.mo66388a(bksz.m106576a(str2, str3, i3, g.f126488d));
        }
    }
}
