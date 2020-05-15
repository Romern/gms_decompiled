package p000;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: qxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qxs {

    /* renamed from: a */
    public static final Object f42397a = new Object();

    /* renamed from: b */
    protected static volatile int f42398b = -1;

    /* renamed from: c */
    public static volatile rsk f42399c;

    /* renamed from: d */
    private static final Object f42400d = new Object();

    static {
        new CountDownLatch(1);
    }

    /* renamed from: a */
    public static Integer m33071a(Context context) {
        if (f42398b <= 0) {
            synchronized (f42400d) {
                if (f42398b <= 0) {
                    rbp a = rbq.m33303a(context, rds.m33429c());
                    try {
                        int i = Build.VERSION.SDK_INT;
                        f42398b = Settings.Global.getInt(context.getContentResolver(), "boot_count");
                    } catch (Settings.SettingNotFoundException e) {
                        f42398b = Integer.MAX_VALUE;
                        Log.e("BootCount", "Could not find system setting for BOOT_COUNT.", e);
                        a.mo24446a("bootCountGlobalSettingNotFound");
                    } catch (Throwable th) {
                        if (a != null) {
                            try {
                                a.close();
                            } catch (Throwable th2) {
                                bqye.m113761a(th, th2);
                            }
                        }
                        throw th;
                    }
                    if (a != null) {
                        a.close();
                    }
                }
            }
        }
        if (f42398b != Integer.MAX_VALUE) {
            return Integer.valueOf(f42398b);
        }
        return null;
    }

    /* renamed from: a */
    public static void m33072a() {
        int i = Build.VERSION.SDK_INT;
    }
}
