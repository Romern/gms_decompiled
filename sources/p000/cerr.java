package p000;

/* renamed from: cerr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cerr implements cerq {
    public static final bdyx floorChangeAccelFifoRequired;
    public static final bdyx floorChangeBaroFifoRequired;
    public static final bdyx floorChangeDetectionEnabled;
    public static final bdyx floorChangeFakeEvent;
    public static final bdyx hardwareFloorChangeDetectionEnabled;
    public static final bdyx hardwareFloorChangeReportLatencyMillis;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        floorChangeAccelFifoRequired = bdyx.m91607a(a, "floor_change_accel_fifo_required", 3000L);
        floorChangeBaroFifoRequired = bdyx.m91607a(a, "floor_change_baro_fifo_required", 300L);
        floorChangeDetectionEnabled = bdyx.m91610a(a, "floor_change_detection_enabled", true);
        floorChangeFakeEvent = bdyx.m91609a(a, "floor_change_fake_event", "");
        hardwareFloorChangeDetectionEnabled = bdyx.m91610a(a, "hardware_floor_change_detection_enabled", false);
        hardwareFloorChangeReportLatencyMillis = bdyx.m91607a(a, "hardware_floor_change_report_latency_millis", 2147483647L);
    }

    public boolean compiled() {
        return true;
    }

    public long floorChangeAccelFifoRequired() {
        return ((Long) floorChangeAccelFifoRequired.mo58455c()).longValue();
    }

    public long floorChangeBaroFifoRequired() {
        return ((Long) floorChangeBaroFifoRequired.mo58455c()).longValue();
    }

    public boolean floorChangeDetectionEnabled() {
        return ((Boolean) floorChangeDetectionEnabled.mo58455c()).booleanValue();
    }

    public String floorChangeFakeEvent() {
        return (String) floorChangeFakeEvent.mo58455c();
    }

    public boolean hardwareFloorChangeDetectionEnabled() {
        return ((Boolean) hardwareFloorChangeDetectionEnabled.mo58455c()).booleanValue();
    }

    public long hardwareFloorChangeReportLatencyMillis() {
        return ((Long) hardwareFloorChangeReportLatencyMillis.mo58455c()).longValue();
    }
}
