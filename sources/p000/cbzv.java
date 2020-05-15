package p000;

/* renamed from: cbzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbzv implements cbzu {

    /* renamed from: a */
    public static final bdyx f178601a;

    /* renamed from: b */
    public static final bdyx f178602b;

    /* renamed from: c */
    public static final bdyx f178603c;

    /* renamed from: d */
    public static final bdyx f178604d;

    /* renamed from: e */
    public static final bdyx f178605e;

    /* renamed from: f */
    public static final bdyx f178606f;

    /* renamed from: g */
    public static final bdyx f178607g;

    /* renamed from: h */
    public static final bdyx f178608h;

    /* renamed from: i */
    public static final bdyx f178609i;

    /* renamed from: j */
    public static final bdyx f178610j;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth_account"));
        bdyx.m91610a(bdyw, "d2d_account_setup_enabled", true);
        f178601a = bdyx.m91607a(bdyw, "d2d_cancel_duration", 5000L);
        bdyx.m91605a(bdyw, "d2d_client_backoff_multiplier", 1.0d);
        bdyx.m91607a(bdyw, "d2d_client_max_retries", 3L);
        bdyx.m91607a(bdyw, "d2d_client_timeout_duration_ms", 2500L);
        f178602b = bdyx.m91609a(bdyw, "d2d_notification_uri_format", "https://support.google.com/mobile/?p=tap_and_go");
        f178603c = bdyx.m91610a(bdyw, "d2d_source_enabled", false);
        f178604d = bdyx.m91610a(bdyw, "enable_droidguard", false);
        f178605e = bdyx.m91610a(bdyw, "enable_emm_reauth_broadcast", true);
        f178606f = bdyx.m91610a(bdyw, "enable_emm_setup_in_setup_wizard", true);
        f178607g = bdyx.m91610a(bdyw, "enable_remove_account_after_dm_failure_for_unicorn", true);
        f178608h = bdyx.m91610a(bdyw, "enable_suppress_google_services_screen_for_unicorn", true);
        bdyx.m91610a(bdyw, "minutemaid_securitykey_omit_origin", false);
        f178609i = bdyx.m91607a(bdyw, "uncertified_status", 0L);
        f178610j = bdyx.m91607a(bdyw, "uncertified_status_expiration_time_ms", 0L);
    }

    /* renamed from: a */
    public final long mo75639a() {
        return ((Long) f178601a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final String mo75640b() {
        return (String) f178602b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo75641c() {
        return ((Boolean) f178603c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo75642d() {
        return ((Boolean) f178604d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo75643e() {
        return ((Boolean) f178605e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo75644f() {
        return ((Boolean) f178606f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo75645g() {
        return ((Boolean) f178607g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo75646h() {
        return ((Boolean) f178608h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final long mo75647i() {
        return ((Long) f178609i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final long mo75648j() {
        return ((Long) f178610j.mo58455c()).longValue();
    }
}
