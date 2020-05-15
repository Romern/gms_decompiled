package p000;

import java.util.Iterator;

/* renamed from: ynh */
final /* synthetic */ class ynh implements Iterable {

    /* renamed from: a */
    private final Iterable f54127a;

    /* renamed from: b */
    private final yhx f54128b;

    public ynh(Iterable iterable, yhx yhx) {
        this.f54127a = iterable;
        this.f54128b = yhx;
    }

    public final Iterator iterator() {
        return new yne(this.f54127a.iterator(), new ynj(this.f54128b));
    }
}
