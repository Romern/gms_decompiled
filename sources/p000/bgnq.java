package p000;

/* renamed from: bgnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bgnq {
    LOCATOR("NetworkLocationLocator", 1),
    ACTIVE_COLLECTOR("NetworkLocationActiveCollector", 1),
    BURST_COLLECTOR("NetworkLocationBurstCollector", 1),
    PASSIVE_COLLECTOR("NetworkLocationPassiveCollector", 1),
    CACHE_UPDATER("NetworkLocationCacheUpdater", 1),
    CALIBRATION_COLLECTOR("NetworkLocationCalibrationCollector", 1),
    SENSOR_COLLECTOR("NetworkLocationSCollector", 1),
    SENSOR_UPLOADER("NetworkLocationSensorUploader", 1),
    ACTIVITY_DETECTION("NetworkLocationActivityDetection", 0),
    IN_OUT_DOOR_COLLECTOR("NetworkLocationInOutCollector", 1),
    BURST_COLLECTION_TRIGGER("NetworkLocationBurstCollectionTrigger", 1),
    VEHICLE_EXIT_DETECTOR("NetworkLocationVehicleExitDetector", 0),
    GESTURE_DETECTOR("NetworkLocationGestureDetector", 0),
    GLS_QUERY("Gls-Query", 1),
    GLS_UPLOAD("Gls-Upload", 0),
    GLS_LOC_QUERY("Gls-LocQuery", 0),
    CALLBACK_RUNNER("CallbackRunner", 2),
    PENDING_INTENT("PendingIntentClient", 2),
    COLLECTIONLIB("CollectionLib", 2),
    COLLECTIONLIB_REPLAYER("CollectionLib-Replayer", 2),
    COLLECTIONLIB_SIG_COLLECTOR("CollectionLib-SigCollector", 2);
    

    /* renamed from: v */
    public final String f116891v;

    /* renamed from: w */
    public final int f116892w;

    private bgnq(String str, int i) {
        this.f116891v = str;
        this.f116892w = i;
    }
}
