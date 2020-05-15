package p000;

/* renamed from: cgxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgxt implements cgxs {

    /* renamed from: a */
    public static final bdyx f187987a;

    /* renamed from: b */
    public static final bdyx f187988b;

    /* renamed from: c */
    public static final bdyx f187989c;

    /* renamed from: d */
    public static final bdyx f187990d;

    /* renamed from: e */
    public static final bdyx f187991e;

    /* renamed from: f */
    public static final bdyx f187992f;

    /* renamed from: g */
    public static final bdyx f187993g;

    /* renamed from: h */
    public static final bdyx f187994h;

    /* renamed from: i */
    public static final bdyx f187995i;

    /* renamed from: j */
    public static final bdyx f187996j;

    /* renamed from: k */
    public static final bdyx f187997k;

    /* renamed from: l */
    public static final bdyx f187998l;

    /* renamed from: m */
    public static final bdyx f187999m;

    /* renamed from: n */
    public static final bdyx f188000n;

    /* renamed from: o */
    public static final bdyx f188001o;

    /* renamed from: p */
    public static final bdyx f188002p;

    /* renamed from: q */
    public static final bdyx f188003q;

    /* renamed from: r */
    public static final bdyx f188004r;

    /* renamed from: s */
    public static final bdyx f188005s;

    /* renamed from: t */
    public static final bdyx f188006t;

    /* renamed from: u */
    public static final bdyx f188007u;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.tapandpay"));
        f187987a = bdyx.m91607a(bdyw, "tap_confirmation_delay_millis", 200L);
        f187988b = bdyx.m91607a(bdyw, "device_lock_sw", 0L);
        f187989c = bdyx.m91607a(bdyw, "device_lock_throttle_seconds", 10L);
        f187990d = bdyx.m91607a(bdyw, "expedited_tap_ui_close_delay_ms", 1750L);
        f187991e = bdyx.m91610a(bdyw, "force_unlock_required_for_testing", false);
        f187992f = bdyx.m91609a(bdyw, "garbage_aid", "FFDDBB9999BBDD");
        f187993g = bdyx.m91610a(bdyw, "garbage_aid_in_ppse_enabled", false);
        f187994h = bdyx.m91607a(bdyw, "max_apdu_count", 20L);
        f187995i = bdyx.m91607a(bdyw, "mc_v2_velocity_check_sw", -1L);
        f187996j = bdyx.m91609a(bdyw, "payment_control_scope_post_v10", "service_sierra");
        f187997k = bdyx.m91609a(bdyw, "payment_control_scope_sandbox", "service_sierrasandbox");
        f187998l = bdyx.m91607a(bdyw, "ppse_only_errors_for_unsupported_ui", 5L);
        f187999m = bdyx.m91607a(bdyw, "tap_event_wait_timeout_millis", 3000L);
        f188000n = bdyx.m91607a(bdyw, "tap_ui_close_delay_ms", 5000L);
        f188001o = bdyx.m91607a(bdyw, "tap_ui_get_cards_timeout_ms", 2000L);
        f188002p = bdyx.m91607a(bdyw, "tap_ui_sequence_delay_ms", 3000L);
        f188003q = bdyx.m91607a(bdyw, "throttle_response_sw", 0L);
        f188004r = bdyx.m91607a(bdyw, "throttling_cdcvm_required_failure_timeout_millis", 10000L);
        f188005s = bdyx.m91607a(bdyw, "throttling_default_timeout_millis", 5000L);
        f188006t = bdyx.m91607a(bdyw, "throttling_max_payment_success_per_session", 1L);
        f188007u = bdyx.m91607a(bdyw, "throttling_payment_success_timeout_millis", 2000L);
    }

    /* renamed from: a */
    public final long mo84689a() {
        return ((Long) f187987a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo84690b() {
        return ((Long) f187988b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo84691c() {
        return ((Long) f187989c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo84692d() {
        return ((Long) f187990d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo84693e() {
        return ((Boolean) f187991e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final String mo84694f() {
        return (String) f187992f.mo58455c();
    }

    /* renamed from: g */
    public final boolean mo84695g() {
        return ((Boolean) f187993g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final long mo84696h() {
        return ((Long) f187994h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo84697i() {
        return ((Long) f187995i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final String mo84698j() {
        return (String) f187996j.mo58455c();
    }

    /* renamed from: k */
    public final String mo84699k() {
        return (String) f187997k.mo58455c();
    }

    /* renamed from: l */
    public final long mo84700l() {
        return ((Long) f187998l.mo58455c()).longValue();
    }

    /* renamed from: m */
    public final long mo84701m() {
        return ((Long) f187999m.mo58455c()).longValue();
    }

    /* renamed from: n */
    public final long mo84702n() {
        return ((Long) f188000n.mo58455c()).longValue();
    }

    /* renamed from: o */
    public final long mo84703o() {
        return ((Long) f188001o.mo58455c()).longValue();
    }

    /* renamed from: p */
    public final long mo84704p() {
        return ((Long) f188002p.mo58455c()).longValue();
    }

    /* renamed from: q */
    public final long mo84705q() {
        return ((Long) f188003q.mo58455c()).longValue();
    }

    /* renamed from: r */
    public final long mo84706r() {
        return ((Long) f188004r.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final long mo84707s() {
        return ((Long) f188005s.mo58455c()).longValue();
    }

    /* renamed from: t */
    public final long mo84708t() {
        return ((Long) f188006t.mo58455c()).longValue();
    }

    /* renamed from: u */
    public final long mo84709u() {
        return ((Long) f188007u.mo58455c()).longValue();
    }
}
