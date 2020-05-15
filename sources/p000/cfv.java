package p000;

/* renamed from: cfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cfv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cfz f6735a;

    /* renamed from: b */
    private final cpx f6736b;

    public cfv(cfz cfz, cpx cpx) {
        this.f6735a = cfz;
        this.f6736b = cpx;
    }

    public final void run() {
        synchronized (this.f6736b.mo8121g()) {
            synchronized (this.f6735a) {
                if (this.f6735a.f6742a.mo3829a(this.f6736b)) {
                    cfz cfz = this.f6735a;
                    try {
                        this.f6736b.mo8119a(cfz.f6749h);
                    } catch (Throwable th) {
                        throw new cew(th);
                    }
                }
                this.f6735a.mo3833a();
            }
        }
    }
}
