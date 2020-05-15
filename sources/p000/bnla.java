package p000;

import java.util.Iterator;

/* renamed from: bnla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnla extends bnlb {

    /* renamed from: a */
    final /* synthetic */ bnlw f131794a;

    public bnla(bnlw bnlw) {
        this.f131794a = bnlw;
    }

    public final void clear() {
        this.f131794a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f131794a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f131794a.isEmpty();
    }

    public final Iterator iterator() {
        return new bnkz(this.f131794a);
    }

    public final boolean remove(Object obj) {
        return this.f131794a.remove(obj) != null;
    }

    public final int size() {
        return this.f131794a.size();
    }
}
