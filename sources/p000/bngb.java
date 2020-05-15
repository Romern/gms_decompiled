package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bngb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bngb implements Iterator {

    /* renamed from: a */
    final /* synthetic */ bngc f131572a;

    /* renamed from: b */
    private int f131573b;

    /* renamed from: c */
    private int f131574c = -1;

    /* renamed from: d */
    private int f131575d;

    /* renamed from: e */
    private int f131576e;

    public bngb(bngc bngc) {
        this.f131572a = bngc;
        bngd bngd = this.f131572a.f131577b;
        this.f131573b = bngd.f131582e;
        this.f131575d = bngd.f131581d;
        this.f131576e = bngd.f131580c;
    }

    /* renamed from: a */
    private final void m109274a() {
        if (this.f131572a.f131577b.f131581d != this.f131575d) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        m109274a();
        return this.f131573b != -2 && this.f131576e > 0;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = this.f131572a.mo67571a(this.f131573b);
            int i = this.f131573b;
            this.f131574c = i;
            this.f131573b = this.f131572a.f131577b.f131583f[i];
            this.f131576e--;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        m109274a();
        if (this.f131574c != -1) {
            z = true;
        } else {
            z = false;
        }
        bndz.m109115a(z);
        bngd bngd = this.f131572a.f131577b;
        int i = this.f131574c;
        bngd.mo67599a(i, bngg.m109305a(bngd.f131578a[i]));
        int i2 = this.f131573b;
        bngd bngd2 = this.f131572a.f131577b;
        if (i2 == bngd2.f131580c) {
            this.f131573b = this.f131574c;
        }
        this.f131574c = -1;
        this.f131575d = bngd2.f131581d;
    }
}
