package p000;

/* renamed from: cdzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdzu implements cdzt {

    /* renamed from: a */
    public static final bdyx f182103a;

    /* renamed from: b */
    public static final bdyx f182104b;

    /* renamed from: c */
    public static final bdyx f182105c;

    /* renamed from: d */
    public static final bdyx f182106d;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.fitness")).mo58445a("fitness.");
        bdyx.m91610a(a, "enable_passive_location_batching", true);
        f182103a = bdyx.m91607a(a, "location_batch_interval_micros", 600000000L);
        f182104b = bdyx.m91609a(a, "min_millis_between_recorded_points_by_type", "");
        f182105c = bdyx.m91607a(a, "min_interval_between_recorded_points_default", 0L);
        f182106d = bdyx.m91610a(a, "use_conditional_sensor_adapter_local_hw", false);
    }

    /* renamed from: a */
    public final long mo78627a() {
        return ((Long) f182103a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final String mo78628b() {
        return (String) f182104b.mo58455c();
    }

    /* renamed from: c */
    public final long mo78629c() {
        return ((Long) f182105c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo78630d() {
        return ((Boolean) f182106d.mo58455c()).booleanValue();
    }
}
