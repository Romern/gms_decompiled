package p000;

/* renamed from: cfqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfqd implements cfqc {

    /* renamed from: a */
    public static final bdyx f185422a;

    /* renamed from: b */
    public static final bdyx f185423b;

    /* renamed from: c */
    public static final bdyx f185424c;

    /* renamed from: d */
    public static final bdyx f185425d;

    /* renamed from: e */
    public static final bdyx f185426e;

    /* renamed from: f */
    public static final bdyx f185427f;

    /* renamed from: g */
    public static final bdyx f185428g;

    /* renamed from: h */
    public static final bdyx f185429h;

    /* renamed from: i */
    public static final bdyx f185430i;

    /* renamed from: j */
    public static final bdyx f185431j;

    /* renamed from: k */
    public static final bdyx f185432k;

    /* renamed from: l */
    public static final bdyx f185433l;

    /* renamed from: m */
    public static final bdyx f185434m;

    /* renamed from: n */
    public static final bdyx f185435n;

    /* renamed from: o */
    public static final bdyx f185436o;

    /* renamed from: p */
    public static final bdyx f185437p;

    /* renamed from: q */
    public static final bdyx f185438q;

    /* renamed from: r */
    public static final bdyx f185439r;

    /* renamed from: s */
    public static final bdyx f185440s;

    /* renamed from: t */
    public static final bdyx f185441t;

    /* renamed from: u */
    public static final bdyx f185442u;

    /* renamed from: v */
    public static final bdyx f185443v;

    /* renamed from: w */
    public static final bdyx f185444w;

    /* renamed from: x */
    public static final bdyx f185445x;

    /* renamed from: y */
    public static final bdyx f185446y;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.notifications")).mo58445a("gnots:");
        f185422a = bdyx.m91609a(a, "account_notifier_app", "account_notifier");
        f185423b = bdyx.m91609a(a, "additional_allowed_domains", "");
        f185424c = bdyx.m91609a(a, "auth_minutemaid_sms_capture_pattern", "(?:^|\\W)(?:MMOTP|G-)(\\d{4,})");
        f185425d = bdyx.m91610a(a, "disable_guns_local_storage", false);
        f185426e = bdyx.m91610a(a, "disable_guns_notifications", false);
        f185427f = bdyx.m91609a(a, "excluded_allowed_domains", "");
        f185428g = bdyx.m91609a(a, "guns_js_bridge_additional_allowed_domains", "");
        f185429h = bdyx.m91609a(a, "guns_js_bridge_domain_whitelist", "myaccount.google.com|security.google.com");
        f185430i = bdyx.m91609a(a, "icon_type:alert_event", "alert_event");
        f185431j = bdyx.m91609a(a, "icon_type:google_box", "google_box");
        f185432k = bdyx.m91609a(a, "icon_type:google_logo", "google_logo");
        f185433l = bdyx.m91609a(a, "icon_type:login_event", "login_event");
        f185434m = bdyx.m91609a(a, "icon_type:security_notification", "security_notification");
        f185435n = bdyx.m91609a(a, "icon_type:security_threat", "security_threat");
        f185436o = bdyx.m91610a(a, "include_default_allowed_domains", true);
        f185437p = bdyx.m91607a(a, "maximum_notifications_stored_in_db", 16L);
        f185438q = bdyx.m91607a(a, "notification_expiration_time_usec_for_local_storage", 2160000000000L);
        f185439r = bdyx.m91609a(a, "open_in_browser_url_path_pattern", "");
        f185440s = bdyx.m91609a(a, "plus_apiary_trace", "");
        f185441t = bdyx.m91610a(a, "plus_cache_enabled", false);
        f185442u = bdyx.m91609a(a, "plus_proto_backend_override", "");
        f185443v = bdyx.m91609a(a, "plus_proto_server_api_path", "/plusi/v3/ozInternal");
        f185444w = bdyx.m91609a(a, "plus_proto_server_url", "https://www.googleapis.com");
        f185445x = bdyx.m91610a(a, "plus_verbose_logging", true);
        f185446y = bdyx.m91607a(a, "social_application_id", 208L);
    }

    /* renamed from: a */
    public final String mo82488a() {
        return (String) f185422a.mo58455c();
    }

    /* renamed from: b */
    public final String mo82489b() {
        return (String) f185423b.mo58455c();
    }

    /* renamed from: c */
    public final String mo82490c() {
        return (String) f185424c.mo58455c();
    }

    /* renamed from: d */
    public final boolean mo82491d() {
        return ((Boolean) f185425d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo82492e() {
        return ((Boolean) f185426e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final String mo82493f() {
        return (String) f185427f.mo58455c();
    }

    /* renamed from: g */
    public final String mo82494g() {
        return (String) f185428g.mo58455c();
    }

    /* renamed from: h */
    public final String mo82495h() {
        return (String) f185429h.mo58455c();
    }

    /* renamed from: i */
    public final String mo82496i() {
        return (String) f185430i.mo58455c();
    }

    /* renamed from: j */
    public final String mo82497j() {
        return (String) f185431j.mo58455c();
    }

    /* renamed from: k */
    public final String mo82498k() {
        return (String) f185432k.mo58455c();
    }

    /* renamed from: l */
    public final String mo82499l() {
        return (String) f185433l.mo58455c();
    }

    /* renamed from: m */
    public final String mo82500m() {
        return (String) f185434m.mo58455c();
    }

    /* renamed from: n */
    public final String mo82501n() {
        return (String) f185435n.mo58455c();
    }

    /* renamed from: o */
    public final boolean mo82502o() {
        return ((Boolean) f185436o.mo58455c()).booleanValue();
    }

    /* renamed from: p */
    public final long mo82503p() {
        return ((Long) f185437p.mo58455c()).longValue();
    }

    /* renamed from: q */
    public final long mo82504q() {
        return ((Long) f185438q.mo58455c()).longValue();
    }

    /* renamed from: r */
    public final String mo82505r() {
        return (String) f185439r.mo58455c();
    }

    /* renamed from: s */
    public final String mo82506s() {
        return (String) f185440s.mo58455c();
    }

    /* renamed from: t */
    public final boolean mo82507t() {
        return ((Boolean) f185441t.mo58455c()).booleanValue();
    }

    /* renamed from: u */
    public final String mo82508u() {
        return (String) f185442u.mo58455c();
    }

    /* renamed from: v */
    public final String mo82509v() {
        return (String) f185443v.mo58455c();
    }

    /* renamed from: w */
    public final String mo82510w() {
        return (String) f185444w.mo58455c();
    }

    /* renamed from: x */
    public final boolean mo82511x() {
        return ((Boolean) f185445x.mo58455c()).booleanValue();
    }

    /* renamed from: y */
    public final long mo82512y() {
        return ((Long) f185446y.mo58455c()).longValue();
    }
}
