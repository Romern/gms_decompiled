package p000;

import java.util.Iterator;

/* renamed from: axc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axc implements Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f2472a;

    public axc(Iterator it) {
        this.f2472a = it;
    }

    public final boolean hasNext() {
        return this.f2472a.hasNext();
    }

    public final Object next() {
        return this.f2472a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
    }
}
