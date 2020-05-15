package p000;

import java.util.Iterator;

/* renamed from: ykj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ykj implements Iterable {

    /* renamed from: a */
    public final ykh f53970a;

    /* renamed from: b */
    private final Iterable f53971b;

    /* renamed from: c */
    private final Iterable f53972c;

    public ykj(ykh ykh, Iterable iterable, Iterable iterable2) {
        this.f53971b = iterable;
        this.f53972c = iterable2;
        this.f53970a = ykh;
    }

    public final Iterator iterator() {
        return bnjr.m109622d(new yki(this, this.f53971b.iterator(), this.f53972c.iterator()));
    }
}
