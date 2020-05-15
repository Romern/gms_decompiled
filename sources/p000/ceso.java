package p000;

/* renamed from: ceso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ceso {
    boolean backgroundThrottle();

    long flpBackgroundBatchRequestMinIntervalMs();

    long flpBackgroundBatchRequestMinWaitMs();

    long flpBackgroundRequestMinIntervalMs();

    String flpBackgroundThrottleWhiteListApps();

    String flpBackgroundWhitelistGcoreModules();

    String flpForcedBackgroundApps();

    String flpForcedBackgroundExceptHighAccuracyApps();

    boolean flpWifiConnectionThrottleEnabled();

    long geofenceMinimumRadiusMeters();

    long geofenceMinimumResponsivenessMillis();

    long throttledGeofenceLocationIntervalSeconds();
}
