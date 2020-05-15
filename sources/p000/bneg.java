package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bneg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bneg extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ bnel f131511a;

    public bneg(bnel bnel) {
        this.f131511a = bnel;
    }

    public final void clear() {
        this.f131511a.clear();
    }

    public final boolean contains(Object obj) {
        Map d = this.f131511a.mo67433d();
        if (d != null) {
            return d.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int a = this.f131511a.mo67421a(entry.getKey());
            if (a == -1 || !bmxi.m108538a(this.f131511a.f131525e[a], entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return this.f131511a.mo67442i();
    }

    public final boolean remove(Object obj) {
        Map d = this.f131511a.mo67433d();
        if (d != null) {
            return d.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f131511a.mo67427b()) {
                int f = this.f131511a.mo67438f();
                Object key = entry.getKey();
                Object value = entry.getValue();
                bnel bnel = this.f131511a;
                int a = bneo.m109163a(key, value, f, bnel.f131522b, bnel.f131523c, bnel.f131524d, bnel.f131525e);
                if (a != -1) {
                    this.f131511a.mo67422a(a, f);
                    bnel bnel2 = this.f131511a;
                    bnel2.f131527g--;
                    bnel2.mo67439g();
                    return true;
                }
            }
        }
        return false;
    }

    public final int size() {
        return this.f131511a.size();
    }
}
