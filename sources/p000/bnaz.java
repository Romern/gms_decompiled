package p000;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: bnaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnaz implements bnbn {

    /* renamed from: a */
    volatile bnbn f131330a;

    /* renamed from: b */
    final bqgy f131331b = bqgy.m112818c();

    /* renamed from: c */
    final bmza f131332c = bmza.m108656a();

    public bnaz() {
        bnbn bnbn = bncb.f131414s;
        this.f131330a = bnbn;
    }

    /* renamed from: a */
    public final int mo66970a() {
        return 0;
    }

    /* renamed from: a */
    public final bnbn mo66971a(ReferenceQueue referenceQueue, Object obj, bncc bncc) {
        return this;
    }

    /* renamed from: b */
    public final bncc mo66973b() {
        return null;
    }

    /* renamed from: c */
    public final boolean mo66974c() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo66975d() {
        return false;
    }

    /* renamed from: e */
    public final Object mo66976e() {
        return bqhi.m112838a(this.f131331b);
    }

    /* renamed from: f */
    public final void mo67034f() {
        this.f131332c.mo66928a(TimeUnit.NANOSECONDS);
    }

    public final Object get() {
        return null;
    }

    /* renamed from: b */
    public final boolean mo67033b(Object obj) {
        return this.f131331b.mo69138b(obj);
    }

    /* renamed from: a */
    public final void mo66972a(Object obj) {
        if (obj == null) {
            this.f131330a = bncb.f131414s;
        } else {
            mo67033b(obj);
        }
    }
}
