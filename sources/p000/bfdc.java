package p000;

import java.util.Iterator;

/* renamed from: bfdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfdc implements Iterator {

    /* renamed from: a */
    public final buai f113463a;

    /* renamed from: b */
    final /* synthetic */ bfdd f113464b;

    public bfdc(bfdd bfdd) {
        btzy a = ((buad) bfdd.f113465a).entrySet().iterator();
        this.f113464b = bfdd;
        this.f113463a = a;
    }

    /* renamed from: a */
    public final int mo61447a() {
        return this.f113464b.f113466b[this.f113463a.mo72557g()];
    }

    /* renamed from: b */
    public final void mo61448b() {
        this.f113463a.mo72556f();
    }

    /* renamed from: c */
    public final bfni next() {
        return (bfni) this.f113463a.mo72550d();
    }

    /* renamed from: d */
    public final String mo61450d() {
        return (String) this.f113463a.mo72551e();
    }

    public final boolean hasNext() {
        return this.f113463a.hasNext();
    }

    public final void remove() {
        this.f113463a.remove();
    }
}
