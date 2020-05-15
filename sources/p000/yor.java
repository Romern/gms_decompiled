package p000;

import java.util.Iterator;

/* renamed from: yor */
final /* synthetic */ class yor implements Iterable {

    /* renamed from: a */
    private final yot f54288a;

    /* renamed from: b */
    private final bngx f54289b;

    /* renamed from: c */
    private final yhx f54290c;

    public yor(yot yot, bngx bngx, yhx yhx) {
        this.f54288a = yot;
        this.f54289b = bngx;
        this.f54290c = yhx;
    }

    public final Iterator iterator() {
        yot yot = this.f54288a;
        return new yne(this.f54289b.listIterator(), new yon(yot.f54296c, this.f54290c));
    }
}
