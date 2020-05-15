package p000;

/* renamed from: ceyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceyu implements ceyt {
    public static final bdyx freshPeriodThreshold;
    public static final bdyx freshPeriodThresholdBackground;

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
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        freshPeriodThreshold = bdyx.m91605a(a, "location_trigger_fresh_period_threshold", 0.4d);
        freshPeriodThresholdBackground = bdyx.m91605a(a, "location_trigger_fresh_period_threshold_background", 1.0d);
    }

    public boolean compiled() {
        return true;
    }

    public double freshPeriodThreshold() {
        return ((Double) freshPeriodThreshold.mo58455c()).doubleValue();
    }

    public double freshPeriodThresholdBackground() {
        return ((Double) freshPeriodThresholdBackground.mo58455c()).doubleValue();
    }
}
