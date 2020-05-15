package p000;

import java.util.Map;

/* renamed from: bkot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkot {

    /* renamed from: a */
    public final Map f125033a;

    /* renamed from: b */
    public final int f125034b;

    public bkot(int i, Map map) {
        this.f125034b = i;
        this.f125033a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bkot)) {
            bkot bkot = (bkot) obj;
            Map map = this.f125033a;
            if (map != null) {
                if (!map.equals(bkot.f125033a)) {
                    return false;
                }
            } else if (bkot.f125033a != null) {
                return false;
            }
            if (this.f125034b == bkot.f125034b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Map map = this.f125033a;
        return (((map != null ? map.hashCode() : 0) + 31) * 31) + this.f125034b;
    }
}
