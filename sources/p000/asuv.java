package p000;

import java.io.ByteArrayOutputStream;

/* renamed from: asuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asuv {
    /* renamed from: a */
    public static long m74875a(byte[] bArr) {
        byte b;
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int length = bArr.length;
            if (i >= length + length) {
                return j;
            }
            b = i % 2 == 0 ? (bArr[i / 2] >>> 4) & 15 : bArr[i / 2] & 15;
            if (b != 15) {
                if (b <= 9 && !z2) {
                    j = (j * 10) + ((long) b);
                    z = true;
                }
            } else if (z) {
                z2 = true;
            }
            i++;
        }
        throw new IllegalArgumentException(String.format("Invalid BCD: %s digit: %d", boan.f132472f.mo68794a(bArr), Integer.valueOf(b)));
    }

    /* renamed from: a */
    public static byte[] m74876a(String str) {
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        int length = charArray.length;
        byte b = 0;
        boolean z = true;
        for (int i = 0; i < length; i++) {
            byte b2 = (byte) (charArray[i] - '0');
            if (!z) {
                b = (byte) (b | b2);
                byteArrayOutputStream.write(b);
            } else {
                b = (byte) (b2 << 4);
            }
            z = !z;
        }
        if (!z) {
            byteArrayOutputStream.write((byte) (b | 15));
        }
        return byteArrayOutputStream.toByteArray();
    }
}
