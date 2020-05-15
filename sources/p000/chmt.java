package p000;

/* renamed from: chmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chmt implements chms {

    /* renamed from: a */
    public static final bdyx f188791a;

    /* renamed from: b */
    public static final bdyx f188792b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.wearable")).mo58445a("gms:wearable:service:");
        f188791a = bdyx.m91607a(a, "data_layer_logging_interval_ms", 43200000L);
        f188792b = bdyx.m91610a(a, "data_layer_stats_logs_enabled", false);
    }

    /* renamed from: a */
    public final long mo85358a() {
        return ((Long) f188791a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final void mo85359b() {
        ((Boolean) f188792b.mo58455c()).booleanValue();
    }
}
