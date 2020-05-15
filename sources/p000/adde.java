package p000;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

/* renamed from: adde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adde {
    /* renamed from: a */
    public static KeyPair m50201a() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(2048);
            return instance.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
