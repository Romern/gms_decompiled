package p000;

/* renamed from: cghz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cghz implements cghy {

    /* renamed from: a */
    public static final bdyx f186977a;

    /* renamed from: b */
    public static final bdyx f186978b;

    /* renamed from: c */
    public static final bdyx f186979c;

    /* renamed from: d */
    public static final bdyx f186980d;

    /* renamed from: e */
    public static final bdyx f186981e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.recaptcha")).mo58443a();
        f186977a = bdyx.m91607a(a, "recaptcha:droidguard_handle_expiration_time_seconds", 300L);
        f186978b = bdyx.m91607a(a, "recaptcha:https_connect_timeout_ms", 60000L);
        f186979c = bdyx.m91607a(a, "recaptcha:https_read_timeout_ms", 60000L);
        f186980d = bdyx.m91607a(a, "recaptcha:landing_token_expiration_time_seconds", 86400L);
        f186981e = bdyx.m91609a(a, "recaptcha:recaptcha_http_endpoint", "https://www.google.com");
    }

    /* renamed from: a */
    public final long mo83821a() {
        return ((Long) f186977a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo83822b() {
        return ((Long) f186978b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo83823c() {
        return ((Long) f186979c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo83824d() {
        return ((Long) f186980d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final String mo83825e() {
        return (String) f186981e.mo58455c();
    }
}
