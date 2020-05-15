package p000;

/* renamed from: cakk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cakk implements bxvp {
    UNKNOWN(0),
    ACCOUNTS_CHANGED(1),
    CONNECTIVITY_CHANGED(2),
    DEVICE_ADMIN_DISABLED(3),
    DEVICE_ADMIN_ENABLED(4),
    DEVICE_ADMIN_UNCHANGED_AFTER_PROMPT(5),
    GMS_UPDATED(6),
    GMS_GCM_REGISTERED(7),
    SITREP_REMOTE_INSTRUCTION(8),
    DEVICE_ADMIN_ALREADY_ENABLED(9),
    DEVICE_ADMIN_NOT_ENABLED(10),
    RETRY_AFTER_SERVER_DELAY(11),
    ASSURE_REMOTE_INSTRUCTION(12),
    LOCKSCREEN_STATE_CHANGED(13);
    

    /* renamed from: o */
    public final int f175005o;

    private cakk(int i) {
        this.f175005o = i;
    }

    /* renamed from: a */
    public static cakk m126724a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ACCOUNTS_CHANGED;
            case 2:
                return CONNECTIVITY_CHANGED;
            case 3:
                return DEVICE_ADMIN_DISABLED;
            case 4:
                return DEVICE_ADMIN_ENABLED;
            case 5:
                return DEVICE_ADMIN_UNCHANGED_AFTER_PROMPT;
            case 6:
                return GMS_UPDATED;
            case 7:
                return GMS_GCM_REGISTERED;
            case 8:
                return SITREP_REMOTE_INSTRUCTION;
            case 9:
                return DEVICE_ADMIN_ALREADY_ENABLED;
            case 10:
                return DEVICE_ADMIN_NOT_ENABLED;
            case 11:
                return RETRY_AFTER_SERVER_DELAY;
            case 12:
                return ASSURE_REMOTE_INSTRUCTION;
            case 13:
                return LOCKSCREEN_STATE_CHANGED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m126725b() {
        return cakj.f174989a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f175005o;
    }

    public final String toString() {
        return Integer.toString(this.f175005o);
    }
}
