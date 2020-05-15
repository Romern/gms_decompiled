package p000;

import java.util.LinkedList;

/* renamed from: bksy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bksy {
    /* renamed from: a */
    public static final blhg m106559a(bkqv bkqv, blhg blhg) {
        blhf blhf = blhf.KIND_NOT_SET;
        int ordinal = blhg.f126522b.ordinal();
        if (ordinal == 8) {
            blhd f = blhg.mo66536f();
            String str = blhg.f126523c;
            int i = f.f126500b;
            String str2 = f.f126502d;
            int i2 = f.f126501c;
            if (str.equals(str2)) {
                if (i2 > i) {
                    i2--;
                } else if (i2 < i) {
                    i++;
                }
            }
            return bksz.m106569a(str2, i2, str, i);
        } else if (ordinal != 10) {
            return ((bksm) bkqv).mo66330a(blhg.f126523c).mo66244a(blhg);
        } else {
            blgo h = blhg.mo66538h();
            LinkedList linkedList = new LinkedList();
            for (blhg blhg2 : h.mo66501a()) {
                linkedList.push(m106559a(bkqv, blhg2));
            }
            return bksz.m106578a(linkedList);
        }
    }
}
