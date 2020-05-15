package p000;

/* renamed from: auzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum auzv implements bxvp {
    UNKNOWN_SYNC_REASON(0),
    PUSH_MESSAGE(1),
    FLAG_CHANGE(2),
    ACCOUNT_CHANGE(3),
    PUSH_REGISTRATION(4),
    DEVICE_BOOT(5),
    APP_UPDATE(6);
    

    /* renamed from: h */
    public static final bxvq f92840h = new auzu();

    /* renamed from: i */
    private final int f92842i;

    private auzv(int i) {
        this.f92842i = i;
    }

    /* renamed from: a */
    public static auzv m78125a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SYNC_REASON;
            case 1:
                return PUSH_MESSAGE;
            case 2:
                return FLAG_CHANGE;
            case 3:
                return ACCOUNT_CHANGE;
            case 4:
                return PUSH_REGISTRATION;
            case 5:
                return DEVICE_BOOT;
            case 6:
                return APP_UPDATE;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f92842i;
    }

    public final String toString() {
        return Integer.toString(this.f92842i);
    }
}
