package p000;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: apyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apyx {

    /* renamed from: a */
    String f85198a;

    /* renamed from: b */
    long f85199b;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037 A[SYNTHETIC, Splitter:B:15:0x0037] */
    public apyx(File file) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                this.f85198a = m71204a("SIGNATURE:", bufferedReader.readLine());
                this.f85199b = Long.parseLong(m71204a("VERSION:", bufferedReader.readLine()), 10);
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                }
            } catch (Throwable th) {
                th = th;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            if (bufferedReader != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static final String m71204a(String str, String str2) {
        if (str2 != null && str2.startsWith(str)) {
            return str2.substring(str.length());
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (str2 == null) {
            str2 = "unavailable";
        }
        objArr[1] = str2;
        throw new IOException(String.format("Line from metadata malformed for %s, line: %s", objArr));
    }
}
