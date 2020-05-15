package p000;

import android.content.Context;

/* renamed from: ahcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahcb {

    /* renamed from: a */
    public static final /* synthetic */ int f66972a = 0;

    static {
        new rjo("Nearby.CONNECTIONS_API", aifn.f68878b, aifn.f68877a);
        new rjo("Nearby.MESSAGES_API", ajdk.f70388b, ajdk.f70387a);
        new rjo("Nearby.BOOTSTRAP_API", ahde.f67047b, ahde.f67046a);
    }

    /* renamed from: a */
    public static ahco m55438a(Context context) {
        sdo.m34966a(context, "Context must not be null");
        return new ahej(context);
    }

    /* renamed from: b */
    public static final aixg m55441b(Context context) {
        sdo.m34966a(context, "Context must not be null");
        return new ajdi(context, null);
    }

    /* renamed from: c */
    public static final ajty m55442c(Context context) {
        sdo.m34966a(context, "Context must not be null");
        return new ajty(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(android.content.ContentResolver, java.lang.String, long):long
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean */
    /* renamed from: d */
    public static boolean m55443d(Context context) {
        if (svr.m36484b(context).mo26169a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
            return aymn.m84269a(context.getContentResolver(), "gms:nearby:requires_gms_check", true);
        }
        return true;
    }

    /* renamed from: a */
    public static final ahie m55439a(Context context, ahig ahig) {
        sdo.m34966a(context, "Context must not be null");
        sdo.m34966a(ahig, "Options must not be null");
        return new aifl(context, ahig);
    }

    /* renamed from: a */
    public static final aixg m55440a(Context context, aixi aixi) {
        sdo.m34966a(context, "Context must not be null");
        sdo.m34966a(aixi, "Options must not be null");
        return new ajdi(context, aixi);
    }
}
