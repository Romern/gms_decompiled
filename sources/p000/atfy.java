package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: atfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atfy implements brep {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f90263a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f90264b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f90265c;

    public atfy(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
        this.f90263a = atomicReference;
        this.f90264b = countDownLatch;
        this.f90265c = atomicReference2;
    }

    /* renamed from: a */
    public final void mo49930a() {
        srn srn = atgf.f90279a;
    }

    /* renamed from: a */
    public final void mo49931a(bres bres) {
        bnsl bnsl = (bnsl) atgf.f90279a.mo68387b();
        bnsl.mo68437a(bres);
        bnsl.mo68405a("Error while reading secure element data");
        this.f90265c.set(bres);
        this.f90264b.countDown();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49932a(Object obj) {
        srn srn = atgf.f90279a;
        this.f90263a.set((JSONObject) obj);
        this.f90264b.countDown();
    }
}
