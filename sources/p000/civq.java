package p000;

import org.whispersystems.curve25519.Curve25519;
import org.whispersystems.curve25519.Curve25519KeyPair;

/* renamed from: civq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class civq {
    /* renamed from: a */
    public static civr m151050a(byte[] bArr) {
        return new civr(bArr);
    }

    /* renamed from: b */
    public static civs m151054b(byte[] bArr) {
        byte b = bArr[0] & 255;
        if (b == 5) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 1, bArr2, 0, 32);
            return new civs(bArr2);
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Bad key type: ");
        sb.append((int) b);
        throw new civg(sb.toString());
    }

    /* renamed from: a */
    public static civt m151051a() {
        Curve25519KeyPair generateKeyPair = Curve25519.getInstance(Curve25519.BEST).generateKeyPair();
        return new civt(new civs(generateKeyPair.getPublicKey()), new civr(generateKeyPair.getPrivateKey()));
    }

    /* renamed from: a */
    public static byte[] m151052a(civr civr, byte[] bArr) {
        return Curve25519.getInstance(Curve25519.BEST).calculateSignature(civr.f191538a, bArr);
    }

    /* renamed from: a */
    public static byte[] m151053a(civs civs, civr civr) {
        return Curve25519.getInstance(Curve25519.BEST).calculateAgreement(civs.f191539a, civr.f191538a);
    }
}
