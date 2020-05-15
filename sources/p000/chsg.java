package p000;

import java.nio.charset.Charset;

/* renamed from: chsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chsg {

    /* renamed from: a */
    public static final Charset f189090a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final boan f189091b = chtr.f189135c;

    /* renamed from: a */
    public static chtn m149481a(String str, chsf chsf) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return chtn.m149537a(str, z, chsf);
    }

    /* renamed from: b */
    public static int m149484b(chtr chtr) {
        return chtr.f189137e;
    }

    /* renamed from: a */
    public static chtr m149482a(byte[]... bArr) {
        return new chtr(bArr.length >> 1, (Object[]) bArr);
    }

    /* renamed from: a */
    public static byte[][] m149483a(chtr chtr) {
        byte[][] bArr = new byte[chtr.mo85646a()][];
        Object[] objArr = chtr.f189136d;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, chtr.mo85646a());
        } else {
            for (int i = 0; i < chtr.f189137e; i++) {
                int i2 = i + i;
                bArr[i2] = chtr.mo85651a(i);
                bArr[i2 + 1] = chtr.mo85654b(i);
            }
        }
        return bArr;
    }
}
