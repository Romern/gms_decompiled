package p000;

/* renamed from: cbvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbvs implements cbvq {

    /* renamed from: a */
    public static final bdyx f178352a;

    /* renamed from: b */
    public static final bdyx f178353b;

    /* renamed from: c */
    public static final bdyx f178354c;

    /* renamed from: d */
    public static final bdyx f178355d;

    /* renamed from: e */
    public static final bdyx f178356e;

    /* renamed from: f */
    public static final bdyx f178357f;

    /* renamed from: g */
    public static final bdyx f178358g;

    /* renamed from: h */
    public static final bdyx f178359h;

    /* renamed from: i */
    public static final bdyx f178360i;

    /* renamed from: j */
    public static final bdyx f178361j;

    /* renamed from: k */
    public static final bdyx f178362k;

    /* renamed from: l */
    public static final bdyx f178363l;

    /* renamed from: m */
    public static final bdyx f178364m;

    /* renamed from: n */
    public static final bdyx f178365n;

    /* renamed from: o */
    public static final bdyx f178366o;

    /* renamed from: p */
    public static final bdyx f178367p;

    /* renamed from: q */
    public static final bdyx f178368q;

    /* renamed from: r */
    public static final bdyx f178369r;

    /* renamed from: s */
    public static final bdyx f178370s;

    /* renamed from: t */
    public static final bdyx f178371t;

    /* renamed from: u */
    public static final bdyx f178372u;

    /* renamed from: v */
    public static final bdyx f178373v;

    /* renamed from: w */
    public static final bdyx f178374w;

    /* renamed from: x */
    public static final bdyx f178375x;

    /* renamed from: y */
    public static final bdyx f178376y;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.ads"));
        f178352a = bdyx.m91610a(bdyw, "gads:ad_settings_page_reporting:enabled", false);
        f178353b = bdyx.m91609a(bdyw, "adid_prefs_more_url", "https://support.google.com/googleplay/answer/3405269");
        bdyx.m91609a(bdyw, "gms:ads:ads_preferences_base_url", "https://www.google.com/ads/preferences/");
        f178354c = bdyx.m91607a(bdyw, "gads:event_attestation:common_payload_cache_duration_in_ms", 3600000L);
        f178355d = bdyx.m91607a(bdyw, "gads:event_attestation:common_payload_cache_size", 5L);
        try {
            f178356e = bdyx.m91608a(bdyw, "gads:event_attestation:destination_domain_public_key", (bqkr) GeneratedMessageLite.m124014a(bqkr.f141031b, new byte[]{10, 85, 10, 15, 100, 111, 117, 98, 108, 101, 99, 108, 105, 99, 107, 46, 110, 101, 116, 18, 66, 48, 51, 49, 101, 50, 54, 98, 51, 54, 101, 50, 52, 53, 49, 52, 55, 101, 53, 56, 55, 97, 51, 99, 53, 100, 51, 56, 101, 49, 50, 97, 49, 55, 52, 57, 50, 55, 98, 101, 52, 49, 102, 48, 98, 99, 49, 101, 50, 55, 51, 57, 100, 54, 98, 51, 54, 57, 48, 54, 51, 52, 53, 53, 100, 99, 55}), cbvr.f178351a);
            f178357f = bdyx.m91610a(bdyw, "gads:event_attestation:enable_migration", false);
            bdyx.m91610a(bdyw, "enable_gms_adid_setting", true);
            f178358g = bdyx.m91610a(bdyw, "gads:event_attestation:enable_device_integrity", false);
            f178359h = bdyx.m91610a(bdyw, "gads:event_attestation:enable_service", false);
            f178360i = bdyx.m91610a(bdyw, "gads:event_attestation:enable_apk_hash", false);
            f178361j = bdyx.m91610a(bdyw, "gads:event_attestation:enable_apk_hash_uri", false);
            f178362k = bdyx.m91610a(bdyw, "gads:event_attestation:enable_reporting", false);
            bdyx.m91610a(bdyw, "enable_gms_limit_ad_tracking_setting", true);
            f178363l = bdyx.m91610a(bdyw, "gads:impression_attestation:enable_impression", false);
            f178364m = bdyx.m91610a(bdyw, "gads:event_attestation:fetch_signature_with_android_p_api", false);
            f178365n = bdyx.m91607a(bdyw, "gads:event_attestation:device_integrity_token_timeout_in_s", 300L);
            f178366o = bdyx.m91607a(bdyw, "gads:event_attestation:device_integrity_token_max_fetch", 3L);
            f178367p = bdyx.m91607a(bdyw, "gads:event_attestation:oneoff_task_flex_in_s", 3600L);
            f178368q = bdyx.m91607a(bdyw, "gads:event_attestation:periodic_task_flex_in_s", 18000L);
            f178369r = bdyx.m91607a(bdyw, "gads:event_attestation:periodic_task_period_in_s", 86400L);
            f178370s = bdyx.m91610a(bdyw, "gads:event_attestation:create_adid_by_cryptohash", false);
            f178371t = bdyx.m91610a(bdyw, "gads:event_attestation:enable_keystore", true);
            f178372u = bdyx.m91610a(bdyw, "gads:event_attestation:enforce_uuid_version_4", false);
            f178373v = bdyx.m91610a(bdyw, "gads:adid_info_gmscore_upgrade_reporting:enabled", false);
            f178374w = bdyx.m91610a(bdyw, "gads:adid_notification:first_party_check:enabled", true);
            f178375x = bdyx.m91609a(bdyw, "vending_ad_prefs_more_url", "https://www.google.com/ads/preferences/html/mobile-about.html");
            f178376y = bdyx.m91610a(bdyw, "gads:adid_reporting:enabled", false);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"gads:event_attestation:destination_domain_public_key\"");
        }
    }

    /* renamed from: a */
    public final boolean mo75429a() {
        return ((Boolean) f178352a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo75430b() {
        return (String) f178353b.mo58455c();
    }

    /* renamed from: c */
    public final long mo75431c() {
        return ((Long) f178354c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo75432d() {
        return ((Long) f178355d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final bqkr mo75433e() {
        return (bqkr) f178356e.mo58455c();
    }

    /* renamed from: f */
    public final boolean mo75434f() {
        return ((Boolean) f178357f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo75435g() {
        return ((Boolean) f178358g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo75436h() {
        return ((Boolean) f178359h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo75437i() {
        return ((Boolean) f178360i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo75438j() {
        return ((Boolean) f178361j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo75439k() {
        return ((Boolean) f178362k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo75440l() {
        return ((Boolean) f178363l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo75441m() {
        return ((Boolean) f178364m.mo58455c()).booleanValue();
    }

    /* renamed from: n */
    public final long mo75442n() {
        return ((Long) f178365n.mo58455c()).longValue();
    }

    /* renamed from: o */
    public final long mo75443o() {
        return ((Long) f178366o.mo58455c()).longValue();
    }

    /* renamed from: p */
    public final long mo75444p() {
        return ((Long) f178367p.mo58455c()).longValue();
    }

    /* renamed from: q */
    public final long mo75445q() {
        return ((Long) f178368q.mo58455c()).longValue();
    }

    /* renamed from: r */
    public final long mo75446r() {
        return ((Long) f178369r.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final boolean mo75447s() {
        return ((Boolean) f178370s.mo58455c()).booleanValue();
    }

    /* renamed from: t */
    public final boolean mo75448t() {
        return ((Boolean) f178371t.mo58455c()).booleanValue();
    }

    /* renamed from: u */
    public final boolean mo75449u() {
        return ((Boolean) f178372u.mo58455c()).booleanValue();
    }

    /* renamed from: v */
    public final boolean mo75450v() {
        return ((Boolean) f178373v.mo58455c()).booleanValue();
    }

    /* renamed from: w */
    public final boolean mo75451w() {
        return ((Boolean) f178374w.mo58455c()).booleanValue();
    }

    /* renamed from: x */
    public final String mo75452x() {
        return (String) f178375x.mo58455c();
    }

    /* renamed from: y */
    public final boolean mo75453y() {
        return ((Boolean) f178376y.mo58455c()).booleanValue();
    }
}
