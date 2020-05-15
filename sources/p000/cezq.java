package p000;

/* renamed from: cezq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cezq implements cezp {
    public static final bdyx addPersonalizedBitToDetectorInfo;
    public static final bdyx applyActivityPersonalization;
    public static final bdyx applyActivityPersonalizationForWalking;
    public static final bdyx checkBatteryStatus;
    public static final bdyx personalizationClusterMinSize;
    public static final bdyx personalizedModelRefreshIntervalDays;
    public static final bdyx useFootprintsToFetchModels;

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
        addPersonalizedBitToDetectorInfo = bdyx.m91610a(a, "add_personalized_bit_to_detector_info", true);
        applyActivityPersonalization = bdyx.m91610a(a, "apply_activity_personalization", false);
        applyActivityPersonalizationForWalking = bdyx.m91610a(a, "apply_activity_personalization_for_walking", false);
        checkBatteryStatus = bdyx.m91610a(a, "check_battery_status", false);
        personalizationClusterMinSize = bdyx.m91607a(a, "personalization_cluster_min_size", 2L);
        personalizedModelRefreshIntervalDays = bdyx.m91607a(a, "personalized_model_refresh_interval_days", 4L);
        useFootprintsToFetchModels = bdyx.m91610a(a, "use_footprints_to_fetch_models", true);
    }

    public boolean addPersonalizedBitToDetectorInfo() {
        return ((Boolean) addPersonalizedBitToDetectorInfo.mo58455c()).booleanValue();
    }

    public boolean applyActivityPersonalization() {
        return ((Boolean) applyActivityPersonalization.mo58455c()).booleanValue();
    }

    public boolean applyActivityPersonalizationForWalking() {
        return ((Boolean) applyActivityPersonalizationForWalking.mo58455c()).booleanValue();
    }

    public boolean checkBatteryStatus() {
        return ((Boolean) checkBatteryStatus.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long personalizationClusterMinSize() {
        return ((Long) personalizationClusterMinSize.mo58455c()).longValue();
    }

    public long personalizedModelRefreshIntervalDays() {
        return ((Long) personalizedModelRefreshIntervalDays.mo58455c()).longValue();
    }

    public boolean useFootprintsToFetchModels() {
        return ((Boolean) useFootprintsToFetchModels.mo58455c()).booleanValue();
    }
}
