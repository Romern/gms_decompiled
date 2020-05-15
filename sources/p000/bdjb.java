package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: bdjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdjb {

    /* renamed from: a */
    static volatile boolean f105721a;

    /* renamed from: b */
    public static final /* synthetic */ int f105722b = 0;

    /* renamed from: c */
    private static volatile ActivityManager f105723c = null;

    private bdjb() {
    }

    /* renamed from: a */
    public static ActivityManager m90889a(Context context) {
        if (f105723c == null) {
            synchronized (bdjb.class) {
                if (f105723c == null) {
                    f105723c = (ActivityManager) context.getSystemService("activity");
                }
            }
        }
        return f105723c;
    }

    /* renamed from: c */
    public static boolean m90892c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return ((PowerManager) context.getSystemService("power")).isInteractive();
    }

    /* renamed from: d */
    public static boolean m90893d(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = m90889a(context).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == Process.myPid()) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m90891b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.contains(context.getPackageName())) {
                int i = Build.VERSION.SDK_INT;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f A[SYNTHETIC, Splitter:B:14:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[SYNTHETIC, Splitter:B:21:0x0049] */
    /* renamed from: a */
    public static String m90890a() {
        BufferedReader bufferedReader;
        int myPid = Process.myPid();
        String str = null;
        BufferedReader bufferedReader2 = null;
        str = null;
        str = null;
        str = null;
        str = null;
        if (myPid > 0) {
            try {
                StringBuilder sb = new StringBuilder(25);
                sb.append("/proc/");
                sb.append(myPid);
                sb.append("/cmdline");
                bufferedReader = new BufferedReader(new FileReader(sb.toString()));
                try {
                    str = bufferedReader.readLine().trim();
                } catch (IOException e) {
                    if (bufferedReader != null) {
                    }
                    return str;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                    }
                    throw th;
                }
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                }
            } catch (IOException e3) {
                bufferedReader = null;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                return str;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        }
        return str;
    }
}
