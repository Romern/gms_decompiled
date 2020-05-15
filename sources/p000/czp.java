package p000;

import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: czp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class czp {

    /* renamed from: a */
    private static final Random f12453a = new Random();

    /* renamed from: a */
    public static String m8033a(String str, String str2) {
        boolean z;
        if (czq.m8041a((CharSequence) str) || str.length() != 32) {
            z = true;
        } else {
            z = false;
        }
        czl.m8004b(z, "error");
        byte[] a = czm.m8012a(str.substring(0, 16));
        byte[] a2 = czm.m8012a(str.substring(16));
        Cipher a3 = m8035a(a, 1);
        Cipher a4 = m8035a(a2, 2);
        byte[] a5 = czm.m8012a(str2);
        byte[] a6 = czm.m8016a(a5, Byte.MIN_VALUE, czm.m8011a((((-(a5.length + 1)) % 8) + 8) % 8));
        byte[] doFinal = a3.doFinal(a6, 0, a6.length);
        return czm.m8019b(a3.doFinal(a4.doFinal(doFinal, doFinal.length - 8, 8), 0, 8));
    }

    /* renamed from: a */
    public static String m8034a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        String d = czq.m8045d(czm.m8019b(bArr), 12);
        String d2 = czq.m8045d(czm.m8019b(bArr2), 4);
        String d3 = czq.m8045d(czm.m8019b(bArr3), 8);
        String d4 = czq.m8045d(czm.m8019b(bArr4), 4);
        String b = czm.m8019b(bArr5);
        int length = String.valueOf(d).length();
        int length2 = String.valueOf(d2).length();
        int length3 = String.valueOf(d3).length();
        StringBuilder sb = new StringBuilder(length + length2 + length3 + String.valueOf(d4).length() + b.length());
        sb.append(d);
        sb.append(d2);
        sb.append(d3);
        sb.append(d4);
        sb.append(b);
        return sb.toString();
    }

    /* renamed from: a */
    private static Cipher m8035a(byte[] bArr, int i) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "DES");
        Cipher instance = Cipher.getInstance("DES/CBC/NoPadding");
        instance.init(i, secretKeySpec, new IvParameterSpec(new byte[8]));
        return instance;
    }

    /* renamed from: a */
    public static byte[] m8036a() {
        byte[] bArr = new byte[8];
        f12453a.nextBytes(bArr);
        return bArr;
    }
}
