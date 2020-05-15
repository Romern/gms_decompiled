package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: amqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqs {
    /* renamed from: a */
    public static String m63193a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return boan.f132472f.mo68788c().mo68794a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            return String.valueOf(str.hashCode());
        }
    }
}
