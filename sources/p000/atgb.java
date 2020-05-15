package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: atgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atgb implements brep {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f90269a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f90270b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f90271c;

    public atgb(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
        this.f90269a = atomicReference;
        this.f90270b = countDownLatch;
        this.f90271c = atomicReference2;
    }

    /* renamed from: a */
    public final void mo49930a() {
        srn srn = atgf.f90279a;
    }

    /* renamed from: a */
    public final void mo49931a(bres bres) {
        bnsl bnsl = (bnsl) atgf.f90279a.mo68387b();
        bnsl.mo68437a(bres);
        bnsl.mo68405a("Error while reading default card data");
        this.f90271c.set(bres);
        this.f90270b.countDown();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49932a(Object obj) {
        srn srn = atgf.f90279a;
        this.f90269a.set((brfb) obj);
        this.f90270b.countDown();
    }
}
