package p000;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;

/* renamed from: vor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vor {

    /* renamed from: a */
    public static KeyGenerator f49685a;

    static {
        f49685a = null;
        try {
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextLong();
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            f49685a = instance;
            instance.init(128, secureRandom);
        } catch (NoSuchAlgorithmException e) {
        }
    }
}
