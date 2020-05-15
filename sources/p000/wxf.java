package p000;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: wxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wxf {
    /* renamed from: a */
    public static byte[] m42444a(File file) {
        FileInputStream fileInputStream;
        sdo.m34960a();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            fileInputStream = new FileInputStream(file);
            while (true) {
                try {
                    int read = fileInputStream.read();
                    if (read == -1) {
                        byte[] b = aatb.m46965b(byteArrayOutputStream.toByteArray());
                        fileInputStream.close();
                        byteArrayOutputStream.close();
                        return b;
                    }
                    byteArrayOutputStream.write(read);
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            byteArrayOutputStream.close();
            throw th;
        }
    }
}
