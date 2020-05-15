package p000;

/* renamed from: bxzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxzv implements bxvp {
    TASK_UNKNOWN(0),
    TASK_LIST_CPID_ENDPOINTS(1),
    TASK_HTTP_CPID_FETCH(2),
    TASK_GCORE_REGISTER(3),
    TASK_GET_CONSENT_INFO(4),
    TASK_SET_CONSENT_STATUS(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f165191h;

    private bxzv(int i) {
        this.f165191h = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f165191h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
