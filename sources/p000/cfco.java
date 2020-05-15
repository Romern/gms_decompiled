package p000;

/* renamed from: cfco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfco implements cfcn {

    /* renamed from: a */
    public static final bdyx f183629a;

    /* renamed from: b */
    public static final bdyx f183630b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.magictether")).mo58445a("gms:magictether:");
        f183629a = bdyx.m91610a(a, "MetricsLogging__is_clearcut_logging_enabled", true);
        f183630b = bdyx.m91607a(a, "MetricsLogging__max_samples_per_clearcut_counter", 64L);
    }

    /* renamed from: a */
    public final boolean mo80838a() {
        return ((Boolean) f183629a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo80839b() {
        return ((Long) f183630b.mo58455c()).longValue();
    }
}
