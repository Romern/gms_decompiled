package p000;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bnni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnni extends AbstractCollection {

    /* renamed from: a */
    final /* synthetic */ bndl f131862a;

    bnni() {
    }

    public final void clear() {
        this.f131862a.mo67270d();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f131862a.mo67309b(entry.getKey(), entry.getValue());
    }

    public final Iterator iterator() {
        return this.f131862a.mo67278j();
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f131862a.mo67310c(entry.getKey(), entry.getValue());
    }

    public final int size() {
        return this.f131862a.mo67269c();
    }

    public bnni(bndl bndl) {
        this.f131862a = bndl;
    }
}
