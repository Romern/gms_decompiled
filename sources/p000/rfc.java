package p000;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* renamed from: rfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rfc {

    /* renamed from: a */
    static final long f42857a = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: b */
    public static C1225nr f42858b = null;

    /* renamed from: c */
    public static final Object f42859c = new Object();

    /* renamed from: d */
    private static volatile boolean f42860d = false;

    /* renamed from: e */
    private static long f42861e;

    static {
        long j = -f42857a;
        f42861e = j + j;
    }

    /* renamed from: a */
    public static boolean m33496a(Context context) {
        if (f42861e > SystemClock.elapsedRealtime() - f42857a) {
            return f42860d;
        }
        boolean z = false;
        try {
            int i = Build.VERSION.SDK_INT;
            int i2 = Settings.Global.getInt(context.getContentResolver(), "adb_enabled");
            f42861e = SystemClock.elapsedRealtime();
            if (i2 == 1) {
                z = true;
            }
            f42860d = z;
            return z;
        } catch (Settings.SettingNotFoundException e) {
            return false;
        }
    }
}
