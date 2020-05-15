package p000;

/* renamed from: cgzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgzv implements cgzu {

    /* renamed from: a */
    public static final bdyx f188134a;

    /* renamed from: b */
    public static final bdyx f188135b;

    /* renamed from: c */
    public static final bdyx f188136c;

    /* renamed from: d */
    public static final bdyx f188137d;

    /* renamed from: e */
    public static final bdyx f188138e;

    /* renamed from: f */
    public static final bdyx f188139f;

    /* renamed from: g */
    public static final bdyx f188140g;

    /* renamed from: h */
    public static final bdyx f188141h;

    /* renamed from: i */
    public static final bdyx f188142i;

    /* renamed from: j */
    public static final bdyx f188143j;

    /* renamed from: k */
    public static final bdyx f188144k;

    /* renamed from: l */
    public static final bdyx f188145l;

    /* renamed from: m */
    public static final bdyx f188146m;

    /* renamed from: n */
    public static final bdyx f188147n;

    /* renamed from: o */
    public static final bdyx f188148o;

    /* renamed from: p */
    public static final bdyx f188149p;

    /* renamed from: q */
    public static final bdyx f188150q;

    /* renamed from: r */
    public static final bdyx f188151r;

    /* renamed from: s */
    public static final bdyx f188152s;

    /* renamed from: t */
    public static final bdyx f188153t;

    /* renamed from: u */
    public static final bdyx f188154u;

    /* renamed from: v */
    public static final bdyx f188155v;

    /* renamed from: w */
    public static final bdyx f188156w;

    /* renamed from: x */
    public static final bdyx f188157x;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.trustagent"));
        f188134a = bdyx.m91607a(bdyw, "auth_coffee_bluetooth_device_disconnection_timeout_ms", 5000L);
        f188135b = bdyx.m91607a(bdyw, "auth_coffee_bluetooth_eid_data_scan_timeout_ms", 5000L);
        f188136c = bdyx.m91609a(bdyw, "auth_coffee_bluetooth_eid_disabled_eid_versions", "1");
        f188137d = bdyx.m91607a(bdyw, "auth_coffee_bluetooth_eid_enable_notificaiton_timeout_ms", 5000L);
        f188138e = bdyx.m91607a(bdyw, "auth_coffee_bluetooth_eid_migration_check_period_in_days", 7L);
        f188139f = bdyx.m91607a(bdyw, "auth_coffee_bluetooth_eid_provision_timeout_ms", 5000L);
        f188140g = bdyx.m91609a(bdyw, "auth_coffee_bluetooth_secured_connection_timer_intervals_ms", "1000,2000,30000");
        f188141h = bdyx.m91607a(bdyw, "auth_coffee_check_connection_after_pair_ms", 15000L);
        f188142i = bdyx.m91607a(bdyw, "auth_coffee_conflict_notification_interval_millis", 604800000L);
        bdyx.m91610a(bdyw, "auth_coffee_deprecate_nfc_trustlet_for_new_users", false);
        f188143j = bdyx.m91610a(bdyw, "auth_coffee_enable_always_unlock_for_legacy_bluetooth", false);
        f188144k = bdyx.m91610a(bdyw, "auth_coffee_enable_always_unlock_for_secure_bluetooth", true);
        f188145l = bdyx.m91610a(bdyw, "auth_coffee_enable_connectionless_trustagent", false);
        f188146m = bdyx.m91610a(bdyw, "auth_coffee_is_bluetooth_trustlet_enabled", false);
        f188147n = bdyx.m91610a(bdyw, "auth_coffee_is_connectionless_ble_trustlet_enabled", false);
        f188148o = bdyx.m91610a(bdyw, "auth_coffee_is_eid_connection_mode_enabled", false);
        f188149p = bdyx.m91610a(bdyw, "auth_coffee_is_file_logging_enabled", false);
        f188150q = bdyx.m91610a(bdyw, "auth_coffee_is_nfc_trustlet_enabled", false);
        f188151r = bdyx.m91607a(bdyw, "auth_coffee_log_trustlet_configuration_interval_millis", 28800000L);
        f188152s = bdyx.m91610a(bdyw, "auth_coffee_notification_disable_bluetooth_trustlet", false);
        f188153t = bdyx.m91610a(bdyw, "auth_coffee_trust_status_monitor_enabled", false);
        f188154u = bdyx.m91610a(bdyw, "auth_enable_clearcut", false);
        f188155v = bdyx.m91610a(bdyw, "auth_trust_agent_sesame_enabled", false);
        f188156w = bdyx.m91605a(bdyw, "auth_trust_agent_user_present_sample_percentage", 0.0d);
        f188157x = bdyx.m91607a(bdyw, "coffee_eid_setup_bt_opearation_time_ms", 3000L);
    }

    /* renamed from: a */
    public final long mo84816a() {
        return ((Long) f188134a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo84817b() {
        return ((Long) f188135b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final String mo84818c() {
        return (String) f188136c.mo58455c();
    }

    /* renamed from: d */
    public final long mo84819d() {
        return ((Long) f188137d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo84820e() {
        return ((Long) f188138e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo84821f() {
        return ((Long) f188139f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final String mo84822g() {
        return (String) f188140g.mo58455c();
    }

    /* renamed from: h */
    public final long mo84823h() {
        return ((Long) f188141h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo84824i() {
        return ((Long) f188142i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final boolean mo84825j() {
        return ((Boolean) f188143j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo84826k() {
        return ((Boolean) f188144k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo84827l() {
        return ((Boolean) f188145l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo84828m() {
        return ((Boolean) f188146m.mo58455c()).booleanValue();
    }

    /* renamed from: n */
    public final boolean mo84829n() {
        return ((Boolean) f188147n.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final boolean mo84830o() {
        return ((Boolean) f188148o.mo58455c()).booleanValue();
    }

    /* renamed from: p */
    public final boolean mo84831p() {
        return ((Boolean) f188149p.mo58455c()).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo84832q() {
        return ((Boolean) f188150q.mo58455c()).booleanValue();
    }

    /* renamed from: r */
    public final long mo84833r() {
        return ((Long) f188151r.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final boolean mo84834s() {
        return ((Boolean) f188152s.mo58455c()).booleanValue();
    }

    /* renamed from: t */
    public final boolean mo84835t() {
        return ((Boolean) f188153t.mo58455c()).booleanValue();
    }

    /* renamed from: u */
    public final boolean mo84836u() {
        return ((Boolean) f188154u.mo58455c()).booleanValue();
    }

    /* renamed from: v */
    public final boolean mo84837v() {
        return ((Boolean) f188155v.mo58455c()).booleanValue();
    }

    /* renamed from: w */
    public final double mo84838w() {
        return ((Double) f188156w.mo58455c()).doubleValue();
    }

    /* renamed from: x */
    public final long mo84839x() {
        return ((Long) f188157x.mo58455c()).longValue();
    }
}
