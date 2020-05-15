package p000;

import java.util.concurrent.ExecutorService;

/* renamed from: bdgv */
final /* synthetic */ class bdgv implements Runnable {

    /* renamed from: a */
    private final bdhc f105607a;

    /* renamed from: b */
    private final Runnable f105608b;

    /* renamed from: c */
    private final ExecutorService f105609c;

    public bdgv(bdhc bdhc, Runnable runnable, ExecutorService executorService) {
        this.f105607a = bdhc;
        this.f105608b = runnable;
        this.f105609c = executorService;
    }

    public final void run() {
        bdhc bdhc = this.f105607a;
        Runnable runnable = this.f105608b;
        ExecutorService executorService = this.f105609c;
        try {
            bdhp.m90826a(bqga.m112776a(runnable, executorService));
        } catch (RuntimeException e) {
            bnrq bnrq = (bnrq) bdhc.f105623a.mo68388c();
            bnrq.mo68437a(e);
            bnrq.mo68432a("bdhc", "a", 235, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Primes failed to initialize");
            bdhc.mo57999b();
        }
        if (bdhc.f105632j.mo57982a() == null) {
            executorService.shutdown();
        }
    }
}
