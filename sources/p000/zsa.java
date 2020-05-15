package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: zsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zsa {
    /* renamed from: a */
    public static int m46135a(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            int i2 = (bArr[i] & 255) - (bArr2[i] & 255);
            if (i2 != 0) {
                return i2;
            }
        }
        return bArr.length - bArr2.length;
    }

    /* renamed from: b */
    public static String m46140b(byte[] bArr) {
        return new String(bArr, 0, m46141c(bArr), Charset.forName("UTF-8"));
    }

    /* renamed from: c */
    private static int m46141c(byte[] bArr) {
        return bArr.length - 9;
    }

    /* renamed from: a */
    public static long m46136a(byte[] bArr) {
        long j = 0;
        for (int c = m46141c(bArr) + 1; c < bArr.length; c++) {
            j = (j << 8) + ((long) (bArr[c] & 255));
        }
        return j;
    }

    /* renamed from: a */
    public static byte[] m46137a(caae caae, long j) {
        return m46139a(caae.f172326b, j);
    }

    /* renamed from: a */
    public static byte[] m46138a(cadn cadn) {
        caae caae = cadn.f172705e;
        if (caae == null) {
            caae = caae.f172323i;
        }
        return m46137a(caae, cadn.f172702b);
    }

    /* renamed from: a */
    public static byte[] m46139a(String str, long j) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte[] bArr = new byte[(bytes.length + 9)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.put(bytes);
        wrap.put((byte) 0);
        wrap.putLong(j);
        wrap.flip();
        wrap.get(bArr);
        return bArr;
    }
}
