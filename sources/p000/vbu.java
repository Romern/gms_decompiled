package p000;

/* renamed from: vbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vbu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f48974a;

    /* renamed from: b */
    final /* synthetic */ vbv f48975b;

    public vbu(vbv vbv, Runnable runnable) {
        this.f48975b = vbv;
        this.f48974a = runnable;
    }

    public final void run() {
        try {
            this.f48974a.run();
            synchronized (this.f48975b) {
                this.f48975b.f48979d = false;
            }
        } catch (Throwable th) {
            synchronized (this.f48975b) {
                this.f48975b.f48979d = false;
                throw th;
            }
        }
    }
}
