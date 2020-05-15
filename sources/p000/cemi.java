package p000;

/* renamed from: cemi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cemi implements cemh {

    /* renamed from: a */
    public static final bdyx f182979a;

    /* renamed from: b */
    public static final bdyx f182980b;

    /* renamed from: c */
    public static final bdyx f182981c;

    /* renamed from: d */
    public static final bdyx f182982d;

    /* renamed from: e */
    public static final bdyx f182983e;

    /* renamed from: f */
    public static final bdyx f182984f;

    /* renamed from: g */
    public static final bdyx f182985g;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.icing")).mo58443a();
        f182979a = bdyx.m91607a(a, "gms_icing_mdh_channel_config_check_stats_sample_interval", 1000L);
        f182980b = bdyx.m91607a(a, "gms_icing_mdh_channel_config_missing_refresh_max_delay_seconds", 300L);
        f182981c = bdyx.m91607a(a, "gms_icing_mdh_channel_config_missing_refresh_min_delay_seconds", 60L);
        f182982d = bdyx.m91607a(a, "gms_icing_mdh_channel_config_refresh_max_delay_seconds", 864000L);
        f182983e = bdyx.m91607a(a, "gms_icing_mdh_channel_config_refresh_min_delay_seconds", 432000L);
        f182984f = bdyx.m91607a(a, "gms_icing_mdh_fetch_channel_configs_stats_sample_interval", 100L);
        f182985g = bdyx.m91607a(a, "gms_icing_mdh_channel_config_refresh_suppress_scheduling_seconds", 3600L);
    }

    /* renamed from: a */
    public final long mo79340a() {
        return ((Long) f182979a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo79341b() {
        return ((Long) f182980b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo79342c() {
        return ((Long) f182981c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo79343d() {
        return ((Long) f182982d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo79344e() {
        return ((Long) f182983e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo79345f() {
        return ((Long) f182984f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo79346g() {
        return ((Long) f182985g.mo58455c()).longValue();
    }
}
