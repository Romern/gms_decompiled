package p000;

import java.util.Locale;

/* renamed from: buhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buhs {

    /* renamed from: a */
    public final int f153883a;

    /* renamed from: b */
    public final int f153884b;

    /* renamed from: c */
    public final int f153885c;

    /* renamed from: d */
    public final int f153886d;

    /* renamed from: e */
    public final buhr f153887e;

    /* renamed from: f */
    public final byte[] f153888f;

    private buhs(int i, int i2, int i3, int i4, buhr buhr, byte[] bArr) {
        if (m119544a(i2) && buhr == null) {
            throw new IllegalArgumentException("'messageHeader' cannot be null for 'first' fragment.");
        }
        this.f153883a = i;
        this.f153884b = i2;
        this.f153885c = i3;
        this.f153886d = i4;
        this.f153887e = buhr;
        this.f153888f = bArr;
    }

    /* renamed from: a */
    private static byte m119540a(int i, int i2, int i3) {
        return (byte) ((i & i3) << i2);
    }

    /* renamed from: a */
    private static int m119541a(byte b) {
        return b & 255;
    }

    /* renamed from: a */
    private static int m119542a(int i, int i2) {
        return (char) ((i << 8) | (i2 & 255));
    }

    /* renamed from: a */
    static boolean m119544a(int i) {
        return i == 0;
    }

    /* renamed from: b */
    private static byte m119546b(int i) {
        return (byte) ((i >> 8) & 255);
    }

    /* renamed from: c */
    private static byte m119547c(int i) {
        return (byte) (i & 255);
    }

    public final String toString() {
        return String.format(Locale.US, "MessageSequenceNumber=%d, FragmentSequenceNumber=%d(0x%X), FragmentLengthBytes=%d(0x%X), Flags=0x%X, MessageHeader:%s", Integer.valueOf(this.f153883a), Integer.valueOf(this.f153884b), Integer.valueOf(this.f153884b), Integer.valueOf(this.f153885c), Integer.valueOf(this.f153885c), Integer.valueOf(this.f153886d), this.f153887e);
    }

    /* renamed from: a */
    public static buhs m119543a(byte[] bArr) {
        buhr buhr;
        int i;
        byte[] bArr2;
        byte[] bArr3 = bArr;
        int length = bArr3 != null ? bArr3.length : 0;
        int i2 = 4;
        if (length < 4) {
            Locale locale = Locale.US;
            Object[] objArr = {Integer.valueOf(length), 4};
            return null;
        }
        byte b = bArr3[0];
        if (((b >> 2) & 3) == 0) {
            int i3 = (b >> 4) & 15;
            byte b2 = b & 3;
            int a = m119541a(bArr3[1]);
            int a2 = m119542a(bArr3[2], bArr3[3]);
            if (m119544a(a)) {
                i = a2 - 4;
                if (length < 8) {
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = {Integer.valueOf(length), 8};
                    return null;
                }
                byte b3 = bArr3[4];
                if (b3 != 0) {
                    new Object[1][0] = Byte.valueOf(b3);
                    return null;
                }
                buhr = new buhr(m119542a(bArr3[5], bArr3[6]), m119541a(bArr3[7]));
                i2 = 8;
            } else {
                buhr = null;
                i = a2;
            }
            int i4 = length - i2;
            if (i4 != i) {
                Locale locale3 = Locale.US;
                Object[] objArr3 = {Integer.valueOf(i4), Integer.valueOf(a2)};
                return null;
            }
            if (i4 > 0) {
                byte[] bArr4 = new byte[i4];
                System.arraycopy(bArr3, i2, bArr4, 0, i4);
                bArr2 = bArr4;
            } else {
                bArr2 = null;
            }
            return new buhs(i3, a, a2, b2, buhr, bArr2);
        }
        new Object[1][0] = Integer.valueOf(b);
        return null;
    }

    /* renamed from: a */
    public static byte[] m119545a(int i, int i2, int i3, int i4, int i5, byte[] bArr, int i6, int i7) {
        int i8;
        int i9;
        if (m119544a(i2)) {
            i9 = i7 + 4;
            i8 = 8;
        } else {
            i9 = i7;
            i8 = 4;
        }
        byte[] bArr2 = new byte[(i8 + i7)];
        bArr2[0] = (byte) (((byte) (m119540a(i, 4, 255) | m119540a(0, 2, 3))) | m119540a(i3, 0, 3));
        bArr2[1] = (byte) i2;
        bArr2[2] = m119546b(i9);
        bArr2[3] = m119547c(i9);
        if (m119544a(i2)) {
            bArr2[4] = 0;
            bArr2[5] = m119546b(i4);
            bArr2[6] = m119547c(i4);
            bArr2[7] = (byte) i5;
        }
        if (i7 != 0) {
            System.arraycopy(bArr, i6, bArr2, i8, i7);
        }
        return bArr2;
    }

    /* renamed from: a */
    public final boolean mo72690a() {
        return m119544a(this.f153884b);
    }
}
