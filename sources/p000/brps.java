package p000;

import java.util.List;

/* renamed from: brps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brps {

    /* renamed from: a */
    public final int f143139a;

    /* renamed from: b */
    public final int f143140b;

    public brps(String str, int i) {
        this.f143139a = m114440a(str);
        this.f143140b = i;
    }

    /* renamed from: a */
    public static int m114440a(String str) {
        try {
            List c = bmyx.m108644b("[.-]").mo66925c((CharSequence) str);
            if (c.size() == 1) {
                return Integer.parseInt(str);
            }
            if (c.size() >= 3) {
                return (Integer.parseInt((String) c.get(0)) * 1000000) + (Integer.parseInt((String) c.get(1)) * 1000) + Integer.parseInt((String) c.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }
}
