package p000;

/* renamed from: cfmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfmm implements cfmk {

    /* renamed from: a */
    public static final bdyx f184373a;

    /* renamed from: b */
    public static final bdyx f184374b;

    /* renamed from: c */
    public static final bdyx f184375c;

    /* renamed from: d */
    public static final bdyx f184376d;

    /* renamed from: e */
    public static final bdyx f184377e;

    /* renamed from: f */
    public static final bdyx f184378f;

    /* renamed from: g */
    public static final bdyx f184379g;

    /* renamed from: h */
    public static final bdyx f184380h;

    /* renamed from: i */
    public static final bdyx f184381i;

    /* renamed from: j */
    public static final bdyx f184382j;

    /* renamed from: k */
    public static final bdyx f184383k;

    /* renamed from: l */
    public static final bdyx f184384l;

    /* renamed from: m */
    public static final bdyx f184385m;

    /* renamed from: n */
    public static final bdyx f184386n;

    /* renamed from: o */
    public static final bdyx f184387o;

    /* renamed from: p */
    public static final bdyx f184388p;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.mobile_data_plan"));
        f184373a = bdyx.m91607a(bdyw, "ConsentOptOut__consent_status_conversion_earliest_start", 1L);
        f184374b = bdyx.m91607a(bdyw, "ConsentOptOut__consent_status_conversion_latest_start", 10L);
        f184375c = bdyx.m91610a(bdyw, "ConsentOptOut__convert_consent_status_after_time_out", false);
        f184376d = bdyx.m91610a(bdyw, "ConsentOptOut__enable_consent_status_conversion", false);
        f184377e = bdyx.m91610a(bdyw, "ConsentOptOut__enable_device_table_flushing", false);
        f184378f = bdyx.m91610a(bdyw, "ConsentOptOut__enable_hidden_notifications_handling", false);
        f184379g = bdyx.m91610a(bdyw, "ConsentOptOut__enable_timeout_welcome_notification", false);
        try {
            f184380h = bdyx.m91608a(bdyw, "ConsentOptOut__mcc_mnc_list_unsupported_consent", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 5, 53, 48, 50, 49, 54, 10, 5, 53, 50, 48, 48, 53}), cfml.f184372a);
            f184381i = bdyx.m91609a(bdyw, "ConsentOptOut__privacy_policy_url", "https://policies.google.com/privacy");
            f184382j = bdyx.m91610a(bdyw, "ConsentOptOut__report_per_device_consent_status", false);
            f184383k = bdyx.m91610a(bdyw, "ConsentOptOut__show_consent_in_settings", false);
            f184384l = bdyx.m91610a(bdyw, "ConsentOptOut__support_per_device_consent", false);
            f184385m = bdyx.m91609a(bdyw, "ConsentOptOut__support_url", "https://support.google.com/android/answer/9211070");
            f184386n = bdyx.m91609a(bdyw, "ConsentOptOut__terms_url", "https://policies.google.com/terms");
            f184387o = bdyx.m91610a(bdyw, "ConsentOptOut__upgrade_database_for_consent_opt_out", true);
            f184388p = bdyx.m91607a(bdyw, "ConsentOptOut__welcome_notification_time_out_millis", 172800000L);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"ConsentOptOut__mcc_mnc_list_unsupported_consent\"");
        }
    }

    /* renamed from: a */
    public final long mo81478a() {
        return ((Long) f184373a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo81479b() {
        return ((Long) f184374b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo81480c() {
        return ((Boolean) f184375c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo81481d() {
        return ((Boolean) f184376d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo81482e() {
        return ((Boolean) f184377e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo81483f() {
        return ((Boolean) f184378f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo81484g() {
        return ((Boolean) f184379g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final bydj mo81485h() {
        return (bydj) f184380h.mo58455c();
    }

    /* renamed from: i */
    public final String mo81486i() {
        return (String) f184381i.mo58455c();
    }

    /* renamed from: j */
    public final boolean mo81487j() {
        return ((Boolean) f184382j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo81488k() {
        return ((Boolean) f184383k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo81489l() {
        return ((Boolean) f184384l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final String mo81490m() {
        return (String) f184385m.mo58455c();
    }

    /* renamed from: n */
    public final String mo81491n() {
        return (String) f184386n.mo58455c();
    }

    /* renamed from: o */
    public final boolean mo81492o() {
        return ((Boolean) f184387o.mo58455c()).booleanValue();
    }

    /* renamed from: p */
    public final long mo81493p() {
        return ((Long) f184388p.mo58455c()).longValue();
    }
}
