package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bshi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bshi implements Iterator {

    /* renamed from: a */
    bshj f144555a;

    /* renamed from: b */
    bshj f144556b = null;

    /* renamed from: c */
    int f144557c;

    /* renamed from: d */
    final /* synthetic */ bshk f144558d;

    public bshi(bshk bshk) {
        this.f144558d = bshk;
        bshk bshk2 = this.f144558d;
        this.f144555a = bshk2.f144572e.f144562d;
        this.f144557c = bshk2.f144571d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bshj mo70573a() {
        bshj bshj = this.f144555a;
        bshk bshk = this.f144558d;
        if (bshj == bshk.f144572e) {
            throw new NoSuchElementException();
        } else if (bshk.f144571d == this.f144557c) {
            this.f144555a = bshj.f144562d;
            this.f144556b = bshj;
            return bshj;
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.f144555a != this.f144558d.f144572e;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bshk.a(bshj, boolean):void
     arg types: [bshj, int]
     candidates:
      bshk.a(bshj, bshj):void
      bshk.a(java.lang.Object, boolean):bshj
      bshk.a(bshj, boolean):void */
    public final void remove() {
        bshj bshj = this.f144556b;
        if (bshj != null) {
            this.f144558d.mo70585a(bshj, true);
            this.f144556b = null;
            this.f144557c = this.f144558d.f144571d;
            return;
        }
        throw new IllegalStateException();
    }
}
