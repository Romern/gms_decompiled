package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bnjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum bnjn implements Iterator {
    INSTANCE;

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        bndz.m109115a(false);
    }
}
