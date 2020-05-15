package p000;

import java.util.Set;

/* renamed from: avjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avjj {
    /* renamed from: a */
    public static Set m78611a() {
        Set b = sqw.m36045b();
        String a = chbh.f188248a.mo6606a().mo84941a();
        if (!stm.m36302d(a)) {
            for (String str : bmyx.m108640a(',').mo66918a((CharSequence) a)) {
                try {
                    b.add(Integer.valueOf(Integer.parseInt(str)));
                } catch (NumberFormatException e) {
                }
            }
        }
        return b;
    }
}
