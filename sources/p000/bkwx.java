package p000;

import java.util.Iterator;

/* renamed from: bkwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkwx implements Iterator {

    /* renamed from: a */
    int f125361a = 0;

    /* renamed from: b */
    final /* synthetic */ bkwy f125362b;

    public bkwx(bkwy bkwy) {
        this.f125362b = bkwy;
    }

    public final boolean hasNext() {
        return this.f125361a < this.f125362b.f125364b;
    }

    public final Object next() {
        Object[] objArr = this.f125362b.f125363a;
        int i = this.f125361a;
        this.f125361a = i + 1;
        return objArr[i];
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
