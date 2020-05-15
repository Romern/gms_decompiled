package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: aytd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aytd {

    /* renamed from: a */
    private static volatile boolean f98444a;

    /* renamed from: a */
    public static String m84774a(String str) {
        if (str == null) {
            return null;
        }
        return String.format(Locale.US, "%016x", Long.valueOf(Long.parseLong(str) & -2));
    }

    /* renamed from: b */
    public static String m84776b(String str, String str2) {
        if (str == null || str2 == null || f98444a) {
            return null;
        }
        return m84775a(str, m84774a(str2));
    }

    /* renamed from: a */
    public static String m84775a(String str, String str2) {
        if (str == null || str2 == null || f98444a) {
            return null;
        }
        try {
            String format = String.format(Locale.US, "%s:%d:%s", str, 1, str2);
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(format.getBytes("UTF-8"));
            return ayth.m84785a(instance.digest()).toLowerCase(Locale.US);
        } catch (NoSuchAlgorithmException e) {
            f98444a = true;
            throw new Exception("No SHA-256 algorithm");
        }
    }
}
