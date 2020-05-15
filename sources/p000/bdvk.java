package p000;

/* renamed from: bdvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdvk {
    /* renamed from: a */
    public static boolean m91494a(int i, bxpe bxpe) {
        bxwc bxwc = bxpe.f164250b;
        int size = bxwc.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            int i4 = ((bxpd) bxwc.get(i2)).f164243b;
            int i5 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i4 == i5) {
                return true;
            } else {
                i2 = i3;
            }
        }
        return false;
    }
}
