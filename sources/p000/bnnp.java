package p000;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: bnnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnnp extends bnpc {

    /* renamed from: a */
    final /* synthetic */ bndm f131869a;

    public bnnp() {
    }

    public final void clear() {
        this.f131869a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f131869a.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.f131869a.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.f131869a.isEmpty();
    }

    public final Iterator iterator() {
        return this.f131869a.mo67287a();
    }

    public final boolean remove(Object obj) {
        return this.f131869a.mo67286a(obj, Integer.MAX_VALUE) > 0;
    }

    public final int size() {
        return this.f131869a.mo67324e().size();
    }

    public bnnp(bndm bndm) {
        this.f131869a = bndm;
    }
}
