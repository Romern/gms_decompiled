package p000;

/* renamed from: buyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum buyv implements bxvp {
    BLE_ADVERTISE_DATA_TYPE_UNKNOWN(0),
    BLE_ADVERTISE_SERVICE_DATA(1),
    BLE_ADVERTISE_MANUFACTURER_DATA(2),
    BLE_ADVERTISE_SCAN_RECORD(3);
    

    /* renamed from: e */
    public final int f155342e;

    private buyv(int i) {
        this.f155342e = i;
    }

    /* renamed from: a */
    public static buyv m120788a(int i) {
        if (i == 0) {
            return BLE_ADVERTISE_DATA_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return BLE_ADVERTISE_SERVICE_DATA;
        }
        if (i == 2) {
            return BLE_ADVERTISE_MANUFACTURER_DATA;
        }
        if (i != 3) {
            return null;
        }
        return BLE_ADVERTISE_SCAN_RECORD;
    }

    /* renamed from: b */
    public static bxvr m120789b() {
        return buyu.f155336a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f155342e;
    }

    public final String toString() {
        return Integer.toString(this.f155342e);
    }
}
