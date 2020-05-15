package p000;

import android.util.Pair;
import java.util.Iterator;

/* renamed from: aezq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aezq implements aeyp {

    /* renamed from: a */
    final /* synthetic */ Iterator f64049a;

    public aezq(Iterator it) {
        this.f64049a = it;
    }

    /* renamed from: a */
    public final void mo34657a() {
    }

    public final boolean hasNext() {
        return this.f64049a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (Pair) this.f64049a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
