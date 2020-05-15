package p000;

import android.net.Uri;

/* renamed from: sds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sds {

    /* renamed from: a */
    private static final Uri f44073a = new Uri.Builder().scheme("android.resource").authority("com.google.android.gms").appendPath("drawable").build();

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
    public static Uri m34979a(String str) {
        sdo.m34966a((Object) str, (Object) "Resource name must not be null.");
        return f44073a.buildUpon().appendPath(str).build();
    }
}
