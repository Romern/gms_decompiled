package p000;

/* renamed from: adbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum adbm implements bxvp {
    DEFAULT_CONSENT_STEP(0),
    GET_TOKEN(1),
    CONFIGURE_COOKIES(2),
    BROWSWER_CONSENT(3),
    NATIVE_CONSENT(4),
    RECORD_GRANTS(5),
    HANDLE_DEVICE_MANAGEMENT_ERRORS(6),
    HANDLE_LOCK_SCREEN_ERROR(7),
    REAUTH(8);
    

    /* renamed from: j */
    public final int f61332j;

    private adbm(int i) {
        this.f61332j = i;
    }

    /* renamed from: a */
    public static adbm m50122a(int i) {
        switch (i) {
            case 0:
                return DEFAULT_CONSENT_STEP;
            case 1:
                return GET_TOKEN;
            case 2:
                return CONFIGURE_COOKIES;
            case 3:
                return BROWSWER_CONSENT;
            case 4:
                return NATIVE_CONSENT;
            case 5:
                return RECORD_GRANTS;
            case 6:
                return HANDLE_DEVICE_MANAGEMENT_ERRORS;
            case 7:
                return HANDLE_LOCK_SCREEN_ERROR;
            case 8:
                return REAUTH;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m50123b() {
        return adbl.f61321a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f61332j;
    }

    public final String toString() {
        return Integer.toString(this.f61332j);
    }
}
