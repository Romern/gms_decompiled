package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aiqf */
final /* synthetic */ class aiqf implements bluo {

    /* renamed from: a */
    private final aiqh f69484a;

    /* renamed from: b */
    private final AtomicBoolean f69485b;

    public aiqf(aiqh aiqh, AtomicBoolean atomicBoolean) {
        this.f69484a = aiqh;
        this.f69485b = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo13812a(bluu bluu) {
        aiqh aiqh = this.f69484a;
        this.f69485b.set(bluu.mo66725b());
        synchronized (aiqh.f69487a) {
            aiqh.f69487a.notifyAll();
        }
    }
}
