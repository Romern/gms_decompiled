package p000;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: beiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beiw implements bqfp {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f111609a;

    /* renamed from: b */
    final /* synthetic */ Set f111610b;

    /* renamed from: c */
    final /* synthetic */ bmza f111611c;

    /* renamed from: d */
    final /* synthetic */ beiz f111612d;

    /* renamed from: e */
    final /* synthetic */ Integer f111613e;

    /* renamed from: f */
    final /* synthetic */ beja f111614f;

    public beiw(beja beja, AtomicBoolean atomicBoolean, Set set, bmza bmza, beiz beiz, Integer num) {
        this.f111614f = beja;
        this.f111609a = atomicBoolean;
        this.f111610b = set;
        this.f111611c = bmza;
        this.f111612d = beiz;
        this.f111613e = num;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        if (this.f111609a.get()) {
            this.f111614f.f111633h.mo60744a(this.f111610b.size(), this.f111611c.mo66928a(beja.f111626a), beja.f111626a);
        } else {
            this.f111614f.f111633h.mo60746a(this.f111610b.size(), bnic.m109495a((Collection) this.f111612d.f111625b), beja.f111626a.convert((long) this.f111613e.intValue(), this.f111614f.f111631f), beja.f111626a);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
    }
}
