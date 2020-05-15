package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: bncw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bncw implements Iterator {

    /* renamed from: a */
    final Iterator f131464a;

    /* renamed from: b */
    final Collection f131465b = this.f131466c.f131468b;

    /* renamed from: c */
    final /* synthetic */ bncx f131466c;

    public bncw(bncx bncx) {
        this.f131466c = bncx;
        Collection collection = bncx.f131468b;
        this.f131464a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67210a() {
        this.f131466c.mo67214a();
        if (this.f131466c.f131468b != this.f131465b) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        mo67210a();
        return this.f131464a.hasNext();
    }

    public final Object next() {
        mo67210a();
        return this.f131464a.next();
    }

    public final void remove() {
        this.f131464a.remove();
        bndd.m109028b(this.f131466c.f131471e);
        this.f131466c.mo67217b();
    }

    public bncw(bncx bncx, Iterator it) {
        this.f131466c = bncx;
        this.f131464a = it;
    }
}
