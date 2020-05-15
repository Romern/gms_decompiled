package p000;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: akmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akmk {
    /* renamed from: a */
    public static String m60015a(String str) {
        return Base64.encodeToString(m60016a(str, "SHA-256"), 11);
    }

    /* renamed from: b */
    public static String m60017b(String str, String str2) {
        String valueOf = String.valueOf(aknk.m60088b(str));
        String valueOf2 = String.valueOf(str2);
        return m60015a(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
    }

    /* renamed from: c */
    public static String m60019c(String str) {
        return m60015a(aknk.m60088b(str));
    }

    /* renamed from: b */
    public static MessageDigest m60018b(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m60016a(String str, String str2) {
        if (str == null) {
            return new byte[0];
        }
        MessageDigest b = m60018b(str2);
        if (b != null) {
            return b.digest(str.getBytes());
        }
        return null;
    }
}
