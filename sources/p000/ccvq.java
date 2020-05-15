package p000;

/* renamed from: ccvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccvq implements ccvp {

    /* renamed from: a */
    public static final bdyx f180040a;

    /* renamed from: b */
    public static final bdyx f180041b;

    /* renamed from: c */
    public static final bdyx f180042c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f180040a = bdyx.m91610a(bdyw, "TelemetryDriveIdFeature__enable_log_event_validation", true);
        bdyx.m91610a(bdyw, "TelemetryDriveIdFeature__enable_setup_frx_telemetry", false);
        f180041b = bdyx.m91610a(bdyw, "TelemetryDriveIdFeature__enabled", false);
        f180042c = bdyx.m91607a(bdyw, "TelemetryDriveIdFeature__id_timeout_millis", 600000L);
    }

    /* renamed from: a */
    public final boolean mo76880a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo76881b() {
        return ((Boolean) f180040a.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76882c() {
        return ((Boolean) f180041b.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo76883d() {
        return ((Long) f180042c.mo58455c()).longValue();
    }
}
