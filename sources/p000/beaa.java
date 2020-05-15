package p000;

import java.util.Map;

/* renamed from: beaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beaa {

    /* renamed from: a */
    public volatile Map f106713a;

    /* renamed from: b */
    private final Object f106714b = new Object();

    /* renamed from: c */
    private bmzi f106715c;

    public beaa(bmzi bmzi) {
        bmxy.m108581a(bmzi);
        this.f106715c = bmzi;
    }

    /* renamed from: a */
    public final Object mo58473a(String str) {
        Object obj;
        Map map = this.f106713a;
        if (map != null) {
            return map.get(str);
        }
        synchronized (this.f106714b) {
            Map map2 = this.f106713a;
            if (map2 == null) {
                map2 = (Map) this.f106715c.mo6606a();
                bmxy.m108581a(map2);
                this.f106713a = map2;
                this.f106715c = null;
            }
            obj = map2.get(str);
        }
        return obj;
    }

    /* renamed from: a */
    public final boolean mo58474a(Map map) {
        bmxy.m108581a(map);
        synchronized (this.f106714b) {
            if (this.f106713a != null) {
                boolean equals = this.f106713a.equals(map);
                return equals;
            }
            this.f106713a = map;
            this.f106715c = null;
            return true;
        }
    }
}
