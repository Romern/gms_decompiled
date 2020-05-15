package p000;

import android.text.TextUtils;
import android.util.Base64;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: awsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsm {

    /* renamed from: a */
    public static final Charset f95035a;

    /* renamed from: c */
    private static final byte[] f95036c;

    /* renamed from: d */
    private static final byte[] f95037d = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: e */
    private static final byte[] f95038e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: b */
    protected final String f95039b = "GmsCore_OpenSSL";

    /* renamed from: f */
    private final String f95040f = "GmsCore_OpenSSL";

    static {
        Charset forName = Charset.forName("UTF-8");
        f95035a = forName;
        f95036c = "Android".getBytes(forName);
    }

    /* renamed from: a */
    public static String m80954a(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    /* renamed from: b */
    private final ECPublicKey m80955b(ECPoint eCPoint) {
        try {
            KeyFactory instance = KeyFactory.getInstance("EC", this.f95039b);
            BigInteger bigInteger = new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951");
            return (ECPublicKey) instance.generatePublic(new ECPublicKeySpec(eCPoint, new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", 16)), new ECPoint(new BigInteger("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", 16), new BigInteger("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5", 16)), new BigInteger("115792089210356248762697446949407573529996955224135760342422259061068512044369"), 1)));
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new RuntimeException("Error parsing ECPublicKey", e);
        }
    }

    /* renamed from: a */
    public final String mo52530a(String str) {
        if (TextUtils.isEmpty(str)) {
            return String.format(Locale.US, "parameter \"%s\" must be a non empty string", "publicKey");
        }
        try {
            byte[] b = m80956b(str);
            if (b[0] != 4) {
                return String.format(Locale.US, "first byte of parameter \"%s\" must be 0x04 (which indicates uncompressed point format)", "publicKey");
            } else if (b.length != 65) {
                return String.format(Locale.US, "parameter \"%s\" must be %d bytes long after base64 decoding", "publicKey", 65);
            } else {
                try {
                    m80955b(awfn.m79850a(b));
                    return null;
                } catch (InvalidKeySpecException e) {
                    return String.format(Locale.US, "parameter \"%s\" is not a valid publicKey: %s", "publicKey", e.getMessage());
                }
            }
        } catch (IllegalArgumentException e2) {
            return String.format(Locale.US, "failed to base64 decode parameter \"%s\": %s", "publicKey", e2.getMessage());
        }
    }

    /* renamed from: b */
    public static byte[] m80956b(String str) {
        return Base64.decode(str, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final KeyPair mo52531a() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", this.f95039b);
            instance.initialize(new ECGenParameterSpec("prime256v1"), new SecureRandom());
            return instance.genKeyPair();
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Error trying to generate key pair", e);
        }
    }

    /* renamed from: b */
    public final byte[] mo52535b(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
            Mac instance = Mac.getInstance("HmacSHA256", this.f95039b);
            instance.init(secretKeySpec);
            return instance.doFinal(bArr2);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Failed to generate message authentication code.", e);
        }
    }

    /* renamed from: a */
    public final ECPublicKey mo52532a(ECPoint eCPoint) {
        try {
            return m80955b(eCPoint);
        } catch (InvalidKeySpecException e) {
            throw new RuntimeException("Error parsing ECPublicKey", e);
        }
    }

    /* renamed from: a */
    public final void mo52533a(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey, PublicKey publicKey, byte[] bArr, byte[] bArr2) {
        boolean z;
        int length = bArr.length;
        int length2 = bArr2.length;
        if (length + length2 == 32) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        try {
            KeyAgreement instance = KeyAgreement.getInstance("ECDH", this.f95039b);
            instance.init(eCPrivateKey);
            instance.doPhase(publicKey, true);
            byte[] a = addf.m50204a(new SecretKeySpec(sqc.m35959a(awfn.m79852a(eCPublicKey.getW()), instance.generateSecret()), "AES"), f95037d, f95036c);
            System.arraycopy(a, 0, bArr, 0, length);
            System.arraycopy(a, length, bArr2, 0, length2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new RuntimeException("Error generating shared key", e);
        }
    }

    /* renamed from: a */
    public final byte[] mo52534a(byte[] bArr, byte[] bArr2) {
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding", this.f95040f);
            instance.init(1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(f95038e));
            return instance.doFinal(bArr2);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Failed to encrypt message.", e);
        }
    }
}
