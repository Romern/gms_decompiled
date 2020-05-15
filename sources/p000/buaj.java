package p000;

import java.util.Map;
import java.util.Set;

/* renamed from: buaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class buaj extends buae implements Set {

    /* renamed from: b */
    final /* synthetic */ buan f153150b;

    public buaj(buan buan) {
        this.f153150b = buan;
    }

    /* renamed from: b */
    public abstract buai iterator();

    public final void clear() {
        this.f153150b.clear();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return entry.getValue().equals(this.f153150b.mo72511a(entry.getKey(), false));
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ buaf mo72498e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return super.equals(obj);
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.f153150b.remove(((Map.Entry) obj).getKey());
        return true;
    }

    public final int size() {
        return this.f153150b.size();
    }
}
