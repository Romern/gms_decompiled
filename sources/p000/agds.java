package p000;

import com.google.android.gms.measurement.internal.EventParams;
import java.util.Iterator;

/* renamed from: agds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agds implements Iterator {

    /* renamed from: a */
    final Iterator f65341a = this.f65342b.f80131a.keySet().iterator();

    /* renamed from: b */
    final /* synthetic */ EventParams f65342b;

    public agds(EventParams eventParams) {
        this.f65342b = eventParams;
    }

    public final boolean hasNext() {
        return this.f65341a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f65341a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
