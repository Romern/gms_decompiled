package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: bnbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnbs extends WeakReference implements bnbn {

    /* renamed from: a */
    final bncc f131399a;

    public bnbs(ReferenceQueue referenceQueue, Object obj, bncc bncc) {
        super(obj, referenceQueue);
        this.f131399a = bncc;
    }

    /* renamed from: a */
    public int mo66970a() {
        return 1;
    }

    /* renamed from: a */
    public final void mo66972a(Object obj) {
    }

    /* renamed from: b */
    public final bncc mo66973b() {
        return this.f131399a;
    }

    /* renamed from: c */
    public final boolean mo66974c() {
        return false;
    }

    /* renamed from: d */
    public final boolean mo66975d() {
        return true;
    }

    /* renamed from: e */
    public final Object mo66976e() {
        return get();
    }

    /* renamed from: a */
    public bnbn mo66971a(ReferenceQueue referenceQueue, Object obj, bncc bncc) {
        return new bnbs(referenceQueue, obj, bncc);
    }
}
