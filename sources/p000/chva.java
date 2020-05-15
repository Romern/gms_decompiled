package p000;

/* renamed from: chva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chva implements Runnable {

    /* renamed from: a */
    final Runnable f189244a;

    /* renamed from: b */
    boolean f189245b;

    /* renamed from: c */
    boolean f189246c;

    public chva(Runnable runnable) {
        bmxy.m108582a(runnable, "task");
        this.f189244a = runnable;
    }

    public final void run() {
        if (!this.f189245b) {
            this.f189246c = true;
            this.f189244a.run();
        }
    }
}
