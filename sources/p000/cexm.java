package p000;

/* renamed from: cexm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cexm implements cexl {
    public static final bdyx enableAddGeofencesThrottling;
    public static final bdyx enableGeofencerMessageThrottling;
    public static final bdyx geofencerAddGeofencesBurstEvents;
    public static final bdyx geofencerAddGeofencesIntervalSeconds;
    public static final bdyx geofencerFastestLocationIntervalMillis;
    public static final bdyx geofencerReduceUnnecessaryLocationUpdates;
    public static final bdyx geofencerRemoveUnusedCodePathV25;
    public static final bdyx geofencerSpecialEventBurstEvents;
    public static final bdyx geofencerSpecialEventIntervalSeconds;
    public static final bdyx geofencerUpdateDetectorBurstEvents;
    public static final bdyx geofencerUpdateDetectorIntervalSeconds;

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
        enableAddGeofencesThrottling = bdyx.m91610a(a, "GeofencerMessageThrottling__enable_add_geofences_throttling", false);
        enableGeofencerMessageThrottling = bdyx.m91610a(a, "GeofencerMessageThrottling__enable_geofencer_message_throttling", false);
        geofencerAddGeofencesBurstEvents = bdyx.m91607a(a, "GeofencerMessageThrottling__geofencer_add_geofences_burst_events", 5L);
        geofencerAddGeofencesIntervalSeconds = bdyx.m91607a(a, "GeofencerMessageThrottling__geofencer_add_geofences_interval_seconds", 60L);
        geofencerFastestLocationIntervalMillis = bdyx.m91607a(a, "GeofencerMessageThrottling__geofencer_fastest_location_interval_millis", 5000L);
        geofencerReduceUnnecessaryLocationUpdates = bdyx.m91610a(a, "GeofencerMessageThrottling__geofencer_reduce_unnecessary_location_updates", false);
        geofencerRemoveUnusedCodePathV25 = bdyx.m91610a(a, "GeofencerMessageThrottling__geofencer_remove_unused_code_path_v25", true);
        geofencerSpecialEventBurstEvents = bdyx.m91607a(a, "GeofencerMessageThrottling__geofencer_special_event_burst_events", 3L);
        geofencerSpecialEventIntervalSeconds = bdyx.m91607a(a, "GeofencerMessageThrottling__geofencer_special_event_interval_seconds", 300L);
        geofencerUpdateDetectorBurstEvents = bdyx.m91607a(a, "GeofencerMessageThrottling__geofencer_update_detector_burst_events", 5L);
        geofencerUpdateDetectorIntervalSeconds = bdyx.m91607a(a, "GeofencerMessageThrottling__geofencer_update_detector_interval_seconds", 60L);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableAddGeofencesThrottling() {
        return ((Boolean) enableAddGeofencesThrottling.mo58455c()).booleanValue();
    }

    public boolean enableGeofencerMessageThrottling() {
        return ((Boolean) enableGeofencerMessageThrottling.mo58455c()).booleanValue();
    }

    public long geofencerAddGeofencesBurstEvents() {
        return ((Long) geofencerAddGeofencesBurstEvents.mo58455c()).longValue();
    }

    public long geofencerAddGeofencesIntervalSeconds() {
        return ((Long) geofencerAddGeofencesIntervalSeconds.mo58455c()).longValue();
    }

    public long geofencerFastestLocationIntervalMillis() {
        return ((Long) geofencerFastestLocationIntervalMillis.mo58455c()).longValue();
    }

    public boolean geofencerReduceUnnecessaryLocationUpdates() {
        return ((Boolean) geofencerReduceUnnecessaryLocationUpdates.mo58455c()).booleanValue();
    }

    public boolean geofencerRemoveUnusedCodePathV25() {
        return ((Boolean) geofencerRemoveUnusedCodePathV25.mo58455c()).booleanValue();
    }

    public long geofencerSpecialEventBurstEvents() {
        return ((Long) geofencerSpecialEventBurstEvents.mo58455c()).longValue();
    }

    public long geofencerSpecialEventIntervalSeconds() {
        return ((Long) geofencerSpecialEventIntervalSeconds.mo58455c()).longValue();
    }

    public long geofencerUpdateDetectorBurstEvents() {
        return ((Long) geofencerUpdateDetectorBurstEvents.mo58455c()).longValue();
    }

    public long geofencerUpdateDetectorIntervalSeconds() {
        return ((Long) geofencerUpdateDetectorIntervalSeconds.mo58455c()).longValue();
    }
}
