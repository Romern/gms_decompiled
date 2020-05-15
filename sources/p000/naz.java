package p000;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* renamed from: naz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class naz {

    /* renamed from: a */
    private final SecretKey f35163a;

    public naz(SecretKey secretKey) {
        this.f35163a = secretKey;
    }

    /* renamed from: a */
    public final nbw mo20425a(byte[] bArr) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(this.f35163a);
            return new nbw(instance.doFinal(bArr));
        } catch (NoSuchAlgorithmException e) {
            throw new lwh("Impossible condition: JCE thinks it does not supportHmacSHA256, but this has existed since Android API level 1.", e);
        }
    }
}
