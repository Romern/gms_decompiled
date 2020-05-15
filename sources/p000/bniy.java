package p000;

import java.util.Iterator;

/* renamed from: bniy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bniy implements Iterator {

    /* renamed from: a */
    boolean f131685a = true;

    /* renamed from: b */
    final /* synthetic */ Iterator f131686b;

    public bniy(Iterator it) {
        this.f131686b = it;
    }

    public final boolean hasNext() {
        return this.f131686b.hasNext();
    }

    public final Object next() {
        Object next = this.f131686b.next();
        this.f131685a = false;
        return next;
    }

    public final void remove() {
        bndz.m109115a(!this.f131685a);
        this.f131686b.remove();
    }
}
