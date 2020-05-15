package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: ipl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ipl {

    /* renamed from: a */
    public static final bdyx f21491a = bdyx.m91607a(f21509s, "reenrollment_window_length_millis", TimeUnit.SECONDS.toMillis(60));

    /* renamed from: b */
    public static final bdyx f21492b = bdyx.m91607a(f21509s, "reenrollment_window_length", TimeUnit.DAYS.toMillis(1));

    /* renamed from: c */
    public static final bdyx f21493c = bdyx.m91609a(f21509s, "enrollment_hostname", "cryptauthenrollment.googleapis.com");

    /* renamed from: d */
    public static final bdyx f21494d = bdyx.m91606a(f21509s, "enrollment_port", 443);

    /* renamed from: e */
    public static final bdyx f21495e = bdyx.m91607a(f21509s, "sevice_deadline_secs", TimeUnit.MINUTES.toSeconds(1));

    /* renamed from: f */
    public static final bdyx f21496f = bdyx.m91609a(f21509s, "oauth_scope", "oauth2:https://www.googleapis.com/auth/cryptauth");

    /* renamed from: g */
    public static final bdyx f21497g = bdyx.m91609a(f21509s, "authorized_entity", "16502139086");

    /* renamed from: h */
    public static final bdyx f21498h = bdyx.m91609a(f21509s, "whitelisted_client", "ScreenlockSync,AuthzenAccountRegistration,ForceRegistration");

    /* renamed from: i */
    public static final bdyx f21499i = bdyx.m91609a(f21509s, "client_name_allowed_force_enrollment", "ForceRegistration");

    /* renamed from: j */
    public static final bdyx f21500j = bdyx.m91606a(f21509s, "new_key_fuzz_period", (int) TimeUnit.MINUTES.toMillis(3));

    /* renamed from: k */
    public static final bdyx f21501k = bdyx.m91606a(f21509s, "new_key_window_period", (int) TimeUnit.HOURS.toMillis(1));

    /* renamed from: l */
    public static final bdyx f21502l = bdyx.m91607a(f21509s, "checkin_delay_millis", TimeUnit.DAYS.toMillis(30));

    /* renamed from: m */
    public static final bdyx f21503m = bdyx.m91607a(f21509s, "retry_attempts", 10L);

    /* renamed from: n */
    public static final bdyx f21504n = bdyx.m91607a(f21509s, "retry_delay_millis", TimeUnit.MINUTES.toMillis(10));

    /* renamed from: o */
    public static final bdyx f21505o = bdyx.m91610a(f21509s, "should_hash_public_key_for_handle", false);

    /* renamed from: p */
    public static final bdyx f21506p = bdyx.m91610a(f21509s, "include_all_feature_metadata_from_database", true);

    /* renamed from: q */
    public static final bdyx f21507q;

    /* renamed from: r */
    public static final bdyx f21508r = bdyx.m91610a(f21509s, "auth_cryptauth_fix_language_tag", true);

    /* renamed from: s */
    private static final bdyw f21509s;

    /* renamed from: t */
    private static final bdyw f21510t;

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
        bdyw a = new bdyw(anef.m64088a("com.google.android.gms.auth_cryptauth")).mo58445a("cryptauth_");
        f21509s = a;
        bdyx.m91605a(a, "backoff_window_length", 1.5d);
        bdyw b = new bdyw(anef.m64088a("com.google.android.gms.magictether")).mo58445a("gms:magictether:").mo58451b("MagicTether__");
        f21510t = b;
        f21507q = bdyx.m91610a(b, "isOnMagicTetherHostWhitelist", false);
    }
}
