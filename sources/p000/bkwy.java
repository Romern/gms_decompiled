package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: bkwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkwy extends AbstractList {

    /* renamed from: a */
    public final Object[] f125363a;

    /* renamed from: b */
    public final int f125364b;

    public bkwy(Object[] objArr) {
        this.f125363a = objArr;
        this.f125364b = objArr.length;
    }

    public final Object get(int i) {
        return this.f125363a[i];
    }

    public final Iterator iterator() {
        return new bkwx(this);
    }

    public final int size() {
        return this.f125364b;
    }

    public final Object[] toArray() {
        return Arrays.copyOf(this.f125363a, this.f125364b);
    }
}
