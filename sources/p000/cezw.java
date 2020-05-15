package p000;

/* renamed from: cezw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface cezw {
    long quakeApiAccelHeadMs();

    double quakeApiAccelQuantizedLsbMs2();

    long quakeApiAccelTailMs();

    long quakeApiAccelTriggeringMs();

    boolean quakeApiAlarmManagerEnable();

    long quakeApiAlarmOnlineMs();

    boolean quakeApiBackoffEnable();

    long quakeApiBackoffMaxMs();

    long quakeApiClientIdExpireMs();

    long quakeApiDroidguardHandleTimeoutMs();

    boolean quakeApiDroidguardOfflineEnable();

    boolean quakeApiDroidguardOnlineEnable();

    boolean quakeApiDroidguardTriggeringEnable();

    boolean quakeApiEnable();

    String quakeApiScope();

    long quakeApiServerDeadlineMs();

    String quakeApiServerHost();

    long quakeApiSessionAccelMaxS();

    long quakeApiSessionCooldownS();

    String quakeApiSessionThrottlerConfig();

    boolean quakeApiUsePersistentThrottler();

    boolean quakeApiV2Enable();

    long quakeTimeExpireAgeMs();

    boolean seismicSendQuakeApiNodeOffline();

    boolean seismicSendQuakeApiNodeOnline();

    boolean seismicSendQuakeApiNodeTriggering();
}
