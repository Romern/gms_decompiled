package p000;

import java.util.concurrent.ExecutorService;

/* renamed from: vbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vbv {

    /* renamed from: a */
    private static final sbw f48976a = new sbw("SingleTaskExecutor", "");

    /* renamed from: b */
    private final Runnable f48977b;

    /* renamed from: c */
    private final ExecutorService f48978c = snp.m35704b(10);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f48979d = false;

    public vbv(Runnable runnable) {
        this.f48977b = new vbu(this, runnable);
    }

    /* renamed from: a */
    public final synchronized void mo28212a() {
        if (!this.f48979d) {
            this.f48979d = true;
            this.f48978c.execute(this.f48977b);
            return;
        }
        f48976a.mo25371b("Request rejected");
    }
}
