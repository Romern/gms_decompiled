package p000;

/* renamed from: baxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class baxo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ baxp f102049a;

    /* renamed from: b */
    private final Runnable f102050b;

    public baxo(baxp baxp, Runnable runnable) {
        this.f102049a = baxp;
        this.f102050b = runnable;
    }

    public final void run() {
        try {
            this.f102050b.run();
        } finally {
            this.f102049a.mo56025a();
        }
    }
}
