package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: bnkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnkh implements ListIterator {

    /* renamed from: a */
    boolean f131759a;

    /* renamed from: b */
    final /* synthetic */ ListIterator f131760b;

    /* renamed from: c */
    final /* synthetic */ bnki f131761c;

    public bnkh(bnki bnki, ListIterator listIterator) {
        this.f131761c = bnki;
        this.f131760b = listIterator;
    }

    public final void add(Object obj) {
        this.f131760b.add(obj);
        this.f131760b.previous();
        this.f131759a = false;
    }

    public final boolean hasNext() {
        return this.f131760b.hasPrevious();
    }

    public final boolean hasPrevious() {
        return this.f131760b.hasNext();
    }

    public final Object next() {
        if (hasNext()) {
            this.f131759a = true;
            return this.f131760b.previous();
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f131761c.mo67916a(this.f131760b.nextIndex());
    }

    public final Object previous() {
        if (hasPrevious()) {
            this.f131759a = true;
            return this.f131760b.next();
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return nextIndex() - 1;
    }

    public final void remove() {
        bndz.m109115a(this.f131759a);
        this.f131760b.remove();
        this.f131759a = false;
    }

    public final void set(Object obj) {
        bmxy.m108600b(this.f131759a);
        this.f131760b.set(obj);
    }
}
