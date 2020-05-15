package p000;

/* renamed from: cedw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cedw implements cedv {

    /* renamed from: a */
    public static final bdyx f182417a;

    /* renamed from: b */
    public static final bdyx f182418b;

    /* renamed from: c */
    public static final bdyx f182419c;

    /* renamed from: d */
    public static final bdyx f182420d;

    /* renamed from: e */
    public static final bdyx f182421e;

    /* renamed from: f */
    public static final bdyx f182422f;

    /* renamed from: g */
    public static final bdyx f182423g;

    /* renamed from: h */
    public static final bdyx f182424h;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.gcm"));
        f182417a = bdyx.m91610a(bdyw, "nts.enable_reachability_observer", false);
        f182418b = bdyx.m91610a(bdyw, "nts.reachability_clearcut_counters_enabled", false);
        f182419c = bdyx.m91609a(bdyw, "nts.reachability_failed_retry_intervals_seconds", "10,20,30,60,120,240,480,900,1800,3600,7200,14400,28800,57600,86400");
        f182420d = bdyx.m91607a(bdyw, "nts.reachability_failure_threshold", 9L);
        f182421e = bdyx.m91609a(bdyw, "nts.reachability_hostname_whitelist", ".google.com,.googleapis.com,.gstatic.com");
        f182422f = bdyx.m91609a(bdyw, "nts.reachability_scheme_whitelist", "ping,tcp");
        f182423g = bdyx.m91607a(bdyw, "nts.reachability_success_retry_interval_seconds", 3600L);
        f182424h = bdyx.m91610a(bdyw, "nts.use_required_uris_column", false);
    }

    /* renamed from: a */
    public final boolean mo78905a() {
        return ((Boolean) f182417a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78906b() {
        return ((Boolean) f182418b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final String mo78907c() {
        return (String) f182419c.mo58455c();
    }

    /* renamed from: d */
    public final long mo78908d() {
        return ((Long) f182420d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final String mo78909e() {
        return (String) f182421e.mo58455c();
    }

    /* renamed from: f */
    public final String mo78910f() {
        return (String) f182422f.mo58455c();
    }

    /* renamed from: g */
    public final long mo78911g() {
        return ((Long) f182423g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final boolean mo78912h() {
        return ((Boolean) f182424h.mo58455c()).booleanValue();
    }
}
