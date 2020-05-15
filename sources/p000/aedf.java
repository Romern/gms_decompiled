package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aedf */
final /* synthetic */ class aedf implements bqeh {

    /* renamed from: a */
    private final aedj f63200a;

    /* renamed from: b */
    private final AtomicReference f63201b;

    /* renamed from: c */
    private final int f63202c;

    public aedf(aedj aedj, AtomicReference atomicReference, int i) {
        this.f63200a = aedj;
        this.f63201b = atomicReference;
        this.f63202c = i;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqgg bqgg;
        aedj aedj = this.f63200a;
        AtomicReference atomicReference = this.f63201b;
        int i = this.f63202c;
        bbjq bbjq = (bbjq) obj;
        bbnm bbnm = (bbnm) atomicReference.get();
        if (bbnm == null) {
            return bqga.m112775a((Object) null);
        }
        if (bbjq.f102774b) {
            synchronized (bbnm.f102953a) {
                bbnm.mo56234f();
                bqgg = bqga.m112775a((Object) null);
            }
        } else {
            bqgg = bbnm.mo56231c();
        }
        return bqdx.m112673a(bqgg, new aecx(aedj, bbjq, bbnm, i), bqfb.INSTANCE);
    }
}
