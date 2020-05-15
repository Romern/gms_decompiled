package p000;

import android.app.ActivityManager;
import android.content.Context;
import java.util.List;

/* renamed from: bbqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbqw {

    /* renamed from: a */
    private static bbqw f103186a;

    private bbqw() {
    }

    /* renamed from: a */
    public static synchronized void m88429a() {
        synchronized (bbqw.class) {
            if (f103186a == null) {
                f103186a = new bbqw();
            }
        }
    }

    /* renamed from: a */
    public static final boolean m88430a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.contains(context.getPackageName())) {
                    if (runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 200) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
