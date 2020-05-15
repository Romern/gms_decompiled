package p000;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* renamed from: buap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class buap implements buaf {

    /* renamed from: b */
    protected int f153160b = -1;

    /* renamed from: c */
    protected int f153161c;

    /* renamed from: d */
    protected int f153162d;

    /* renamed from: e */
    final /* synthetic */ buaq f153163e;

    protected buap(buaq buaq) {
        this.f153163e = buaq;
        buav buav = this.f153163e.f153164c;
        this.f153161c = buav.f153181h;
        this.f153162d = buav.f153177d;
    }

    /* renamed from: c */
    public final void mo72576c() {
        if (this.f153163e.f153164c.f153177d != this.f153162d) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            int i = this.f153161c;
            this.f153160b = i;
            buav buav = this.f153163e.f153164c;
            if (i == buav.f153182i) {
                this.f153161c = -1;
            } else {
                this.f153161c = buav.mo72596d(i);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: d */
    public final int mo72577d() {
        mo72578e();
        return this.f153160b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo72578e() {
        if (this.f153163e.f153164c.f153177d != this.f153162d) {
            throw new ConcurrentModificationException();
        } else if (this.f153160b == -1) {
            throw new IllegalStateException();
        }
    }

    public final boolean hasNext() {
        return !this.f153163e.f153164c.mo72605f() && this.f153161c != -1;
    }

    public final Object next() {
        mo72576c();
        return mo72479b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buav.a(int, boolean):int
     arg types: [int, int]
     candidates:
      buav.a(int, int):void
      buav.a(int, boolean):int */
    public final void remove() {
        mo72578e();
        int i = this.f153163e.f153164c.mo72607i(this.f153160b);
        this.f153160b = i;
        if (this.f153161c != -1) {
            this.f153161c = this.f153163e.f153164c.mo72596d(i);
        }
        this.f153163e.f153164c.mo72603a(this.f153160b, false);
        this.f153163e.f153165d.mo72586d(this.f153160b);
        this.f153160b = -1;
        this.f153162d = this.f153163e.f153164c.f153177d;
    }
}
