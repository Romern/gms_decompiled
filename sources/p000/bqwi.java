package p000;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;

/* renamed from: bqwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqwi implements bqod {

    /* renamed from: a */
    private final RSAPrivateCrtKey f141716a;

    /* renamed from: b */
    private final RSAPublicKey f141717b;

    /* renamed from: c */
    private final int f141718c;

    /* renamed from: d */
    private final int f141719d;

    /* renamed from: e */
    private final int f141720e;

    public bqwi(RSAPrivateCrtKey rSAPrivateCrtKey, int i, int i2, int i3) {
        int i4 = bqwl.f141725a;
        bqwl.m113527b(rSAPrivateCrtKey.getModulus().bitLength());
        this.f141716a = rSAPrivateCrtKey;
        this.f141717b = (RSAPublicKey) ((KeyFactory) bqvo.f141695g.mo69341a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.f141719d = i;
        this.f141720e = i2;
        this.f141718c = i3;
    }

    /* renamed from: a */
    public final byte[] mo69316a(byte[] bArr) {
        byte[] bArr2;
        int bitLength = this.f141717b.getModulus().bitLength() - 1;
        int i = bqwl.f141725a;
        MessageDigest messageDigest = (MessageDigest) bqvo.f141692d.mo69341a(bqwk.m113524b(this.f141719d));
        byte[] digest = messageDigest.digest(bArr);
        int digestLength = messageDigest.getDigestLength();
        int i2 = ((bitLength - 1) / 8) + 1;
        int i3 = this.f141718c;
        if (i2 >= digestLength + i3 + 2) {
            byte[] a = bqwf.m113516a(i3);
            int i4 = digestLength + 8;
            byte[] bArr3 = new byte[(this.f141718c + i4)];
            System.arraycopy(digest, 0, bArr3, 8, digestLength);
            int length = a.length;
            System.arraycopy(a, 0, bArr3, i4, length);
            byte[] digest2 = messageDigest.digest(bArr3);
            int i5 = (i2 - digestLength) - 1;
            byte[] bArr4 = new byte[i5];
            int i6 = (i2 - this.f141718c) - digestLength;
            bArr4[i6 - 2] = 1;
            System.arraycopy(a, 0, bArr4, i6 - 1, length);
            byte[] a2 = bqwk.m113523a(digest2, i5, this.f141720e);
            byte[] bArr5 = new byte[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                bArr5[i7] = (byte) (bArr4[i7] ^ a2[i7]);
            }
            int i8 = 0;
            while (true) {
                bArr2 = bArr5;
                if (((long) i8) >= (((long) i2) * 8) - ((long) bitLength)) {
                    break;
                }
                int i9 = i8 / 8;
                bArr2[i9] = (byte) (bArr2[i9] & ((1 << (7 - (i8 % 8))) ^ -1));
                i8++;
                bArr5 = bArr2;
            }
            int i10 = digestLength + i5;
            byte[] bArr6 = new byte[(i10 + 1)];
            System.arraycopy(bArr2, 0, bArr6, 0, i5);
            System.arraycopy(digest2, 0, bArr6, i5, digest2.length);
            bArr6[i10] = -68;
            Cipher cipher = (Cipher) bqvo.f141689a.mo69341a("RSA/ECB/NOPADDING");
            cipher.init(2, this.f141716a);
            byte[] doFinal = cipher.doFinal(bArr6);
            Cipher cipher2 = (Cipher) bqvo.f141689a.mo69341a("RSA/ECB/NOPADDING");
            cipher2.init(1, this.f141717b);
            if (new BigInteger(1, bArr6).equals(new BigInteger(1, cipher2.doFinal(doFinal)))) {
                return doFinal;
            }
            throw new RuntimeException("Security bug: RSA signature computation error");
        }
        throw new GeneralSecurityException("encoding error");
    }
}
