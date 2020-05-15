package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;

/* renamed from: srf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class srf {

    /* renamed from: a */
    private static final IntentFilter f45025a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b */
    private static long f45026b;

    /* renamed from: c */
    private static float f45027c = Float.NaN;

    /* renamed from: a */
    public static int m36091a(Context context) {
        if (!(context == null || context.getApplicationContext() == null)) {
            boolean b = m36093b(context);
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null) {
                return (!m36092a(powerManager) ? (char) 0 : 2) | b ? 1 : 0;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m36093b(Context context) {
        int i;
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f45025a);
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra("plugged", 0);
        } else {
            i = 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        if ((i & 7) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m36095d(Context context) {
        return m36092a((PowerManager) context.getSystemService("power"));
    }

    /* renamed from: e */
    public static synchronized float m36096e(Context context) {
        float f;
        synchronized (srf.class) {
            if (SystemClock.elapsedRealtime() - f45026b < 60000) {
                if (Float.isNaN(f45027c)) {
                }
                f = f45027c;
            }
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f45025a);
            if (registerReceiver != null) {
                f45027c = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
            }
            f45026b = SystemClock.elapsedRealtime();
            f = f45027c;
        }
        return f;
    }

    /* renamed from: f */
    public static boolean m36097f(Context context) {
        return ((AudioManager) context.getSystemService("audio")).getMode() == 2;
    }

    /* renamed from: g */
    public static boolean m36098g(Context context) {
        int i = Build.VERSION.SDK_INT;
        return Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete", -1) == 1;
    }

    /* renamed from: c */
    public static boolean m36094c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return ((PowerManager) context.getSystemService("power")).isDeviceIdleMode();
    }

    /* renamed from: a */
    public static boolean m36092a(PowerManager powerManager) {
        int i = Build.VERSION.SDK_INT;
        return powerManager.isInteractive();
    }
}
