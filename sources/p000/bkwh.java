package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bkwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkwh implements bkwk {
    /* renamed from: a */
    private static final blhg m106738a(String str, int i, List list) {
        if (list.isEmpty()) {
            return bksz.m106563a();
        }
        return bksz.m106582b(str, i, list);
    }

    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        int i;
        int i2;
        int i3;
        int i4;
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq2.mo66389b();
        String str = b.f126523c;
        String str2 = b2.f126523c;
        blhd f = b.mo66536f();
        String str3 = f.f126502d;
        if (str.equals(str2) || str3.equals(str2)) {
            blhv d = b2.mo66533d();
            if (!str.equals(str2) || !f.f126502d.equals(str2) || (i = f.f126500b) < (i2 = d.f126584b) || i >= i2 + d.mo66562a() || (i3 = f.f126501c) <= (i4 = d.f126584b) || i3 >= i4 + d.mo66562a()) {
                int i5 = d.f126584b;
                List arrayList = new ArrayList(d.mo66563b());
                blhg a = bksz.m106563a();
                if (str.equals(str2)) {
                    int i6 = f.f126500b;
                    int i7 = d.f126584b;
                    if (i6 >= i7 && i6 < i7 + d.mo66562a()) {
                        a = bksz.m106582b(f.f126502d, bksz.m106561a(b), Collections.singletonList((blhp) arrayList.remove(f.f126500b - d.f126584b)));
                    } else if (f.f126500b < d.f126584b) {
                        i5--;
                    }
                }
                if (f.f126502d.equals(str2)) {
                    int i8 = f.f126501c;
                    int i9 = d.f126584b;
                    if (i8 > i9 && i8 < i9 + d.mo66562a()) {
                        int i10 = f.f126501c - d.f126584b;
                        a = m106738a(str2, bksz.m106561a(b) + 1, arrayList.subList(i10, arrayList.size()));
                        arrayList = arrayList.subList(0, i10);
                    } else if (f.f126501c <= d.f126584b) {
                        i5++;
                    }
                }
                blhg a2 = m106738a(str2, i5, arrayList);
                if (a.f126522b == blhf.KIND_NOT_SET) {
                    a = a2;
                } else if (a2.f126522b != blhf.KIND_NOT_SET) {
                    blgn b3 = blgo.m107143b();
                    b3.mo66498a(a2);
                    b3.mo66498a(a);
                    a = bksz.m106565a(b3.mo66500b());
                }
                bkwq2.mo66388a(a);
                return;
            }
            int i11 = f.f126500b;
            int i12 = d.f126584b;
            int i13 = i11 - i12;
            int i14 = f.f126501c - i12;
            if (i14 > i13) {
                i14--;
            }
            ArrayList arrayList2 = new ArrayList(d.mo66563b());
            arrayList2.add(i14, (blhp) arrayList2.remove(i13));
            bkwq2.mo66388a(m106738a(str2, d.f126584b, arrayList2));
        }
    }
}
