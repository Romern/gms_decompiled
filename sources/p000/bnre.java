package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: bnre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnre extends bnrd implements ListIterator {

    /* renamed from: a */
    private final int f132029a;

    /* renamed from: b */
    private int f132030b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo67499a(int i);

    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f132030b < this.f132029a;
    }

    public final boolean hasPrevious() {
        return this.f132030b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f132030b;
            this.f132030b = i + 1;
            return mo67499a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f132030b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f132030b - 1;
            this.f132030b = i;
            return mo67499a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f132030b - 1;
    }

    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    protected bnre(int i, int i2) {
        bmxy.m108599b(i2, i);
        this.f132029a = i;
        this.f132030b = i2;
    }
}
