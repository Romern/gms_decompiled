package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* renamed from: ssl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssl {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029 A[SYNTHETIC, Splitter:B:16:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0032 A[SYNTHETIC, Splitter:B:22:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public static String m36243a(File file, String str) {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[((int) Math.min(1024L, file.length()))];
                fileInputStream2.read(bArr);
                String a = m36244a(bArr, str);
                try {
                    fileInputStream2.close();
                } catch (IOException e) {
                }
                return a;
            } catch (Exception e2) {
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                }
                throw th;
            }
        } catch (Exception e3) {
            if (fileInputStream != null) {
                return "";
            }
            try {
                fileInputStream.close();
                return "";
            } catch (IOException e4) {
                return "";
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static String m36244a(byte[] bArr, String str) {
        MessageDigest b = spn.m35868b(str);
        return b != null ? srv.m36164d(b.digest(bArr)).toLowerCase() : "";
    }
}
