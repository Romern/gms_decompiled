package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: bxwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxwd {

    /* renamed from: a */
    static final Charset f164980a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f164981b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f164981b = bArr;
        ByteBuffer.wrap(bArr);
        bxuc.m123419a(f164981b);
    }

    /* renamed from: a */
    static int m124078a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: a */
    public static int m124079a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m124080a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static String m124086b(byte[] bArr) {
        return new String(bArr, f164980a);
    }

    /* renamed from: c */
    public static int m124087c(byte[] bArr) {
        int length = bArr.length;
        int a = m124078a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    static Object m124081a(Object obj, Object obj2) {
        bxxb aM = ((bxxc) obj).mo73645aM();
        aM.mo73628a((bxxc) obj2);
        return aM.mo74057h();
    }

    /* renamed from: a */
    static void m124082a(bxxc bxxc) {
        if (bxxc instanceof bxta) {
            bxta bxta = (bxta) bxxc;
            throw null;
        }
    }

    /* renamed from: a */
    static void m124083a(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    /* renamed from: a */
    static void m124084a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: a */
    public static boolean m124085a(byte[] bArr) {
        return bxzd.f165126a.mo74331a(bArr, 0, bArr.length);
    }
}
