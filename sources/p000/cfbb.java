package p000;

/* renamed from: cfbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfbb implements cfba {

    /* renamed from: a */
    public static final bdyx f183556a;

    /* renamed from: b */
    public static final bdyx f183557b;

    /* renamed from: c */
    public static final bdyx f183558c;

    /* renamed from: d */
    public static final bdyx f183559d;

    /* renamed from: e */
    public static final bdyx f183560e;

    /* renamed from: f */
    public static final bdyx f183561f;

    /* renamed from: g */
    public static final bdyx f183562g;

    /* renamed from: h */
    public static final bdyx f183563h;

    /* renamed from: i */
    public static final bdyx f183564i;

    /* renamed from: j */
    public static final bdyx f183565j;

    /* renamed from: k */
    public static final bdyx f183566k;

    /* renamed from: l */
    public static final bdyx f183567l;

    /* renamed from: m */
    public static final bdyx f183568m;

    /* renamed from: n */
    public static final bdyx f183569n;

    /* renamed from: o */
    public static final bdyx f183570o;

    /* renamed from: p */
    public static final bdyx f183571p;

    /* renamed from: q */
    public static final bdyx f183572q;

    /* renamed from: r */
    public static final bdyx f183573r;

    /* renamed from: s */
    public static final bdyx f183574s;

    /* renamed from: t */
    public static final bdyx f183575t;

    /* renamed from: u */
    public static final bdyx f183576u;

    /* renamed from: v */
    public static final bdyx f183577v;

    /* renamed from: w */
    public static final bdyx f183578w;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.locationsharing")).mo58445a("location_sharing.");
        f183556a = bdyx.m91609a(a, "account_central_url", "https://myaccount.google.com/locationsharing");
        f183557b = bdyx.m91609a(a, "add_name_url", "https://myaccount.google.com/name");
        f183558c = bdyx.m91609a(a, "api_path", "/socialuserlocation/v1/userLocationFrontend/");
        f183559d = bdyx.m91609a(a, "api_whitelist", "");
        f183560e = bdyx.m91609a(a, "apiary_trace", "");
        f183561f = bdyx.m91610a(a, "auto_location_reporting_opt_in", false);
        f183562g = bdyx.m91607a(a, "default_temporary_index", 3L);
        f183563h = bdyx.m91610a(a, "disable_share_edits", false);
        f183564i = bdyx.m91610a(a, "disable_whitelist_for_test", false);
        f183565j = bdyx.m91610a(a, "enable_frequent_contacts", true);
        f183566k = bdyx.m91610a(a, "enable_gdpr_compliance", true);
        f183567l = bdyx.m91610a(a, "enable_location_sharing_preference", false);
        f183568m = bdyx.m91610a(a, "enable_logging", false);
        f183569n = bdyx.m91610a(a, "enable_module_version_notification", false);
        bdyx.m91610a(a, "enable_read_only", true);
        f183570o = bdyx.m91609a(a, "help_url", "https://support.google.com/accounts");
        f183571p = bdyx.m91610a(a, "hide_edit_shares_button", true);
        f183572q = bdyx.m91610a(a, "LocationSharing__huxley_strings", false);
        f183573r = bdyx.m91607a(a, "max_burst_duration_ms", 3600000L);
        f183574s = bdyx.m91609a(a, "search_method_types", "google;email;phone");
        f183575t = bdyx.m91609a(a, "server_api_scope", "https://www.googleapis.com/auth/social.userlocation");
        f183576u = bdyx.m91609a(a, "server_url", "https://www.googleapis.com");
        f183577v = bdyx.m91609a(a, "settings_whitelist", "");
        f183578w = bdyx.m91609a(a, "temporary_times_minutes", "15,30,45,60,120,180,240,300,360,420,480,540,600,660,720,1440,2880,4320");
    }

    /* renamed from: a */
    public final String mo80778a() {
        return (String) f183556a.mo58455c();
    }

    /* renamed from: b */
    public final String mo80779b() {
        return (String) f183557b.mo58455c();
    }

    /* renamed from: c */
    public final String mo80780c() {
        return (String) f183558c.mo58455c();
    }

    /* renamed from: d */
    public final String mo80781d() {
        return (String) f183559d.mo58455c();
    }

    /* renamed from: e */
    public final String mo80782e() {
        return (String) f183560e.mo58455c();
    }

    /* renamed from: f */
    public final boolean mo80783f() {
        return ((Boolean) f183561f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final long mo80784g() {
        return ((Long) f183562g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final boolean mo80785h() {
        return ((Boolean) f183563h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo80786i() {
        return ((Boolean) f183564i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo80787j() {
        return ((Boolean) f183565j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo80788k() {
        return ((Boolean) f183566k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo80789l() {
        return ((Boolean) f183567l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo80790m() {
        return ((Boolean) f183568m.mo58455c()).booleanValue();
    }

    /* renamed from: n */
    public final boolean mo80791n() {
        return ((Boolean) f183569n.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final String mo80792o() {
        return (String) f183570o.mo58455c();
    }

    /* renamed from: p */
    public final boolean mo80793p() {
        return ((Boolean) f183571p.mo58455c()).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo80794q() {
        return ((Boolean) f183572q.mo58455c()).booleanValue();
    }

    /* renamed from: r */
    public final long mo80795r() {
        return ((Long) f183573r.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final String mo80796s() {
        return (String) f183574s.mo58455c();
    }

    /* renamed from: t */
    public final String mo80797t() {
        return (String) f183575t.mo58455c();
    }

    /* renamed from: u */
    public final String mo80798u() {
        return (String) f183576u.mo58455c();
    }

    /* renamed from: v */
    public final String mo80799v() {
        return (String) f183577v.mo58455c();
    }

    /* renamed from: w */
    public final String mo80800w() {
        return (String) f183578w.mo58455c();
    }
}
