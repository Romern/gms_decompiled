package p000;

/* renamed from: cfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cfw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cfz f6737a;

    /* renamed from: b */
    private final cpx f6738b;

    public cfw(cfz cfz, cpx cpx) {
        this.f6737a = cfz;
        this.f6738b = cpx;
    }

    public final void run() {
        synchronized (this.f6738b.mo8121g()) {
            synchronized (this.f6737a) {
                if (this.f6737a.f6742a.mo3829a(this.f6738b)) {
                    this.f6737a.f6751j.mo3845e();
                    cfz cfz = this.f6737a;
                    try {
                        this.f6738b.mo8120a(cfz.f6751j, cfz.f6753l);
                        this.f6737a.mo3836a(this.f6738b);
                    } catch (Throwable th) {
                        throw new cew(th);
                    }
                }
                this.f6737a.mo3833a();
            }
        }
    }
}
