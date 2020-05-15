package p000;

import java.util.concurrent.Executor;

/* renamed from: apbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apbd {

    /* renamed from: b */
    private static apbd f84095b;

    /* renamed from: a */
    private final Executor f84096a = snp.m35704b(9);

    private apbd() {
    }

    /* renamed from: a */
    public static synchronized apbd m69986a() {
        apbd apbd;
        synchronized (apbd.class) {
            if (f84095b == null) {
                f84095b = new apbd();
            }
            apbd = f84095b;
        }
        return apbd;
    }

    /* renamed from: a */
    public final void mo47075a(Runnable runnable) {
        this.f84096a.execute(runnable);
    }
}
