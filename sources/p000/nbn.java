package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;

/* renamed from: nbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nbn {

    /* renamed from: a */
    public final KeyGenerator f35193a;

    public nbn(SecureRandom secureRandom) {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            this.f35193a = instance;
            instance.init((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, secureRandom);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Impossible condition: JCE thinks it does not support AES key generation, but this has existed since Android API version 1.", e);
        }
    }
}
