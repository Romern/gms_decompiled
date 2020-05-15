package p000;

/* renamed from: cdsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdsg implements cdsc {

    /* renamed from: a */
    public static final bdyx f181636a;

    /* renamed from: b */
    public static final bdyx f181637b;

    /* renamed from: c */
    public static final bdyx f181638c;

    /* renamed from: d */
    public static final bdyx f181639d;

    /* renamed from: e */
    public static final bdyx f181640e;

    /* renamed from: f */
    public static final bdyx f181641f;

    /* renamed from: g */
    public static final bdyx f181642g;

    /* renamed from: h */
    public static final bdyx f181643h;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.enterprise")).mo58443a();
        f181636a = bdyx.m91610a(a, "ZeroTouchFeature__bypass_device_conditions_check", false);
        f181637b = bdyx.m91610a(a, "ZeroTouchFeature__enable_error_ui_in_auth", false);
        bdyx.m91610a(a, "ZeroTouchFeature__enable_forced_factory_reset", false);
        f181638c = bdyx.m91610a(a, "ZeroTouchFeature__enable_full_auto_load_in_loader", false);
        f181639d = bdyx.m91610a(a, "ZeroTouchFeature__enable_zero_touch_in_auth", false);
        f181640e = bdyx.m91607a(a, "ZeroTouchFeature__feature_request_poll_interval_in_seconds", 5L);
        f181641f = bdyx.m91607a(a, "ZeroTouchFeature__feature_request_timeout_in_seconds", 120L);
        bdyx.m91610a(a, "ZeroTouchFeature__financed_devices_supported", true);
        try {
            bdyx.m91608a(a, "ZeroTouchFeature__known_non_managing_device_admins", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 22, 99, 111, 109, 46, 97, 102, 119, 115, 97, 109, 112, 108, 101, 115, 46, 116, 101, 115, 116, 100, 112, 99, 10, 22, 99, 111, 109, 46, 97, 102, 119, 115, 97, 109, 112, 108, 101, 115, 46, 116, 101, 115, 116, 100, 112, 99}), cdsd.f181633a);
            try {
                bdyx.m91608a(a, "ZeroTouchFeature__known_non_managing_device_owners", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 22, 99, 111, 109, 46, 97, 102, 119, 115, 97, 109, 112, 108, 101, 115, 46, 116, 101, 115, 116, 100, 112, 99}), cdse.f181634a);
                f181642g = bdyx.m91609a(a, "ZeroTouchFeature__log_source", "");
                bdyx.m91609a(a, "ZeroTouchFeature__managed_provisioning_params_icon_authority", "com.google.android.gms.policy_enterprise");
                bdyx.m91609a(a, "ZeroTouchFeature__managed_provisioning_params_icon_url_option", "arrow");
                try {
                    bdyx.m91608a(a, "ZeroTouchFeature__manufacturers_with_3p_zero_touch", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 7, 115, 97, 109, 115, 117, 110, 103}), cdsf.f181635a);
                    bdyx.m91610a(a, "ZeroTouchFeature__provisioning_extended_logging", false);
                    bdyx.m91607a(a, "ZeroTouchFeature__provisioning_server_network_timeout_ms", 60000L);
                    bdyx.m91607a(a, "ZeroTouchFeature__provisioning_server_suw_network_timeout_ms", 30000L);
                    bdyx.m91609a(a, "ZeroTouchFeature__provisioning_server_url", "https://staging-afwprovisioning-pa.sandbox.googleapis.com");
                    f181643h = bdyx.m91610a(a, "ZeroTouchFeature__zero_touch_config_present", false);
                    bdyx.m91609a(a, "ZeroTouchFeature__zero_touch_server_response", "");
                    bdyx.m91607a(a, "ZeroTouchFeature__zero_touch_task_rerun_interval_seconds", 300L);
                } catch (bxwf e) {
                    throw new AssertionError("Could not parse proto flag \"ZeroTouchFeature__manufacturers_with_3p_zero_touch\"");
                }
            } catch (bxwf e2) {
                throw new AssertionError("Could not parse proto flag \"ZeroTouchFeature__known_non_managing_device_owners\"");
            }
        } catch (bxwf e3) {
            throw new AssertionError("Could not parse proto flag \"ZeroTouchFeature__known_non_managing_device_admins\"");
        }
    }

    /* renamed from: a */
    public final boolean mo78235a() {
        return ((Boolean) f181636a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78236b() {
        return ((Boolean) f181637b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78237c() {
        return ((Boolean) f181638c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo78238d() {
        return ((Boolean) f181639d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo78239e() {
        return ((Long) f181640e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo78240f() {
        return ((Long) f181641f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final String mo78241g() {
        return (String) f181642g.mo58455c();
    }

    /* renamed from: h */
    public final boolean mo78242h() {
        return ((Boolean) f181643h.mo58455c()).booleanValue();
    }
}
