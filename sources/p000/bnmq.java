package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: bnmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnmq extends bnmm {

    /* renamed from: a */
    final Map f131849a;

    /* renamed from: b */
    final bnmk f131850b;

    public bnmq(Map map, bnmk bnmk) {
        bmxy.m108581a(map);
        this.f131849a = map;
        bmxy.m108581a(bnmk);
        this.f131850b = bnmk;
    }

    /* renamed from: b */
    public final Iterator mo68058b() {
        return bnjr.m109609a(this.f131849a.entrySet().iterator(), bnmt.m109788a(this.f131850b));
    }

    public final void clear() {
        this.f131849a.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.f131849a.containsKey(obj);
    }

    public final Object get(Object obj) {
        Object obj2 = this.f131849a.get(obj);
        if (obj2 != null || this.f131849a.containsKey(obj)) {
            return this.f131850b.mo68026a(obj, obj2);
        }
        return null;
    }

    public final Set keySet() {
        return this.f131849a.keySet();
    }

    public final Object remove(Object obj) {
        if (this.f131849a.containsKey(obj)) {
            return this.f131850b.mo68026a(obj, this.f131849a.remove(obj));
        }
        return null;
    }

    public final int size() {
        return this.f131849a.size();
    }

    public final Collection values() {
        return new bnmr(this);
    }
}
