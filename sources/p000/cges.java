package p000;

/* renamed from: cges */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cges implements cgen {

    /* renamed from: a */
    public static final bdyx f186669a;

    /* renamed from: b */
    public static final bdyx f186670b;

    /* renamed from: c */
    public static final bdyx f186671c;

    /* renamed from: d */
    public static final bdyx f186672d;

    /* renamed from: e */
    public static final bdyx f186673e;

    /* renamed from: f */
    public static final bdyx f186674f;

    /* renamed from: g */
    public static final bdyx f186675g;

    /* renamed from: h */
    public static final bdyx f186676h;

    /* renamed from: i */
    public static final bdyx f186677i;

    /* renamed from: j */
    public static final bdyx f186678j;

    /* renamed from: k */
    public static final bdyx f186679k;

    /* renamed from: l */
    public static final bdyx f186680l;

    /* renamed from: m */
    public static final bdyx f186681m;

    /* renamed from: n */
    public static final bdyx f186682n;

    /* renamed from: o */
    public static final bdyx f186683o;

    /* renamed from: p */
    public static final bdyx f186684p;

    /* renamed from: q */
    public static final bdyx f186685q;

    /* renamed from: r */
    public static final bdyx f186686r;

    /* renamed from: s */
    public static final bdyx f186687s;

    /* renamed from: t */
    public static final bdyx f186688t;

    /* renamed from: u */
    public static final bdyx f186689u;

    /* renamed from: v */
    public static final bdyx f186690v;

    /* renamed from: w */
    public static final bdyx f186691w;

    /* renamed from: x */
    public static final bdyx f186692x;

    /* renamed from: y */
    public static final bdyx f186693y;

    /* renamed from: z */
    public static final bdyx f186694z;

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
        bdyw b = new bdyw("direct_boot:com.google.android.gms.phenotype").mo58445a("gms:phenotype:").mo58450b();
        f186669a = bdyx.m91607a(b, "adaptive_window_start_seconds", 14400L);
        f186670b = bdyx.m91610a(b, "Sync__cleanup_developer_db", false);
        f186671c = bdyx.m91607a(b, "connection_timeout_millis", 60000L);
        f186672d = bdyx.m91610a(b, "Sync__detect_flag_corruption4", false);
        bdyx.m91610a(b, "enable_adaptive_poller", true);
        f186673e = bdyx.m91610a(b, "Sync__enable_device_based_sync", false);
        f186674f = bdyx.m91610a(b, "Sync__enable_improved_heterodyne_exception", true);
        f186675g = bdyx.m91610a(b, "Sync__enable_pseudonymous_id_compare_and_set", true);
        bdyx.m91610a(b, "enable_schedule_on_register_delta", true);
        f186676h = bdyx.m91610a(b, "enable_task_reachability", false);
        try {
            f186677i = bdyx.m91608a(b, "Sync__garbage_collection_fetch_reasons", (bydh) GeneratedMessageLite.m124014a(bydh.f165789b, new byte[0]), cgeo.f186665a);
            f186678j = bdyx.m91610a(b, "Sync__guard_against_same_tokens_tag", true);
            f186679k = bdyx.m91610a(b, "Sync__include_client_type", true);
            f186680l = bdyx.m91607a(b, "interval_seconds", 14400L);
            f186681m = bdyx.m91610a(b, "Sync__log_http_error_code", true);
            f186682n = bdyx.m91607a(b, "Sync__read_timeout_millis", 60000L);
            f186683o = bdyx.m91607a(b, "Sync__rebroadcast_min_interval_seconds", -1L);
            f186684p = bdyx.m91610a(b, "Sync__remove_old_config_packages", false);
            f186685q = bdyx.m91610a(b, "Sync__remove_request_config_tag", false);
            f186686r = bdyx.m91610a(b, "Sync__stop_sync_on_pseudonymous_api_error", true);
            f186687s = bdyx.m91610a(b, "Sync__sync_on_checkin", false);
            try {
                f186688t = bdyx.m91608a(b, "Sync__sync_on_delta_blacklist", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[0]), cgep.f186666a);
                f186689u = bdyx.m91610a(b, "Sync__sync_on_flag_corruption", true);
                try {
                    f186690v = bdyx.m91608a(b, "Sync__sync_on_nonsync_params_delta_blacklist", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[]{10, 39, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 111, 111, 103, 108, 101, 113, 117, 105, 99, 107, 115, 101, 97, 114, 99, 104, 98, 111, 120}), cgeq.f186667a);
                    f186691w = bdyx.m91609a(b, "sync_on_params_delta_blacklist", "com.google.android.gms.phenotype,com.google.android.contacts,com.google.android.apps.links#com.google.android.apps.cerebra.links,com.google.android.apps.links#com.google.android.apps.cerebra.links.dogfood,com.google.android.gms.people");
                    try {
                        f186692x = bdyx.m91608a(b, "Sync__unregister_config_packages", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[0]), cger.f186668a);
                        f186693y = bdyx.m91610a(b, "Sync__update_config_hash", true);
                        f186694z = bdyx.m91610a(b, "use_http_url_connection", false);
                    } catch (bxwf e) {
                        throw new AssertionError("Could not parse proto flag \"Sync__unregister_config_packages\"");
                    }
                } catch (bxwf e2) {
                    throw new AssertionError("Could not parse proto flag \"Sync__sync_on_nonsync_params_delta_blacklist\"");
                }
            } catch (bxwf e3) {
                throw new AssertionError("Could not parse proto flag \"Sync__sync_on_delta_blacklist\"");
            }
        } catch (bxwf e4) {
            throw new AssertionError("Could not parse proto flag \"Sync__garbage_collection_fetch_reasons\"");
        }
    }

    /* renamed from: a */
    public final long mo83544a() {
        return ((Long) f186669a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo83545b() {
        return ((Boolean) f186670b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo83546c() {
        return ((Long) f186671c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo83547d() {
        return ((Boolean) f186672d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo83548e() {
        return ((Boolean) f186673e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo83549f() {
        return ((Boolean) f186674f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo83550g() {
        return ((Boolean) f186675g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo83551h() {
        return ((Boolean) f186676h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final bydh mo83552i() {
        return (bydh) f186677i.mo58455c();
    }

    /* renamed from: j */
    public final boolean mo83553j() {
        return ((Boolean) f186678j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo83554k() {
        return ((Boolean) f186679k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final long mo83555l() {
        return ((Long) f186680l.mo58455c()).longValue();
    }

    /* renamed from: m */
    public final boolean mo83556m() {
        return ((Boolean) f186681m.mo58455c()).booleanValue();
    }

    /* renamed from: n */
    public final long mo83557n() {
        return ((Long) f186682n.mo58455c()).longValue();
    }

    /* renamed from: o */
    public final long mo83558o() {
        return ((Long) f186683o.mo58455c()).longValue();
    }

    /* renamed from: p */
    public final boolean mo83559p() {
        return ((Boolean) f186684p.mo58455c()).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo83560q() {
        return ((Boolean) f186685q.mo58455c()).booleanValue();
    }

    /* renamed from: r */
    public final boolean mo83561r() {
        return ((Boolean) f186686r.mo58455c()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo83562s() {
        return ((Boolean) f186687s.mo58455c()).booleanValue();
    }

    /* renamed from: t */
    public final bydj mo83563t() {
        return (bydj) f186688t.mo58455c();
    }

    /* renamed from: u */
    public final boolean mo83564u() {
        return ((Boolean) f186689u.mo58455c()).booleanValue();
    }

    /* renamed from: v */
    public final bydj mo83565v() {
        return (bydj) f186690v.mo58455c();
    }

    /* renamed from: w */
    public final String mo83566w() {
        return (String) f186691w.mo58455c();
    }

    /* renamed from: x */
    public final bydj mo83567x() {
        return (bydj) f186692x.mo58455c();
    }

    /* renamed from: y */
    public final boolean mo83568y() {
        return ((Boolean) f186693y.mo58455c()).booleanValue();
    }

    /* renamed from: z */
    public final boolean mo83569z() {
        return ((Boolean) f186694z.mo58455c()).booleanValue();
    }
}
