package p000;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ehv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ehv {

    /* renamed from: a */
    public static final byte[] f15022a = "CryptAuth Enrollment".getBytes(bmwy.f131158c);

    /* renamed from: b */
    public static final byte[] f15023b = "CryptAuth Key Proof".getBytes(bmwy.f131158c);

    /* renamed from: a */
    public static KeyPair m10461a() {
        return byrp.m125221a();
    }

    /* renamed from: b */
    public static KeyPair m10470b() {
        return bysu.m125292a();
    }

    /* renamed from: d */
    public static PrivateKey m10474d(byte[] bArr) {
        try {
            return m10471b(bArr);
        } catch (InvalidKeySpecException e) {
            throw e;
        }
    }

    /* renamed from: e */
    public static SecretKey m10475e(byte[] bArr) {
        return byrr.m125225a(bArr);
    }

    /* renamed from: c */
    public static PublicKey m10473c(byte[] bArr) {
        try {
            return byrr.m125227b(bArr);
        } catch (InvalidKeySpecException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static PublicKey m10462a(byte[] bArr) {
        return byrr.m125227b(bArr);
    }

    /* renamed from: b */
    public static PrivateKey m10471b(byte[] bArr) {
        return byrr.m125224a().generatePrivate(new PKCS8EncodedKeySpec(bArr));
    }

    /* renamed from: a */
    public static SecretKey m10463a(PrivateKey privateKey, PublicKey publicKey) {
        return byrp.m125222a(privateKey, publicKey);
    }

    /* renamed from: b */
    public static byte[] m10472b(PublicKey publicKey) {
        return byrr.m125226a(publicKey);
    }

    /* renamed from: a */
    public static byte[] m10464a(PrivateKey privateKey) {
        return privateKey.getEncoded();
    }

    /* renamed from: a */
    public static byte[] m10465a(PrivateKey privateKey, SecureRandom secureRandom, byte[] bArr) {
        try {
            Signature instance = Signature.getInstance("SHA256withECDSA");
            instance.initSign(privateKey, secureRandom);
            instance.update(f15023b);
            instance.update(bArr);
            return instance.sign();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static byte[] m10466a(PublicKey publicKey) {
        return byrr.m125226a(publicKey);
    }

    /* renamed from: a */
    public static byte[] m10467a(byte[] bArr, String str, int i, byte[] bArr2) {
        try {
            return m10468a(m10469a(bArr, f15023b, str.getBytes(bmwy.f131158c), "HmacSHA256", i), bArr2, "AES");
        } catch (InvalidKeyException e) {
            throw new RuntimeException("Failed to apply HKDF for verifying the key proof", e);
        }
    }

    /* renamed from: a */
    public static byte[] m10468a(byte[] bArr, byte[] bArr2, String str) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bArr, str));
            return instance.doFinal(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new RuntimeException("Error performing HMAC. This should never happen.");
        }
    }

    /* renamed from: a */
    public static byte[] m10469a(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, int i) {
        bmxy.m108588a(true);
        bmxy.m108588a(true);
        try {
            return bxtx.m123262a(byst.m125284a(new SecretKeySpec(bArr, str), bArr2, bArr3), 0, i).mo73780k();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
