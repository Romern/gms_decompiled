package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: zly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zly implements ygd {

    /* renamed from: a */
    private final bngx f55426a;

    /* renamed from: b */
    private final String f55427b;

    private zly(List list, String str) {
        bmxy.m108581a(list);
        this.f55426a = bngx.m109368a((Collection) list);
        this.f55427b = str;
    }

    /* renamed from: a */
    public static ygd m45722a(List list, String str) {
        if (list == null || list.isEmpty()) {
            return ygv.f53779i;
        }
        return new zly(list, str);
    }

    public final String toString() {
        return "FilterByDeviceDataSource";
    }

    /* renamed from: a */
    public final boolean mo30462a(yfr yfr) {
        caaq g = yfr.mo30428g();
        bnre i = this.f55426a.listIterator();
        while (i.hasNext()) {
            caaq caaq = (caaq) i.next();
            String str = this.f55427b;
            if (g != null && caaq != null) {
                caap a = caap.m126421a(g.f172360c);
                if (a == null) {
                    a = caap.UNKNOWN;
                }
                caap a2 = caap.m126421a(caaq.f172360c);
                if (a2 == null) {
                    a2 = caap.UNKNOWN;
                }
                if (a == a2 && yxw.m44962a(g.f172363f, caaq.f172363f, str) && yxw.m44962a(g.f172362e, caaq.f172362e, str) && yxw.m44962a(g.f172361d, caaq.f172361d, str) && yxw.m44962a(g.f172359b, caaq.f172359b, str)) {
                    return true;
                }
            } else if (g == null && caaq == null) {
                return true;
            }
        }
        return false;
    }
}
