package p000;

import com.felicanetworks.mfc.Felica;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

/* renamed from: aqgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqgx {

    /* renamed from: a */
    private static final Random f86094a = new Random();

    /* renamed from: a */
    public static double m71595a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return d / 8.64E7d;
    }

    /* renamed from: a */
    public static int m71596a(int i) {
        return i * 1000;
    }

    /* renamed from: b */
    public static int m71599b(int i) {
        return i * Felica.MAX_TIMEOUT;
    }

    /* renamed from: a */
    static void m71597a(byte[] bArr, InputStream inputStream) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i < length) {
                int read = inputStream.read(bArr, i, length - i);
                if (read >= 0) {
                    i += read;
                } else {
                    throw new IOException("Attempted to read past end of stream");
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m71598a() {
        byte[] bArr = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        f86094a.nextBytes(bArr);
        return bArr;
    }
}
