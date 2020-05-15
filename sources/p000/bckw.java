package p000;

import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import java.util.concurrent.Callable;

/* renamed from: bckw */
final /* synthetic */ class bckw implements Callable {

    /* renamed from: a */
    static final Callable f104425a = new bckw();

    private bckw() {
    }

    public final Object call() {
        KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
        instance.initialize(new ECGenParameterSpec("secp256r1"));
        return instance.generateKeyPair();
    }
}
