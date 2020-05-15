package p000;

/* renamed from: bvjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvjc implements bxvp {
    UNKNOWN_EVENT_TYPE(0),
    MAGIC_PAIR_START(1010),
    WAIT_FOR_SCREEN_UNLOCK(1020),
    GATT_CONNECT(1030),
    BR_EDR_HANDOVER_WRITE_CONTROL_POINT_REQUEST(1040),
    BR_EDR_HANDOVER_READ_BLUETOOTH_MAC(1050),
    BR_EDR_HANDOVER_READ_TRANSPORT_BLOCK(1060),
    GET_PROFILES_VIA_SDP(1070),
    DISCOVER_DEVICE(1080),
    CANCEL_DISCOVERY(1090),
    REMOVE_BOND(1100),
    CANCEL_BOND(1110),
    CREATE_BOND(1120),
    CONNECT_PROFILE(1130),
    DISABLE_BLUETOOTH(1140),
    ENABLE_BLUETOOTH(1150),
    MAGIC_PAIR_END(1160),
    SECRET_HANDSHAKE(1170),
    WRITE_ACCOUNT_KEY(1180),
    WRITE_TO_FOOTPRINTS(1190),
    PASSKEY_EXCHANGE(1200),
    DEVICE_RECOGNIZED(1210),
    GET_LOCAL_PUBLIC_ADDRESS(1220),
    DIRECTLY_CONNECTED_TO_PROFILE(1230),
    DEVICE_ALIAS_CHANGED(1240),
    WRITE_DEVICE_NAME(1250),
    UPDATE_PROVIDER_NAME_START(1260),
    UPDATE_PROVIDER_NAME_END(1270),
    READ_FIRMWARE_VERSION(1280),
    RETROACTIVE_PAIR_START(1290),
    RETROACTIVE_PAIR_END(1300),
    SUBSEQUENT_PAIR_START(1310),
    SUBSEQUENT_PAIR_END(1320),
    BISTO_PAIR_START(1330),
    BISTO_PAIR_END(1340),
    REMOTE_PAIR_START(1350),
    REMOTE_PAIR_END(1360);
    

    /* renamed from: L */
    public final int f156339L;

    private bvjc(int i) {
        this.f156339L = i;
    }

    /* renamed from: a */
    public static bvjc m121167a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_EVENT_TYPE;
            case 1010:
                return MAGIC_PAIR_START;
            case 1020:
                return WAIT_FOR_SCREEN_UNLOCK;
            case 1030:
                return GATT_CONNECT;
            case 1040:
                return BR_EDR_HANDOVER_WRITE_CONTROL_POINT_REQUEST;
            case 1050:
                return BR_EDR_HANDOVER_READ_BLUETOOTH_MAC;
            case 1060:
                return BR_EDR_HANDOVER_READ_TRANSPORT_BLOCK;
            case 1070:
                return GET_PROFILES_VIA_SDP;
            case 1080:
                return DISCOVER_DEVICE;
            case 1090:
                return CANCEL_DISCOVERY;
            case 1100:
                return REMOVE_BOND;
            case 1110:
                return CANCEL_BOND;
            case 1120:
                return CREATE_BOND;
            case 1130:
                return CONNECT_PROFILE;
            case 1140:
                return DISABLE_BLUETOOTH;
            case 1150:
                return ENABLE_BLUETOOTH;
            case 1160:
                return MAGIC_PAIR_END;
            case 1170:
                return SECRET_HANDSHAKE;
            case 1180:
                return WRITE_ACCOUNT_KEY;
            case 1190:
                return WRITE_TO_FOOTPRINTS;
            case 1200:
                return PASSKEY_EXCHANGE;
            case 1210:
                return DEVICE_RECOGNIZED;
            case 1220:
                return GET_LOCAL_PUBLIC_ADDRESS;
            case 1230:
                return DIRECTLY_CONNECTED_TO_PROFILE;
            case 1240:
                return DEVICE_ALIAS_CHANGED;
            case 1250:
                return WRITE_DEVICE_NAME;
            case 1260:
                return UPDATE_PROVIDER_NAME_START;
            case 1270:
                return UPDATE_PROVIDER_NAME_END;
            case 1280:
                return READ_FIRMWARE_VERSION;
            case 1290:
                return RETROACTIVE_PAIR_START;
            case 1300:
                return RETROACTIVE_PAIR_END;
            case 1310:
                return SUBSEQUENT_PAIR_START;
            case 1320:
                return SUBSEQUENT_PAIR_END;
            case 1330:
                return BISTO_PAIR_START;
            case 1340:
                return BISTO_PAIR_END;
            case 1350:
                return REMOTE_PAIR_START;
            case 1360:
                return REMOTE_PAIR_END;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f156339L;
    }

    public final String toString() {
        return Integer.toString(this.f156339L);
    }
}
