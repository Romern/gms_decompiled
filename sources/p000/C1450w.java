package p000;

/* renamed from: w */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1450w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1477x f27484a;

    public C1450w(C1477x xVar) {
        this.f27484a = xVar;
    }

    public final void run() {
        boolean d = this.f27484a.f27546b.mo2452d();
        if (this.f27484a.f27547c.compareAndSet(false, true) && d) {
            C1477x xVar = this.f27484a;
            xVar.f27545a.execute(xVar.f27549e);
        }
    }
}
