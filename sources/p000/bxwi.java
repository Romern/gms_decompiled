package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bxwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxwi implements Iterator {

    /* renamed from: a */
    private final Iterator f164994a;

    public bxwi(Iterator it) {
        this.f164994a = it;
    }

    public final boolean hasNext() {
        return this.f164994a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f164994a.next();
        return entry.getValue() instanceof bxwj ? new bxwh(entry) : entry;
    }

    public final void remove() {
        this.f164994a.remove();
    }
}
