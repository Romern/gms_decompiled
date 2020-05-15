package p000;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: srh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class srh implements ListIterator {

    /* renamed from: a */
    final /* synthetic */ sri f45028a;

    /* renamed from: b */
    private final int f45029b;

    /* renamed from: c */
    private long f45030c;

    /* renamed from: d */
    private int f45031d;

    /* renamed from: e */
    private int f45032e = 0;

    public srh(sri sri) {
        this.f45028a = sri;
        this.f45029b = sri.f45040h;
        this.f45030c = sri.f45041i;
        this.f45031d = sri.mo26014c();
    }

    /* renamed from: a */
    private final void m36100a() {
        if (this.f45029b != this.f45028a.f45040h) {
            throw new ConcurrentModificationException();
        }
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f45032e < this.f45028a.f45039g;
    }

    public final boolean hasPrevious() {
        return this.f45032e > 0;
    }

    public final int nextIndex() {
        throw new UnsupportedOperationException();
    }

    public final int previousIndex() {
        throw new UnsupportedOperationException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        m36100a();
        if (hasNext()) {
            int i = this.f45028a.f45038f[this.f45031d];
            int d = sri.m36101d(i);
            long j = this.f45030c + ((long) d);
            do {
                this.f45030c += (long) d;
                int b = this.f45028a.mo26012b(this.f45031d);
                this.f45031d = b;
                this.f45032e++;
                d = sri.m36101d(this.f45028a.f45038f[b]);
            } while (d == sri.f45037e);
            return this.f45028a.mo26007a(j * sri.f45033a, sri.m36103e(i), sri.m36104f(i));
        }
        throw new NoSuchElementException();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        m36100a();
        while (hasPrevious()) {
            int c = this.f45028a.mo26015c(this.f45031d - 1);
            this.f45031d = c;
            this.f45032e--;
            int i = this.f45028a.f45038f[c];
            long j = this.f45030c;
            int d = sri.m36101d(i);
            this.f45030c -= (long) d;
            if (d != sri.f45037e) {
                return this.f45028a.mo26007a(j * sri.f45033a, sri.m36103e(i), sri.m36104f(i));
            }
        }
        throw new NoSuchElementException();
    }
}
