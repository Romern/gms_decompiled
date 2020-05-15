package p000;

/* renamed from: cfak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface cfak {
    boolean forceSensorCollectionUpload();

    boolean isSensorCollectionEnabled();

    boolean isSensorCollectionSizeLimited();

    long maxSensorTraceSizeBytes();

    String sensorCollectionSizeLimitedPackages();

    long sensorCollectionWifiScanDelayMs();
}
