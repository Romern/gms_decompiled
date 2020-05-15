package p000;

/* renamed from: cake */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cake implements bxvp {
    SUCCESS(0),
    FAILURE(1),
    MISSING_ACCOUNT(2),
    LOCATION_DISABLED_IN_SYSTEM(16),
    LOCATION_DISABLED_IN_GOOGLE_SETTINGS(3),
    LOCATION_DISABLED_IN_CONSOLE(4),
    LOCATION_TIME_OUT(7),
    UNKNOWN_COMMAND(5),
    UNABLE_TO_PERFORM_ACTION_NOT_DEVICE_ADMINISTRATOR(6),
    USER_NOT_PRIVILEGED(8),
    PASSWORD_NOT_STRONG_ENOUGH(9),
    DEFAULT_UNKNOWN(10),
    AUTO_ENABLE_ALREADY_DEVICE_ADMINISTRATOR(11),
    INVALID_REMOTE_INSTRUCTION(12),
    INVALID_ANDROID_VERSION(13),
    AUTO_DISABLE_ALREADY_NOT_DEVICE_ADMINISTRATOR(14),
    REMIND_ALREADY_DEVICE_ADMINISTRATOR(15),
    LOCKSCREEN_PHONE_NUMBER_INVALID(17),
    DEVICE_HAS_NO_TELEPHONY(18),
    LOCKSCREEN_ALREADY_ENABLED(19),
    RING_DEVICE_INTERRUPTED(20),
    LAST_KNOWN_LOCATION(21),
    GMS_PERMISSION_DENIED(22),
    UNPAIR_TIMEOUT(23),
    SCREEN_UNLOCKED(24);
    

    /* renamed from: z */
    public final int f174967z;

    private cake(int i) {
        this.f174967z = i;
    }

    /* renamed from: a */
    public static cake m126716a(int i) {
        switch (i) {
            case 0:
                return SUCCESS;
            case 1:
                return FAILURE;
            case 2:
                return MISSING_ACCOUNT;
            case 3:
                return LOCATION_DISABLED_IN_GOOGLE_SETTINGS;
            case 4:
                return LOCATION_DISABLED_IN_CONSOLE;
            case 5:
                return UNKNOWN_COMMAND;
            case 6:
                return UNABLE_TO_PERFORM_ACTION_NOT_DEVICE_ADMINISTRATOR;
            case 7:
                return LOCATION_TIME_OUT;
            case 8:
                return USER_NOT_PRIVILEGED;
            case 9:
                return PASSWORD_NOT_STRONG_ENOUGH;
            case 10:
                return DEFAULT_UNKNOWN;
            case 11:
                return AUTO_ENABLE_ALREADY_DEVICE_ADMINISTRATOR;
            case 12:
                return INVALID_REMOTE_INSTRUCTION;
            case 13:
                return INVALID_ANDROID_VERSION;
            case 14:
                return AUTO_DISABLE_ALREADY_NOT_DEVICE_ADMINISTRATOR;
            case 15:
                return REMIND_ALREADY_DEVICE_ADMINISTRATOR;
            case 16:
                return LOCATION_DISABLED_IN_SYSTEM;
            case 17:
                return LOCKSCREEN_PHONE_NUMBER_INVALID;
            case 18:
                return DEVICE_HAS_NO_TELEPHONY;
            case 19:
                return LOCKSCREEN_ALREADY_ENABLED;
            case 20:
                return RING_DEVICE_INTERRUPTED;
            case 21:
                return LAST_KNOWN_LOCATION;
            case 22:
                return GMS_PERMISSION_DENIED;
            case 23:
                return UNPAIR_TIMEOUT;
            case 24:
                return SCREEN_UNLOCKED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m126717b() {
        return cakd.f174940a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f174967z;
    }

    public final String toString() {
        return Integer.toString(this.f174967z);
    }
}
