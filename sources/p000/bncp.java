package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bncp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bncp implements Iterator {

    /* renamed from: a */
    Map.Entry f131455a;

    /* renamed from: b */
    final /* synthetic */ Iterator f131456b;

    /* renamed from: c */
    final /* synthetic */ bncq f131457c;

    public bncp(bncq bncq, Iterator it) {
        this.f131457c = bncq;
        this.f131456b = it;
    }

    public final boolean hasNext() {
        return this.f131456b.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f131456b.next();
        this.f131455a = entry;
        return entry.getKey();
    }

    public final void remove() {
        bndz.m109115a(this.f131455a != null);
        Collection collection = (Collection) this.f131455a.getValue();
        this.f131456b.remove();
        bndd.m109029b(this.f131457c.f131458a, collection.size());
        collection.clear();
        this.f131455a = null;
    }
}
