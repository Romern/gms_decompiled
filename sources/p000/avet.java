package p000;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: avet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avet {

    /* renamed from: a */
    private static qws f93034a;

    /* renamed from: b */
    private static aves f93035b;

    /* renamed from: c */
    private static final Random f93036c = new Random();

    /* renamed from: a */
    public static synchronized aves m78388a() {
        aves aves;
        synchronized (avet.class) {
            if (f93034a == null) {
                f93034a = new qws(rpr.m34216b(), "STREAMZ_UDC", null);
            }
            if (f93035b == null) {
                f93035b = new aves(adzl.f62962b.mo25877a(1, 2), new beof(f93034a, "STREAMZ_UDC"), "STREAMZ_UDC");
            }
            aves = f93035b;
        }
        return aves;
    }

    /* renamed from: a */
    public static synchronized void m78389a(long j, TimeUnit timeUnit) {
        synchronized (avet.class) {
            if (f93034a != null) {
                f93034a.mo24336a(j, timeUnit);
            }
        }
    }

    /* renamed from: a */
    public static boolean m78390a(long j) {
        return j > 0 && j < 2147483647L && f93036c.nextInt((int) j) == 0;
    }
}
