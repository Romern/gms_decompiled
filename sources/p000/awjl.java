package p000;

/* renamed from: awjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awjl {

    /* renamed from: a */
    public static final bdyw f94539a;

    /* renamed from: b */
    public static final bdyx f94540b;

    /* renamed from: c */
    public static final bdyx f94541c;

    /* renamed from: d */
    public static final bdyx f94542d = bdyx.m91609a(f94539a, "orchestration_test_server_base_path", "https://sandbox.google.com");

    /* renamed from: e */
    public static final bdyx f94543e = bdyx.m91610a(f94539a, "request_context_populate_accounts", true);

    /* renamed from: f */
    public static final bdyx f94544f = bdyx.m91610a(f94539a, "force_ui_for_pre_authorized_apps", false);

    /* renamed from: g */
    public static final bdyx f94545g = bdyx.m91610a(f94539a, "report_service_exceptions", true);

    /* renamed from: h */
    public static final bdyx f94546h = bdyx.m91606a(f94539a, "report_service_exceptions_timeout_millis", 5000);

    /* renamed from: i */
    public static final bdyx f94547i = bdyx.m91609a(f94539a, "validation.price_format", "[0-9]*(\\.[0-9][0-9]?)?");

    /* renamed from: j */
    public static final bdyx f94548j = bdyx.m91610a(f94539a, "filter_touches_when_obscured_for_form_activity", true);

    /* renamed from: k */
    public static final bdyx f94549k = bdyx.m91610a(f94539a, "clear_auto_scroll_triggers_on_new_page", true);

    /* renamed from: l */
    public static final bdyx f94550l = bdyx.m91610a(f94539a, "enable_instrument_selector_header_image", true);

    /* renamed from: m */
    private static final bdyw f94551m;

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
        bdyw b = new bdyw(anef.m64088a("com.google.android.gms.wallet")).mo58445a("wallet.").mo58450b();
        f94539a = b;
        f94540b = bdyx.m91609a(b, "__phenotype_server_token", "");
        bdyw b2 = new bdyw(anef.m64088a("com.google.android.gms.tapandpay")).mo58445a("google_wallet:").mo58450b();
        f94551m = b2;
        f94541c = bdyx.m91609a(b2, "__phenotype_server_token", "");
        bdyx.m91606a(f94539a, "max_apk_bytes_to_read", -1);
    }
}
