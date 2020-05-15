package p000;

import java.io.UnsupportedEncodingException;

/* renamed from: bqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqd {
    static {
        bqd.class.getSimpleName();
    }

    private bqd() {
    }

    /* renamed from: a */
    public static String m3507a(byl byl, byte[] bArr, byte[] bArr2) {
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        byte b2;
        int i5;
        byte b3;
        byte b4;
        int i6;
        int i7;
        Object[] objArr = {byl, bArr, bArr2};
        int i8 = cbd.f6383a;
        byte[] b5 = cak.m3836b(cbb.m3882a(byl.mo3563i(), bArr, bArr2));
        try {
            int length = b5.length;
            cbi cbi = new cbi();
            int i9 = (length / 3) * 4;
            int i10 = length % 3;
            if (i10 == 1) {
                i9 += 2;
            } else if (i10 == 2) {
                i9 += 3;
            }
            cbi.f6385a = new byte[i9];
            byte[] bArr3 = cbi.f6393e;
            byte[] bArr4 = cbi.f6385a;
            int i11 = cbi.f6392d;
            int i12 = cbi.f6391c;
            if (i12 == 0) {
                b = -1;
                i = 0;
            } else if (i12 != 1) {
                if (i12 != 2) {
                    b = -1;
                    i = 0;
                } else if (length > 0) {
                    byte[] bArr5 = cbi.f6390b;
                    b = ((bArr5[1] & 255) << 8) | ((bArr5[0] & 255) << 16) | (b5[0] & 255);
                    cbi.f6391c = 0;
                    i = 1;
                } else {
                    b = -1;
                    i = 0;
                }
            } else if (length >= 2) {
                b = ((cbi.f6390b[0] & 255) << 16) | ((b5[0] & 255) << 8) | (b5[1] & 255);
                cbi.f6391c = 0;
                i = 2;
            } else {
                b = -1;
                i = 0;
            }
            if (b != -1) {
                bArr4[0] = bArr3[b >> 18];
                bArr4[1] = bArr3[(b >> 12) & 63];
                bArr4[2] = bArr3[(b >> 6) & 63];
                bArr4[3] = bArr3[b & 63];
                i11--;
                if (i11 != 0) {
                    i3 = 4;
                } else {
                    bArr4[4] = 10;
                    i3 = 5;
                    i11 = 19;
                }
            } else {
                i3 = 0;
            }
            while (true) {
                int i13 = i + 3;
                if (i13 > length) {
                    break;
                }
                byte b6 = ((b5[i] & 255) << 16) | ((b5[i + 1] & 255) << 8) | (b5[i + 2] & 255);
                bArr4[i3] = bArr3[b6 >> 18];
                bArr4[i3 + 1] = bArr3[(b6 >> 12) & 63];
                bArr4[i3 + 2] = bArr3[(b6 >> 6) & 63];
                bArr4[i3 + 3] = bArr3[b6 & 63];
                int i14 = i3 + 4;
                i2--;
                if (i2 != 0) {
                    i7 = i13;
                } else {
                    bArr4[i14] = 10;
                    i14++;
                    i7 = i13;
                    i2 = 19;
                }
            }
            int i15 = cbi.f6391c;
            int i16 = i - i15;
            if (i16 == length - 1) {
                if (i15 > 0) {
                    b2 = cbi.f6390b[0];
                    i4 = 1;
                } else {
                    b2 = b5[i];
                    i4 = 0;
                }
                int i17 = (b2 & 255) << 4;
                cbi.f6391c = i15 - i4;
                bArr4[i3] = bArr3[i17 >> 6];
                bArr4[i3 + 1] = bArr3[i17 & 63];
            } else if (i16 == length - 2) {
                if (i15 > 1) {
                    b3 = cbi.f6390b[0];
                    i5 = 1;
                } else {
                    byte b7 = b5[i];
                    i++;
                    b3 = b7;
                    i5 = 0;
                }
                int i18 = (b3 & 255) << 10;
                if (i15 > 0) {
                    i6 = i5 + 1;
                    b4 = cbi.f6390b[i5];
                } else {
                    b4 = b5[i];
                    i6 = i5;
                }
                int i19 = ((b4 & 255) << 2) | i18;
                cbi.f6391c = i15 - i6;
                int i20 = i3 + 1;
                bArr4[i3] = bArr3[i19 >> 12];
                bArr4[i20] = bArr3[(i19 >> 6) & 63];
                bArr4[i20 + 1] = bArr3[i19 & 63];
            }
            cbi.f6392d = i2;
            String str = new String(cbi.f6385a, "US-ASCII");
            new Object[1][0] = str;
            return str;
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
