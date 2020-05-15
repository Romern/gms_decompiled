package p000;

import java.io.UnsupportedEncodingException;

/* renamed from: catw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class catw {
    /* renamed from: a */
    public static String m127192a(String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            String valueOf = String.valueOf(cipx.m150786a(sb.toString().getBytes("ISO-8859-1")).mo86341b());
            return valueOf.length() == 0 ? new String("Basic ") : "Basic ".concat(valueOf);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError();
        }
    }
}
