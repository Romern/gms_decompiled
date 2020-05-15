package p000;

/* renamed from: ceud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceud implements ceuc {
    public static final bdyx bugFixUnloadFromChreWhenNlpTurnsOff;
    public static final bdyx enableChreGeofencing;
    public static final bdyx onDemandWifiScan;
    public static final bdyx useGmscoreAlarmListener;
    public static final bdyx wifiConnectionStatusSync;

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
        bugFixUnloadFromChreWhenNlpTurnsOff = bdyx.m91610a(a, "ChreGeofence__bug_fix_unload_from_chre_when_nlp_turns_off", false);
        enableChreGeofencing = bdyx.m91610a(a, "enable_chre_geofencing", false);
        onDemandWifiScan = bdyx.m91610a(a, "enable_on_demand_wifi_scan_chre", false);
        useGmscoreAlarmListener = bdyx.m91610a(a, "ChreGeofence__use_gmscore_alarm_listener", false);
        wifiConnectionStatusSync = bdyx.m91610a(a, "enable_wifi_connection_status_sync_chre", false);
    }

    public boolean bugFixUnloadFromChreWhenNlpTurnsOff() {
        return ((Boolean) bugFixUnloadFromChreWhenNlpTurnsOff.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableChreGeofencing() {
        return ((Boolean) enableChreGeofencing.mo58455c()).booleanValue();
    }

    public boolean onDemandWifiScan() {
        return ((Boolean) onDemandWifiScan.mo58455c()).booleanValue();
    }

    public boolean useGmscoreAlarmListener() {
        return ((Boolean) useGmscoreAlarmListener.mo58455c()).booleanValue();
    }

    public boolean wifiConnectionStatusSync() {
        return ((Boolean) wifiConnectionStatusSync.mo58455c()).booleanValue();
    }
}
