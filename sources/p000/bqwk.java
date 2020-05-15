package p000;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: bqwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqwk {
    /* renamed from: a */
    public static String m113519a(int i) {
        String a = bqvx.m113499a(i);
        int i2 = bqwl.f141725a;
        StringBuilder sb = new StringBuilder(a.length() + 9);
        sb.append(a);
        sb.append("withECDSA");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m113524b(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? "SHA-512" : "SHA-384" : "SHA-256";
    }

    /* renamed from: a */
    public static BigInteger m113520a(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    /* renamed from: a */
    public static boolean m113521a() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: a */
    public static byte[] m113522a(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (length > i2) {
            throw new GeneralSecurityException("integer too large");
        } else if (length != i2) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, 0, bArr, i - length, length);
            return bArr;
        } else if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, length);
        } else {
            throw new GeneralSecurityException("integer too large");
        }
    }

    /* renamed from: a */
    public static byte[] m113523a(byte[] bArr, int i, int i2) {
        MessageDigest messageDigest = (MessageDigest) bqvo.f141692d.mo69341a(m113524b(i2));
        int digestLength = messageDigest.getDigestLength();
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 <= (i - 1) / digestLength; i4++) {
            messageDigest.reset();
            messageDigest.update(bArr);
            messageDigest.update(m113522a(BigInteger.valueOf((long) i4), 4));
            byte[] digest = messageDigest.digest();
            int length = digest.length;
            System.arraycopy(digest, 0, bArr2, i3, Math.min(length, i - i3));
            i3 += length;
        }
        return bArr2;
    }
}
