package p000;

/* renamed from: ceru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceru implements cert {
    public static final bdyx alwaysReturnNullableHardwareArProviderService;
    public static final bdyx hardwareActivityMinPeriodMillis;
    public static final bdyx hardwareActivityRecognitionConfidence;
    public static final bdyx hardwareActivityRecognitionEnabledV5;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        alwaysReturnNullableHardwareArProviderService = bdyx.m91610a(a, "null_hw_ar_ser", false);
        hardwareActivityMinPeriodMillis = bdyx.m91607a(a, "hardware_activity_min_period_millis", 16000L);
        hardwareActivityRecognitionConfidence = bdyx.m91607a(a, "hardware_activity_recognition_confidence", 75L);
        hardwareActivityRecognitionEnabledV5 = bdyx.m91610a(a, "hardware_activity_recognition_enabled_v5", true);
    }

    public boolean alwaysReturnNullableHardwareArProviderService() {
        return ((Boolean) alwaysReturnNullableHardwareArProviderService.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long hardwareActivityMinPeriodMillis() {
        return ((Long) hardwareActivityMinPeriodMillis.mo58455c()).longValue();
    }

    public long hardwareActivityRecognitionConfidence() {
        return ((Long) hardwareActivityRecognitionConfidence.mo58455c()).longValue();
    }

    public boolean hardwareActivityRecognitionEnabledV5() {
        return ((Boolean) hardwareActivityRecognitionEnabledV5.mo58455c()).booleanValue();
    }
}
