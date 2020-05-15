package p000;

import java.util.Iterator;

/* renamed from: yjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yjm implements Iterable {

    /* renamed from: a */
    private final Iterable f53938a;

    public yjm(Iterable iterable) {
        this.f53938a = iterable;
    }

    public final Iterator iterator() {
        return new yjl(this.f53938a.iterator());
    }
}
