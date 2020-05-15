package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bnem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnem implements Iterator {

    /* renamed from: a */
    int f131531a;

    /* renamed from: b */
    int f131532b;

    /* renamed from: c */
    int f131533c = -1;

    /* renamed from: d */
    final /* synthetic */ bnen f131534d;

    public bnem(bnen bnen) {
        this.f131534d = bnen;
        bnen bnen2 = this.f131534d;
        this.f131531a = bnen2.f131536b;
        this.f131532b = bnen2.mo67460e();
    }

    /* renamed from: a */
    private final void m109147a() {
        if (this.f131534d.f131536b != this.f131531a) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.f131532b >= 0;
    }

    public final Object next() {
        m109147a();
        if (hasNext()) {
            int i = this.f131532b;
            this.f131533c = i;
            bnen bnen = this.f131534d;
            Object obj = bnen.f131535a[i];
            this.f131532b = bnen.mo67455c(i);
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        m109147a();
        if (this.f131533c >= 0) {
            z = true;
        } else {
            z = false;
        }
        bndz.m109115a(z);
        this.f131531a += 32;
        bnen bnen = this.f131534d;
        bnen.remove(bnen.f131535a[this.f131533c]);
        this.f131532b--;
        this.f131533c = -1;
    }
}
