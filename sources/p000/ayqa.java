package p000;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ayqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayqa {
    /* renamed from: a */
    static byte[] m84481a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 16) {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bArr, "HmacSHA256"));
            return instance.doFinal(bArr2);
        }
        throw new GeneralSecurityException("Incorrect key length, should be the AES-128 key.");
    }
}
