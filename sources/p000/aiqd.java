package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aiqd */
final /* synthetic */ class aiqd implements bluo {

    /* renamed from: a */
    private final aiqe f69479a;

    /* renamed from: b */
    private final AtomicBoolean f69480b;

    public aiqd(aiqe aiqe, AtomicBoolean atomicBoolean) {
        this.f69479a = aiqe;
        this.f69480b = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo13812a(bluu bluu) {
        aiqe aiqe = this.f69479a;
        this.f69480b.set(bluu.mo66725b());
        synchronized (aiqe.f69481a) {
            aiqe.f69481a.notifyAll();
        }
    }
}
