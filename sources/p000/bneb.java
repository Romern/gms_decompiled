package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: bneb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bneb extends AbstractCollection {

    /* renamed from: a */
    final Collection f131506a;

    /* renamed from: b */
    final bmxj f131507b;

    public bneb(Collection collection, bmxj bmxj) {
        bmxy.m108581a(collection);
        this.f131506a = collection;
        bmxy.m108581a(bmxj);
        this.f131507b = bmxj;
    }

    public final void clear() {
        this.f131506a.clear();
    }

    public final boolean isEmpty() {
        return this.f131506a.isEmpty();
    }

    public final Iterator iterator() {
        return bnjr.m109609a(this.f131506a.iterator(), this.f131507b);
    }

    public final int size() {
        return this.f131506a.size();
    }
}
