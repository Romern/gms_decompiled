package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: xid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xid {
    /* renamed from: a */
    public static MessageDigest m42997a() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
