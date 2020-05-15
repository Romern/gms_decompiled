package p000;

/* renamed from: bisf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bisf implements bxvp {
    STATUS_UNSOLICITED_MESSAGE(1),
    STATUS_SUCCESS(0),
    STATUS_NO_COMPATIBLE_VERSION(-1),
    STATUS_CERTIFICATE_ERROR(-2),
    STATUS_AUTHENTICATION_FAILURE(-3),
    STATUS_INVALID_SERVICE(-4),
    STATUS_INVALID_CHANNEL(-5),
    STATUS_INVALID_PRIORITY(-6),
    STATUS_INTERNAL_ERROR(-7),
    STATUS_MEDIA_CONFIG_MISMATCH(-8),
    STATUS_INVALID_SENSOR(-9),
    STATUS_BLUETOOTH_PAIRING_DELAYED(-10),
    STATUS_BLUETOOTH_UNAVAILABLE(-11),
    STATUS_BLUETOOTH_INVALID_ADDRESS(-12),
    STATUS_BLUETOOTH_INVALID_PAIRING_METHOD(-13),
    STATUS_BLUETOOTH_INVALID_AUTH_DATA(-14),
    STATUS_BLUETOOTH_AUTH_DATA_MISMATCH(-15),
    STATUS_BLUETOOTH_HFP_ANOTHER_CONNECTION(-16),
    STATUS_BLUETOOTH_HFP_CONNECTION_FAILURE(-17),
    STATUS_KEYCODE_NOT_BOUND(-18),
    STATUS_RADIO_INVALID_STATION(-19),
    STATUS_INVALID_INPUT(-20),
    STATUS_RADIO_STATION_PRESETS_NOT_SUPPORTED(-21),
    STATUS_RADIO_COMM_ERROR(-22),
    STATUS_AUTHENTICATION_FAILURE_CERT_NOT_YET_VALID(-23),
    STATUS_AUTHENTICATION_FAILURE_CERT_EXPIRED(-24),
    STATUS_COMMAND_NOT_SUPPORTED(-250),
    STATUS_FRAMING_ERROR(-251),
    STATUS_UNEXPECTED_MESSAGE(-253),
    STATUS_BUSY(-254),
    STATUS_OUT_OF_MEMORY(-255);
    

    /* renamed from: F */
    public final int f121548F;

    private bisf(int i) {
        this.f121548F = i;
    }

    /* renamed from: a */
    public static bisf m102781a(int i) {
        if (i == -251) {
            return STATUS_FRAMING_ERROR;
        }
        if (i == -250) {
            return STATUS_COMMAND_NOT_SUPPORTED;
        }
        switch (i) {
            case -255:
                return STATUS_OUT_OF_MEMORY;
            case -254:
                return STATUS_BUSY;
            case -253:
                return STATUS_UNEXPECTED_MESSAGE;
            default:
                switch (i) {
                    case -24:
                        return STATUS_AUTHENTICATION_FAILURE_CERT_EXPIRED;
                    case -23:
                        return STATUS_AUTHENTICATION_FAILURE_CERT_NOT_YET_VALID;
                    case -22:
                        return STATUS_RADIO_COMM_ERROR;
                    case -21:
                        return STATUS_RADIO_STATION_PRESETS_NOT_SUPPORTED;
                    case -20:
                        return STATUS_INVALID_INPUT;
                    case -19:
                        return STATUS_RADIO_INVALID_STATION;
                    case -18:
                        return STATUS_KEYCODE_NOT_BOUND;
                    case -17:
                        return STATUS_BLUETOOTH_HFP_CONNECTION_FAILURE;
                    case -16:
                        return STATUS_BLUETOOTH_HFP_ANOTHER_CONNECTION;
                    case -15:
                        return STATUS_BLUETOOTH_AUTH_DATA_MISMATCH;
                    case -14:
                        return STATUS_BLUETOOTH_INVALID_AUTH_DATA;
                    case -13:
                        return STATUS_BLUETOOTH_INVALID_PAIRING_METHOD;
                    case -12:
                        return STATUS_BLUETOOTH_INVALID_ADDRESS;
                    case -11:
                        return STATUS_BLUETOOTH_UNAVAILABLE;
                    case -10:
                        return STATUS_BLUETOOTH_PAIRING_DELAYED;
                    case -9:
                        return STATUS_INVALID_SENSOR;
                    case -8:
                        return STATUS_MEDIA_CONFIG_MISMATCH;
                    case -7:
                        return STATUS_INTERNAL_ERROR;
                    case -6:
                        return STATUS_INVALID_PRIORITY;
                    case -5:
                        return STATUS_INVALID_CHANNEL;
                    case -4:
                        return STATUS_INVALID_SERVICE;
                    case -3:
                        return STATUS_AUTHENTICATION_FAILURE;
                    case -2:
                        return STATUS_CERTIFICATE_ERROR;
                    case -1:
                        return STATUS_NO_COMPATIBLE_VERSION;
                    case 0:
                        return STATUS_SUCCESS;
                    case 1:
                        return STATUS_UNSOLICITED_MESSAGE;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static bxvr m102782b() {
        return bise.f121515a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f121548F;
    }

    public final String toString() {
        return Integer.toString(this.f121548F);
    }
}
