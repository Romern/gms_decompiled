package p000;

import android.os.Build;
import java.util.concurrent.TimeUnit;

/* renamed from: bdzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdzz {

    /* renamed from: a */
    private static boolean f106712a;

    private bdzz() {
    }

    /* renamed from: a */
    static void m91651a(bqgk bqgk) {
        int i = Build.VERSION.SDK_INT;
        synchronized (bdzz.class) {
            if (!f106712a) {
                TimeUnit timeUnit = TimeUnit.MINUTES;
                bdzu.m91647a(bqgk.mo25814a(new bdzy(bqgk, timeUnit), 10, timeUnit));
                f106712a = true;
            }
        }
    }
}
