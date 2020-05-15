package p000;

/* renamed from: cekp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cekp implements ceko {

    /* renamed from: a */
    public static final bdyx f182850a;

    /* renamed from: b */
    public static final bdyx f182851b;

    /* renamed from: c */
    public static final bdyx f182852c;

    /* renamed from: d */
    public static final bdyx f182853d;

    /* renamed from: e */
    public static final bdyx f182854e;

    /* renamed from: f */
    public static final bdyx f182855f;

    /* renamed from: g */
    public static final bdyx f182856g;

    /* renamed from: h */
    public static final bdyx f182857h;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.herrevad")).mo58445a("herrevad:");
        f182850a = bdyx.m91610a(a, "allow_frequent_background_observations_for_test", false);
        bdyx.m91610a(a, "HerrevadBackground__background_configure_via_manager", true);
        bdyx.m91610a(a, "background_observation_allow_wakeups", false);
        bdyx.m91607a(a, "background_observation_log_await_millis", 0L);
        bdyx.m91607a(a, "background_observation_min_interval_secs", 21600L);
        f182851b = bdyx.m91607a(a, "background_observation_min_sdk", 23L);
        f182852c = bdyx.m91610a(a, "HerrevadBackground__background_observation_on_cellular_only", true);
        f182853d = bdyx.m91607a(a, "background_observation_task_interval_secs", 3600L);
        bdyx.m91610a(a, "background_observation_use_exact", false);
        bdyx.m91610a(a, "background_observation_use_persistent_process", true);
        f182854e = bdyx.m91610a(a, "enable_background_observation", true);
        bdyx.m91610a(a, "HerrevadBackground__enable_background_observation_by_all_gates", true);
        bdyx.m91610a(a, "enable_background_observation_by_location_history", false);
        f182855f = bdyx.m91610a(a, "enable_herrevad_latency_optimization", false);
        bdyx.m91610a(a, "enable_optimized_passive_observation", true);
        f182856g = bdyx.m91610a(a, "latency_opt_phone_state_change", false);
        f182857h = bdyx.m91610a(a, "passive_observation_network_any", false);
    }

    /* renamed from: a */
    public final boolean mo79228a() {
        return ((Boolean) f182850a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo79229b() {
        return ((Long) f182851b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo79230c() {
        return ((Boolean) f182852c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo79231d() {
        return ((Long) f182853d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo79232e() {
        return ((Boolean) f182854e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo79233f() {
        return ((Boolean) f182855f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo79234g() {
        return ((Boolean) f182856g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo79235h() {
        return ((Boolean) f182857h.mo58455c()).booleanValue();
    }
}
