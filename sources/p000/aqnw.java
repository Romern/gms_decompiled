package p000;

import android.os.SystemProperties;

/* renamed from: aqnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqnw {

    /* renamed from: a */
    public static final bdyx f86400a;

    /* renamed from: b */
    public static final bdyx f86401b = bdyx.m91610a(f86407h, "enable_new_consent_flow", false);

    /* renamed from: c */
    public static final bdyx f86402c = bdyx.m91609a(f86407h, "valid_consent_url_pattern", String.format("^https:\\/\\/(accounts|gaiastaging)[\\w\\.\\-]*\\.(google\\.com|%s)\\/[\\d\\w\\/]+[\\/\\?]?", SystemProperties.get("gms.auth.sw_domain", "google.com").replace(".", "\\.")));

    /* renamed from: d */
    public static final bdyx f86403d = bdyx.m91609a(f86407h, "client_auth_config_host", "clientauthconfig.googleapis.com");

    /* renamed from: e */
    public static final bdyx f86404e = bdyx.m91606a(f86407h, "client_auth_config_port", 443);

    /* renamed from: f */
    public static final bdyx f86405f = bdyx.m91610a(f86407h, "continue_with_account_picker_when_errors_encountered", true);

    /* renamed from: g */
    public static final bdyx f86406g = bdyx.m91610a(f86407h, "browser_consent_show_page_after_js_bridge_callback", true);

    /* renamed from: h */
    private static final bdyw f86407h;

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
        bdyw a = new bdyw(anef.m64088a("com.google.android.gms.signin")).mo58445a("google_sign_in_");
        f86407h = a;
        f86400a = bdyx.m91609a(a, "account_chip_disallowed_build_types", "");
    }
}
