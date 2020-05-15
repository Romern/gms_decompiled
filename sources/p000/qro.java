package p000;

import android.net.Uri;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: qro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qro {

    /* renamed from: a */
    private static final byte[] f42001a = "|".getBytes();

    /* renamed from: a */
    public static String m32739a(bxxc bxxc, String... strArr) {
        byte[] bArr;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bxxc.serializeToBytes());
            for (int i = 0; i < strArr.length; i++) {
                if (i > 0) {
                    instance.update(f42001a);
                }
                String str = strArr[i];
                if (str == null) {
                    bArr = new byte[0];
                } else {
                    bArr = Uri.encode(str, "!$&'()*+,-./;=@_~ ").replace(" ", "%20").getBytes();
                }
                instance.update(bArr);
            }
            return Base64.encodeToString(instance.digest(), 2);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
