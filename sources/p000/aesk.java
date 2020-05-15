package p000;

import android.os.Looper;

/* renamed from: aesk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aesk {
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
    public static Looper m52500a(Looper looper) {
        boolean z;
        if (looper != null) {
            return looper;
        }
        if (Looper.myLooper() != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
