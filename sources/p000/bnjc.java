package p000;

import java.util.Iterator;

/* renamed from: bnjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnjc extends bnfi {

    /* renamed from: a */
    private final Iterable f131693a;

    public bnjc(Iterable iterable) {
        this.f131693a = iterable;
    }

    public final Iterator iterator() {
        return bnjr.m109608a(this.f131693a.iterator());
    }

    public final String toString() {
        return this.f131693a.toString();
    }
}
