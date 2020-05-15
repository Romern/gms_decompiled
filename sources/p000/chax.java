package p000;

/* renamed from: chax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chax implements chaw {

    /* renamed from: a */
    public static final bdyx f188216a;

    /* renamed from: b */
    public static final bdyx f188217b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.udc"));
        f188216a = bdyx.m91605a(bdyw, "ClearcutFeature__background_api_reporting_fraction", 0.005d);
        bdyx.m91605a(bdyw, "ClearcutFeature__context_manager_empty_buffer_reporting_fraction", 0.005d);
        f188217b = bdyx.m91607a(bdyw, "ClearcutFeature__proto_data_store_operations_reporting_interval", 1000L);
    }

    /* renamed from: a */
    public final double mo84889a() {
        return ((Double) f188216a.mo58455c()).doubleValue();
    }

    /* renamed from: b */
    public final long mo84890b() {
        return ((Long) f188217b.mo58455c()).longValue();
    }
}
