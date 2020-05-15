package p000;

/* renamed from: ccoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccoo implements ccon {

    /* renamed from: a */
    public static final bdyx f179632a;

    /* renamed from: b */
    public static final bdyx f179633b;

    /* renamed from: c */
    public static final bdyx f179634c;

    /* renamed from: d */
    public static final bdyx f179635d;

    /* renamed from: e */
    public static final bdyx f179636e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.backup"));
        f179632a = bdyx.m91610a(bdyw, "WifiD2dFeature__backup_handle_source_wifi_d2d_intent", false);
        f179633b = bdyx.m91607a(bdyw, "WifiD2dFeature__backup_source_post_setup_calls_max_retries", 2L);
        f179634c = bdyx.m91607a(bdyw, "WifiD2dFeature__backup_source_post_setup_calls_timeout_millis", 30000L);
        f179635d = bdyx.m91607a(bdyw, "WifiD2dFeature__backup_wifi_d2d_source_connection_timeout_millis", 180000L);
        f179636e = bdyx.m91607a(bdyw, "WifiD2dFeature__backup_wifi_d2d_source_max_connection_retries", 2L);
    }

    /* renamed from: a */
    public final boolean mo76537a() {
        return ((Boolean) f179632a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo76538b() {
        return ((Long) f179633b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo76539c() {
        return ((Long) f179634c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo76540d() {
        return ((Long) f179635d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo76541e() {
        return ((Long) f179636e.mo58455c()).longValue();
    }
}
