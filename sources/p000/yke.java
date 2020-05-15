package p000;

import java.util.Iterator;

/* renamed from: yke */
final /* synthetic */ class yke implements Iterable {

    /* renamed from: a */
    private final Iterable f53963a;

    /* renamed from: b */
    private final yhx f53964b;

    public yke(Iterable iterable, yhx yhx) {
        this.f53963a = iterable;
        this.f53964b = yhx;
    }

    public final Iterator iterator() {
        return new yne(this.f53963a.iterator(), new ykf(this.f53964b));
    }
}
