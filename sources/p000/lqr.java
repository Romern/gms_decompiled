package p000;

import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: lqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lqr {
    /* renamed from: a */
    public static byte[] m19542a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA-512").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException();
        }
    }
}
