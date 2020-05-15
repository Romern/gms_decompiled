package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bndg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bndg implements Iterator {

    /* renamed from: b */
    int f131481b = this.f131484e.f131485a.mo68146a();

    /* renamed from: c */
    int f131482c = -1;

    /* renamed from: d */
    int f131483d = this.f131484e.f131485a.f131885d;

    /* renamed from: e */
    final /* synthetic */ bndh f131484e;

    public bndg(bndh bndh) {
        this.f131484e = bndh;
    }

    /* renamed from: a */
    private final void m109052a() {
        if (this.f131484e.f131485a.f131885d != this.f131483d) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public abstract Object mo67281a(int i);

    public final boolean hasNext() {
        m109052a();
        return this.f131481b >= 0;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = mo67281a(this.f131481b);
            int i = this.f131481b;
            this.f131482c = i;
            this.f131481b = this.f131484e.f131485a.mo68147a(i);
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        m109052a();
        if (this.f131482c != -1) {
            z = true;
        } else {
            z = false;
        }
        bndz.m109115a(z);
        bndh bndh = this.f131484e;
        bndh.f131486b -= (long) bndh.f131485a.mo68156f(this.f131482c);
        bnnx bnnx = this.f131484e.f131485a;
        this.f131481b--;
        this.f131482c = -1;
        this.f131483d = bnnx.f131885d;
    }
}
