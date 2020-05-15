package p000;

import java.util.Map;

/* renamed from: bes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bes {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* renamed from: a */
    public static Object m2844a(String str) {
        return ((bet) bgs.f3191a.mo3119a("DATA_CONTEXT", false)).f3121c.get(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* renamed from: b */
    public static Object m2846b(String str) {
        Map map = ((bet) bgs.f3191a.mo3119a("DATA_CONTEXT", false)).f3121c;
        Object obj = map.get(str);
        map.remove(str);
        return obj;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* renamed from: a */
    public static void m2845a(String str, Object obj) {
        ((bet) bgs.f3191a.mo3119a("DATA_CONTEXT", false)).f3121c.put(str, obj);
    }
}
