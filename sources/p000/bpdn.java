package p000;

/* renamed from: bpdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpdn implements bxvp {
    UNKNOWN_CODE(0),
    PROTOCOL_INCOMPATIBLE_VERSION(1),
    PROTOCOL_WRONG_CONFIGURATION(2),
    PROTOCOL_IO_ERROR(3),
    PROTOCOL_BYEBYE_REQUESTED_BY_CAR(4),
    PROTOCOL_BYEBYE_REQUESTED_BY_USER(5),
    PROTOCOL_WRONG_MESSAGE(6),
    PROTOCOL_AUTH_FAILED(7),
    PROTOCOL_AUTH_FAILED_BY_CAR(8),
    TIMEOUT(9),
    NO_LAUNCHER(10),
    COMPOSITION(11),
    CAR_NOT_RESPONDING(12),
    PROTOCOL_AUTH_FAILED_BY_CAR_CERT_NOT_YET_VALID(13),
    PROTOCOL_AUTH_FAILED_BY_CAR_CERT_EXPIRED(14),
    CONNECTION_ERROR(15),
    USB_ACCESSORY_ERROR(16),
    CAR_SERVICE_INIT_ERROR(17),
    CAR_SERVICE_CONNECTION_ERROR(18),
    USB_CHARGE_ONLY(19),
    BLUETOOTH_FAILURE(1000);
    

    /* renamed from: v */
    public final int f136282v;

    private bpdn(int i) {
        this.f136282v = i;
    }

    /* renamed from: a */
    public static bpdn m111806a(int i) {
        if (i == 1000) {
            return BLUETOOTH_FAILURE;
        }
        switch (i) {
            case 0:
                return UNKNOWN_CODE;
            case 1:
                return PROTOCOL_INCOMPATIBLE_VERSION;
            case 2:
                return PROTOCOL_WRONG_CONFIGURATION;
            case 3:
                return PROTOCOL_IO_ERROR;
            case 4:
                return PROTOCOL_BYEBYE_REQUESTED_BY_CAR;
            case 5:
                return PROTOCOL_BYEBYE_REQUESTED_BY_USER;
            case 6:
                return PROTOCOL_WRONG_MESSAGE;
            case 7:
                return PROTOCOL_AUTH_FAILED;
            case 8:
                return PROTOCOL_AUTH_FAILED_BY_CAR;
            case 9:
                return TIMEOUT;
            case 10:
                return NO_LAUNCHER;
            case 11:
                return COMPOSITION;
            case 12:
                return CAR_NOT_RESPONDING;
            case 13:
                return PROTOCOL_AUTH_FAILED_BY_CAR_CERT_NOT_YET_VALID;
            case 14:
                return PROTOCOL_AUTH_FAILED_BY_CAR_CERT_EXPIRED;
            case 15:
                return CONNECTION_ERROR;
            case 16:
                return USB_ACCESSORY_ERROR;
            case 17:
                return CAR_SERVICE_INIT_ERROR;
            case 18:
                return CAR_SERVICE_CONNECTION_ERROR;
            case 19:
                return USB_CHARGE_ONLY;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f136282v;
    }

    public final String toString() {
        return Integer.toString(this.f136282v);
    }
}
