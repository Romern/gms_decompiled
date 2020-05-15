package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

/* renamed from: asej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asej {

    /* renamed from: a */
    public static final Pattern f88774a = Pattern.compile("^[a-zA-Z_][a-zA-Z0-9_]*(\\.[a-zA-Z_][a-zA-Z0-9_]*)*$");

    /* renamed from: a */
    public static String m73866a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return srv.m36162b(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError("No SHA-256 implementation found.");
        }
    }
}
