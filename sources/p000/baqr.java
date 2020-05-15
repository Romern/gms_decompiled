package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: baqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baqr {
    /* renamed from: a */
    public static long m87409a(ByteString bxtx) {
        return bxtx.mo73760e().getLong();
    }

    /* renamed from: b */
    public static Long m87413b(ByteString bxtx) {
        if (bxtx != null) {
            return Long.valueOf(m87409a(bxtx));
        }
        return null;
    }

    /* renamed from: a */
    public static long m87410a(ByteString bxtx, long j) {
        return bxtx != null ? m87409a(bxtx) : j;
    }

    /* renamed from: a */
    public static ByteString m87411a(long j) {
        ByteBuffer putLong = ByteBuffer.allocate(8).putLong(j);
        putLong.flip();
        return ByteString.m123263b(putLong);
    }

    /* renamed from: a */
    public static byte[] m87412a(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            if ((bArr[length] & 255) != 255) {
                byte[] copyOf = Arrays.copyOf(bArr, length + 1);
                copyOf[length] = (byte) (copyOf[length] + 1);
                return copyOf;
            }
        }
        return null;
    }
}
