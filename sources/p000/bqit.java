package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: bqit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqit {

    /* renamed from: a */
    public static final byte[] f140896a = new byte[1024];

    /* renamed from: b */
    public static final int[] f140897b = new int[1024];

    /* renamed from: a */
    static int m112903a(InputStream inputStream, byte[] bArr, int i, int i2) {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (IOException e) {
            throw new bqil("Failed to read input", e);
        }
    }

    /* renamed from: a */
    static void m112904a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(bArr, i2, bArr, i, i3 - i2);
    }
}
