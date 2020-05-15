package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.logging.Logger;

/* renamed from: cbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbm {

    /* renamed from: a */
    private static final char[] f6397a = new char[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: b */
    private static final char[] f6398b = new char[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: c */
    private static final String[] f6399c = new String[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    static {
        Logger.getLogger(cbm.class.getName());
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < 256; i++) {
            f6397a[i] = cArr[(i & 240) >> 4];
            f6398b[i] = cArr[i & 15];
            f6399c[i] = new String(new char[]{f6397a[i], f6398b[i]});
        }
    }

    private cbm() {
    }

    /* renamed from: a */
    public static String m3892a(byte b) {
        return b < 0 ? f6399c[b + 256] : f6399c[b];
    }

    /* renamed from: b */
    public static char[] m3897b(byte[] bArr, boolean z) {
        int i;
        int i2;
        if (bArr != null) {
            int length = bArr.length;
            if (!z) {
                i = 2;
            } else {
                i = 3;
            }
            char[] cArr = new char[(i * length)];
            int i3 = 0;
            if (!z) {
                int i4 = 0;
                while (i3 < length) {
                    byte b = bArr[i3];
                    if (b < 0) {
                        int i5 = b + 256;
                        int i6 = i4 + 1;
                        cArr[i4] = f6397a[i5];
                        i4 = i6 + 1;
                        cArr[i6] = f6398b[i5];
                    } else {
                        int i7 = i4 + 1;
                        cArr[i4] = f6397a[b];
                        i4 = i7 + 1;
                        cArr[i7] = f6398b[b];
                    }
                    i3++;
                }
            } else {
                int i8 = 0;
                while (i3 < length) {
                    byte b2 = bArr[i3];
                    if (b2 < 0) {
                        int i9 = b2 + 256;
                        int i10 = i8 + 1;
                        cArr[i8] = f6397a[i9];
                        i2 = i10 + 1;
                        cArr[i10] = f6398b[i9];
                    } else {
                        int i11 = i8 + 1;
                        cArr[i8] = f6397a[b2];
                        i2 = i11 + 1;
                        cArr[i11] = f6398b[b2];
                    }
                    cArr[i2] = ' ';
                    i3++;
                    i8 = i2 + 1;
                }
            }
            return cArr;
        }
        throw new IllegalArgumentException("Input is null.");
    }

    /* renamed from: a */
    public static String m3893a(byte[] bArr) {
        return m3895a(bArr, false);
    }

    /* renamed from: a */
    public static String m3894a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return m3895a(bArr2, true);
    }

    /* renamed from: a */
    public static String m3895a(byte[] bArr, boolean z) {
        return new String(m3897b(bArr, z));
    }

    /* renamed from: a */
    public static byte[] m3896a(CharSequence charSequence) {
        int i;
        int i2;
        if (charSequence != null) {
            int length = charSequence.length();
            int i3 = length / 2;
            byte[] bArr = new byte[i3];
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = i4 + 1;
                char charAt = charSequence.charAt(i4);
                if (Character.isWhitespace(charAt)) {
                    i4 = i6;
                } else if (i6 < length) {
                    if (charAt >= '0' && charAt <= '9') {
                        i = (charAt - '0') << 4;
                    } else if (charAt >= 'A' && charAt <= 'F') {
                        i = (charAt - '7') << 4;
                    } else if (charAt < 'a' || charAt > 'f') {
                        throw new cbk(charSequence, i6);
                    } else {
                        i = (charAt - 'W') << 4;
                    }
                    int i7 = i6 + 1;
                    char charAt2 = charSequence.charAt(i6);
                    if (charAt2 >= '0' && charAt2 <= '9') {
                        i2 = charAt2 - '0';
                    } else if (charAt2 >= 'A' && charAt2 <= 'F') {
                        i2 = charAt2 - '7';
                    } else if (charAt2 < 'a' || charAt2 > 'f') {
                        throw new cbk(charSequence, i7);
                    } else {
                        i2 = charAt2 - 'W';
                    }
                    bArr[i5] = (byte) (i | i2);
                    i5++;
                    i4 = i7;
                } else {
                    String str = (String) charSequence;
                    StringBuilder sb = new StringBuilder(str.length() + 48);
                    sb.append("input contains an odd number of hex characters. ");
                    sb.append(str);
                    throw new cbk(sb.toString());
                }
            }
            if (i3 == i5) {
                return bArr;
            }
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, 0, bArr2, 0, i5);
            return bArr2;
        }
        throw new cbk("Input is null.");
    }
}
