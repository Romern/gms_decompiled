package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bvpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpm {

    /* renamed from: a */
    private static final Set f157317a = Collections.unmodifiableSet(new HashSet(Arrays.asList("com.google.android.location.internal.action.ULR_BLE_SCAN_ALARM", "com.google.android.location.internal.action.ULR_BLE_STOP_NEARBY_ALARM", "com.google.android.location.internal.action.ULR_RESTART_BATCH_BLE_SCAN_ALARM", "com.google.android.location.internal.action.ULR_BAROMETER_READ_ALARM", "com.google.android.location.internal.action.GEOFENCER_AR_RESULT", "com.google.android.location.internal.action.GEOFENCER_LOCATION_RESULT", "com.google.android.location.internal.action.PLACES_GEOFENCE_RESULT", "com.google.android.location.internal.action.PLACES_REFRESH_USER_DATA_SUBSCRIPTION", "com.google.android.location.internal.action.ACTION_PLACES_PUBLISH_PLACE_UPDATE", "com.google.android.location.internal.action.FLP_AR_RESULT", "com.google.android.location.internal.action.FLP_LOW_POWER_LOCATION_RESULT", "com.google.android.location.internal.action.FLP_FULL_POWER_LOCATION_RESULT", "com.google.android.location.internal.action.ACTION_FLP_COMPUTE_WIFI_LOCATIONS_RESULT", "com.google.android.location.internal.action.AR_TRANSITION_RESULT")));

    /* renamed from: a */
    public static String m121348a(String str) {
        if (str == null || !f157317a.contains(str)) {
            return null;
        }
        return str.concat("_FORWARDED");
    }
}
