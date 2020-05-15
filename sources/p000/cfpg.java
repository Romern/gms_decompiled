package p000;

/* renamed from: cfpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfpg implements cfpf {

    /* renamed from: a */
    public static final bdyx f185336a;

    /* renamed from: b */
    public static final bdyx f185337b;

    /* renamed from: c */
    public static final bdyx f185338c;

    /* renamed from: d */
    public static final bdyx f185339d;

    /* renamed from: e */
    public static final bdyx f185340e;

    /* renamed from: f */
    public static final bdyx f185341f;

    /* renamed from: g */
    public static final bdyx f185342g;

    /* renamed from: h */
    public static final bdyx f185343h;

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
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.netrec"));
        f185336a = bdyx.m91610a(bdyw, "Netrec__Backend__enable_spatula_disable_pseudonymous_identification", false);
        f185337b = bdyx.m91610a(bdyw, "NetrecBackend__include_ssid_hash", false);
        f185338c = bdyx.m91605a(bdyw, "NetrecBackend__network_scoring_backoff_multiplier", 1.5d);
        f185339d = bdyx.m91609a(bdyw, "Netrec__Backend__network_scoring_endpoint", "get_wifi_quality");
        f185340e = bdyx.m91607a(bdyw, "NetrecBackend__network_scoring_retries", 0L);
        f185341f = bdyx.m91607a(bdyw, "NetrecBackend__nfe_request_timeout_millis", 2000L);
        f185342g = bdyx.m91609a(bdyw, "Netrec__Backend__propagate_experiments", "com.google.android.apps.gcs");
        f185343h = bdyx.m91607a(bdyw, "NetrecBackend__pseudonymous_id_timeout_ms", 200L);
        bdyx.m91610a(bdyw, "Netrec__Backend__use_pseudonymous", false);
    }

    /* renamed from: a */
    public final boolean mo82409a() {
        return ((Boolean) f185336a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82410b() {
        return ((Boolean) f185337b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final double mo82411c() {
        return ((Double) f185338c.mo58455c()).doubleValue();
    }

    /* renamed from: d */
    public final String mo82412d() {
        return (String) f185339d.mo58455c();
    }

    /* renamed from: e */
    public final long mo82413e() {
        return ((Long) f185340e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo82414f() {
        return ((Long) f185341f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final String mo82415g() {
        return (String) f185342g.mo58455c();
    }

    /* renamed from: h */
    public final long mo82416h() {
        return ((Long) f185343h.mo58455c()).longValue();
    }
}
