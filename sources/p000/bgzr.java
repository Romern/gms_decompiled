package p000;

import com.google.android.gms.common.stats.radio.NetworkLatencyContract;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.ulr.ApiDeviceConnectivitySetting;
import com.google.android.ulr.ApiLocationStatus;
import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiRate;

/* renamed from: bgzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzr {
    /* renamed from: a */
    public static ApiLocationStatus m100487a(LocationAvailability locationAvailability) {
        return new ApiLocationStatus(m100490a(locationAvailability.f79344a), false, m100490a(locationAvailability.f79345b));
    }

    /* renamed from: a */
    public static String m100490a(int i) {
        switch (i) {
            case 0:
                return NetworkLatencyContract.NetworkLatencyColumns.SUCCESSFUL;
            case 1:
                return "unknown";
            case 2:
                return "timedOutOnScan";
            case 3:
                return "noInfoInDatabase";
            case 4:
                return "invalidScan";
            case 5:
                return "unableToQueryDatabase";
            case 6:
                return "scansDisabledInSettings";
            case 7:
                return "locationDisabledInSettings";
            case 8:
                return "inProgress";
            default:
                return "indeterminate";
        }
    }

    /* renamed from: b */
    public static ApiMetadata m100491b(boolean z, long j) {
        return new ApiMetadata(null, new ApiDeviceConnectivitySetting(Boolean.valueOf(z), null, null), null, null, null, null, null, null, Long.valueOf(j), null, null);
    }

    /* renamed from: a */
    public static ApiMetadata m100488a(ApiRate apiRate) {
        sdo.m34959a(apiRate);
        return new ApiMetadata(null, null, null, null, null, null, null, apiRate, apiRate.mo71580g(), null, null);
    }

    /* renamed from: a */
    public static ApiMetadata m100489a(boolean z, long j) {
        return new ApiMetadata(null, new ApiDeviceConnectivitySetting(null, null, Boolean.valueOf(z)), null, null, null, null, null, null, Long.valueOf(j), null, null);
    }
}
