package p000;

/* renamed from: cdyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdyq implements cdyp {

    /* renamed from: a */
    public static final bdyx f181928a;

    /* renamed from: b */
    public static final bdyx f181929b;

    /* renamed from: c */
    public static final bdyx f181930c;

    /* renamed from: d */
    public static final bdyx f181931d;

    /* renamed from: e */
    public static final bdyx f181932e;

    /* renamed from: f */
    public static final bdyx f181933f;

    /* renamed from: g */
    public static final bdyx f181934g;

    /* renamed from: h */
    public static final bdyx f181935h;

    /* renamed from: i */
    public static final bdyx f181936i;

    /* renamed from: j */
    public static final bdyx f181937j;

    /* renamed from: k */
    public static final bdyx f181938k;

    /* renamed from: l */
    public static final bdyx f181939l;

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.fitness")).mo58445a("fitness.");
        f181928a = bdyx.m91609a(a, "fitness_server_api_path", "/fitness/v0");
        f181929b = bdyx.m91610a(a, "apiary_cache_enabled", false);
        f181930c = bdyx.m91609a(a, "apiary_trace", "");
        f181931d = bdyx.m91610a(a, "apiary_verbose_logging", true);
        f181932e = bdyx.m91609a(a, "fitness_backend_override", "");
        f181933f = bdyx.m91609a(a, "fitness_server_first_party_api_path", "/fitness/v0firstparty");
        bdyx.m91607a(a, "min_compress_request_body_bytes", 500L);
        f181934g = bdyx.m91609a(a, "scope", "https://www.googleapis.com/auth/fitness");
        f181935h = bdyx.m91605a(a, "fitness_server_backoff_multiplier", 1.0d);
        f181936i = bdyx.m91607a(a, "fitness_server_retry", 1L);
        f181937j = bdyx.m91607a(a, "fitness_server_timeout_ms", 12000L);
        f181938k = bdyx.m91609a(a, "__phenotype_server_token", "");
        f181939l = bdyx.m91609a(a, "fitness_server_url", "https://www.googleapis.com");
    }

    /* renamed from: a */
    public final String mo78462a() {
        return (String) f181928a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo78463b() {
        return ((Boolean) f181929b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final String mo78464c() {
        return (String) f181930c.mo58455c();
    }

    /* renamed from: d */
    public final boolean mo78465d() {
        return ((Boolean) f181931d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final String mo78466e() {
        return (String) f181932e.mo58455c();
    }

    /* renamed from: f */
    public final String mo78467f() {
        return (String) f181933f.mo58455c();
    }

    /* renamed from: g */
    public final String mo78468g() {
        return (String) f181934g.mo58455c();
    }

    /* renamed from: h */
    public final double mo78469h() {
        return ((Double) f181935h.mo58455c()).doubleValue();
    }

    /* renamed from: i */
    public final long mo78470i() {
        return ((Long) f181936i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final long mo78471j() {
        return ((Long) f181937j.mo58455c()).longValue();
    }

    /* renamed from: k */
    public final String mo78472k() {
        return (String) f181938k.mo58455c();
    }

    /* renamed from: l */
    public final String mo78473l() {
        return (String) f181939l.mo58455c();
    }
}
