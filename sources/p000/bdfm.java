package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: bdfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdfm {

    /* renamed from: a */
    private static final Charset f105553a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static Long m90702a(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(f105553a));
            return Long.valueOf(ByteBuffer.wrap(instance.digest()).getLong());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
