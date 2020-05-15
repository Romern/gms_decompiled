package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: bngc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bngc extends AbstractSet {

    /* renamed from: b */
    final bngd f131577b;

    public bngc(bngd bngd) {
        this.f131577b = bngd;
    }

    /* renamed from: a */
    public abstract Object mo67571a(int i);

    public final void clear() {
        this.f131577b.clear();
    }

    public final Iterator iterator() {
        return new bngb(this);
    }

    public final int size() {
        return this.f131577b.f131580c;
    }
}
