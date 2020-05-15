package p000;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: btue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btue {
    /* renamed from: a */
    public static int m117146a(InputStream inputStream) {
        int i = 0;
        int i2 = 0;
        while (i < 32) {
            int read = inputStream.read();
            i2 |= (read & 127) << i;
            i += 7;
            if ((read & 128) == 0) {
                return i2;
            }
        }
        throw new IndexOutOfBoundsException("varint too long");
    }

    /* renamed from: a */
    public static int m117147a(ByteBuffer byteBuffer) {
        int i;
        byte b = byteBuffer.get();
        if (b >= 0) {
            return b;
        }
        byte b2 = b & Byte.MAX_VALUE;
        byte b3 = byteBuffer.get();
        if (b3 < 0) {
            b2 |= (b3 & Byte.MAX_VALUE) << 7;
            byte b4 = byteBuffer.get();
            if (b4 < 0) {
                b2 |= (b4 & Byte.MAX_VALUE) << 14;
                byte b5 = byteBuffer.get();
                if (b5 < 0) {
                    byte b6 = byteBuffer.get();
                    byte b7 = b2 | ((b5 & Byte.MAX_VALUE) << 21) | (b6 << 28);
                    while (b6 < 0) {
                        b6 = byteBuffer.get();
                    }
                    return b7;
                }
                i = b5 << 21;
            } else {
                i = b4 << 14;
            }
        } else {
            i = b3 << 7;
        }
        return b2 | i;
    }

    /* renamed from: a */
    public static void m117148a(int i, OutputStream outputStream) {
        int i2;
        int i3 = i;
        int i4 = 0;
        do {
            i4++;
            i3 >>>= 7;
        } while (i3 != 0);
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (true) {
            int i6 = i & 127;
            i >>>= 7;
            if (i != 0) {
                i2 = 128;
            } else {
                i2 = 0;
            }
            int i7 = i5 + 1;
            bArr[i5] = (byte) (i6 + i2);
            if (i != 0) {
                i5 = i7;
            } else {
                outputStream.write(bArr);
                return;
            }
        }
    }
}
