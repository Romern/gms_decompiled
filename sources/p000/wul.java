package p000;

import android.content.Intent;
import java.net.URISyntaxException;

/* renamed from: wul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wul {
    /* renamed from: a */
    public static String m42303a(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (parseUri.getAction().equals("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR")) {
                return parseUri.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP");
            }
            srn srn = wtw.f51331a;
            parseUri.getAction();
            return null;
        } catch (URISyntaxException e) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("wul", "a", 43, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("fail to get companion app info from discovery item");
            return null;
        }
    }
}
