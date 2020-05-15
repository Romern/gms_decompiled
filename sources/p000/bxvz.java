package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bxvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxvz implements Iterator {

    /* renamed from: a */
    final /* synthetic */ bxwb f164974a;

    /* renamed from: b */
    private final Iterator f164975b;

    public bxvz(bxwb bxwb, Iterator it) {
        this.f164974a = bxwb;
        this.f164975b = it;
    }

    public final boolean hasNext() {
        return this.f164975b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new bxvy(this.f164974a, (Map.Entry) this.f164975b.next());
    }

    public final void remove() {
        this.f164975b.remove();
    }
}
