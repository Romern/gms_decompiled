package p000;

/* renamed from: ceug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceug implements ceuf {
    public static final bdyx bugfixCatchLatestSettings;
    public static final bdyx ignoreOldChreGeofenceVersions;

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
        bugfixCatchLatestSettings = bdyx.m91610a(a, "ChreGeofencingBugFixes__bugfix_catch_latest_settings", true);
        ignoreOldChreGeofenceVersions = bdyx.m91610a(a, "ChreGeofencingBugFixes__ignore_old_chre_geofence_versions", true);
    }

    public boolean bugfixCatchLatestSettings() {
        return ((Boolean) bugfixCatchLatestSettings.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean ignoreOldChreGeofenceVersions() {
        return ((Boolean) ignoreOldChreGeofenceVersions.mo58455c()).booleanValue();
    }
}
