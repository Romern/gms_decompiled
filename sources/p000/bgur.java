package p000;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.logging.Level;

/* renamed from: bgur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgur {

    /* renamed from: a */
    private static File f117590a = null;

    /* renamed from: b */
    private static volatile Map f117591b = new C1223np();

    /* renamed from: c */
    private static boolean f117592c = false;

    /* renamed from: d */
    private static boolean[] f117593d;

    /* renamed from: a */
    public static void m100004a() {
        boolean[] zArr = new boolean[64];
        for (int i = 0; i < 64; i++) {
            zArr[i] = false;
        }
        for (String str : bmyx.m108640a(',').mo66918a((CharSequence) chcs.f188354a.mo6606a().mo85032U())) {
            if (!str.isEmpty()) {
                try {
                    int parseInt = Integer.parseInt(str);
                    if (parseInt >= 0 && parseInt <= 63) {
                        zArr[parseInt] = true;
                    }
                } catch (NumberFormatException e) {
                    Log.e("GCoreUlr", "Bad errorId configuring silent feedback");
                }
            }
        }
        f117593d = zArr;
    }

    /* renamed from: b */
    private static synchronized void m100016b() {
        synchronized (bgur.class) {
            if (!f117591b.isEmpty()) {
                for (bgus bgus : f117591b.values()) {
                    bgus.mo63222a();
                }
                f117591b.clear();
                if (f117590a != null && f117590a.exists() && !bgzo.m100468a(f117590a)) {
                    String valueOf = String.valueOf(f117590a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                    sb.append("Error deleting ");
                    sb.append(valueOf);
                    Log.e("GCoreUlr", sb.toString());
                }
                f117590a = null;
            }
        }
    }

    /* renamed from: c */
    private static synchronized void m100023c(Context context) {
        synchronized (bgur.class) {
            if (!f117592c) {
                bgzo.m100468a(new File(context.getFilesDir(), "reporting-log"));
                f117592c = true;
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m100024c(String str, int i, String str2) {
        synchronized (bgur.class) {
            m100010a(str, i, new bguq(str, str2));
        }
    }

    /* renamed from: c */
    public static synchronized void m100025c(String str, String str2) {
        synchronized (bgur.class) {
            m100018b(str, 0, str2);
        }
    }

    /* renamed from: b */
    public static void m100017b(Context context) {
        try {
            spn.m35873c();
            m100023c(context);
            m100006a(context, "GCoreUlr", (int) chcs.f188354a.mo6606a().mo85076al());
            m100006a(context, "GCoreUlrLong", (int) chcs.f188354a.mo6606a().mo85078an());
        } catch (RuntimeException e) {
            Log.wtf("GCoreUlr", "Best-effort configureForUlr() failed", e);
            fjk a = beyc.m96081a();
            if (a == null) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("location tracking disabled, can't send ");
                sb.append(valueOf);
                sb.toString();
            } else if (beyc.f113002b != null) {
                fjh fjh = new fjh(beyc.f113002b, beyc.f113001a);
                Thread currentThread = Thread.currentThread();
                String p = cese.m138167p();
                String valueOf2 = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 52 + String.valueOf(p).length());
                sb2.append("Exception ");
                sb2.append(valueOf2);
                sb2.append(", fatal: false. AnalyticsUtil userDomain: ");
                sb2.append(p);
                sb2.toString();
                fiq fiq = new fiq();
                fiq.mo10864b("utm_source=location");
                fiq.mo10859a(fjh.mo10888a(currentThread.getName(), e));
                fiq.mo10860a(false);
                fiq.mo10858a(1, p);
                a.mo10893a(fiq.mo10861a());
            }
        }
    }

    /* renamed from: a */
    public static void m100005a(Context context) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            new bgup(context).start();
        } else {
            m100017b(context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        return;
     */
    /* renamed from: a */
    private static synchronized void m100006a(Context context, String str, int i) {
        File file;
        synchronized (bgur.class) {
            if (chcs.f188354a.mo6606a().mo85077am()) {
                if (f117590a == null) {
                    f117590a = new File(context.getFilesDir(), "flog");
                }
                if (!f117590a.isDirectory()) {
                    if (!f117590a.mkdir()) {
                        String valueOf = String.valueOf(f117590a);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                        sb.append("Error creating sRootDir ");
                        sb.append(valueOf);
                        Log.e("GCoreUlr", "", new IOException(sb.toString()));
                        return;
                    }
                }
                bgus bgus = (bgus) f117591b.get(str);
                if (bgus == null) {
                    file = new File(f117590a, str);
                } else {
                    file = bgus.f117594a;
                }
                if (i <= 0) {
                    bgus bgus2 = (bgus) f117591b.get(str);
                    if (bgus2 != null) {
                        bgus2.mo63222a();
                    }
                    bgzo.m100468a(file);
                    return;
                }
                if (!file.isDirectory()) {
                    if (!file.mkdir()) {
                        String valueOf2 = String.valueOf(file);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
                        sb2.append("Error creating dir ");
                        sb2.append(valueOf2);
                        Log.e("GCoreUlr", "", new IOException(sb2.toString()));
                        return;
                    }
                }
                if (bgus == null) {
                    try {
                        f117591b.put(str, new bgus(file, i));
                    } catch (IOException | IllegalArgumentException e) {
                        String valueOf3 = String.valueOf(file);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 26);
                        sb3.append("Failed to create log file ");
                        sb3.append(valueOf3);
                        Log.e("GCoreUlr", sb3.toString(), e);
                    }
                }
            } else {
                m100016b();
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m100018b(String str, int i, String str2) {
        bguq bguq;
        synchronized (bgur.class) {
            if (m100015a(i)) {
                bguq = new bguq(str, str2);
            } else {
                bguq = null;
            }
            m100009a(str, i, str2, bguq);
        }
    }

    /* renamed from: b */
    public static synchronized void m100019b(String str, int i, String str2, Throwable th) {
        synchronized (bgur.class) {
            bgus bgus = (bgus) f117591b.get(str);
            if (bgus != null) {
                bgus.mo63225a(Level.SEVERE, str, str2, th);
            }
            bguv.m100040a(i);
            if (m100015a(i)) {
                bguz.m100120a(th);
            }
            Log.wtf(str, str2, th);
        }
    }

    /* renamed from: b */
    public static synchronized void m100020b(String str, String str2) {
        synchronized (bgur.class) {
            m100008a(str, 0, str2);
        }
    }

    /* renamed from: a */
    public static synchronized void m100007a(PrintWriter printWriter, String str) {
        synchronized (bgur.class) {
            bgus bgus = (bgus) f117591b.get(str);
            if (bgus != null) {
                bgus.mo63223a(printWriter);
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m100021b(String str, String str2, Throwable th) {
        synchronized (bgur.class) {
            m100009a(str, 0, str2, th);
        }
    }

    /* renamed from: b */
    public static synchronized void m100022b(String str, Throwable th) {
        synchronized (bgur.class) {
            m100021b(str, th.getMessage(), th);
        }
    }

    /* renamed from: a */
    public static synchronized void m100008a(String str, int i, String str2) {
        synchronized (bgur.class) {
            if (Log.isLoggable(str, 5)) {
                Log.w(str, str2);
            }
            if (i != 0) {
                bguv.m100040a(i);
            }
            bgus bgus = (bgus) f117591b.get(str);
            if (bgus != null) {
                bgus.mo63224a(Level.WARNING, str, str2);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m100009a(String str, int i, String str2, Throwable th) {
        synchronized (bgur.class) {
            if (m100015a(i)) {
                bguz.m100120a(th);
            }
            if (i != 0) {
                if (i >= 65535) {
                    bguv.m100043a("UlrDeviceTagEvents", i);
                } else {
                    bguv.m100040a(i);
                }
            }
            if (Log.isLoggable(str, 6)) {
                Log.e(str, str2, th);
            }
            bgus bgus = (bgus) f117591b.get(str);
            if (bgus != null) {
                bgus.mo63225a(Level.SEVERE, str, str2, th);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m100010a(String str, int i, Throwable th) {
        synchronized (bgur.class) {
            m100019b(str, i, th.getMessage(), th);
        }
    }

    /* renamed from: a */
    public static synchronized void m100011a(String str, String str2) {
        synchronized (bgur.class) {
            if (Log.isLoggable(str, 4)) {
                Log.i(str, str2);
            }
            bgus bgus = (bgus) f117591b.get(str);
            if (bgus != null) {
                bgus.mo63224a(Level.INFO, str, str2);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m100012a(String str, String str2, Throwable th) {
        synchronized (bgur.class) {
            if (Log.isLoggable(str, 5)) {
                Log.w(str, str2, th);
            }
            bgus bgus = (bgus) f117591b.get(str);
            if (bgus != null) {
                bgus.mo63225a(Level.WARNING, str, str2, th);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m100013a(String str, Throwable th) {
        synchronized (bgur.class) {
            if (Log.isLoggable(str, 5)) {
                Log.w(str, th);
            }
            bgus bgus = (bgus) f117591b.get(str);
            if (bgus != null) {
                bgus.mo63226a(Level.WARNING, str, th);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m100014a(Level level, String str, String str2) {
        synchronized (bgur.class) {
            bgus bgus = (bgus) f117591b.get(str);
            if (bgus != null) {
                bgus.mo63224a(level, str, str2);
            }
        }
    }

    /* renamed from: a */
    private static boolean m100015a(int i) {
        boolean[] zArr;
        if (!chcs.f188354a.mo6606a().mo85021J() || (zArr = f117593d) == null || i > 63) {
            return false;
        }
        return zArr[i];
    }
}
