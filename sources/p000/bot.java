package p000;

import java.io.InputStream;
import java.math.BigInteger;

/* renamed from: bot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bot {

    /* renamed from: a */
    public static final /* synthetic */ int f5284a = 0;

    static {
        citv.m151011a(bot.class);
    }

    /* renamed from: a */
    public static final boz m3421a(InputStream inputStream) {
        byte[] bArr;
        int read = inputStream.read();
        if (read >= 8) {
            bArr = new byte[read];
            int read2 = inputStream.read(bArr);
            if (read2 != read) {
                Object[] objArr = {Integer.valueOf(read2), Integer.valueOf(read)};
                int i = cbd.f6383a;
                bou bou = bou.UNEXPECTED_END_OF_FILE;
                throw new bov();
            }
        } else if (read < 0) {
            bArr = null;
        } else {
            bou bou2 = bou.UNEXPECTED_END_OF_FILE;
            throw new bov();
        }
        if (bArr == null) {
            return null;
        }
        byte b = bArr[1];
        if (b != 0) {
            byte b2 = bArr[2];
            if (b2 >= 2) {
                int i2 = (b * b2) + 3;
                if (i2 + 3 == bArr.length) {
                    try {
                        byte b3 = bArr[i2];
                        bos[] values = bos.values();
                        int length = values.length;
                        int i3 = 0;
                        while (i3 < length) {
                            bos bos = values[i3];
                            if (bos.f5283d != b3) {
                                i3++;
                            } else {
                                BigInteger[] bigIntegerArr = new BigInteger[b2];
                                for (int i4 = 0; i4 < b2; i4++) {
                                    byte[] bArr2 = new byte[b];
                                    System.arraycopy(bArr, (i4 * b) + 3, bArr2, 0, b);
                                    bigIntegerArr[i4] = new BigInteger(1, bArr2);
                                }
                                boz boz = new boz();
                                boz.f5299a = bArr[0] & 255;
                                boz.f5300b = b & 255;
                                boz.f5301c = b2 & 255;
                                boz.f5302d = bigIntegerArr;
                                boz.f5303e = bos;
                                boz.f5304f = bArr[i2 + 1] & 255;
                                boz.f5305g = bArr[i2 + 2] & 255;
                                return boz;
                            }
                        }
                        throw new IllegalArgumentException();
                    } catch (IllegalArgumentException e) {
                        bou bou3 = bou.UNEXPECTED_END_OF_FILE;
                        throw new bov(e);
                    }
                } else {
                    bou bou4 = bou.UNEXPECTED_END_OF_FILE;
                    throw new bov();
                }
            } else {
                bou bou5 = bou.UNEXPECTED_END_OF_FILE;
                throw new bov();
            }
        } else {
            bou bou6 = bou.UNEXPECTED_END_OF_FILE;
            throw new bov();
        }
    }
}
