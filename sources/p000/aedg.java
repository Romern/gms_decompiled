package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aedg */
final /* synthetic */ class aedg implements bqeh {

    /* renamed from: a */
    private final aedj f63203a;

    /* renamed from: b */
    private final AtomicReference f63204b;

    /* renamed from: c */
    private final int f63205c;

    public aedg(aedj aedj, AtomicReference atomicReference, int i) {
        this.f63203a = aedj;
        this.f63204b = atomicReference;
        this.f63205c = i;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        aedj aedj = this.f63203a;
        AtomicReference atomicReference = this.f63204b;
        int i = this.f63205c;
        Exception exc = (Exception) obj;
        bbnm bbnm = (bbnm) atomicReference.get();
        if (bbnm != null) {
            return bqdx.m112673a(bbnm.mo56232d(), new aecw(aedj, bbnm, exc, i), bqfb.INSTANCE);
        }
        return bqga.m112775a((Object) null);
    }
}
