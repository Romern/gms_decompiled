package p000;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* renamed from: bedv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bedv {

    /* renamed from: a */
    static final ECParameterSpec f106989a = ((ECPublicKey) m91838b().getPublic()).getParams();

    /* renamed from: b */
    public final KeyPair f106990b = m91838b();

    /* renamed from: c */
    public PublicKey f106991c = null;

    /* renamed from: a */
    public static PublicKey m91836a(byte[] bArr) {
        int length = bArr.length;
        if (length != 65) {
            String valueOf = String.valueOf(String.valueOf(length));
            throw new bedu(valueOf.length() == 0 ? new String("Encoded public key point has invalid length: ") : "Encoded public key point has invalid length: ".concat(valueOf));
        } else if (bArr[0] == 4) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 1, bArr2, 0, 32);
            BigInteger bigInteger = new BigInteger(1, bArr2);
            System.arraycopy(bArr, 33, bArr2, 0, 32);
            try {
                return KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, new BigInteger(1, bArr2)), f106989a));
            } catch (InvalidKeySpecException e) {
                throw new bedu("Provided public key is invalid.", e);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new bedu("Public key point must be in uncompressed format");
        }
    }

    /* renamed from: b */
    private static KeyPair m91838b() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(new ECGenParameterSpec("prime256v1"));
            KeyPair generateKeyPair = instance.generateKeyPair();
            if (generateKeyPair != null) {
                return generateKeyPair;
            }
            throw new RuntimeException("Could not generate key pair.");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: b */
    private static byte[] m91839b(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(bArr);
            if (digest != null) {
                return digest;
            }
            throw new RuntimeException("SHA-256 output is null.");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static byte[] m91837a(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length > 33 || (length == 33 && byteArray[0] != 0)) {
            throw new RuntimeException("EC coordinate is too large to fit in 32 bytes.");
        }
        byte[] bArr = new byte[32];
        if (length > 32) {
            System.arraycopy(byteArray, 1, bArr, 0, 32);
        } else {
            System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        }
        return bArr;
    }

    /* renamed from: a */
    public final byte[] mo58593a() {
        if (this.f106991c != null) {
            try {
                KeyAgreement instance = KeyAgreement.getInstance("ECDH");
                instance.init(this.f106990b.getPrivate());
                instance.doPhase(this.f106991c, true);
                byte[] generateSecret = instance.generateSecret();
                if (generateSecret != null) {
                    return Arrays.copyOfRange(m91839b(generateSecret), 0, 16);
                }
                throw new RuntimeException("Generated ECDH secret is null.");
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            } catch (InvalidKeyException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new IllegalStateException("Remote public key must be set before generating shared key");
        }
    }
}
