package p000;

/* renamed from: cggu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cggu implements cggt {

    /* renamed from: a */
    public static final bdyx f186900a;

    /* renamed from: b */
    public static final bdyx f186901b;

    /* renamed from: c */
    public static final bdyx f186902c;

    /* renamed from: d */
    public static final bdyx f186903d;

    /* renamed from: e */
    public static final bdyx f186904e;

    /* renamed from: f */
    public static final bdyx f186905f;

    /* renamed from: g */
    public static final bdyx f186906g;

    /* renamed from: h */
    public static final bdyx f186907h;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.places"));
        f186900a = bdyx.m91609a(bdyw, "placesserver.api_path", "/placesandroid/v1/");
        f186901b = bdyx.m91609a(bdyw, "placesserver.apiary_trace", "");
        f186902c = bdyx.m91609a(bdyw, "placesserver.auth_scope", "https://www.googleapis.com/auth/placesserver");
        f186903d = bdyx.m91609a(bdyw, "placesserver.backend_override", "");
        f186904e = bdyx.m91610a(bdyw, "placesserver.cache_enabled", false);
        f186905f = bdyx.m91607a(bdyw, "placesserver_timeout_millis", 10000L);
        f186906g = bdyx.m91609a(bdyw, "placesserver.url", "https://www.googleapis.com");
        f186907h = bdyx.m91610a(bdyw, "placesserver.verbose_logging", true);
    }

    /* renamed from: a */
    public final String mo83757a() {
        return (String) f186900a.mo58455c();
    }

    /* renamed from: b */
    public final String mo83758b() {
        return (String) f186901b.mo58455c();
    }

    /* renamed from: c */
    public final String mo83759c() {
        return (String) f186902c.mo58455c();
    }

    /* renamed from: d */
    public final String mo83760d() {
        return (String) f186903d.mo58455c();
    }

    /* renamed from: e */
    public final boolean mo83761e() {
        return ((Boolean) f186904e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final long mo83762f() {
        return ((Long) f186905f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final String mo83763g() {
        return (String) f186906g.mo58455c();
    }

    /* renamed from: h */
    public final boolean mo83764h() {
        return ((Boolean) f186907h.mo58455c()).booleanValue();
    }
}
