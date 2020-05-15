package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;

/* renamed from: bje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bje {
    /* renamed from: a */
    public static void m3181a(byte b, int i, String str) {
        int i2;
        if (str == null) {
            str = "Couldnt get last TA message";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        if (bytes.length > 256) {
            bytes = Arrays.copyOfRange(bytes, 0, (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        int length = bytes.length;
        int i3 = length + 7;
        byte[] bArr = new byte[i3];
        bArr[0] = 2;
        bArr[1] = (byte) (i3 - 2);
        bArr[2] = b;
        System.arraycopy(ByteBuffer.allocate(4).putInt(i).array(), 0, bArr, 3, 4);
        System.arraycopy(bytes, 0, bArr, 7, length);
        bix a = biy.m3166a();
        byte[] g = a.mo3189g(335639);
        if (g != null) {
            i2 = g.length + i3;
        } else {
            i2 = i3;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        if (g != null) {
            System.arraycopy(g, 0, bArr2, i3, g.length);
        }
        a.mo3179b(335639, bArr2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bji.a(byte[], int, short):short
     arg types: [byte[], short, short]
     candidates:
      bji.a(byte[], int, byte):byte
      bji.a(byte[], int, long):int
      bji.a(byte[], int, short):short */
    /* renamed from: a */
    public static void m3182a(byte b, short s) {
        byte b2;
        byte b3 = b;
        bix a = biy.m3166a();
        byte[] g = a.mo3189g(335639);
        byte[] c = a.mo3182c(335631);
        byte[] c2 = a.mo3182c(335632);
        int i = 12;
        if (g != null) {
            i = 12 + g.length;
        }
        if (b3 != -88) {
            b2 = 0;
        } else {
            b2 = c != null ? (byte) (c.length + 2) : 2;
            if (c2 != null) {
                b2 = (byte) (b2 + c2.length);
            }
        }
        int i2 = i + b2;
        byte[] bArr = new byte[i2];
        byte b4 = 3;
        bArr[0] = 3;
        int a2 = bji.m3202a(bArr, 1, (short) (i2 - 3));
        if (g != null) {
            int length = g.length;
            System.arraycopy(g, 0, bArr, a2, length);
            a2 += length;
        }
        int i3 = a2 + 1;
        bArr[a2] = 0;
        if (b3 == -92) {
            b4 = 1;
        } else if (b3 == -88) {
            b4 = 2;
        } else if (b3 != -78) {
            b4 = b3 != -82 ? b3 == -54 ? (byte) 4 : 0 : 5;
        }
        bArr[i3] = b4;
        short a3 = bji.m3202a(bArr, (int) ((short) (i3 + 1)), s);
        byte[] array = ByteBuffer.allocate(8).putLong(new Date().getTime() / 1000).array();
        int length2 = array.length;
        System.arraycopy(Arrays.copyOfRange(array, length2 - 4, length2), 0, bArr, a3, 4);
        int i4 = a3 + 4;
        int i5 = i4 + 1;
        bArr[i4] = b2;
        if (b2 != 0) {
            int i6 = i5 + 1;
            byte[] bArr2 = a.f3347c;
            bArr[i5] = bArr2[38];
            byte b5 = bArr2[27];
            if (b5 == -25) {
                i5 = i6 + 1;
                bArr[i6] = 0;
            } else if (b5 == 19) {
                i5 = i6 + 1;
                bArr[i6] = 1;
            } else {
                i5 = i6 + 1;
                bArr[i6] = 2;
            }
            if (c2 != null) {
                int length3 = c2.length;
                System.arraycopy(c2, 0, bArr, i5, length3);
                i5 += length3;
            }
            if (c != null) {
                int length4 = c.length;
                System.arraycopy(c, 0, bArr, i5, length4);
                i5 += length4;
            }
        }
        byte[] g2 = a.mo3189g(335640);
        if (g2 != null) {
            i5 += g2.length;
        }
        byte[] bArr3 = new byte[i5];
        System.arraycopy(bArr, 0, bArr3, 0, i2);
        if (g2 != null) {
            System.arraycopy(g2, 0, bArr3, i2, g2.length);
        }
        a.mo3179b(335640, bArr3);
    }

    /* renamed from: a */
    public static void m3183a(String str, bii bii, long j) {
        byte b;
        bix a = biy.m3166a();
        byte[] g = a.mo3189g(335639);
        int i = 17;
        if (g != null) {
            i = 17 + g.length;
        }
        byte[] bArr = new byte[i];
        bArr[0] = 1;
        short a2 = bji.m3202a(bArr, 1, (short) (i - 3));
        if (g != null) {
            int length = g.length;
            System.arraycopy(g, 0, bArr, a2, length);
            a2 = (short) (a2 + length);
        }
        short s = (short) (a2 + 1);
        bArr[a2] = 0;
        String valueOf = String.valueOf(str);
        System.arraycopy(bji.m3204a(valueOf.length() == 0 ? new String("0") : "0".concat(valueOf)), 0, bArr, s, 4);
        short s2 = (short) (s + 4);
        if (bii != null) {
            b = (byte) bii.ordinal();
        } else {
            b = 0;
        }
        bArr[s2] = b;
        short a3 = (short) bji.m3196a(bArr, (short) (s2 + 1), j);
        bji.m3196a(bArr, a3, System.currentTimeMillis() / 1000);
        int i2 = (short) (a3 + 4);
        byte[] g2 = a.mo3189g(335640);
        if (g2 != null) {
            i2 = (short) (i2 + g2.length);
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        if (g2 != null) {
            System.arraycopy(g2, 0, bArr2, i, g2.length);
        }
        a.mo3179b(335640, bArr2);
    }
}
