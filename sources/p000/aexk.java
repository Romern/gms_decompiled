package p000;

import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: aexk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexk {
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
    public static AudienceMember m52644a(String str, String str2, String str3) {
        sdo.m34969a(str, (Object) "Phone number must not be empty.");
        String valueOf = String.valueOf(str);
        return AudienceMember.m22641b(valueOf.length() == 0 ? new String("p:") : "p:".concat(valueOf), str2, str3);
    }

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
    /* renamed from: b */
    public static AudienceMember m52646b(String str, String str2, String str3) {
        sdo.m34969a(str, (Object) "Email address must not be empty.");
        return AudienceMember.m22641b(ancm.m64019h(str), str2, str3);
    }

    /* renamed from: c */
    public static boolean m52648c(AudienceMember audienceMember) {
        String str;
        if (audienceMember == null || (str = audienceMember.f30295e) == null) {
            return false;
        }
        return "p:".equals(str.substring(0, 2));
    }

    /* renamed from: d */
    public static boolean m52649d(AudienceMember audienceMember) {
        return (audienceMember == null || ancm.m64018g(audienceMember.f30295e) == null) ? false : true;
    }

    /* renamed from: a */
    public static String m52645a(AudienceMember audienceMember) {
        if (audienceMember.mo17847c()) {
            return audienceMember.f30295e.substring(2);
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m52647b(AudienceMember audienceMember) {
        return (audienceMember == null || ancm.m64016e(audienceMember.f30295e) == null) ? false : true;
    }
}
