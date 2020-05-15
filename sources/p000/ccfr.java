package p000;

/* renamed from: ccfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccfr implements ccfq {

    /* renamed from: a */
    public static final bdyx f178879a;

    /* renamed from: b */
    public static final bdyx f178880b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth.easyunlock")).mo58445a("auth_easyunlock_");
        f178879a = bdyx.m91610a(a, "MetricsLogging__is_clearcut_logging_enabled", true);
        f178880b = bdyx.m91607a(a, "MetricsLogging__max_samples_per_clearcut_counter", 64L);
    }

    /* renamed from: a */
    public final boolean mo75865a() {
        return ((Boolean) f178879a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo75866b() {
        return ((Long) f178880b.mo58455c()).longValue();
    }
}
