package p000;

/* renamed from: ccqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccqt implements ccqs {

    /* renamed from: a */
    public static final bdyx f179771a;

    /* renamed from: b */
    public static final bdyx f179772b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f179771a = bdyx.m91607a(bdyw, "CarTelemetryCheckboxFeature__car_telemetry_logger_queue_size", 10000L);
        bdyx.m91610a(bdyw, "CarTelemetryCheckboxFeature__honor_checkbox", false);
        bdyx.m91610a(bdyw, "CarTelemetryCheckboxFeature__query_checkbox", false);
        f179772b = bdyx.m91610a(bdyw, "CarTelemetryCheckboxFeature__use_checkbox", false);
    }

    /* renamed from: a */
    public final long mo76655a() {
        return ((Long) f179771a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo76656b() {
        return ((Boolean) f179772b.mo58455c()).booleanValue();
    }
}
