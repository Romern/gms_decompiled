package p000;

/* renamed from: ccbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccbf implements ccbe {

    /* renamed from: a */
    public static final bdyx f178713a;

    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth_account")).mo58443a();
        bdyx.m91609a(a, "auth_lookup_account_state_url", "https://android.clients.google.com/auth/lookup/account_state?rt=b");
        bdyx.m91609a(a, "auth_checkname_servlet_path", "https://android.clients.google.com/setup/checkname");
        bdyx.m91609a(a, "auth_factory_reset_protection_validation_url", "https://android.clients.google.com/auth/frp/validation");
        f178713a = bdyx.m91609a(a, "auth_fetch_managing_app_for_user_url", "https://android.clients.google.com/auth/enterprise/fetch_managing_app_for_user?rt=b");
        bdyx.m91609a(a, "auth_reauth_settings_url", "https://android.clients.google.com/auth/reauthsettings");
        bdyx.m91609a(a, "auth_servlet_path", "https://android.clients.google.com/auth");
        bdyx.m91609a(a, "auth_setup_servlet_path", "https://android.clients.google.com/setup");
        bdyx.m91609a(a, "auth_verify_pin_url", "https://android.clients.google.com/auth/verifypin");
    }

    /* renamed from: a */
    public final String mo75739a() {
        return (String) f178713a.mo58455c();
    }
}
