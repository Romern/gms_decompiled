package p000;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: byrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byrr {
    /* renamed from: a */
    public static KeyFactory m125224a() {
        try {
            return KeyFactory.getInstance("EC");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static PublicKey m125227b(byte[] bArr) {
        try {
            return bysu.m125293a((bytb) bxvk.m124014a(bytb.f167639f, bArr));
        } catch (bxwf e) {
            throw new InvalidKeySpecException("Unable to parse GenericPublicKey", e);
        } catch (IllegalArgumentException e2) {
            throw new InvalidKeySpecException("Unable to parse GenericPublicKey", e2);
        }
    }

    /* renamed from: a */
    public static SecretKey m125225a(byte[] bArr) {
        return new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public static byte[] m125226a(PublicKey publicKey) {
        return bysu.m125290a(publicKey).mo73642k();
    }
}
