package p000;

/* renamed from: cgcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgcm implements cgcl {

    /* renamed from: a */
    public static final bdyx f186568a;

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
        bdyx.m91610a(a, "Database__enable_database_schema_version_22", true);
        f186568a = bdyx.m91610a(a, "Database__enable_database_schema_version_23", false);
        bdyx.m91610a(a, "Database__enable_deferred_transactions", true);
        bdyx.m91610a(a, "WriteAheadLoggingFeature__enable_write_ahead_logging", true);
    }

    /* renamed from: a */
    public final boolean mo83495a() {
        return ((Boolean) f186568a.mo58455c()).booleanValue();
    }
}
