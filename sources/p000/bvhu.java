package p000;

/* renamed from: bvhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvhu implements bxvp {
    UNKNOWN_BANDWIDTH_UPGRADE_RESULT(0),
    UPGRADE_RESULT_SUCCESS(1),
    UPGRADE_RESULT_ERROR(2),
    MEDIUM_ERROR(3),
    PROTOCOL_ERROR(4),
    RESULT_IO_ERROR(5),
    CHANNEL_ERROR(6),
    ALREADY_ON_MEDIUM_ERROR(7),
    UNFINISHED_ERROR(10),
    BLUETOOTH_MEDIUM_ERROR(11),
    WIFI_AWARE_MEDIUM_ERROR(12),
    WIFI_LAN_MEDIUM_ERROR(13),
    WIFI_HOTSPOT_MEDIUM_ERROR(14),
    WIFI_DIRECT_MEDIUM_ERROR(15);
    

    /* renamed from: o */
    public final int f156121o;

    private bvhu(int i) {
        this.f156121o = i;
    }

    /* renamed from: a */
    public static bvhu m121123a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BANDWIDTH_UPGRADE_RESULT;
            case 1:
                return UPGRADE_RESULT_SUCCESS;
            case 2:
                return UPGRADE_RESULT_ERROR;
            case 3:
                return MEDIUM_ERROR;
            case 4:
                return PROTOCOL_ERROR;
            case 5:
                return RESULT_IO_ERROR;
            case 6:
                return CHANNEL_ERROR;
            case 7:
                return ALREADY_ON_MEDIUM_ERROR;
            case 8:
            case 9:
            default:
                return null;
            case 10:
                return UNFINISHED_ERROR;
            case 11:
                return BLUETOOTH_MEDIUM_ERROR;
            case 12:
                return WIFI_AWARE_MEDIUM_ERROR;
            case 13:
                return WIFI_LAN_MEDIUM_ERROR;
            case 14:
                return WIFI_HOTSPOT_MEDIUM_ERROR;
            case 15:
                return WIFI_DIRECT_MEDIUM_ERROR;
        }
    }

    /* renamed from: b */
    public static bxvr m121124b() {
        return bvht.f156105a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f156121o;
    }

    public final String toString() {
        return Integer.toString(this.f156121o);
    }
}
