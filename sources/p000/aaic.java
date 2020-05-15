package p000;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: aaic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaic {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aaic.a(java.io.File, boolean):void
     arg types: [java.io.File, int]
     candidates:
      aaic.a(java.lang.String, java.io.File):java.io.File
      aaic.a(java.io.File, byte[]):boolean
      aaic.a(java.io.File, boolean):void */
    /* renamed from: a */
    public static File m21295a(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        m21298a(file2, false);
        return file2;
    }

    /* renamed from: b */
    public static void m21301b(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    m21301b(file2);
                }
            }
            file.delete();
        }
    }

    /* renamed from: a */
    public static File m21296a(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(m21295a(str, file), str2);
    }

    /* renamed from: a */
    public static String m21297a(byte[] bArr) {
        int length;
        if (!(bArr == null || (length = bArr.length) == 0)) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                instance.update(bArr, 0, length);
                return srv.m36160a(instance.digest());
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m21298a(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: a */
    public static boolean m21299a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                srz.m36171a(fileOutputStream2);
                return true;
            } catch (IOException e) {
                fileOutputStream = fileOutputStream2;
                srz.m36171a(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                srz.m36171a(fileOutputStream);
                throw th;
            }
        } catch (IOException e2) {
            srz.m36171a(fileOutputStream);
            return false;
        } catch (Throwable th2) {
            th = th2;
            srz.m36171a(fileOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m21300a(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] k = bxtx.m123256a(fileInputStream).mo73780k();
                srz.m36171a((Closeable) fileInputStream);
                return k;
            } catch (IOException e) {
                srz.m36171a((Closeable) fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                srz.m36171a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (IOException e2) {
            fileInputStream = null;
            srz.m36171a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            srz.m36171a((Closeable) fileInputStream2);
            throw th;
        }
    }
}
