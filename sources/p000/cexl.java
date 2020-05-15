package p000;

/* renamed from: cexl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface cexl {
    boolean enableAddGeofencesThrottling();

    boolean enableGeofencerMessageThrottling();

    long geofencerAddGeofencesBurstEvents();

    long geofencerAddGeofencesIntervalSeconds();

    long geofencerFastestLocationIntervalMillis();

    boolean geofencerReduceUnnecessaryLocationUpdates();

    long geofencerSpecialEventBurstEvents();

    long geofencerSpecialEventIntervalSeconds();

    long geofencerUpdateDetectorBurstEvents();

    long geofencerUpdateDetectorIntervalSeconds();
}
