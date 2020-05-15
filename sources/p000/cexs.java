package p000;

/* renamed from: cexs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cexs implements cexr {
    public static final bdyx enableHardwareGeofencing;
    public static final bdyx flpGeofenceEnableHalDebugMode;
    public static final bdyx forceHardwareGeofenceWhenAvailable;
    public static final bdyx preserveGeofencesWhenNetworkLocationTurnsOff;
    public static final bdyx useHardwareGeofenceWhenUnavailable;

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
        enableHardwareGeofencing = bdyx.m91610a(a, "enable_hardware_geofencing_olivet", true);
        flpGeofenceEnableHalDebugMode = bdyx.m91610a(a, "flp_geofence_enable_hal_debug", false);
        forceHardwareGeofenceWhenAvailable = bdyx.m91610a(a, "force_hardware_geofence_when_available", false);
        preserveGeofencesWhenNetworkLocationTurnsOff = bdyx.m91610a(a, "Geofencing__preserve_geofences_when_network_location_turns_off", true);
        useHardwareGeofenceWhenUnavailable = bdyx.m91610a(a, "use_hardware_geofence_when_unavailable", false);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableHardwareGeofencing() {
        return ((Boolean) enableHardwareGeofencing.mo58455c()).booleanValue();
    }

    public boolean flpGeofenceEnableHalDebugMode() {
        return ((Boolean) flpGeofenceEnableHalDebugMode.mo58455c()).booleanValue();
    }

    public boolean forceHardwareGeofenceWhenAvailable() {
        return ((Boolean) forceHardwareGeofenceWhenAvailable.mo58455c()).booleanValue();
    }

    public boolean preserveGeofencesWhenNetworkLocationTurnsOff() {
        return ((Boolean) preserveGeofencesWhenNetworkLocationTurnsOff.mo58455c()).booleanValue();
    }

    public boolean useHardwareGeofenceWhenUnavailable() {
        return ((Boolean) useHardwareGeofenceWhenUnavailable.mo58455c()).booleanValue();
    }
}
