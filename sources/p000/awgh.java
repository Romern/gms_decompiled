package p000;

/* renamed from: awgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awgh {
    /* renamed from: a */
    public static bmcv m79897a(byah byah, int i) {
        if (byah == null) {
            return null;
        }
        bxwc bxwc = byah.f165263f;
        int size = bxwc.size();
        int i2 = 0;
        while (i2 < size) {
            bmcv bmcv = (bmcv) bxwc.get(i2);
            int a = bmce.m107889a(bmcv.f128756e);
            if (a == 0) {
                a = 1;
            }
            i2++;
            if (a == i) {
                return bmcv;
            }
        }
        return null;
    }
}
