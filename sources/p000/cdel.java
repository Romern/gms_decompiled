package p000;

/* renamed from: cdel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdel implements cdek {

    /* renamed from: a */
    public static final bdyx f180587a;

    /* renamed from: b */
    public static final bdyx f180588b;

    /* renamed from: c */
    public static final bdyx f180589c;

    /* renamed from: d */
    public static final bdyx f180590d;

    /* renamed from: e */
    public static final bdyx f180591e;

    /* renamed from: f */
    public static final bdyx f180592f;

    /* renamed from: g */
    public static final bdyx f180593g;

    /* renamed from: h */
    public static final bdyx f180594h;

    /* renamed from: i */
    public static final bdyx f180595i;

    /* renamed from: j */
    public static final bdyx f180596j;

    /* renamed from: k */
    public static final bdyx f180597k;

    /* renamed from: l */
    public static final bdyx f180598l;

    /* renamed from: m */
    public static final bdyx f180599m;

    /* renamed from: n */
    public static final bdyx f180600n;

    /* renamed from: o */
    public static final bdyx f180601o;

    /* renamed from: p */
    public static final bdyx f180602p;

    /* renamed from: q */
    public static final bdyx f180603q;

    /* renamed from: r */
    public static final bdyx f180604r;

    /* renamed from: s */
    public static final bdyx f180605s;

    /* renamed from: t */
    public static final bdyx f180606t;

    /* renamed from: u */
    public static final bdyx f180607u;

    /* renamed from: v */
    public static final bdyx f180608v;

    /* renamed from: w */
    public static final bdyx f180609w;

    /* renamed from: x */
    public static final bdyx f180610x;

    /* renamed from: y */
    public static final bdyx f180611y;

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
        bdyw a = new bdyw("direct_boot:com.google.android.gms.playlog.uploader").mo58445a("gms:playlog:uploader:");
        f180587a = bdyx.m91607a(a, "ClearcutUploader__apache_socket_timeout_millis", 60000L);
        f180588b = bdyx.m91609a(a, "auth_token_service", "androidmarket");
        f180589c = bdyx.m91609a(a, "batch_server_url", "https://play.googleapis.com/log/batch");
        f180590d = bdyx.m91610a(a, "ClearcutUploader__check_radio_active", true);
        f180591e = bdyx.m91610a(a, "ClearcutUploader__check_tos_consent_before_upload", true);
        f180592f = bdyx.m91607a(a, "connection_timeout_millis", 30000L);
        f180593g = bdyx.m91610a(a, "debug", false);
        f180594h = bdyx.m91610a(a, "debug_allow_http", false);
        f180595i = bdyx.m91610a(a, "debug_ignore_response", false);
        f180596j = bdyx.m91610a(a, "ClearcutUploader__enable_cronet", false);
        f180597k = bdyx.m91610a(a, "ClearcutUploader__enable_pseudonymous_id_compare_and_set", true);
        bdyx.m91610a(a, "ClearcutUploader__enforce_apache_socket_timeout", true);
        f180598l = bdyx.m91609a(a, "ClearcutUploader__log_upload_transport", "APACHE_HTTP");
        f180599m = bdyx.m91607a(a, "max_log_events_size_bytes", 65536L);
        bdyx.m91607a(a, "max_log_events_size_bytes ", 65536L);
        f180600n = bdyx.m91607a(a, "max_redirects", 5L);
        f180601o = bdyx.m91609a(a, "oauth2_developer_code", "");
        f180602p = bdyx.m91607a(a, "qos_default_task_interval_millis", 3600000L);
        f180603q = bdyx.m91607a(a, "qos_oneoff_start_min_millis", 5000L);
        f180604r = bdyx.m91607a(a, "qos_silent_window_min_millis", 10000L);
        f180605s = bdyx.m91607a(a, "qos_unmetered_or_daily_interval_millis", 72000000L);
        f180606t = bdyx.m91607a(a, "qos_unmetered_task_interval_millis", 3600000L);
        f180607u = bdyx.m91607a(a, "ClearcutUploader__read_timeout_millis", 60000L);
        f180608v = bdyx.m91610a(a, "ClearcutUploader__remove_fast_tier_scheduling_after_upload", false);
        f180609w = bdyx.m91610a(a, "ClearcutUploader__skip_cookie_header_quoting", false);
        bdyx.m91610a(a, "ClearcutUploader__stop_upload_personal_logs_with_null_auth_token", true);
        bdyx.m91610a(a, "ClearcutUploader__switch_to_pseudonymous_api", false);
        f180610x = bdyx.m91610a(a, "ClearcutUploader__upload_zwieback_reset_time", false);
        bdyx.m91610a(a, "use_http_url_connection", false);
        f180611y = bdyx.m91610a(a, "ClearcutUploader__use_system_clock_for_external_timestamp", false);
    }

    /* renamed from: a */
    public final long mo77334a() {
        return ((Long) f180587a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final String mo77335b() {
        return (String) f180588b.mo58455c();
    }

    /* renamed from: c */
    public final String mo77336c() {
        return (String) f180589c.mo58455c();
    }

    /* renamed from: d */
    public final boolean mo77337d() {
        return ((Boolean) f180590d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo77338e() {
        return ((Boolean) f180591e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final long mo77339f() {
        return ((Long) f180592f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final boolean mo77340g() {
        return ((Boolean) f180593g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo77341h() {
        return ((Boolean) f180594h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo77342i() {
        return ((Boolean) f180595i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo77343j() {
        return ((Boolean) f180596j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo77344k() {
        return ((Boolean) f180597k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final String mo77345l() {
        return (String) f180598l.mo58455c();
    }

    /* renamed from: m */
    public final long mo77346m() {
        return ((Long) f180599m.mo58455c()).longValue();
    }

    /* renamed from: n */
    public final long mo77347n() {
        return ((Long) f180600n.mo58455c()).longValue();
    }

    /* renamed from: o */
    public final String mo77348o() {
        return (String) f180601o.mo58455c();
    }

    /* renamed from: p */
    public final long mo77349p() {
        return ((Long) f180602p.mo58455c()).longValue();
    }

    /* renamed from: q */
    public final long mo77350q() {
        return ((Long) f180603q.mo58455c()).longValue();
    }

    /* renamed from: r */
    public final long mo77351r() {
        return ((Long) f180604r.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final long mo77352s() {
        return ((Long) f180605s.mo58455c()).longValue();
    }

    /* renamed from: t */
    public final long mo77353t() {
        return ((Long) f180606t.mo58455c()).longValue();
    }

    /* renamed from: u */
    public final long mo77354u() {
        return ((Long) f180607u.mo58455c()).longValue();
    }

    /* renamed from: v */
    public final boolean mo77355v() {
        return ((Boolean) f180608v.mo58455c()).booleanValue();
    }

    /* renamed from: w */
    public final boolean mo77356w() {
        return ((Boolean) f180609w.mo58455c()).booleanValue();
    }

    /* renamed from: x */
    public final boolean mo77357x() {
        return ((Boolean) f180610x.mo58455c()).booleanValue();
    }

    /* renamed from: y */
    public final boolean mo77358y() {
        return ((Boolean) f180611y.mo58455c()).booleanValue();
    }
}
