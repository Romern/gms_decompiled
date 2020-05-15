package p000;

/* renamed from: cfoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfoc implements cfob {

    /* renamed from: a */
    public static final bdyx f184775a;

    /* renamed from: b */
    public static final bdyx f184776b;

    /* renamed from: c */
    public static final bdyx f184777c;

    /* renamed from: d */
    public static final bdyx f184778d;

    /* renamed from: e */
    public static final bdyx f184779e;

    /* renamed from: f */
    public static final bdyx f184780f;

    /* renamed from: g */
    public static final bdyx f184781g;

    /* renamed from: h */
    public static final bdyx f184782h;

    /* renamed from: i */
    public static final bdyx f184783i;

    /* renamed from: j */
    public static final bdyx f184784j;

    /* renamed from: k */
    public static final bdyx f184785k;

    /* renamed from: l */
    public static final bdyx f184786l;

    /* renamed from: m */
    public static final bdyx f184787m;

    /* renamed from: n */
    public static final bdyx f184788n;

    /* renamed from: o */
    public static final bdyx f184789o;

    /* renamed from: p */
    public static final bdyx f184790p;

    /* renamed from: q */
    public static final bdyx f184791q;

    /* renamed from: r */
    public static final bdyx f184792r;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.nearby")).mo58445a("nearbydirect:");
        f184775a = bdyx.m91607a(a, "ble_always_on_mode_grace_before_pause_millis", 2000L);
        f184776b = bdyx.m91607a(a, "ble_always_on_mode_pause_duration_millis", 300000L);
        f184777c = bdyx.m91607a(a, "ble_api_operation_timeout_seconds", 2L);
        f184778d = bdyx.m91607a(a, "ble_cycle_period_when_not_duty_cycling_millis", 3600000L);
        f184779e = bdyx.m91607a(a, "bluetooth_discovery_cycle_period_when_not_duty_cycling_millis", 3600000L);
        f184780f = bdyx.m91610a(a, "direct_bypass_whitelist_check", false);
        f184781g = bdyx.m91609a(a, "debug_whitelist", "com.google.android.apps.testing.devicewhisperer.deviceagents.copresence:EDA6413C3E3A95492114FE07CD953AD897E40D1A,com.google.android.apps.testing.devicewhisperer.deviceagents.nearby:EDA6413C3E3A95492114FE07CD953AD897E40D1A");
        f184782h = bdyx.m91610a(a, "direct_fast_pair_check_current_scan_no_op", true);
        f184783i = bdyx.m91610a(a, "direct_fast_pair_reduce_scan_rate_connected_headset", false);
        f184784j = bdyx.m91610a(a, "direct_fast_pair_thread_safe_scan_history", true);
        f184785k = bdyx.m91610a(a, "disable_fast_pair_scanner_in_nearby_direct", false);
        f184786l = bdyx.m91610a(a, "fake_screen_on_action_enabled", false);
        f184787m = bdyx.m91609a(a, "direct_first_party_whitelist", "");
        f184788n = bdyx.m91607a(a, "low_latency_burst_scan_mode", 2L);
        f184789o = bdyx.m91607a(a, "low_latency_burst_scan_time_millis", 30000L);
        f184790p = bdyx.m91607a(a, "num_scans_in_history", 10L);
        f184791q = bdyx.m91610a(a, "rssi_and_distance_enabled", true);
        f184792r = bdyx.m91607a(a, "screen_on_scan_burst_duration_millis", 6000L);
    }

    /* renamed from: a */
    public final long mo81860a() {
        return ((Long) f184775a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo81861b() {
        return ((Long) f184776b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo81862c() {
        return ((Long) f184777c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo81863d() {
        return ((Long) f184778d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo81864e() {
        return ((Long) f184779e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo81865f() {
        return ((Boolean) f184780f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final String mo81866g() {
        return (String) f184781g.mo58455c();
    }

    /* renamed from: h */
    public final boolean mo81867h() {
        return ((Boolean) f184782h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo81868i() {
        return ((Boolean) f184783i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo81869j() {
        return ((Boolean) f184784j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo81870k() {
        return ((Boolean) f184785k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo81871l() {
        return ((Boolean) f184786l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final String mo81872m() {
        return (String) f184787m.mo58455c();
    }

    /* renamed from: n */
    public final long mo81873n() {
        return ((Long) f184788n.mo58455c()).longValue();
    }

    /* renamed from: o */
    public final long mo81874o() {
        return ((Long) f184789o.mo58455c()).longValue();
    }

    /* renamed from: p */
    public final long mo81875p() {
        return ((Long) f184790p.mo58455c()).longValue();
    }

    /* renamed from: q */
    public final boolean mo81876q() {
        return ((Boolean) f184791q.mo58455c()).booleanValue();
    }

    /* renamed from: r */
    public final long mo81877r() {
        return ((Long) f184792r.mo58455c()).longValue();
    }
}
