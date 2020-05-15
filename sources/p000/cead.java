package p000;

/* renamed from: cead */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cead implements ceac {

    /* renamed from: A */
    public static final bdyx f182126A;

    /* renamed from: B */
    public static final bdyx f182127B;

    /* renamed from: C */
    public static final bdyx f182128C;

    /* renamed from: a */
    public static final bdyx f182129a;

    /* renamed from: b */
    public static final bdyx f182130b;

    /* renamed from: c */
    public static final bdyx f182131c;

    /* renamed from: d */
    public static final bdyx f182132d;

    /* renamed from: e */
    public static final bdyx f182133e;

    /* renamed from: f */
    public static final bdyx f182134f;

    /* renamed from: g */
    public static final bdyx f182135g;

    /* renamed from: h */
    public static final bdyx f182136h;

    /* renamed from: i */
    public static final bdyx f182137i;

    /* renamed from: j */
    public static final bdyx f182138j;

    /* renamed from: k */
    public static final bdyx f182139k;

    /* renamed from: l */
    public static final bdyx f182140l;

    /* renamed from: m */
    public static final bdyx f182141m;

    /* renamed from: n */
    public static final bdyx f182142n;

    /* renamed from: o */
    public static final bdyx f182143o;

    /* renamed from: p */
    public static final bdyx f182144p;

    /* renamed from: q */
    public static final bdyx f182145q;

    /* renamed from: r */
    public static final bdyx f182146r;

    /* renamed from: s */
    public static final bdyx f182147s;

    /* renamed from: t */
    public static final bdyx f182148t;

    /* renamed from: u */
    public static final bdyx f182149u;

    /* renamed from: v */
    public static final bdyx f182150v;

    /* renamed from: w */
    public static final bdyx f182151w;

    /* renamed from: x */
    public static final bdyx f182152x;

    /* renamed from: y */
    public static final bdyx f182153y;

    /* renamed from: z */
    public static final bdyx f182154z;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.fitness")).mo58445a("fitness.");
        f182129a = bdyx.m91610a(a, "always_initialize_platform_sync", false);
        f182130b = bdyx.m91610a(a, "disable_skip_sync_checks", false);
        f182131c = bdyx.m91610a(a, "down_sync_enabled", true);
        f182132d = bdyx.m91610a(a, "download_points_in_parallel", true);
        f182133e = bdyx.m91607a(a, "phone_to_wear_sync_limit", 500L);
        f182134f = bdyx.m91610a(a, "enabled_chime", true);
        f182135g = bdyx.m91610a(a, "enable_event_driven_sync", true);
        f182136h = bdyx.m91610a(a, "enable_ms2_migration", false);
        bdyx.m91610a(a, "enable_sync_adapter_on_watch", false);
        bdyx.m91610a(a, "wearable_paired_with_android_sync_server", false);
        bdyx.m91610a(a, "wearable_paired_with_ios_sync_server", true);
        bdyx.m91609a(a, "daily_sync_limits_wearable", "");
        f182137i = bdyx.m91607a(a, "event_driven_sync_step_threshold", 1000L);
        f182138j = bdyx.m91610a(a, "init_recording_on_sync", true);
        bdyx.m91610a(a, "init_wearable_recording_on_sync", true);
        f182139k = bdyx.m91607a(a, "initial_sync_window_days", 30L);
        f182140l = bdyx.m91609a(a, "local_only_applications", "");
        f182141m = bdyx.m91607a(a, "max_sync_delay_for_active_session_millis", 14400000L);
        bdyx.m91607a(a, "wearable_max_sync_delay_for_active_session_millis", 14400000L);
        bdyx.m91607a(a, "wearable_phone_max_sync_delay_for_active_session_millis", 14400000L);
        f182142n = bdyx.m91607a(a, "sync_shortest_interval_seconds", 60L);
        f182143o = bdyx.m91607a(a, "sync_bad_network_interval_seconds", 43200L);
        bdyx.m91607a(a, "wearable_min_sync_interval_secs", 60L);
        bdyx.m91607a(a, "wearable_min_sync_interval_non_wifi_secs", 43200L);
        bdyx.m91607a(a, "wearable_phone_min_sync_interval_non_wifi_secs", 43200L);
        bdyx.m91607a(a, "wearable_phone_min_sync_interval_secs", 60L);
        f182144p = bdyx.m91609a(a, "pre_sync_broadcast_syncsource_wait_period_secs", "0=60|1=600");
        f182145q = bdyx.m91609a(a, "sync_all_data_point_on_initial_sync_data_types", "com.google.height,com.google.weight,com.google.blood_pressure,com.google.internal.goal");
        f182146r = bdyx.m91607a(a, "sync_all_data_sources_minimum_period_millis", 43200000L);
        f182147s = bdyx.m91607a(a, "sync_interval_secs", 3600L);
        bdyx.m91607a(a, "wearable_sync_interval_secs", 3600L);
        bdyx.m91607a(a, "wearable_phone_sync_interval_secs", 14400L);
        f182148t = bdyx.m91607a(a, "sync_threads", 10L);
        f182149u = bdyx.m91607a(a, "fitness_client_timeout_secs", 20L);
        f182150v = bdyx.m91607a(a, "upload_sync_additional_batches", 1000L);
        bdyx.m91607a(a, "wearable_upload_sync_additional_batches", 1000L);
        bdyx.m91607a(a, "wearable_phone_upload_sync_additional_batches", 1000L);
        f182151w = bdyx.m91607a(a, "fitness_client_upload_background_data_points_timeout_secs", 200L);
        f182152x = bdyx.m91607a(a, "upload_sync_limit", 900L);
        f182153y = bdyx.m91607a(a, "max_total_data_point_change_size_per_request_bytes", 400000L);
        f182154z = bdyx.m91607a(a, "fitness_client_upload_data_points_timeout_secs", 20L);
        f182126A = bdyx.m91609a(a, "upload_sync_data_source_blacklist_pattern", "");
        f182127B = bdyx.m91610a(a, "use_gcm_network_manager_sync", false);
        f182128C = bdyx.m91610a(a, "use_ms2_sync_api", false);
    }

    /* renamed from: A */
    public final String mo78647A() {
        return (String) f182126A.mo58455c();
    }

    /* renamed from: B */
    public final boolean mo78648B() {
        return ((Boolean) f182127B.mo58455c()).booleanValue();
    }

    /* renamed from: C */
    public final boolean mo78649C() {
        return ((Boolean) f182128C.mo58455c()).booleanValue();
    }

    /* renamed from: a */
    public final boolean mo78650a() {
        return ((Boolean) f182129a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78651b() {
        return ((Boolean) f182130b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78652c() {
        return ((Boolean) f182131c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo78653d() {
        return ((Boolean) f182132d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo78654e() {
        return ((Long) f182133e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo78655f() {
        return ((Boolean) f182134f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo78656g() {
        return ((Boolean) f182135g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo78657h() {
        return ((Boolean) f182136h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final long mo78658i() {
        return ((Long) f182137i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final boolean mo78659j() {
        return ((Boolean) f182138j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final long mo78660k() {
        return ((Long) f182139k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final String mo78661l() {
        return (String) f182140l.mo58455c();
    }

    /* renamed from: m */
    public final long mo78662m() {
        return ((Long) f182141m.mo58455c()).longValue();
    }

    /* renamed from: n */
    public final long mo78663n() {
        return ((Long) f182142n.mo58455c()).longValue();
    }

    /* renamed from: o */
    public final long mo78664o() {
        return ((Long) f182143o.mo58455c()).longValue();
    }

    /* renamed from: p */
    public final String mo78665p() {
        return (String) f182144p.mo58455c();
    }

    /* renamed from: q */
    public final String mo78666q() {
        return (String) f182145q.mo58455c();
    }

    /* renamed from: r */
    public final long mo78667r() {
        return ((Long) f182146r.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final long mo78668s() {
        return ((Long) f182147s.mo58455c()).longValue();
    }

    /* renamed from: t */
    public final long mo78669t() {
        return ((Long) f182148t.mo58455c()).longValue();
    }

    /* renamed from: u */
    public final long mo78670u() {
        return ((Long) f182149u.mo58455c()).longValue();
    }

    /* renamed from: v */
    public final long mo78671v() {
        return ((Long) f182150v.mo58455c()).longValue();
    }

    /* renamed from: w */
    public final long mo78672w() {
        return ((Long) f182151w.mo58455c()).longValue();
    }

    /* renamed from: x */
    public final long mo78673x() {
        return ((Long) f182152x.mo58455c()).longValue();
    }

    /* renamed from: y */
    public final long mo78674y() {
        return ((Long) f182153y.mo58455c()).longValue();
    }

    /* renamed from: z */
    public final long mo78675z() {
        return ((Long) f182154z.mo58455c()).longValue();
    }
}
