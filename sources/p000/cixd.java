package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;

/* renamed from: cixd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cixd {
    /* renamed from: a */
    public static byte m151106a(int i) {
        return (byte) (((i << 4) | 3) & 255);
    }

    /* renamed from: a */
    public static int m151107a(byte b) {
        return (b & 255) >> 4;
    }

    /* renamed from: a */
    public static byte[] m151108a(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                byteArrayOutputStream.write(bArr2);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static byte[][] m151109a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArr3 = new byte[i2];
        byte[][] bArr4 = {bArr2, bArr3};
        System.arraycopy(bArr, i, bArr3, 0, i2);
        return bArr4;
    }

    /* renamed from: a */
    public static byte[][] m151110a(byte[] bArr, int i, int i2, int i3) {
        String str;
        if (bArr != null && i2 >= 0) {
            int i4 = i + i2;
            if (bArr.length >= i4 + i3) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, i, bArr3, 0, i2);
                byte[] bArr4 = new byte[i3];
                byte[][] bArr5 = {bArr2, bArr3, bArr4};
                System.arraycopy(bArr, i4, bArr4, 0, i3);
                return bArr5;
            }
        }
        if (bArr != null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArr) {
                stringBuffer.append("(byte)0x");
                stringBuffer.append(cixe.f191668a[(b >> 4) & 15]);
                stringBuffer.append(cixe.f191668a[b & 15]);
                stringBuffer.append(", ");
            }
            str = stringBuffer.toString();
        } else {
            str = null;
        }
        String valueOf = String.valueOf(str);
        throw new ParseException(valueOf.length() == 0 ? new String("Input too small: ") : "Input too small: ".concat(valueOf), 0);
    }
}
