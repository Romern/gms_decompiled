package p000;

/* renamed from: cgef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgef implements cged {

    /* renamed from: a */
    public static final bdyx f186638a;

    /* renamed from: b */
    public static final bdyx f186639b;

    /* renamed from: c */
    public static final bdyx f186640c;

    /* renamed from: d */
    public static final bdyx f186641d;

    /* renamed from: e */
    public static final bdyx f186642e;

    /* renamed from: f */
    public static final bdyx f186643f;

    /* renamed from: g */
    public static final bdyx f186644g;

    /* renamed from: h */
    public static final bdyx f186645h;

    /* renamed from: i */
    public static final bdyx f186646i;

    /* renamed from: j */
    public static final bdyx f186647j;

    /* renamed from: k */
    public static final bdyx f186648k;

    /* renamed from: l */
    public static final bdyx f186649l;

    /* renamed from: m */
    public static final bdyx f186650m;

    /* renamed from: n */
    public static final bdyx f186651n;

    /* renamed from: o */
    public static final bdyx f186652o;

    /* renamed from: p */
    public static final bdyx f186653p;

    /* renamed from: q */
    public static final bdyx f186654q;

    /* renamed from: r */
    public static final bdyx f186655r;

    /* renamed from: s */
    public static final bdyx f186656s;

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
        bdyw b = new bdyw("direct_boot:com.google.android.gms.phenotype").mo58445a("gms:phenotype:").mo58450b();
        f186638a = bdyx.m91609a(b, "clear_reset_blacklist", "");
        f186639b = bdyx.m91609a(b, "configurator:auth_token_service", "oauth2:https://www.googleapis.com/auth/experimentsandconfigs");
        f186640c = bdyx.m91609a(b, "configurator:service_url", "https://www.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs");
        f186641d = bdyx.m91610a(b, "debug_allow_http", false);
        f186642e = bdyx.m91610a(b, "debug_clear_heterodyne_tag", false);
        f186643f = bdyx.m91610a(b, "PhenotypeFeature__enable_broadcast_logging", false);
        f186644g = bdyx.m91610a(b, "PhenotypeFeature__enable_committed_version_logging", true);
        f186645h = bdyx.m91610a(b, "enableDebugService", false);
        f186646i = bdyx.m91610a(b, "enable_flag_deltas", true);
        f186647j = bdyx.m91610a(b, "enable_verbose_syncer_logging", false);
        bdyx.m91609a(b, "gcm_sender_id", "336839458163");
        bdyx.m91607a(b, "gcm_subscription_smear_ms", 172800000L);
        f186648k = bdyx.m91607a(b, "interval_flex_seconds", 1800L);
        f186649l = bdyx.m91607a(b, "max_users_to_sync", 20L);
        f186650m = bdyx.m91607a(b, "phenotype_api_wait_ms", 2000L);
        f186651n = bdyx.m91607a(b, "retry_after_max_seconds", 86400L);
        f186652o = bdyx.m91607a(b, "retry_after_min_seconds", 60L);
        f186653p = bdyx.m91610a(b, "PhenotypeFeature__return_server_token_when_overrides_present", true);
        f186654q = bdyx.m91607a(b, "sync_retry_delay_seconds", 3600L);
        f186655r = bdyx.m91607a(b, "vacuum_change_count_mod", 1000L);
        try {
            f186656s = bdyx.m91608a(b, "whitelisted_apps_for_flag_overrides", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[]{10, 29, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 112, 108, 97, 121, 46, 103, 97, 109, 101, 115}), cgee.f186637a);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"whitelisted_apps_for_flag_overrides\"");
        }
    }

    /* renamed from: a */
    public final String mo83520a() {
        return (String) f186638a.mo58455c();
    }

    /* renamed from: b */
    public final String mo83521b() {
        return (String) f186639b.mo58455c();
    }

    /* renamed from: c */
    public final String mo83522c() {
        return (String) f186640c.mo58455c();
    }

    /* renamed from: d */
    public final boolean mo83523d() {
        return ((Boolean) f186641d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo83524e() {
        return ((Boolean) f186642e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo83525f() {
        return ((Boolean) f186643f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo83526g() {
        return ((Boolean) f186644g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo83527h() {
        return ((Boolean) f186645h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo83528i() {
        return ((Boolean) f186646i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo83529j() {
        return ((Boolean) f186647j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final long mo83530k() {
        return ((Long) f186648k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final long mo83531l() {
        return ((Long) f186649l.mo58455c()).longValue();
    }

    /* renamed from: m */
    public final long mo83532m() {
        return ((Long) f186650m.mo58455c()).longValue();
    }

    /* renamed from: n */
    public final long mo83533n() {
        return ((Long) f186651n.mo58455c()).longValue();
    }

    /* renamed from: o */
    public final long mo83534o() {
        return ((Long) f186652o.mo58455c()).longValue();
    }

    /* renamed from: p */
    public final boolean mo83535p() {
        return ((Boolean) f186653p.mo58455c()).booleanValue();
    }

    /* renamed from: q */
    public final long mo83536q() {
        return ((Long) f186654q.mo58455c()).longValue();
    }

    /* renamed from: r */
    public final long mo83537r() {
        return ((Long) f186655r.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final bydj mo83538s() {
        return (bydj) f186656s.mo58455c();
    }
}
