package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bneh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bneh implements Iterator {

    /* renamed from: b */
    int f131512b;

    /* renamed from: c */
    int f131513c;

    /* renamed from: d */
    int f131514d = -1;

    /* renamed from: e */
    final /* synthetic */ bnel f131515e;

    public bneh(bnel bnel) {
        this.f131515e = bnel;
        bnel bnel2 = this.f131515e;
        this.f131512b = bnel2.f131526f;
        this.f131513c = bnel2.mo67441h();
    }

    /* renamed from: a */
    private final void m109123a() {
        if (this.f131515e.f131526f != this.f131512b) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public abstract Object mo67404a(int i);

    public final boolean hasNext() {
        return this.f131513c >= 0;
    }

    public final Object next() {
        m109123a();
        if (hasNext()) {
            int i = this.f131513c;
            this.f131514d = i;
            Object a = mo67404a(i);
            this.f131513c = this.f131515e.mo67435e(this.f131513c);
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        m109123a();
        if (this.f131514d >= 0) {
            z = true;
        } else {
            z = false;
        }
        bndz.m109115a(z);
        this.f131512b += 32;
        bnel bnel = this.f131515e;
        bnel.remove(bnel.f131524d[this.f131514d]);
        this.f131513c = this.f131515e.mo67424b(this.f131513c, this.f131514d);
        this.f131514d = -1;
    }
}
