package p000;

/* renamed from: cevp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cevp implements cevo {
    public static final bdyx activityLocationBindTimeRange;
    public static final bdyx activityRecognitionResultGlsUploadEnabled;
    public static final bdyx enabledCollectors;

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
        activityLocationBindTimeRange = bdyx.m91607a(a, "activity_location_bind_time_range", 360000L);
        activityRecognitionResultGlsUploadEnabled = bdyx.m91610a(a, "activity_recognition_result_gls_upload_enabled", true);
        enabledCollectors = bdyx.m91607a(a, "enabled_collectors", 2147483582L);
    }

    public long activityLocationBindTimeRange() {
        return ((Long) activityLocationBindTimeRange.mo58455c()).longValue();
    }

    public boolean activityRecognitionResultGlsUploadEnabled() {
        return ((Boolean) activityRecognitionResultGlsUploadEnabled.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long enabledCollectors() {
        return ((Long) enabledCollectors.mo58455c()).longValue();
    }
}
