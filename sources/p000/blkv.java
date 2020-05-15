package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: blkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blkv {
    /* renamed from: a */
    public static void m107314a(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new IOException("truncated input stream");
            }
        }
    }
}
