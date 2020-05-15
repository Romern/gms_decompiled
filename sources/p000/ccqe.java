package p000;

/* renamed from: ccqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccqe implements ccqd {

    /* renamed from: a */
    public static final bdyx f179746a;

    /* renamed from: b */
    public static final bdyx f179747b;

    /* renamed from: c */
    public static final bdyx f179748c;

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
        f179746a = bdyx.m91610a(bdyw, "CarEventLoggerRefactorFeature__convert_car_analytics_telemetry", false);
        f179747b = bdyx.m91610a(bdyw, "CarEventLoggerRefactorFeature__convert_car_setup_analytics_telemetry", false);
        f179748c = bdyx.m91610a(bdyw, "CarEventLoggerRefactorFeature__disable_fake_logger", false);
    }

    /* renamed from: a */
    public final boolean mo76635a() {
        return ((Boolean) f179746a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76636b() {
        return ((Boolean) f179747b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76637c() {
        return ((Boolean) f179748c.mo58455c()).booleanValue();
    }
}
