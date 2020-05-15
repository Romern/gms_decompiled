package p000;

import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;

/* renamed from: byrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byrp {
    static {
        byss byss = byss.HMAC_SHA256;
        bysr bysr = bysr.NONE;
    }

    /* renamed from: a */
    public static KeyPair m125221a() {
        return bysu.m125292a();
    }

    /* renamed from: a */
    public static SecretKey m125222a(PrivateKey privateKey, PublicKey publicKey) {
        try {
            KeyAgreement instance = KeyAgreement.getInstance(!(privateKey instanceof ECPrivateKey) ? "DH" : "ECDH");
            instance.init(privateKey);
            instance.doPhase(publicKey, true);
            return byrr.m125225a(m125223a(instance.generateSecret()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    static byte[] m125223a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
