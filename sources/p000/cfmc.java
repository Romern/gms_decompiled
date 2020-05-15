package p000;

/* renamed from: cfmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfmc implements cfmb {

    /* renamed from: a */
    public static final bdyx f184333a;

    /* renamed from: b */
    public static final bdyx f184334b;

    /* renamed from: c */
    public static final bdyx f184335c;

    /* renamed from: d */
    public static final bdyx f184336d;

    /* renamed from: e */
    public static final bdyx f184337e;

    /* renamed from: f */
    public static final bdyx f184338f;

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
        f184333a = bdyx.m91610a(bdyw, "BugFixesOrImprovementInV26__cache_plan_status", false);
        f184334b = bdyx.m91610a(bdyw, "BugFixesOrImprovementInV26__cache_upsell_offer", false);
        f184335c = bdyx.m91610a(bdyw, "BugFixesOrImprovementInV26__check_data_mcc_mnc", true);
        f184336d = bdyx.m91610a(bdyw, "BugFixesOrImprovementInV26__check_no_network", true);
        bdyx.m91610a(bdyw, "BugFixesOrImprovementInV26__prioritize_simdb_cache", true);
        f184337e = bdyx.m91609a(bdyw, "BugFixesOrImprovementInV26__test_imsi", "");
        f184338f = bdyx.m91610a(bdyw, "BugFixesOrImprovementInV26__truncate_integer_prices", true);
    }

    /* renamed from: a */
    public final boolean mo81442a() {
        return ((Boolean) f184333a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo81443b() {
        return ((Boolean) f184334b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo81444c() {
        return ((Boolean) f184335c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo81445d() {
        return ((Boolean) f184336d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final String mo81446e() {
        return (String) f184337e.mo58455c();
    }

    /* renamed from: f */
    public final boolean mo81447f() {
        return ((Boolean) f184338f.mo58455c()).booleanValue();
    }
}
