package p000;

import android.util.Log;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: zyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyh {

    /* renamed from: a */
    public static final zyh f56175a = new zyh(null);

    /* renamed from: b */
    private final File f56176b;

    public zyh() {
    }

    /* renamed from: a */
    public static void m46680a(String str, String str2, Object... objArr) {
        zyh zyh = f56175a;
        if (Log.isLoggable(str, 5)) {
            Log.w(str, zyh.mo31589a(str2, objArr));
        }
        zyh.mo31590a("W", str, zyh.mo31589a(str2, objArr), (Throwable) null);
    }

    /* renamed from: b */
    public static void m46682b(String str, String str2, Object... objArr) {
        zyh zyh = f56175a;
        if (Log.isLoggable(str, 4)) {
            Log.i(str, zyh.mo31589a(str2, objArr));
        }
        zyh.mo31590a("I", str, zyh.mo31589a(str2, objArr), (Throwable) null);
    }

    /* renamed from: c */
    public static void m46683c(String str, String str2, Object... objArr) {
        zyh zyh = f56175a;
        zyh.mo31590a("D", str, zyh.mo31589a(str2, objArr), (Throwable) null);
    }

    public zyh(byte[] bArr) {
        File file = new File("/data/local/tmp/fonts-module.log");
        this.f56176b = !file.exists() ? null : file;
    }

    /* renamed from: a */
    public static void m46681a(String str, Throwable th, String str2, Object... objArr) {
        zyh zyh = f56175a;
        if (Log.isLoggable(str, 5)) {
            Log.w(str, zyh.mo31589a(str2, objArr), th);
        }
        zyh.mo31590a("W", str, zyh.mo31589a(str2, objArr), th);
    }

    /* renamed from: a */
    public final String mo31589a(String str, Object... objArr) {
        try {
            return String.format(Locale.ENGLISH, str, objArr);
        } catch (IllegalFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(Locale.ENGLISH, "Illegal log format [%s] args [", str));
            for (Object obj : objArr) {
                sb.append(String.format(Locale.ENGLISH, "%s ", obj));
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.PrintWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileWriter.<init>(java.lang.String, boolean):void throws java.io.IOException}
      ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo31590a(String str, String str2, String str3, Throwable th) {
        FileWriter fileWriter;
        FileWriter fileWriter2;
        FileWriter fileWriter3;
        FileWriter fileWriter4;
        PrintWriter printWriter;
        File file = this.f56176b;
        if (file != null) {
            FileWriter fileWriter5 = null;
            r3 = null;
            FileWriter fileWriter6 = null;
            try {
                fileWriter = new FileWriter(file, true);
                try {
                    printWriter = new PrintWriter(fileWriter);
                } catch (IOException e) {
                    e = e;
                    fileWriter4 = null;
                    fileWriter5 = fileWriter;
                    fileWriter3 = fileWriter4;
                    try {
                        m46681a("FontsLogger", e, "Unable to write %s", this.f56176b);
                        srz.m36171a(fileWriter3);
                        srz.m36171a(fileWriter5);
                    } catch (Throwable th2) {
                        th = th2;
                        fileWriter = fileWriter5;
                        fileWriter2 = fileWriter3;
                        fileWriter6 = fileWriter2;
                        srz.m36171a(fileWriter6);
                        srz.m36171a(fileWriter);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    srz.m36171a(fileWriter6);
                    srz.m36171a(fileWriter);
                    throw th;
                }
                try {
                    StringBuilder sb = new StringBuilder(str.length() + 3 + str2.length() + String.valueOf(str3).length());
                    sb.append(str);
                    sb.append(" ");
                    sb.append(str2);
                    sb.append(" ");
                    sb.append(str3);
                    sb.append("\n");
                    printWriter.append((CharSequence) sb.toString());
                    if (th != null) {
                        bqye.m113760a(th, printWriter);
                    }
                    printWriter.flush();
                    srz.m36171a(printWriter);
                    srz.m36171a(fileWriter);
                } catch (IOException e2) {
                    e = e2;
                    fileWriter4 = printWriter;
                    fileWriter5 = fileWriter;
                    fileWriter3 = fileWriter4;
                    m46681a("FontsLogger", e, "Unable to write %s", this.f56176b);
                    srz.m36171a(fileWriter3);
                    srz.m36171a(fileWriter5);
                } catch (Throwable th4) {
                    th = th4;
                    fileWriter2 = printWriter;
                    fileWriter6 = fileWriter2;
                    srz.m36171a(fileWriter6);
                    srz.m36171a(fileWriter);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                fileWriter3 = null;
                m46681a("FontsLogger", e, "Unable to write %s", this.f56176b);
                srz.m36171a(fileWriter3);
                srz.m36171a(fileWriter5);
            } catch (Throwable th5) {
                th = th5;
                fileWriter = null;
                srz.m36171a(fileWriter6);
                srz.m36171a(fileWriter);
                throw th;
            }
        }
    }
}
