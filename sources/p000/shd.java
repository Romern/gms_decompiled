package p000;

import android.net.Uri;

/* renamed from: shd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class shd {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public static String m35267a(String str) {
        sdo.checkIfNull((Object) str, (Object) "Encoding a null parameter!");
        return Uri.encode(str);
    }

    @Deprecated
    /* renamed from: a */
    public static String m35268a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str.indexOf("?") != -1) {
            sb.append('&');
        } else {
            sb.append('?');
        }
        sb.append(str2);
        sb.append('=');
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m35269a(StringBuilder sb, String str, String str2) {
        if (sb.indexOf("?") != -1) {
            sb.append('&');
        } else {
            sb.append('?');
        }
        sb.append(str);
        sb.append('=');
        sb.append(str2);
    }
}
