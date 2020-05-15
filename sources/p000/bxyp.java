package p000;

import java.util.ListIterator;

/* renamed from: bxyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxyp implements ListIterator {

    /* renamed from: a */
    final ListIterator f165108a = this.f165110c.f165113a.listIterator(this.f165109b);

    /* renamed from: b */
    final /* synthetic */ int f165109b;

    /* renamed from: c */
    final /* synthetic */ bxyr f165110c;

    public bxyp(bxyr bxyr, int i) {
        this.f165110c = bxyr;
        this.f165109b = i;
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f165108a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f165108a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f165108a.next();
    }

    public final int nextIndex() {
        return this.f165108a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f165108a.previous();
    }

    public final int previousIndex() {
        return this.f165108a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
