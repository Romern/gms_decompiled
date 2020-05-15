package p000;

import java.security.KeyPairGenerator;

/* renamed from: aczo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aczo {

    /* renamed from: a */
    public final KeyPairGenerator f61170a;

    public aczo() {
        try {
            this.f61170a = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        } catch (RuntimeException e) {
            throw new aczp("Unable to access keyPairGenerator", e);
        }
    }
}
