package p000;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: atft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atft implements brep {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f90260a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f90261b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f90262c;

    public atft(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
        this.f90260a = atomicReference;
        this.f90261b = countDownLatch;
        this.f90262c = atomicReference2;
    }

    /* renamed from: a */
    public final void mo49930a() {
        srn srn = atgf.f90279a;
    }

    /* renamed from: a */
    public final void mo49931a(bres bres) {
        this.f90260a.set(bres);
        this.f90261b.countDown();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49932a(Object obj) {
        bngs bngs = new bngs();
        for (breq breq : (List) obj) {
            if (breq.mo60902a() > 0) {
                bngs.mo67668c(breq);
            }
        }
        this.f90262c.set(bngs.mo67664a());
        this.f90261b.countDown();
    }
}
