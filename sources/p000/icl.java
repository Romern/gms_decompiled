package p000;

/* renamed from: icl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class icl {

    /* renamed from: a */
    public static final bdyx f20736a;

    /* renamed from: b */
    public static final bdyx f20737b = bdyx.m91609a(f20741f, "plus.oauth_server_api_path", "/o/oauth2");

    /* renamed from: c */
    public static final bdyx f20738c = bdyx.m91610a(f20741f, "google_sign_in_events", true);

    /* renamed from: d */
    public static final bdyx f20739d = bdyx.m91606a(f20741f, "auth_google_sign_in_api_silent_signin_time_out_in_seconds", 10);

    /* renamed from: e */
    public static final bdyx f20740e = bdyx.m91610a(f20741f, "gms:google_sign_in_enable_games_scope_swapping", true);

    /* renamed from: f */
    private static final bdyw f20741f;

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
        bdyw bdyw = new bdyw(anef.m64088a("com.google.android.gms.auth.api.signin"));
        f20741f = bdyw;
        f20736a = bdyx.m91609a(bdyw, "plus.oauth_server_url", "https://accounts.google.com");
        bdyx.m91610a(f20741f, "auth_google_sign_in_api_save_to_yolo_explicit_sign_in", false);
        bdyx.m91610a(f20741f, "auth_google_sign_in_api_save_to_yolo_silent_sign_in", false);
        bdyx.m91606a(f20741f, "auth_google_sign_in_api_save_credentials_connection_time_out_in_seconds", 1);
        bdyx.m91606a(f20741f, "auth_google_sign_in_api_save_credentials_save_time_out_in_seconds", 10);
        bdyx.m91610a(f20741f, "gms:google_sign_in_enable_setting_games_greeting", true);
    }
}
