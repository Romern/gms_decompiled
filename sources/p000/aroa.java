package p000;

import java.security.MessageDigest;

/* renamed from: aroa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aroa {
    /* renamed from: a */
    public static String m73209a(String str, bowh bowh) {
        byte[] a;
        return (!(bowh == bowh.HEX_PIN || bowh == bowh.GOOGLE_HEX) || (a = m73210a(str)) == null) ? str : srv.m36164d(a).substring(0, 4);
    }

    /* renamed from: a */
    public static byte[] m73210a(String str) {
        MessageDigest a = spo.m35903a("SHA1");
        if (a != null) {
            return a.digest(str.getBytes());
        }
        return null;
    }
}
