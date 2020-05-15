package p000;

import android.util.Base64;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: enn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class enn {
    /* renamed from: a */
    public static enl m10771a(InputStream inputStream, OutputStream outputStream, int i) {
        String str;
        if (i != 1) {
            str = "SHA-256";
        } else {
            str = "SHA-1";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[8192];
            long j = 0;
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        return new enl(Base64.encodeToString(instance.digest(), 11), j);
                    }
                    if (outputStream != null) {
                        outputStream.write(bArr, 0, read);
                    }
                    instance.update(bArr, 0, read);
                    j += (long) read;
                } finally {
                    inputStream.close();
                }
            }
        } catch (NoSuchAlgorithmException e) {
            inputStream.close();
            return null;
        }
    }
}
