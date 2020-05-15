package p000;

import android.content.Context;

/* renamed from: acyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acyc {

    /* renamed from: a */
    public final Context f61072a;

    /* renamed from: b */
    public final String f61073b;

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
    public acyc(Context context, String str) {
        sdo.m34966a(context, "Context must not be null.");
        sdo.m34969a(str, (Object) "Alias must not be empty.");
        sdo.m34975b(str.matches("[a-zA-Z0-9_]*"), "Alias must match: [a-zA-Z0-9_]*");
        this.f61072a = context;
        this.f61073b = str;
    }
}
