package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bnei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnei extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ bnel f131516a;

    public bnei(bnel bnel) {
        this.f131516a = bnel;
    }

    public final void clear() {
        this.f131516a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f131516a.containsKey(obj);
    }

    public final Iterator iterator() {
        bnel bnel = this.f131516a;
        Map d = bnel.mo67433d();
        if (d != null) {
            return d.keySet().iterator();
        }
        return new bned(bnel);
    }

    public final boolean remove(Object obj) {
        Map d = this.f131516a.mo67433d();
        if (d != null) {
            return d.keySet().remove(obj);
        }
        return this.f131516a.mo67425b(obj) != bnel.f131521a;
    }

    public final int size() {
        return this.f131516a.size();
    }
}
