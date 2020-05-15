package p000;

/* renamed from: cgoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgoe implements cgod {

    /* renamed from: a */
    public static final bdyx f187390a;

    /* renamed from: b */
    public static final bdyx f187391b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.smart_profile")).mo58443a();
        f187390a = bdyx.m91609a(a, "GplusTurndownFeature__correct_datamixer_auth_scope", "https://www.googleapis.com/auth/peopleapi.readwrite");
        f187391b = bdyx.m91610a(a, "GplusTurndownFeature__replace_plus_scopes", false);
    }

    /* renamed from: a */
    public final String mo84177a() {
        return (String) f187390a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo84178b() {
        return ((Boolean) f187391b.mo58455c()).booleanValue();
    }
}
