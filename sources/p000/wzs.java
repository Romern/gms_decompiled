package p000;

/* renamed from: wzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum wzs implements bxvp {
    EVENT_TYPE_UNDEFINED_DO_NOT_USE(0),
    EVENT_TYPE_ENROLLMENT_SUCCESS(1),
    EVENT_TYPE_ENROLLMENT_ERROR(2),
    EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS(3),
    EVENT_TYPE_HARDWARE_KEY_INVALIDATION_ERROR(4),
    EVENT_TYPE_SIGN_ASSERTION_SUCCESS(5),
    EVENT_TYPE_SIGN_ASSERTION_ERROR(6);
    

    /* renamed from: h */
    public final int f51637h;

    private wzs(int i) {
        this.f51637h = i;
    }

    /* renamed from: a */
    public static wzs m42538a(int i) {
        switch (i) {
            case 0:
                return EVENT_TYPE_UNDEFINED_DO_NOT_USE;
            case 1:
                return EVENT_TYPE_ENROLLMENT_SUCCESS;
            case 2:
                return EVENT_TYPE_ENROLLMENT_ERROR;
            case 3:
                return EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS;
            case 4:
                return EVENT_TYPE_HARDWARE_KEY_INVALIDATION_ERROR;
            case 5:
                return EVENT_TYPE_SIGN_ASSERTION_SUCCESS;
            case 6:
                return EVENT_TYPE_SIGN_ASSERTION_ERROR;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m42539b() {
        return wzr.f51628a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f51637h;
    }

    public final String toString() {
        return Integer.toString(this.f51637h);
    }
}
