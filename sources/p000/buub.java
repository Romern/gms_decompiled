package p000;

/* renamed from: buub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum buub implements bxvp {
    UNKNOWN_MEDIUM(0),
    MDNS(1),
    BLUETOOTH(2),
    WIFI_HOTSPOT(3),
    BLE(4),
    WIFI_LAN(5),
    WIFI_AWARE(6),
    NFC(7),
    WIFI_DIRECT(8),
    WEB_RTC(9);
    

    /* renamed from: k */
    public final int f154920k;

    private buub(int i) {
        this.f154920k = i;
    }

    /* renamed from: a */
    public static buub m120451a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_MEDIUM;
            case 1:
                return MDNS;
            case 2:
                return BLUETOOTH;
            case 3:
                return WIFI_HOTSPOT;
            case 4:
                return BLE;
            case 5:
                return WIFI_LAN;
            case 6:
                return WIFI_AWARE;
            case 7:
                return NFC;
            case 8:
                return WIFI_DIRECT;
            case 9:
                return WEB_RTC;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m120452b() {
        return buua.f154908a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f154920k;
    }

    public final String toString() {
        return Integer.toString(this.f154920k);
    }
}
