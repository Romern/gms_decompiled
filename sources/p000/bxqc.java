package p000;

/* renamed from: bxqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxqc implements bxvp {
    UNKNOWN_REQUEST_REASON(0),
    PERIODIC_SYNC(1),
    FLAG_CHANGE(2),
    ACCOUNT_CHANGE(3),
    DEVICE_BOOT(4),
    APP_UPDATE(5),
    PUSH_MESSAGE(6),
    PUSH_REGISTRATION(7),
    FORCED_SYNC(8),
    EMPTY_CACHE(9),
    INITIALIZATION_SYNC(10);
    

    /* renamed from: l */
    public final int f164366l;

    private bxqc(int i) {
        this.f164366l = i;
    }

    /* renamed from: a */
    public static bxqc m122975a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_REQUEST_REASON;
            case 1:
                return PERIODIC_SYNC;
            case 2:
                return FLAG_CHANGE;
            case 3:
                return ACCOUNT_CHANGE;
            case 4:
                return DEVICE_BOOT;
            case 5:
                return APP_UPDATE;
            case 6:
                return PUSH_MESSAGE;
            case 7:
                return PUSH_REGISTRATION;
            case 8:
                return FORCED_SYNC;
            case 9:
                return EMPTY_CACHE;
            case 10:
                return INITIALIZATION_SYNC;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m122976b() {
        return bxqb.f164353a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f164366l;
    }

    public final String toString() {
        return Integer.toString(this.f164366l);
    }
}
