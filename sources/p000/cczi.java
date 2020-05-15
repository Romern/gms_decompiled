package p000;

/* renamed from: cczi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cczi implements cczg {

    /* renamed from: a */
    public static final bdyx f180299a;

    /* renamed from: b */
    public static final bdyx f180300b;

    /* renamed from: c */
    public static final bdyx f180301c;

    /* renamed from: d */
    public static final bdyx f180302d;

    /* renamed from: e */
    public static final bdyx f180303e;

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.cast")).mo58445a("gms:cast:");
        f180299a = bdyx.m91610a(a, "DynamicSession__enabled_publish_dynamic_route", true);
        f180300b = bdyx.m91610a(a, "DynamicSession__enabled_reconnect_when_session_moved", true);
        f180301c = bdyx.m91607a(a, "DynamicSession__minimum_client_library_version", 2147483647L);
        try {
            f180302d = bdyx.m91608a(a, "DynamicSession__session_device_blacklisted_apps", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[]{10, 8, 54, 55, 52, 65, 48, 50, 52, 51, 10, 8, 56, 69, 54, 67, 56, 54, 54, 68, 10, 8, 57, 54, 48, 56, 52, 51, 55, 50, 10, 8, 68, 50, 54, 67, 55, 65, 68, 50, 10, 8, 69, 53, 56, 55, 49, 66, 55, 49}), cczh.f180298a);
            f180303e = bdyx.m91607a(a, "DynamicSession__session_endpoint_switch_timeout_ms", 60000L);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"DynamicSession__session_device_blacklisted_apps\"");
        }
    }

    /* renamed from: a */
    public final boolean mo77095a() {
        return ((Boolean) f180299a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77096b() {
        return ((Boolean) f180300b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final bydj mo77097c() {
        return (bydj) f180302d.mo58455c();
    }

    /* renamed from: d */
    public final long mo77098d() {
        return ((Long) f180303e.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final void mo77099e() {
        ((Long) f180301c.mo58455c()).longValue();
    }
}
