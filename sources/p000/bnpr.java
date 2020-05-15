package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bnpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnpr extends bnds implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Map f131971a;

    /* renamed from: b */
    private transient Map f131972b;

    public bnpr(Map map) {
        this.f131971a = map;
    }

    /* renamed from: a */
    public final Object mo67370a(Object obj, Object obj2, Object obj3) {
        bmxy.m108581a(obj);
        bmxy.m108581a(obj2);
        bmxy.m108581a(obj3);
        Map map = (Map) this.f131971a.get(obj);
        if (map == null) {
            map = bnfs.m109265b();
            this.f131971a.put(obj, map);
        }
        return map.put(obj2, obj3);
    }

    /* renamed from: b */
    public final Map mo68265b(Object obj) {
        return new bnpm(this, obj);
    }

    /* renamed from: c */
    public final Iterator mo67373c() {
        return new bnpj(this);
    }

    /* renamed from: d */
    public final int mo68266d() {
        int i = 0;
        for (Map map : this.f131971a.values()) {
            i += map.size();
        }
        return i;
    }

    /* renamed from: e */
    public final Map mo68267e() {
        Map map = this.f131972b;
        if (map != null) {
            return map;
        }
        bnpp bnpp = new bnpp(this);
        this.f131972b = bnpp;
        return bnpp;
    }

    /* renamed from: a */
    public final void mo67371a() {
        this.f131971a.clear();
    }

    /* renamed from: a */
    public final boolean mo68264a(Object obj) {
        return obj != null && bnmt.m109805b(this.f131971a, obj);
    }
}
