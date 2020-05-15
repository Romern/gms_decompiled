package p000;

/* renamed from: hfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hfe {

    /* renamed from: a */
    public static final bdyx f19639a;

    /* renamed from: b */
    public static final bdyx f19640b = bdyx.m91609a(f19645g, "server_path", "/credentials/v1");

    /* renamed from: c */
    public static final bdyx f19641c = bdyx.m91609a(f19645g, "apiary_trace", "");

    /* renamed from: d */
    public static final bdyx f19642d = bdyx.m91609a(f19645g, "server_scope", "https://www.googleapis.com/auth/login_manager");

    /* renamed from: e */
    public static final bdyx f19643e = bdyx.m91609a(f19645g, "help_url", "https://support.google.com/accounts/?p=smartlock");

    /* renamed from: f */
    public static final bdyx f19644f = bdyx.m91610a(f19645g, "log_ui_events", false);

    /* renamed from: g */
    private static final bdyw f19645g;

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
        bdyw a = new bdyw(anef.m64088a("com.google.android.gms.auth.api.credentials")).mo58445a("auth_credentials_api_");
        f19645g = a;
        f19639a = bdyx.m91609a(a, "server_url", "https://www.googleapis.com");
    }
}
