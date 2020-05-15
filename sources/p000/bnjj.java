package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bnjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnjj implements Iterator {

    /* renamed from: a */
    final /* synthetic */ int f131702a;

    /* renamed from: b */
    final /* synthetic */ Iterator f131703b;

    /* renamed from: c */
    private int f131704c;

    public bnjj(int i, Iterator it) {
        this.f131702a = i;
        this.f131703b = it;
    }

    public final boolean hasNext() {
        return this.f131704c < this.f131702a && this.f131703b.hasNext();
    }

    public final Object next() {
        if (hasNext()) {
            this.f131704c++;
            return this.f131703b.next();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        this.f131703b.remove();
    }
}
