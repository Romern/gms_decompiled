package p000;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: ssy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssy {

    /* renamed from: a */
    private static String f45109a = null;

    /* renamed from: b */
    private static int f45110b = 0;

    /* renamed from: a */
    public static String m36271a() {
        if (f45109a == null) {
            if (f45110b == 0) {
                f45110b = Process.myPid();
            }
            f45109a = m36272a(f45110b);
        }
        return f45109a;
    }

    /* renamed from: a */
    static String m36272a(int i) {
        BufferedReader bufferedReader;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        String str = null;
        str = null;
        BufferedReader bufferedReader2 = null;
        str = null;
        if (i > 0) {
            try {
                StringBuilder sb = new StringBuilder(25);
                sb.append("/proc/");
                sb.append(i);
                sb.append("/cmdline");
                String sb2 = sb.toString();
                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                bufferedReader = new BufferedReader(new FileReader(sb2));
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                try {
                    str = bufferedReader.readLine().trim();
                } catch (IOException e) {
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    srz.m36171a(bufferedReader2);
                    throw th;
                }
            } catch (IOException e2) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                srz.m36171a(bufferedReader2);
                throw th;
            }
            srz.m36171a(bufferedReader);
        }
        return str;
    }
}
