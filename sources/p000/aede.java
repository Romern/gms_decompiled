package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aede */
final /* synthetic */ class aede implements bqeh {

    /* renamed from: a */
    private final aedj f63196a;

    /* renamed from: b */
    private final AtomicReference f63197b;

    /* renamed from: c */
    private final bbjr f63198c;

    /* renamed from: d */
    private final int f63199d;

    public aede(aedj aedj, AtomicReference atomicReference, bbjr bbjr, int i) {
        this.f63196a = aedj;
        this.f63197b = atomicReference;
        this.f63198c = bbjr;
        this.f63199d = i;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        Void voidR = (Void) obj;
        return this.f63196a.mo34067a(this.f63198c, this.f63199d, (bbmw) this.f63197b.get());
    }
}
