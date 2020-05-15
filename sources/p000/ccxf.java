package p000;

/* renamed from: ccxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccxf implements ccxe {

    /* renamed from: a */
    public static final bdyx f180147a;

    /* renamed from: b */
    public static final bdyx f180148b;

    /* renamed from: c */
    public static final bdyx f180149c;

    /* renamed from: d */
    public static final bdyx f180150d;

    /* renamed from: e */
    public static final bdyx f180151e;

    /* renamed from: f */
    public static final bdyx f180152f;

    /* renamed from: g */
    public static final bdyx f180153g;

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
        f180147a = bdyx.m91610a(a, "Analytics__client_feature_usage_analytics_enabled", false);
        f180148b = bdyx.m91610a(a, "Analytics__client_session_analytics_enabled", true);
        f180149c = bdyx.m91610a(a, "Analytics__client_session_analytics_use_module_status_code_mapping", true);
        f180150d = bdyx.m91610a(a, "Analytics__discovery_session_summary_b139756723_fix", true);
        f180151e = bdyx.m91610a(a, "Analytics__discovery_session_summary_enabled", true);
        f180152f = bdyx.m91607a(a, "Analytics__firelog_upload_mode", 0L);
        f180153g = bdyx.m91610a(a, "Analytics__log_lnid", false);
    }

    /* renamed from: a */
    public final boolean mo76965a() {
        return ((Boolean) f180147a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76966b() {
        return ((Boolean) f180148b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76967c() {
        return ((Boolean) f180149c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo76968d() {
        return ((Boolean) f180150d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo76969e() {
        return ((Boolean) f180151e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final long mo76970f() {
        return ((Long) f180152f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final boolean mo76971g() {
        return ((Boolean) f180153g.mo58455c()).booleanValue();
    }
}
