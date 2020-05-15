package p000;

/* renamed from: cdfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdfy implements cdfx {

    /* renamed from: a */
    public static final bdyx f180712a;

    /* renamed from: b */
    public static final bdyx f180713b;

    /* renamed from: c */
    public static final bdyx f180714c;

    /* renamed from: d */
    public static final bdyx f180715d;

    /* renamed from: e */
    public static final bdyx f180716e;

    /* renamed from: f */
    public static final bdyx f180717f;

    /* renamed from: g */
    public static final bdyx f180718g;

    /* renamed from: h */
    public static final bdyx f180719h;

    /* renamed from: i */
    public static final bdyx f180720i;

    /* renamed from: j */
    public static final bdyx f180721j;

    /* renamed from: k */
    public static final bdyx f180722k;

    /* renamed from: l */
    public static final bdyx f180723l;

    /* renamed from: m */
    public static final bdyx f180724m;

    /* renamed from: n */
    public static final bdyx f180725n;

    /* renamed from: o */
    public static final bdyx f180726o;

    /* renamed from: p */
    public static final bdyx f180727p;

    /* renamed from: q */
    public static final bdyx f180728q;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.constellation")).mo58445a("gms:constellation:");
        f180712a = bdyx.m91607a(a, "Triggers__consent_based_periodic_trigger_min_interval_secs", 604800L);
        f180713b = bdyx.m91607a(a, "Triggers__consent_checker_initial_jitter_max_delay_millis", 0L);
        f180714c = bdyx.m91607a(a, "Triggers__default_refresh_check_interval_when_unknown_secs", 7200L);
        f180715d = bdyx.m91610a(a, "Triggers__is_api_trigger_enabled", false);
        f180716e = bdyx.m91610a(a, "Triggers__is_gaia_id_checker_enabled", false);
        f180717f = bdyx.m91610a(a, "Triggers__is_gcm_push_trigger_enabled", true);
        f180718g = bdyx.m91610a(a, "Triggers__is_periodic_client_state_checker_enabled", true);
        f180719h = bdyx.m91610a(a, "Triggers__is_periodic_consent_based_trigger_enabled", true);
        f180720i = bdyx.m91610a(a, "Triggers__is_reboot_checker_enabled", true);
        f180721j = bdyx.m91610a(a, "Triggers__is_refresh_checker_enabled", true);
        f180722k = bdyx.m91610a(a, "Triggers__is_retry_sync_enabled", false);
        f180723l = bdyx.m91610a(a, "Triggers__is_sim_slot_returned_by_api", true);
        f180724m = bdyx.m91610a(a, "Triggers__is_sim_state_checker_enabled", true);
        f180725n = bdyx.m91610a(a, "Triggers__is_sim_state_logging_only_enabled", false);
        f180726o = bdyx.m91607a(a, "Triggers__periodic_client_state_checker_min_interval_secs", 86400L);
        f180727p = bdyx.m91607a(a, "Triggers__sim_state_checker_attempt_delay_millis", 20000L);
        bdyx.m91607a(a, "Triggers__sync_refresh_gcm_task_window_secs", 600L);
        f180728q = bdyx.m91607a(a, "Triggers__sync_schedule_gcm_task_terminate_window_millis", 86400000L);
    }

    /* renamed from: a */
    public final long mo77446a() {
        return ((Long) f180712a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo77447b() {
        return ((Long) f180713b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo77448c() {
        return ((Long) f180714c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo77449d() {
        return ((Boolean) f180715d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo77450e() {
        return ((Boolean) f180716e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo77451f() {
        return ((Boolean) f180717f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo77452g() {
        return ((Boolean) f180718g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo77453h() {
        return ((Boolean) f180719h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo77454i() {
        return ((Boolean) f180720i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo77455j() {
        return ((Boolean) f180721j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo77456k() {
        return ((Boolean) f180722k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo77457l() {
        return ((Boolean) f180723l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo77458m() {
        return ((Boolean) f180724m.mo58455c()).booleanValue();
    }

    /* renamed from: n */
    public final boolean mo77459n() {
        return ((Boolean) f180725n.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final long mo77460o() {
        return ((Long) f180726o.mo58455c()).longValue();
    }

    /* renamed from: p */
    public final long mo77461p() {
        return ((Long) f180727p.mo58455c()).longValue();
    }

    /* renamed from: q */
    public final long mo77462q() {
        return ((Long) f180728q.mo58455c()).longValue();
    }
}
