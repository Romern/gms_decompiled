package p000;

/* renamed from: cgbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgbd implements cgbc {

    /* renamed from: a */
    public static final bdyx f186275a;

    /* renamed from: b */
    public static final bdyx f186276b;

    /* renamed from: c */
    public static final bdyx f186277c;

    /* renamed from: d */
    public static final bdyx f186278d;

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
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f186275a = bdyx.m91610a(bdyw, "MenagerieSystemAccountFinder__deprecate_caching_system_account_finder", false);
        f186276b = bdyx.m91610a(bdyw, "MenagerieSystemAccountFinder__deprecate_caching_system_account_finder_for_period_sync", false);
        f186277c = bdyx.m91610a(bdyw, "MenagerieSystemAccountFinder__log_system_account_finder_usage", false);
        f186278d = bdyx.m91605a(bdyw, "MenagerieSystemAccountFinder__log_system_account_finder_usage_sample_rate", 0.01d);
    }

    /* renamed from: a */
    public final boolean mo83216a() {
        return ((Boolean) f186275a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83217b() {
        return ((Boolean) f186276b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo83218c() {
        return ((Boolean) f186277c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final double mo83219d() {
        return ((Double) f186278d.mo58455c()).doubleValue();
    }
}
