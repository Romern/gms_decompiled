package p000;

/* renamed from: bzbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzbu implements bxvp {
    TOKEN_MEDIUM_UNKNOWN(0),
    AUDIO_ULTRASOUND_PASSBAND(1),
    BLUETOOTH_CLASSIC_NAME(2),
    BLE_ADVERTISING_PACKET(3),
    WIFI_DIRECT_SSID(4),
    LOCAL_DEVICE(5),
    BLE_GATT_SERVICE(6),
    WIFI_AP_SSID(7),
    AUDIO_AUDIBLE_DTMF(8),
    ALPHA_NUMERIC_VISUAL(9);
    

    /* renamed from: k */
    public final int f169275k;

    private bzbu(int i) {
        this.f169275k = i;
    }

    /* renamed from: a */
    public static bzbu m125627a(int i) {
        switch (i) {
            case 0:
                return TOKEN_MEDIUM_UNKNOWN;
            case 1:
                return AUDIO_ULTRASOUND_PASSBAND;
            case 2:
                return BLUETOOTH_CLASSIC_NAME;
            case 3:
                return BLE_ADVERTISING_PACKET;
            case 4:
                return WIFI_DIRECT_SSID;
            case 5:
                return LOCAL_DEVICE;
            case 6:
                return BLE_GATT_SERVICE;
            case 7:
                return WIFI_AP_SSID;
            case 8:
                return AUDIO_AUDIBLE_DTMF;
            case 9:
                return ALPHA_NUMERIC_VISUAL;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m125628b() {
        return bzbt.f169263a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f169275k;
    }

    public final String toString() {
        return Integer.toString(this.f169275k);
    }
}
