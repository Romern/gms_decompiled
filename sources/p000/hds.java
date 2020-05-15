package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;

/* renamed from: hds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hds {

    /* renamed from: a */
    private static final sek f19547a = ght.m13172b("AppIdentityUtils");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public static String m14227a(Context context, String str) {
        sdo.m34969a(str, (Object) "app package name cannot be empty");
        try {
            return svr.m36484b(context).mo26177b(str).toString();
        } catch (PackageManager.NameNotFoundException e) {
            f19547a.mo25417e("Unable to get the application label.", e, new Object[0]);
            return str;
        }
    }

    /* renamed from: b */
    public static String m14229b(String str) {
        sdo.m34977c(str);
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        sdo.m34959a((Object) scheme);
        return scheme + "://" + parse.getAuthority();
    }

    /* renamed from: a */
    public static String m14228a(String str) {
        sdo.m34977c(str);
        String host = Uri.parse(str).getHost();
        sdo.m34959a((Object) host);
        return host;
    }
}
