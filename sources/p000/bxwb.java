package p000;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* renamed from: bxwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxwb extends AbstractMap {

    /* renamed from: a */
    public final bxvx f164978a;

    /* renamed from: b */
    private final Map f164979b;

    public bxwb(Map map, bxvx bxvx) {
        this.f164979b = map;
        this.f164978a = bxvx;
    }

    /* renamed from: a */
    public static bxvx m124074a(bxvq bxvq, bxvp bxvp) {
        return new bxvx(bxvq, bxvp);
    }

    public final Set entrySet() {
        return new bxwa(this, this.f164979b.entrySet());
    }

    public final Object get(Object obj) {
        Object obj2 = this.f164979b.get(obj);
        if (obj2 != null) {
            return this.f164978a.mo74163a(obj2);
        }
        return null;
    }

    public final Object put(Object obj, Object obj2) {
        Object put = this.f164979b.put(obj, Integer.valueOf(((bxvp) obj2).mo3214a()));
        if (put != null) {
            return this.f164978a.mo74163a(put);
        }
        return null;
    }
}
