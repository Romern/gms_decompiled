package p000;

import java.util.List;

/* renamed from: btwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwv {

    /* renamed from: a */
    public final btwy f152760a;

    public btwv(btwy btwy) {
        this.f152760a = btwy;
    }

    /* renamed from: a */
    public static boolean m118963a(int i, List list) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            btwu btwu = (btwu) list.get(i2);
            i2++;
            if (i >= btwu.f152757a && i <= btwu.f152758b) {
                return true;
            }
        }
        return false;
    }
}
