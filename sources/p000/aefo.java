package p000;

import android.content.Context;

/* renamed from: aefo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aefo {

    /* renamed from: a */
    public static final rjo f63329a = new rjo("ActivityRecognition.API", f63332d, f63331c);
    @Deprecated

    /* renamed from: b */
    public static final aeja f63330b = new aeja();

    /* renamed from: c */
    private static final rje f63331c = new rje();

    /* renamed from: d */
    private static final rjl f63332d = new aefm();

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
    public static aekl m51796a(rkb rkb) {
        boolean z = true;
        sdo.m34975b(true, "GoogleApiClient parameter is required.");
        aekl aekl = (aekl) rkb.mo24786a(f63331c);
        if (aekl == null) {
            z = false;
        }
        sdo.m34971a(z, (Object) "GoogleApiClient is not configured to use the ActivityRecognition.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        return aekl;
    }

    /* renamed from: a */
    public static rjx m51797a(Context context) {
        return new rjx(context, (short[]) null);
    }
}
