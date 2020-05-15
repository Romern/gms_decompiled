package p000;

/* renamed from: celd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class celd implements cela {

    /* renamed from: a */
    public static final bdyx f182878a;

    /* renamed from: b */
    public static final bdyx f182879b;

    /* renamed from: c */
    public static final bdyx f182880c;

    /* renamed from: d */
    public static final bdyx f182881d;

    /* renamed from: e */
    public static final bdyx f182882e;

    /* renamed from: f */
    public static final bdyx f182883f;

    /* renamed from: g */
    public static final bdyx f182884g;

    /* renamed from: h */
    public static final bdyx f182885h;

    /* renamed from: i */
    public static final bdyx f182886i;

    /* renamed from: j */
    public static final bdyx f182887j;

    /* renamed from: k */
    public static final bdyx f182888k;

    /* renamed from: l */
    public static final bdyx f182889l;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.herrevad")).mo58445a("herrevad:");
        bdyx.m91610a(a, "Reporting__always_monitor_gates", true);
        bdyx.m91610a(a, "Reporting__filtering_enabled", false);
        f182878a = bdyx.m91610a(a, "Reporting__gate_on_location", false);
        f182879b = bdyx.m91610a(a, "Reporting__gate_on_location_accuracy", false);
        f182880c = bdyx.m91610a(a, "Reporting__gate_on_usage_reporting", true);
        f182881d = bdyx.m91610a(a, "Reporting__gate_on_user_location_reporting", true);
        f182882e = bdyx.m91607a(a, "Reporting__global_daily_observation_limit", 400L);
        bdyx.m91610a(a, "Reporting__include_report_lag", true);
        f182883f = bdyx.m91610a(a, "Reporting__indoor_outdoor_enabled", false);
        f182884g = bdyx.m91607a(a, "Reporting__lightweight_shim_timeout_millis", 500L);
        bdyx.m91609a(a, "Reporting__location_type_filter_source_packages", "*");
        bdyx.m91609a(a, "Reporting__location_type_filter_values", "5,6,8");
        try {
            f182885h = bdyx.m91608a(a, "Reporting__measurement_type_daily_observation_limits", (caen) bxvk.m124014a(caen.f172838b, new byte[0]), celb.f182876a);
            bdyx.m91610a(a, "Reporting__omit_cell_data_on_wifi", true);
            bdyx.m91610a(a, "Reporting__perap_herrevad_ids_enabled", true);
            bdyx.m91610a(a, "Reporting__rate_limiter_enabled", true);
            f182886i = bdyx.m91609a(a, "Reporting__rate_limiter_source_package_exclusion_list", "");
            f182887j = bdyx.m91607a(a, "Reporting__rate_limiter_threshold_millis", 10000L);
            try {
                f182888k = bdyx.m91608a(a, "Reporting__source_package_daily_observation_limits", (caep) bxvk.m124014a(caep.f172846b, new byte[]{10, -46, 2, 10, 26, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 121, 111, 117, 116, 117, 98, 101, 10, 29, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 121, 111, 117, 116, 117, 98, 101, 46, 116, 118, 10, 36, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 121, 111, 117, 116, 117, 98, 101, 46, 107, 105, 100, 115, 10, 38, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 121, 111, 117, 116, 117, 98, 101, 46, 103, 97, 109, 105, 110, 103, 10, 39, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 121, 111, 117, 116, 117, 98, 101, 46, 105, 110, 115, 116, 97, 110, 116, 10, 38, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 121, 111, 117, 116, 117, 98, 101, 46, 115, 97, 109, 112, 108, 101, 10, 34, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 121, 111, 117, 116, 117, 98, 101, 46, 118, 114, 10, 37, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 121, 111, 117, 116, 117, 98, 101, 46, 109, 97, 103, 110, 111, 10, 41, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 121, 111, 117, 116, 117, 98, 101, 46, 117, 110, 112, 108, 117, 103, 103, 101, 100, 16, 0}), celc.f182877a);
                f182889l = bdyx.m91609a(a, "Reporting__source_package_whitelist", "com.google.android.apps.maps,com.google.android.gm,com.google.android.youtube,com.google.android.youtube.tv,com.google.android.apps.youtube.kids,com.google.android.apps.youtube.gaming,com.google.android.apps.youtube.instant,com.google.android.apps.youtube.sample,com.google.android.apps.youtube.vr,com.google.android.apps.youtube.magno,com.google.android.apps.youtube.unplugged,com.google.android.talk,com.google.android.apps.gmm.car,com.google.android.apps.gmm.qp,com.google.android.apps.gmm.dev,com.google.android.apps.gmm.fishfood,com.google.android.apps.gmm,com.google.android.gms.admob,com.android.chrome,com.chrome.beta,com.chrome.deviceextras.samsung,com.google.android.apps.photos,com.google.android.apps.youtube.music,com.google.android.videos,com.google.android.apps.steen,com.google.android.apps.spectrum,com.google.android.apps.nbu.society,com.google.society,com.android.vending,com.google.android.apps.genie.geniewidget,com.google.android.gms,com.google.android.gms.herrevad");
            } catch (bxwf e) {
                throw new AssertionError("Could not parse proto flag \"Reporting__source_package_daily_observation_limits\"");
            }
        } catch (bxwf e2) {
            throw new AssertionError("Could not parse proto flag \"Reporting__measurement_type_daily_observation_limits\"");
        }
    }

    /* renamed from: a */
    public final boolean mo79250a() {
        return ((Boolean) f182878a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79251b() {
        return ((Boolean) f182879b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79252c() {
        return ((Boolean) f182880c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo79253d() {
        return ((Boolean) f182881d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo79254e() {
        return ((Long) f182882e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo79255f() {
        return ((Boolean) f182883f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final long mo79256g() {
        return ((Long) f182884g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final caen mo79257h() {
        return (caen) f182885h.mo58455c();
    }

    /* renamed from: i */
    public final String mo79258i() {
        return (String) f182886i.mo58455c();
    }

    /* renamed from: j */
    public final long mo79259j() {
        return ((Long) f182887j.mo58455c()).longValue();
    }

    /* renamed from: k */
    public final caep mo79260k() {
        return (caep) f182888k.mo58455c();
    }

    /* renamed from: l */
    public final String mo79261l() {
        return (String) f182889l.mo58455c();
    }
}
