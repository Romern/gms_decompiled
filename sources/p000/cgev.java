package p000;

/* renamed from: cgev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgev implements cgeu {

    /* renamed from: a */
    public static final bdyx f186697a;

    /* renamed from: b */
    public static final bdyx f186698b;

    /* renamed from: c */
    public static final bdyx f186699c;

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
        bdyw a = new bdyw("direct_boot:com.google.android.gms.phenotype").mo58445a("gms:phenotype:");
        f186697a = bdyx.m91610a(a, "UsePackageConfig__enable_auto_subpackage", true);
        f186698b = bdyx.m91610a(a, "UsePackageConfig__enable_experiment_injection", true);
        f186699c = bdyx.m91610a(a, "UsePackageConfig__enable_logging_config", true);
    }

    /* renamed from: a */
    public final boolean mo83571a() {
        return ((Boolean) f186697a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83572b() {
        return ((Boolean) f186698b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo83573c() {
        return ((Boolean) f186699c.mo58455c()).booleanValue();
    }
}
