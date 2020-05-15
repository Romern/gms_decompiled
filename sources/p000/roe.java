package p000;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: roe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class roe {

    /* renamed from: a */
    public final Set f43431a = Collections.newSetFromMap(new WeakHashMap());

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
    public static rob m34171a(Object obj, String str) {
        sdo.checkIfNull(obj, "Listener must not be null");
        sdo.checkIfNull((Object) str, (Object) "Listener type must not be null");
        sdo.m34969a(str, (Object) "Listener type must not be empty");
        return new rob(obj, str);
    }

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
    public static rod m34172a(Object obj, Looper looper, String str) {
        sdo.checkIfNull(obj, "Listener must not be null");
        sdo.checkIfNull(looper, "Looper must not be null");
        sdo.checkIfNull((Object) str, (Object) "Listener type must not be null");
        return new rod(looper, obj, str);
    }
}
