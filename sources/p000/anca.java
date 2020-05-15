package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: anca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anca implements Iterable, Iterator {
    public final boolean hasNext() {
        return false;
    }

    public final Iterator iterator() {
        return this;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
