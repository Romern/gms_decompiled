package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: np */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1223np extends C1245ok implements Map {

    /* renamed from: a */
    C1238od f26749a;

    public C1223np() {
    }

    /* renamed from: b */
    private final C1238od m19688b() {
        if (this.f26749a == null) {
            this.f26749a = new C1222no(this);
        }
        return this.f26749a;
    }

    public final Set entrySet() {
        C1238od b = m19688b();
        if (b.f26795b == null) {
            b.f26795b = new C1233nz(b);
        }
        return b.f26795b;
    }

    public final Set keySet() {
        C1238od b = m19688b();
        if (b.f26796c == null) {
            b.f26796c = new C1235oa(b);
        }
        return b.f26796c;
    }

    public final void putAll(Map map) {
        mo15618a(this.f26809h + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection values() {
        C1238od b = m19688b();
        if (b.f26797d == null) {
            b.f26797d = new C1237oc(b);
        }
        return b.f26797d;
    }

    public C1223np(int i) {
        super(i);
    }

    public C1223np(C1245ok okVar) {
        if (okVar != null) {
            mo8150a(okVar);
        }
    }
}
