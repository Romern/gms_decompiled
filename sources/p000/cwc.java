package p000;

import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: cwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cwc {

    /* renamed from: a */
    private static final Random f12229a = new Random();

    /* renamed from: a */
    public static String m7742a(String str, String str2) {
        boolean z;
        if (cwd.m7751a((CharSequence) str) || str.length() != 32) {
            z = true;
        } else {
            z = false;
        }
        cvx.m7698b(z, "error");
        byte[] b = cvz.m7720b(str.substring(0, 16));
        byte[] b2 = cvz.m7720b(str.substring(16));
        Cipher a = m7744a(b, 1);
        Cipher a2 = m7744a(b2, 2);
        byte[] b3 = cvz.m7720b(str2);
        byte[] b4 = cvz.m7722b(b3, Byte.MIN_VALUE, cvz.m7709a((((-(b3.length + 1)) % 8) + 8) % 8, (byte) 0));
        byte[] doFinal = a.doFinal(b4, 0, b4.length);
        return cvz.m7704a(a.doFinal(a2.doFinal(doFinal, doFinal.length - 8, 8), 0, 8));
    }

    /* renamed from: a */
    public static String m7743a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        String c = cwd.m7754c(cvz.m7704a(bArr), 12);
        String c2 = cwd.m7754c(cvz.m7704a(bArr2), 4);
        String c3 = cwd.m7754c(cvz.m7704a(bArr3), 8);
        String c4 = cwd.m7754c(cvz.m7704a(bArr4), 4);
        String a = cvz.m7704a(bArr5);
        int length = String.valueOf(c).length();
        int length2 = String.valueOf(c2).length();
        int length3 = String.valueOf(c3).length();
        StringBuilder sb = new StringBuilder(length + length2 + length3 + String.valueOf(c4).length() + a.length());
        sb.append(c);
        sb.append(c2);
        sb.append(c3);
        sb.append(c4);
        sb.append(a);
        return sb.toString();
    }

    /* renamed from: a */
    private static Cipher m7744a(byte[] bArr, int i) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "DES");
        Cipher instance = Cipher.getInstance("DES/CBC/NoPadding");
        instance.init(i, secretKeySpec, new IvParameterSpec(new byte[8]));
        return instance;
    }

    /* renamed from: a */
    public static byte[] m7745a() {
        byte[] bArr = new byte[8];
        f12229a.nextBytes(bArr);
        return bArr;
    }
}
