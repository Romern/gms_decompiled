package p000;

/* renamed from: cdjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdjv implements cdju {

    /* renamed from: a */
    public static final bdyx f181079a;

    /* renamed from: b */
    public static final bdyx f181080b;

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
        bdyw bdyw = new bdyw("direct_boot:gms_chimera_phenotype_flags");
        bdyx.m91610a(bdyw, "ClientLogging__enable_background_init", true);
        f181079a = bdyx.m91610a(bdyw, "ClientLogging__enable_client_logging", true);
        f181080b = bdyx.m91607a(bdyw, "ClientLogging__min_logging_level", 900L);
    }

    /* renamed from: a */
    public final boolean mo77763a() {
        return ((Boolean) f181079a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo77764b() {
        return ((Long) f181080b.mo58455c()).longValue();
    }
}
