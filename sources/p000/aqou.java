package p000;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: aqou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqou {

    /* renamed from: a */
    public static final aqou f86436a = new aqou();

    /* renamed from: a */
    public static final String m71890a(String str, String str2) {
        sdo.m34959a((Object) str);
        sdo.m34959a((Object) str2);
        MessageDigest b = spn.m35868b("MD5");
        if (b == null) {
            return null;
        }
        b.update(String.format("%s:%s", str, str2).getBytes(Charset.forName("UTF-8")));
        return srv.m36164d(b.digest());
    }
}
