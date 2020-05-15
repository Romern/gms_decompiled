package p000;

import java.util.Iterator;

/* renamed from: bxyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxyq implements Iterator {

    /* renamed from: a */
    final Iterator f165111a = this.f165112b.f165113a.iterator();

    /* renamed from: b */
    final /* synthetic */ bxyr f165112b;

    public bxyq(bxyr bxyr) {
        this.f165112b = bxyr;
    }

    public final boolean hasNext() {
        return this.f165111a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f165111a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
