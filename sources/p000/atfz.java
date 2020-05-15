package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: atfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atfz implements brep {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f90266a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f90267b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f90268c;

    public atfz(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
        this.f90266a = atomicReference;
        this.f90267b = countDownLatch;
        this.f90268c = atomicReference2;
    }

    /* renamed from: a */
    public final void mo49930a() {
        srn srn = atgf.f90279a;
    }

    /* renamed from: a */
    public final void mo49931a(bres bres) {
        bnsl bnsl = (bnsl) atgf.f90279a.mo68387b();
        bnsl.mo68437a(bres);
        bnsl.mo68405a("Error while provisioning FeliCa card");
        this.f90268c.set(bres);
        this.f90267b.countDown();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49932a(Object obj) {
        srn srn = atgf.f90279a;
        this.f90266a.set((String) obj);
        this.f90267b.countDown();
    }
}
