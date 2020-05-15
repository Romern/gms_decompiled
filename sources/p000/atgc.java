package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: atgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atgc implements brep {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f90272a;

    /* renamed from: b */
    final /* synthetic */ AtomicReference f90273b;

    public atgc(CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.f90272a = countDownLatch;
        this.f90273b = atomicReference;
    }

    /* renamed from: a */
    public final void mo49930a() {
        srn srn = atgf.f90279a;
    }

    /* renamed from: a */
    public final void mo49931a(bres bres) {
        ((bnsl) atgf.f90279a.mo68387b()).mo68405a("Error while deleting card");
        this.f90273b.set(bres);
        this.f90272a.countDown();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49932a(Object obj) {
        Void voidR = (Void) obj;
        srn srn = atgf.f90279a;
        this.f90272a.countDown();
    }
}
