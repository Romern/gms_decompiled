package p000;

/* renamed from: cbrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbrk implements cbrj {

    /* renamed from: a */
    public static final bdyx f178137a;

    /* renamed from: b */
    public static final bdyx f178138b;

    /* renamed from: c */
    public static final bdyx f178139c;

    /* renamed from: d */
    public static final bdyx f178140d;

    /* renamed from: e */
    public static final bdyx f178141e;

    /* renamed from: f */
    public static final bdyx f178142f;

    /* renamed from: g */
    public static final bdyx f178143g;

    /* renamed from: h */
    public static final bdyx f178144h;

    /* renamed from: i */
    public static final bdyx f178145i;

    /* renamed from: j */
    public static final bdyx f178146j;

    /* renamed from: k */
    public static final bdyx f178147k;

    /* renamed from: l */
    public static final bdyx f178148l;

    /* renamed from: m */
    public static final bdyx f178149m;

    /* renamed from: n */
    public static final bdyx f178150n;

    /* renamed from: o */
    public static final bdyx f178151o;

    /* renamed from: p */
    public static final bdyx f178152p;

    /* renamed from: q */
    public static final bdyx f178153q;

    /* renamed from: r */
    public static final bdyx f178154r;

    /* renamed from: s */
    public static final bdyx f178155s;

    /* renamed from: t */
    public static final bdyx f178156t;

    /* renamed from: u */
    public static final bdyx f178157u;

    /* renamed from: v */
    public static final bdyx f178158v;

    /* renamed from: w */
    public static final bdyx f178159w;

    /* renamed from: x */
    public static final bdyx f178160x;

    /* renamed from: y */
    public static final bdyx f178161y;

    /* renamed from: z */
    public static final bdyx f178162z;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.accountsettings")).mo58445a("gms:accountsettings:");
        f178137a = bdyx.m91609a(a, "Config__accountChooserUrl", "https://accounts.google.com/AccountChooser");
        f178138b = bdyx.m91607a(a, "Config__backend_api_timeout_ms", 30000L);
        f178139c = bdyx.m91609a(a, "Config__browsable_screen_ids_whitelist_regex", "(1|200|400|502|527)");
        bdyx.m91610a(a, "Config__dark_mode_on_old_platforms_enabled", false);
        f178140d = bdyx.m91609a(a, "Config__emergency_info_main_intent", "intent:#Intent;action=com.google.android.apps.safetyhub.ME_CARD;package=com.google.android.apps.safetyhub;end");
        f178141e = bdyx.m91610a(a, "Config__enable_debug_menu_options", false);
        f178142f = bdyx.m91610a(a, "Config__enable_mg_purging", true);
        f178143g = bdyx.m91610a(a, "Config__enable_webviews", true);
        f178144h = bdyx.m91609a(a, "Config__fallback_url_whitelist_regex", "https://(myaccount|takeout)\\.google\\.com/.*");
        bdyx.m91609a(a, "Config__google_account_url", "https://myaccount.google.com");
        f178145i = bdyx.m91609a(a, "Config__google_payments_intent", "");
        f178146j = bdyx.m91609a(a, "Config__google_payments_url", "https://pay.google.com/payments");
        f178147k = bdyx.m91607a(a, "Config__heartbeat_ping_end_time_sec", 300L);
        f178148l = bdyx.m91607a(a, "Config__heartbeat_ping_start_time_sec", 7L);
        f178149m = bdyx.m91609a(a, "Config__oauth_scope", "https://www.googleapis.com/auth/account_settings_mobile");
        f178150n = bdyx.m91607a(a, "Config__people_api_timeout_ms", 30000L);
        f178151o = bdyx.m91609a(a, "__phenotype_server_token", "");
        f178152p = bdyx.m91607a(a, "Config__preconnect_refresh_time_ms", 240000L);
        f178153q = bdyx.m91609a(a, "Config__profile_picture_dialog_help_url", "https://support.google.com/accounts/answer/6304920");
        bdyx.m91609a(a, "Config__query_parameter_whitelist_regex", "utm_.*|rapt|anexp|rfn|rfnc|et|eid|order_id");
        f178154r = bdyx.m91607a(a, "Config__screen_max_lifetime_ms", 1209600000L);
        f178155s = bdyx.m91607a(a, "Config__screen_purge_flex_sec", 43200L);
        f178156t = bdyx.m91607a(a, "Config__screen_purge_period_sec", 604800L);
        f178157u = bdyx.m91609a(a, "Config__server_hostname", "accountsettingsmobile-pa.googleapis.com");
        f178158v = bdyx.m91607a(a, "Config__server_port", 443L);
        f178159w = bdyx.m91607a(a, "Config__stable_screen_stale_time_ms", 604800000L);
        f178160x = bdyx.m91607a(a, "Config__unstable_screen_stale_time_ms", 300000L);
        f178161y = bdyx.m91607a(a, "Config__webview_version_cache_expiration_time_ms", 300000L);
        f178162z = bdyx.m91610a(a, "Config__zero_party_debug_google_setting_items_enabled", false);
    }

    /* renamed from: a */
    public final String mo75251a() {
        return (String) f178137a.mo58455c();
    }

    /* renamed from: b */
    public final long mo75252b() {
        return ((Long) f178138b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final String mo75253c() {
        return (String) f178139c.mo58455c();
    }

    /* renamed from: d */
    public final String mo75254d() {
        return (String) f178140d.mo58455c();
    }

    /* renamed from: e */
    public final boolean mo75255e() {
        return ((Boolean) f178141e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo75256f() {
        return ((Boolean) f178142f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo75257g() {
        return ((Boolean) f178143g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final String mo75258h() {
        return (String) f178144h.mo58455c();
    }

    /* renamed from: i */
    public final String mo75259i() {
        return (String) f178145i.mo58455c();
    }

    /* renamed from: j */
    public final String mo75260j() {
        return (String) f178146j.mo58455c();
    }

    /* renamed from: k */
    public final long mo75261k() {
        return ((Long) f178147k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final long mo75262l() {
        return ((Long) f178148l.mo58455c()).longValue();
    }

    /* renamed from: m */
    public final String mo75263m() {
        return (String) f178149m.mo58455c();
    }

    /* renamed from: n */
    public final long mo75264n() {
        return ((Long) f178150n.mo58455c()).longValue();
    }

    /* renamed from: o */
    public final String mo75265o() {
        return (String) f178151o.mo58455c();
    }

    /* renamed from: p */
    public final long mo75266p() {
        return ((Long) f178152p.mo58455c()).longValue();
    }

    /* renamed from: q */
    public final String mo75267q() {
        return (String) f178153q.mo58455c();
    }

    /* renamed from: r */
    public final long mo75268r() {
        return ((Long) f178154r.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final long mo75269s() {
        return ((Long) f178155s.mo58455c()).longValue();
    }

    /* renamed from: t */
    public final long mo75270t() {
        return ((Long) f178156t.mo58455c()).longValue();
    }

    /* renamed from: u */
    public final String mo75271u() {
        return (String) f178157u.mo58455c();
    }

    /* renamed from: v */
    public final long mo75272v() {
        return ((Long) f178158v.mo58455c()).longValue();
    }

    /* renamed from: w */
    public final long mo75273w() {
        return ((Long) f178159w.mo58455c()).longValue();
    }

    /* renamed from: x */
    public final long mo75274x() {
        return ((Long) f178160x.mo58455c()).longValue();
    }

    /* renamed from: y */
    public final long mo75275y() {
        return ((Long) f178161y.mo58455c()).longValue();
    }

    /* renamed from: z */
    public final boolean mo75276z() {
        return ((Boolean) f178162z.mo58455c()).booleanValue();
    }
}
