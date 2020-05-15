package p000;

/* renamed from: cfhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfhc implements cfgz {

    /* renamed from: a */
    public static final bdyx f184066a;

    /* renamed from: b */
    public static final bdyx f184067b;

    /* renamed from: c */
    public static final bdyx f184068c;

    /* renamed from: d */
    public static final bdyx f184069d;

    /* renamed from: e */
    public static final bdyx f184070e;

    /* renamed from: f */
    public static final bdyx f184071f;

    /* renamed from: g */
    public static final bdyx f184072g;

    /* renamed from: h */
    public static final bdyx f184073h;

    /* renamed from: i */
    public static final bdyx f184074i;

    /* renamed from: j */
    public static final bdyx f184075j;

    /* renamed from: k */
    public static final bdyx f184076k;

    /* renamed from: l */
    public static final bdyx f184077l;

    /* renamed from: m */
    public static final bdyx f184078m;

    /* renamed from: n */
    public static final bdyx f184079n;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.mdisync")).mo58443a();
        try {
            f184066a = bdyx.m91608a(a, "CoreFeature__api_blacklist", (afqw) bxvk.m124014a(afqw.f64582b, new byte[0]), cfha.f184064a);
            f184067b = bdyx.m91607a(a, "CoreFeature__cel_severe_sampling_interval", 10L);
            f184068c = bdyx.m91607a(a, "CoreFeature__cel_warning_sampling_interval", 100L);
            f184069d = bdyx.m91607a(a, "CoreFeature__clearcut_sampling_interval", 1000L);
            f184070e = bdyx.m91607a(a, "CoreFeature__dasu_sampling_interval", 100L);
            f184071f = bdyx.m91610a(a, "CoreFeature__enable_client_error_logging", true);
            f184072g = bdyx.m91610a(a, "CoreFeature__enable_dasu_logging", false);
            f184073h = bdyx.m91610a(a, "CoreFeature__enable_mdd_maintenance", false);
            f184074i = bdyx.m91610a(a, "CoreFeature__enable_mdi_sync_api", true);
            f184075j = bdyx.m91610a(a, "CoreFeature__enable_push_message_handlers", false);
            bdyx.m91610a(a, "CoreFeature__enable_sync_stats", true);
            f184076k = bdyx.m91610a(a, "CoreFeature__enable_sync_with_stats", false);
            bdyx.m91609a(a, "CoreFeature__gaia_logging_logsource", "MDI_SYNC_COMPONENTS_GAIA");
            f184077l = bdyx.m91610a(a, "CoreFeature__get_spe_channel_with_account", false);
            try {
                f184078m = bdyx.m91608a(a, "CoreFeature__sync_policy_policies", (byke) bxvk.m124014a(byke.f166739b, new byte[]{10, 72, 8, 1, 18, 68, 10, 64, 10, 26, 10, 16, 8, 1, 58, 12, 8, 1, 18, 2, 8, 30, 26, 4, 8, -32, -88, 1, 18, 6, 10, 0, 18, 2, 8, 1, 18, 34, 10, 18, 8, 2, 16, 2, 58, 12, 8, 1, 18, 2, 8, 30, 26, 4, 8, -32, -88, 1, 18, 12, 10, 4, 8, -32, -88, 1, 18, 4, 8, -16, -105, 1, 18, 0, 10, 72, 8, 2, 18, 68, 10, 64, 10, 26, 10, 16, 8, 3, 58, 12, 8, 1, 18, 2, 8, 30, 26, 4, 8, -32, -88, 1, 18, 6, 10, 0, 18, 2, 8, 1, 18, 34, 10, 18, 8, 3, 16, 2, 58, 12, 8, 1, 18, 2, 8, 30, 26, 4, 8, -32, -88, 1, 18, 12, 10, 4, 8, -32, -88, 1, 18, 4, 8, -16, -105, 1, 18, 0}), cfhb.f184065a);
                f184079n = bdyx.m91610a(a, "CoreFeature__use_gmscore_channel_provider", true);
            } catch (bxwf e) {
                throw new AssertionError("Could not parse proto flag \"CoreFeature__sync_policy_policies\"");
            }
        } catch (bxwf e2) {
            throw new AssertionError("Could not parse proto flag \"CoreFeature__api_blacklist\"");
        }
    }

    /* renamed from: a */
    public final afqw mo81216a() {
        return (afqw) f184066a.mo58455c();
    }

    /* renamed from: b */
    public final long mo81217b() {
        return ((Long) f184067b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo81218c() {
        return ((Long) f184068c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo81219d() {
        return ((Long) f184069d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo81220e() {
        return ((Long) f184070e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo81221f() {
        return ((Boolean) f184071f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo81222g() {
        return ((Boolean) f184072g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo81223h() {
        return ((Boolean) f184073h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo81224i() {
        return ((Boolean) f184074i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo81225j() {
        return ((Boolean) f184075j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo81226k() {
        return ((Boolean) f184076k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo81227l() {
        return ((Boolean) f184077l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final byke mo81228m() {
        return (byke) f184078m.mo58455c();
    }

    /* renamed from: n */
    public final boolean mo81229n() {
        return ((Boolean) f184079n.mo58455c()).booleanValue();
    }
}
