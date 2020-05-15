package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bxwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxwa extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ bxwb f164976a;

    /* renamed from: b */
    private final Set f164977b;

    public bxwa(bxwb bxwb, Set set) {
        this.f164976a = bxwb;
        this.f164977b = set;
    }

    public final Iterator iterator() {
        return new bxvz(this.f164976a, this.f164977b.iterator());
    }

    public final int size() {
        return this.f164977b.size();
    }
}
