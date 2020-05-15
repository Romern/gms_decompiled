package p000;

/* renamed from: cfsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfsf implements cfse {

    /* renamed from: a */
    public static final bdyx f185545a;

    /* renamed from: b */
    public static final bdyx f185546b;

    /* renamed from: c */
    public static final bdyx f185547c;

    /* renamed from: d */
    public static final bdyx f185548d;

    /* renamed from: e */
    public static final bdyx f185549e;

    /* renamed from: f */
    public static final bdyx f185550f;

    /* renamed from: g */
    public static final bdyx f185551g;

    /* renamed from: h */
    public static final bdyx f185552h;

    /* renamed from: i */
    public static final bdyx f185553i;

    /* renamed from: j */
    public static final bdyx f185554j;

    /* renamed from: k */
    public static final bdyx f185555k;

    /* renamed from: l */
    public static final bdyx f185556l;

    /* renamed from: m */
    public static final bdyx f185557m;

    /* renamed from: n */
    public static final bdyx f185558n;

    /* renamed from: o */
    public static final bdyx f185559o;

    /* renamed from: p */
    public static final bdyx f185560p;

    /* renamed from: q */
    public static final bdyx f185561q;

    /* renamed from: r */
    public static final bdyx f185562r;

    /* renamed from: s */
    public static final bdyx f185563s;

    /* renamed from: t */
    public static final bdyx f185564t;

    /* renamed from: u */
    public static final bdyx f185565u;

    /* renamed from: v */
    public static final bdyx f185566v;

    /* renamed from: w */
    public static final bdyx f185567w;

    /* renamed from: x */
    public static final bdyx f185568x;

    /* renamed from: y */
    public static final bdyx f185569y;

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
        bdyw b = new bdyw(bdyj.m91581a("com.google.android.gms.update")).mo58445a("update_download_").mo58450b();
        f185545a = bdyx.m91610a(b, "allow_aggressive_file_sync", false);
        f185546b = bdyx.m91610a(b, "allow_roaming", true);
        f185547c = bdyx.m91607a(b, "approval_check_frequency", 604800000L);
        bdyx.m91607a(b, "charging_only_backoff_delay", 3600000L);
        f185548d = bdyx.m91607a(b, "connection_timeout", 120000L);
        f185549e = bdyx.m91607a(b, "device_roaming_delay", 3600000L);
        f185550f = bdyx.m91607a(b, "insufficient_space_retry_delay", 86400000L);
        f185551g = bdyx.m91607a(b, "download_low_battery_delay", 3600000L);
        f185552h = bdyx.m91607a(b, "min_cache_space", 104857600L);
        f185553i = bdyx.m91607a(b, "min_data_space", 524288000L);
        f185554j = bdyx.m91607a(b, "network_error_backoff_initial_delay", 60000L);
        f185555k = bdyx.m91607a(b, "network_error_backoff_maximum_delay", 21600000L);
        f185556l = bdyx.m91605a(b, "network_error_backoff_multiply_factor", 1.5d);
        f185557m = bdyx.m91607a(b, "normal_network_selection_timeout", 3000L);
        bdyx.m91607a(b, "notify_time", 0L);
        f185558n = bdyx.m91607a(b, "offpeak_download_operator_mismatch_retry_frequency", 3600000L);
        bdyx.m91610a(b, "pause_resume_by_service_allowed", true);
        f185559o = bdyx.m91607a(b, "paused_by_user_check_frequency", 86400000L);
        f185560p = bdyx.m91610a(b, "prefer_data", false);
        f185561q = bdyx.m91609a(b, "rate_limits", "10000,20000,40000,70000,120000,240000,480000,900000");
        f185562r = bdyx.m91607a(b, "read_timeout", 120000L);
        f185563s = bdyx.m91607a(b, "redownload_backoff_initial_delay", 3600000L);
        f185564t = bdyx.m91607a(b, "redownload_backoff_maximum_delay", 604800000L);
        f185565u = bdyx.m91605a(b, "redownload_backoff_multiply_factor", 3.0d);
        f185566v = bdyx.m91607a(b, "redownload_retry_limit", 2147483647L);
        f185567w = bdyx.m91607a(b, "wifi_only_backoff_delay", 21600000L);
        f185568x = bdyx.m91607a(b, "zero_rate_apn_selection_timeout", 20000L);
        f185569y = bdyx.m91610a(b, "zero_rate_fallback_connection_allowed", false);
    }

    /* renamed from: a */
    public final boolean mo82593a() {
        return ((Boolean) f185545a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82594b() {
        return ((Boolean) f185546b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo82595c() {
        return ((Long) f185547c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo82596d() {
        return ((Long) f185548d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo82597e() {
        return ((Long) f185549e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo82598f() {
        return ((Long) f185550f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo82599g() {
        return ((Long) f185551g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo82600h() {
        return ((Long) f185554j.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo82601i() {
        return ((Long) f185555k.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final double mo82602j() {
        return ((Double) f185556l.mo58455c()).doubleValue();
    }

    /* renamed from: k */
    public final long mo82603k() {
        return ((Long) f185557m.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final long mo82604l() {
        return ((Long) f185558n.mo58455c()).longValue();
    }

    /* renamed from: m */
    public final long mo82605m() {
        return ((Long) f185559o.mo58455c()).longValue();
    }

    /* renamed from: n */
    public final boolean mo82606n() {
        return ((Boolean) f185560p.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final String mo82607o() {
        return (String) f185561q.mo58455c();
    }

    /* renamed from: p */
    public final long mo82608p() {
        return ((Long) f185562r.mo58455c()).longValue();
    }

    /* renamed from: q */
    public final long mo82609q() {
        return ((Long) f185563s.mo58455c()).longValue();
    }

    /* renamed from: r */
    public final long mo82610r() {
        return ((Long) f185564t.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final double mo82611s() {
        return ((Double) f185565u.mo58455c()).doubleValue();
    }

    /* renamed from: t */
    public final long mo82612t() {
        return ((Long) f185566v.mo58455c()).longValue();
    }

    /* renamed from: u */
    public final long mo82613u() {
        return ((Long) f185567w.mo58455c()).longValue();
    }

    /* renamed from: v */
    public final long mo82614v() {
        return ((Long) f185568x.mo58455c()).longValue();
    }

    /* renamed from: w */
    public final boolean mo82615w() {
        return ((Boolean) f185569y.mo58455c()).booleanValue();
    }
}
