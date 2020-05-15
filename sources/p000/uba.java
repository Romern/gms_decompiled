package p000;

/* renamed from: uba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uba implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ubd f47081a;

    public uba(ubd ubd) {
        this.f47081a = ubd;
    }

    public final void run() {
        synchronized (this.f47081a) {
            ubd ubd = this.f47081a;
            ubd.f47090c = null;
            ubd.mo27047d();
            this.f47081a.mo27048e();
        }
    }
}
