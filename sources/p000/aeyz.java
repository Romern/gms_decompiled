package p000;

import android.util.Pair;
import java.util.Iterator;

/* renamed from: aeyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeyz implements aeyp {

    /* renamed from: a */
    final /* synthetic */ Iterator f64028a;

    public aeyz(Iterator it) {
        this.f64028a = it;
    }

    /* renamed from: a */
    public final void mo34657a() {
    }

    public final boolean hasNext() {
        return this.f64028a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (Pair) this.f64028a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
