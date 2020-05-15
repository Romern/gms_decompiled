package p000;

import android.content.Context;

/* renamed from: aeie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeie {

    /* renamed from: a */
    public static final rjo f63411a = new rjo("LocationServices.API", f63415e, f63414d);
    @Deprecated

    /* renamed from: b */
    public static final aejs f63412b = new aejs();
    @Deprecated

    /* renamed from: c */
    public static final aejn f63413c = new aejn();

    /* renamed from: d */
    private static final rje f63414d = new rje();

    /* renamed from: e */
    private static final rjl f63415e = new aeic();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public static aekl m51875a(rkb rkb) {
        boolean z;
        boolean z2 = true;
        if (rkb != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "GoogleApiClient parameter is required.");
        aekl aekl = (aekl) rkb.mo24786a(f63414d);
        if (aekl == null) {
            z2 = false;
        }
        sdo.m34971a(z2, (Object) "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return aekl;
    }

    /* renamed from: b */
    public static rjx m51877b(Context context) {
        return new rjx(context, f63411a, (rjk) null, rjw.f43159a);
    }

    /* renamed from: c */
    public static rjx m51878c(Context context) {
        return new rjx(context, f63411a, (rjk) null, new rky());
    }

    /* renamed from: a */
    public static rjx m51876a(Context context) {
        return new rjx(context, f63411a, (rjk) null, rjw.f43159a);
    }
}
