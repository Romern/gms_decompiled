package p000;

/* renamed from: akgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akgo implements Runnable {

    /* renamed from: a */
    public final bqgy f71888a = bqgy.m112818c();

    /* renamed from: b */
    private final Runnable f71889b;

    public akgo(Runnable runnable) {
        this.f71889b = runnable;
    }

    public final void run() {
        this.f71889b.run();
        this.f71888a.mo69136a((Throwable) new RuntimeException("DiscoveryCancellationRunnable timed out."));
    }
}
