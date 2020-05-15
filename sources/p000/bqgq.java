package p000;

/* renamed from: bqgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqgq extends bqdp implements Runnable {

    /* renamed from: a */
    private final Runnable f140631a;

    public bqgq(Runnable runnable) {
        bmxy.m108581a(runnable);
        this.f140631a = runnable;
    }

    public final void run() {
        try {
            this.f140631a.run();
        } catch (Throwable th) {
            mo69136a(th);
            bmzo.m108686a(th);
            throw new RuntimeException(th);
        }
    }
}
