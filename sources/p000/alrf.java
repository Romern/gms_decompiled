package p000;

import java.util.concurrent.Executor;

/* renamed from: alrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alrf {

    /* renamed from: b */
    private static alrf f74164b;

    /* renamed from: a */
    private final Executor f74165a = snp.m35704b(9);

    private alrf() {
    }

    /* renamed from: a */
    public static alrf m61546a() {
        synchronized (alrf.class) {
            if (f74164b == null) {
                f74164b = new alrf();
            }
        }
        return f74164b;
    }

    /* renamed from: a */
    public final void mo40670a(Runnable runnable) {
        this.f74165a.execute(runnable);
    }
}
