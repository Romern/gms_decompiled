package p000;

import java.nio.ByteBuffer;

/* renamed from: bxzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxzd {

    /* renamed from: a */
    public static final bxyz f165126a;

    /* renamed from: a */
    public static int m124551a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: a */
    public static int m124552a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: a */
    public static int m124553a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: b */
    public static int m124558b(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m124551a(b);
        }
        if (i3 == 1) {
            return m124552a(b, bArr[i]);
        }
        if (i3 == 2) {
            return m124553a(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    static String m124559c(byte[] bArr, int i, int i2) {
        return f165126a.mo74332b(bArr, i, i2);
    }

    static {
        bxyz bxyz;
        if (bxyx.f165117c && bxyx.f165116b && !bxtd.m123131a()) {
            bxyz = new bxzc();
        } else {
            bxyz = new bxza();
        }
        f165126a = bxyz;
    }

    /* renamed from: a */
    static int m124554a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new bxzb(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static int m124555a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f165126a.mo74328a(charSequence, bArr, i, i2);
    }

    /* renamed from: a */
    static void m124556a(CharSequence charSequence, ByteBuffer byteBuffer) {
        bxyz bxyz = f165126a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m124555a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            bxyz.mo74330a(charSequence, byteBuffer);
        } else {
            bxyz.m124533b(charSequence, byteBuffer);
        }
    }

    /* renamed from: a */
    public static boolean m124557a(byte[] bArr, int i, int i2) {
        return f165126a.mo74331a(bArr, i, i2);
    }
}
