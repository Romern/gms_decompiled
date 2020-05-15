package p000;

/* renamed from: cdoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdoj implements cdoi {

    /* renamed from: a */
    public static final bdyx f181426a;

    /* renamed from: b */
    public static final bdyx f181427b;

    /* renamed from: c */
    public static final bdyx f181428c;

    /* renamed from: d */
    public static final bdyx f181429d;

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
        bdyw a = new bdyw("direct_boot:gms_chimera_phenotype_flags").mo58445a("gms:common:");
        f181426a = bdyx.m91610a(a, "ServiceTracking__enable_service_invocation_logging_dev_only_prototype", false);
        f181427b = bdyx.m91610a(a, "ServiceTracking__enable_service_tracking", false);
        f181428c = bdyx.m91607a(a, "ServiceTracking__service_invocation_logging_buffer_size", 100L);
        f181429d = bdyx.m91607a(a, "ServiceTracking__service_invocation_logging_timeout_seconds", 300L);
    }

    /* renamed from: a */
    public final boolean mo78063a() {
        return ((Boolean) f181426a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78064b() {
        return ((Boolean) f181427b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo78065c() {
        return ((Long) f181428c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo78066d() {
        return ((Long) f181429d.mo58455c()).longValue();
    }
}
