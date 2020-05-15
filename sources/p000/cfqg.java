package p000;

/* renamed from: cfqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfqg implements cfqf {

    /* renamed from: a */
    public static final bdyx f185449a;

    /* renamed from: b */
    public static final bdyx f185450b;

    /* renamed from: c */
    public static final bdyx f185451c;

    /* renamed from: d */
    public static final bdyx f185452d;

    /* renamed from: e */
    public static final bdyx f185453e;

    /* renamed from: f */
    public static final bdyx f185454f;

    /* renamed from: g */
    public static final bdyx f185455g;

    /* renamed from: h */
    public static final bdyx f185456h;

    /* renamed from: i */
    public static final bdyx f185457i;

    /* renamed from: j */
    public static final bdyx f185458j;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.notifications"));
        f185449a = bdyx.m91609a(bdyw, "NotificationsUseOnePlatformApiFeature__api_server_url", "https://notifications-pa.googleapis.com");
        f185450b = bdyx.m91609a(bdyw, "NotificationsUseOnePlatformApiFeature__apiary_trace", "");
        f185451c = bdyx.m91609a(bdyw, "NotificationsUseOnePlatformApiFeature__base_api_path", "/v1/gmscore/legacy");
        f185452d = bdyx.m91610a(bdyw, "NotificationsUseOnePlatformApiFeature__enable_caching", false);
        f185453e = bdyx.m91610a(bdyw, "NotificationsUseOnePlatformApiFeature__enable_one_platform_api", false);
        f185454f = bdyx.m91610a(bdyw, "NotificationsUseOnePlatformApiFeature__enable_one_platform_tracing", false);
        f185455g = bdyx.m91610a(bdyw, "NotificationsUseOnePlatformApiFeature__enable_verbose_logging", false);
        f185456h = bdyx.m91609a(bdyw, "NotificationsUseOnePlatformApiFeature__fetch_by_identifier_path", "/fetchbyidentifier?alt=proto");
        f185457i = bdyx.m91609a(bdyw, "NotificationsUseOnePlatformApiFeature__oauth_scopes", "https://www.googleapis.com/auth/notifications");
        f185458j = bdyx.m91609a(bdyw, "NotificationsUseOnePlatformApiFeature__set_read_states_path", "/setreadstates?alt=proto");
    }

    /* renamed from: a */
    public final String mo82514a() {
        return (String) f185449a.mo58455c();
    }

    /* renamed from: b */
    public final String mo82515b() {
        return (String) f185450b.mo58455c();
    }

    /* renamed from: c */
    public final String mo82516c() {
        return (String) f185451c.mo58455c();
    }

    /* renamed from: d */
    public final boolean mo82517d() {
        return ((Boolean) f185452d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo82518e() {
        return ((Boolean) f185453e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo82519f() {
        return ((Boolean) f185454f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo82520g() {
        return ((Boolean) f185455g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final String mo82521h() {
        return (String) f185456h.mo58455c();
    }

    /* renamed from: i */
    public final String mo82522i() {
        return (String) f185457i.mo58455c();
    }

    /* renamed from: j */
    public final String mo82523j() {
        return (String) f185458j.mo58455c();
    }
}
