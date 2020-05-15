package p000;

import android.util.SparseArray;

/* renamed from: dcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum dcm {
    WIFI_INACCESSIBLE_CHANNEL(-14),
    NO_COMPATIBLE_WIFI_VERSION_FOUND(-13),
    NO_COMPATIBLE_WIFI_CHANNEL_FOUND(-12),
    DISCONNECTED_BT(-11),
    ABORTED_WIFI(-10),
    RECONNECTION_PREVENTED(-9),
    BT_HFP_A2DP_DISCONNECTED(-8),
    CONNECTION_LOST_BT(-7),
    RFCOMM_START_IO_FAILURE(-6),
    RFCOMM_READ_FAILURE(-5),
    RFCOMM_WRITE_FAILURE(-4),
    WIFI_INVALID_CREDENTIALS(-3),
    WIFI_SECURITY_NOT_SUPPORTED(-2),
    WIFI_DISABLED(-1),
    IDLE(0),
    BT_HFP_A2DP_CONNECTED(1),
    CONNECTING_BT(2),
    CONNECTING_RFCOMM(3),
    RFCOMM_RECONNECTING(4),
    CONNECTED_BT(5),
    CONNECTING_WIFI(6),
    CONNECTED_WIFI(7),
    PROJECTION_INITIATED(8),
    VERSION_CHECK_COMPLETE(9),
    SHUTDOWN(10),
    FOUND_COMPATIBLE_WIFI_NETWORK(11),
    PROJECTION_IN_PROGRESS(12),
    RFCOMM_TIMED_OUT(13),
    WIFI_CONNECT_TIMED_OUT(14),
    PROJECTION_START_TIMED_OUT(15),
    PROJECTION_ENDED(16),
    START_WIFI_REQUEST_SUCCESS(17),
    START_WIFI_REQUEST_FAILED_ALREADY_STARTED(18),
    START_WIFI_REQUEST_FAILED_WIFI_DISABLED(19),
    START_WIFI_REQUEST_FAILED_WIFI_NOT_YET_STARTED(20),
    START_WIFI_REQUEST_FAILED_INVALID_CREDENTIALS(21),
    PROJECTION_CONNECTED(22),
    PROJECTION_DISCONNECTED(23),
    WIFI_PROJECTION_START_REQUESTED(24),
    WIFI_AUTOMATICALLY_ENABLED(25);
    

    /* renamed from: O */
    private final int f12864O;

    static {
        SparseArray sparseArray = new SparseArray();
        dcm[] values = values();
        for (dcm dcm : values) {
            sparseArray.append(dcm.f12864O, dcm);
        }
    }

    private dcm(int i) {
        this.f12864O = i;
    }

    /* renamed from: a */
    public final boolean mo8533a(dcm dcm) {
        return this.f12864O >= dcm.f12864O;
    }
}
