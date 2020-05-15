package p000;

import java.util.Iterator;

/* renamed from: bnjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnjq implements Iterator {

    /* renamed from: a */
    private final Iterator f131717a;

    /* renamed from: b */
    private boolean f131718b;

    /* renamed from: c */
    private Object f131719c;

    public bnjq(Iterator it) {
        bmxy.m108581a(it);
        this.f131717a = it;
    }

    /* renamed from: a */
    public final Object mo67862a() {
        if (!this.f131718b) {
            this.f131719c = this.f131717a.next();
            this.f131718b = true;
        }
        return this.f131719c;
    }

    public final boolean hasNext() {
        return this.f131718b || this.f131717a.hasNext();
    }

    public final Object next() {
        if (!this.f131718b) {
            return this.f131717a.next();
        }
        Object obj = this.f131719c;
        this.f131718b = false;
        this.f131719c = null;
        return obj;
    }

    public final void remove() {
        bmxy.m108601b(!this.f131718b, "Can't remove after you've peeked at next");
        this.f131717a.remove();
    }
}
