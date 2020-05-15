package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Debug;
import android.os.DropBoxManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: sqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sqx {

    /* renamed from: a */
    private static final String[] f45009a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b */
    private static int f45010b = 0;

    /* renamed from: c */
    private static int f45011c = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x017b, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[Catch:{ RuntimeException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa A[Catch:{ RuntimeException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1 A[Catch:{ RuntimeException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9 A[Catch:{ RuntimeException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d2 A[Catch:{ RuntimeException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e7 A[Catch:{ RuntimeException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ea A[Catch:{ RuntimeException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:54:0x0151] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0187 A[SYNTHETIC, Splitter:B:77:0x0187] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0190 A[SYNTHETIC, Splitter:B:82:0x0190] */
    /* renamed from: a */
    static synchronized String m36050a(Context context, String str, String str2, int i) {
        int i2;
        synchronized (sqx.class) {
            StringBuilder sb = new StringBuilder(1024);
            sb.append("Process: ");
            sb.append(stm.m36299a(str2));
            sb.append("\nPackage: com.google.android.gms");
            String str3 = "20.15.15 (120300-{{cl}})";
            int i3 = 201515033;
            if (sqr.m35998a()) {
                try {
                    PackageInfo b = svr.m36484b(context).mo26176b(context.getPackageName(), 0);
                    i3 = b.versionCode;
                    try {
                        if (b.versionName != null) {
                            str3 = b.versionName;
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.w("CrashUtils", "Error while trying to get the package information! Using static version.", e);
                        sb.append(" v");
                        sb.append(i3);
                        if (!TextUtils.isEmpty(str3)) {
                        }
                        sb.append("\nBuild: ");
                        sb.append(Build.FINGERPRINT);
                        sb.append("\n");
                        if (Debug.isDebuggerConnected()) {
                        }
                        if (i != 0) {
                        }
                        sb.append("\n");
                        if (!TextUtils.isEmpty(str)) {
                        }
                        if (sqr.m35998a()) {
                        }
                        if (i2 > 0) {
                        }
                        String sb2 = sb.toString();
                        return sb2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.w("CrashUtils", "Error while trying to get the package information! Using static version.", e);
                    sb.append(" v");
                    sb.append(i3);
                    if (!TextUtils.isEmpty(str3)) {
                    }
                    sb.append("\nBuild: ");
                    sb.append(Build.FINGERPRINT);
                    sb.append("\n");
                    if (Debug.isDebuggerConnected()) {
                    }
                    if (i != 0) {
                    }
                    sb.append("\n");
                    if (!TextUtils.isEmpty(str)) {
                    }
                    if (sqr.m35998a()) {
                    }
                    if (i2 > 0) {
                    }
                    String sb22 = sb.toString();
                    return sb22;
                }
            }
            sb.append(" v");
            sb.append(i3);
            if (!TextUtils.isEmpty(str3)) {
                if (str3.contains("(") && !str3.contains(")")) {
                    if (str3.endsWith("-")) {
                        str3 = String.valueOf(str3).concat("111111111");
                    }
                    str3 = String.valueOf(str3).concat(")");
                }
                sb.append(" (");
                sb.append(str3);
                sb.append(")");
            }
            sb.append("\nBuild: ");
            sb.append(Build.FINGERPRINT);
            sb.append("\n");
            if (Debug.isDebuggerConnected()) {
                sb.append("Debugger: Connected\n");
            }
            if (i != 0) {
                sb.append("DD-EDD: ");
                sb.append(i);
                sb.append("\n");
            }
            sb.append("\n");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            if (sqr.m35998a()) {
                try {
                    i2 = Settings.Secure.getInt(context.getContentResolver(), "logcat_for_system_app_crash", 0);
                } catch (RuntimeException e3) {
                    Log.e("CrashUtils", "Error detecting allowed logcat lines.", e3);
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                sb.append("\n");
                InputStreamReader inputStreamReader = null;
                try {
                    Process start = new ProcessBuilder("/system/bin/logcat", "-v", "time", "-b", "events", "-b", "system", "-b", "main", "-b", "crash", "-t", String.valueOf(i2)).redirectErrorStream(true).start();
                    try {
                        start.getOutputStream().close();
                    } catch (IOException e4) {
                    } catch (Throwable th) {
                    }
                    try {
                        start.getErrorStream().close();
                    } catch (IOException e5) {
                    } catch (Throwable th2) {
                    }
                    InputStreamReader inputStreamReader2 = new InputStreamReader(start.getInputStream());
                    try {
                        char[] cArr = new char[8192];
                        while (true) {
                            int read = inputStreamReader2.read(cArr);
                            if (read > 0) {
                                sb.append(cArr, 0, read);
                            } else {
                                try {
                                    break;
                                } catch (IOException e6) {
                                }
                            }
                        }
                        inputStreamReader2.close();
                    } catch (IOException e7) {
                        e = e7;
                        inputStreamReader = inputStreamReader2;
                        try {
                            Log.e("CrashUtils", "Error running logcat", e);
                            if (inputStreamReader != null) {
                            }
                            String sb222 = sb.toString();
                            return sb222;
                        } catch (Throwable th3) {
                            th = th3;
                            if (inputStreamReader != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                        }
                        throw th;
                    }
                } catch (IOException e8) {
                    e = e8;
                    Log.e("CrashUtils", "Error running logcat", e);
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    String sb2222 = sb.toString();
                    return sb2222;
                } catch (Throwable th22) {
                }
            }
            String sb22222 = sb.toString();
        }
        return sb22222;
    }

    /* renamed from: a */
    public static synchronized Throwable m36051a(Throwable th) {
        Throwable th2;
        boolean z;
        boolean z2;
        synchronized (sqx.class) {
            LinkedList linkedList = new LinkedList();
            while (th != null) {
                linkedList.push(th);
                th = th.getCause();
            }
            th2 = null;
            z = false;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String className = stackTraceElement.getClassName();
                    String fileName = stackTraceElement.getFileName();
                    if ((TextUtils.isEmpty(fileName) || !fileName.startsWith(":com.google.android.gms")) && !sqr.m35998a()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z |= z2;
                    if (!z2 && !m36055a(className)) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
                if (th2 != null) {
                    th2 = new Throwable("<filtered>", th2);
                } else {
                    th2 = new Throwable("<filtered>");
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        if (z) {
            return th2;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        return;
     */
    /* renamed from: a */
    public static synchronized void m36052a(Context context, String str, String str2, int i, Throwable th) {
        int i2;
        synchronized (sqx.class) {
            sdo.m34959a(context);
            if (!stm.m36302d(str)) {
                int hashCode = str.hashCode();
                if (th != null) {
                    i2 = th.hashCode();
                } else {
                    i2 = f45011c;
                }
                if (f45010b == hashCode) {
                    if (f45011c == i2) {
                        return;
                    }
                }
                f45010b = hashCode;
                f45011c = i2;
                DropBoxManager dropBoxManager = (DropBoxManager) context.getSystemService("dropbox");
                if (dropBoxManager != null && dropBoxManager.isTagEnabled("system_app_crash")) {
                    dropBoxManager.addText("system_app_crash", m36050a(context, str, str2, i));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m36053a(Context context, Throwable th) {
        m36054a(context, th, 536870912);
    }

    /* renamed from: a */
    public static void m36054a(Context context, Throwable th, int i) {
        try {
            sdo.m34959a(context);
            sdo.m34959a(th);
            if (!sqr.m35998a()) {
                th = m36051a(th);
                if (th == null) {
                    return;
                }
            }
            m36052a(context, Log.getStackTraceString(th), ssy.m36271a(), i, th);
        } catch (Exception e) {
            try {
                if (sqr.m35998a()) {
                    throw e;
                }
            } catch (Exception e2) {
                Log.e("CrashUtils", "Error determining which process we're running in!", e2);
            }
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    /* renamed from: a */
    public static boolean m36055a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f45009a) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
