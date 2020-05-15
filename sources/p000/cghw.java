package p000;

/* renamed from: cghw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cghw implements cghv {

    /* renamed from: a */
    public static final bdyx f186968a;

    /* renamed from: b */
    public static final bdyx f186969b;

    /* renamed from: c */
    public static final bdyx f186970c;

    /* renamed from: d */
    public static final bdyx f186971d;

    /* renamed from: e */
    public static final bdyx f186972e;

    /* renamed from: f */
    public static final bdyx f186973f;

    /* renamed from: g */
    public static final bdyx f186974g;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.reachability"));
        f186968a = bdyx.m91610a(bdyw, "ReachabilityGms__data_periodic_sync_enabled", false);
        f186969b = bdyx.m91610a(bdyw, "ReachabilityGms__enable_clearcut_log", false);
        f186970c = bdyx.m91607a(bdyw, "ReachabilityGms__minimum_power_connected_sync_interval_hours", 72L);
        f186971d = bdyx.m91607a(bdyw, "ReachabilityGms__reachability_service_type_upper_bound", 30L);
        f186972e = bdyx.m91610a(bdyw, "ReachabilityGms__reachabilitygms_upload_device_info_enabled", false);
        bdyx.m91610a(bdyw, "ReachabilityGms__upload_device_info_enabled", false);
        f186973f = bdyx.m91609a(bdyw, "ReachabilityGms__white_pages_server_grpc_hostname", "myphonenumbers-pa.googleapis.com");
        f186974g = bdyx.m91607a(bdyw, "ReachabilityGms__white_pages_server_grpc_port", 443L);
    }

    /* renamed from: a */
    public final boolean mo83813a() {
        return ((Boolean) f186968a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83814b() {
        return ((Boolean) f186969b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo83815c() {
        return ((Long) f186970c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo83816d() {
        return ((Long) f186971d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo83817e() {
        return ((Boolean) f186972e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final String mo83818f() {
        return (String) f186973f.mo58455c();
    }

    /* renamed from: g */
    public final long mo83819g() {
        return ((Long) f186974g.mo58455c()).longValue();
    }
}
