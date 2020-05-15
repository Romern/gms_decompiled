package p000;

/* renamed from: cdjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdjk implements cdjj {

    /* renamed from: a */
    public static final bdyx f180983a;

    /* renamed from: b */
    public static final bdyx f180984b;

    /* renamed from: c */
    public static final bdyx f180985c;

    /* renamed from: d */
    public static final bdyx f180986d;

    /* renamed from: e */
    public static final bdyx f180987e;

    /* renamed from: f */
    public static final bdyx f180988f;

    /* renamed from: g */
    public static final bdyx f180989g;

    /* renamed from: h */
    public static final bdyx f180990h;

    /* renamed from: i */
    public static final bdyx f180991i;

    /* renamed from: j */
    public static final bdyx f180992j;

    /* renamed from: k */
    public static final bdyx f180993k;

    /* renamed from: l */
    public static final bdyx f180994l;

    /* renamed from: m */
    public static final bdyx f180995m;

    /* renamed from: n */
    public static final bdyx f180996n;

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
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms")).mo58445a("gms:chimera:");
        f180983a = bdyx.m91607a(a, "ChimeraCheckin__config_checkin_backoff_window_seconds", 600L);
        f180984b = bdyx.m91607a(a, "ChimeraCheckin__config_checkin_flex_seconds", 1800L);
        f180985c = bdyx.m91607a(a, "ChimeraCheckin__config_checkin_initial_backoff_seconds", 3600L);
        f180986d = bdyx.m91607a(a, "ChimeraCheckin__config_checkin_initial_flex_seconds", 120L);
        f180987e = bdyx.m91607a(a, "ChimeraCheckin__config_checkin_interval_secs", 43200L);
        f180988f = bdyx.m91610a(a, "ChimeraCheckin__disable_checkin_if_heterodyne_config_is_too_old", true);
        f180989g = bdyx.m91610a(a, "ChimeraCheckin__enable_gcm_forced_checkin", false);
        f180990h = bdyx.m91610a(a, "ChimeraCheckin__enable_immediate_staleness_logging", false);
        f180991i = bdyx.m91607a(a, "ChimeraCheckin__forced_checkin_moduleset_poll_retries", 7L);
        f180992j = bdyx.m91607a(a, "ChimeraCheckin__heterodyne_serving_version_max_age_secs", 604800L);
        f180993k = bdyx.m91607a(a, "ChimeraCheckin__progress_listener_timeout_secs", 150L);
        f180994l = bdyx.m91610a(a, "ChimeraCheckin__sync_phenotype_on_first_urgent_checkin", true);
        f180995m = bdyx.m91610a(a, "ChimeraCheckin__use_feature_aware_listeners", true);
        f180996n = bdyx.m91607a(a, "ChimeraCheckin__wait_for_heterodyne_serving_version_seconds", 10L);
    }

    /* renamed from: a */
    public final long mo77672a() {
        return ((Long) f180983a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo77673b() {
        return ((Long) f180984b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo77674c() {
        return ((Long) f180985c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo77675d() {
        return ((Long) f180986d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo77676e() {
        return ((Long) f180987e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo77677f() {
        return ((Boolean) f180988f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo77678g() {
        return ((Boolean) f180989g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo77679h() {
        return ((Boolean) f180990h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final long mo77680i() {
        return ((Long) f180991i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final long mo77681j() {
        return ((Long) f180992j.mo58455c()).longValue();
    }

    /* renamed from: k */
    public final long mo77682k() {
        return ((Long) f180993k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final boolean mo77683l() {
        return ((Boolean) f180994l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo77684m() {
        return ((Boolean) f180995m.mo58455c()).booleanValue();
    }

    /* renamed from: n */
    public final long mo77685n() {
        return ((Long) f180996n.mo58455c()).longValue();
    }
}
