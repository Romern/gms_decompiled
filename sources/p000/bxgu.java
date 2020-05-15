package p000;

/* renamed from: bxgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxgu implements bxvp {
    UNKNOWN_FENCE_OPERATION_TYPE(0),
    ADD_LISTENER(1),
    ADD_PENDING_INTENT(2),
    REMOVE_LISTENER(3),
    REMOVE_PENDING_INTENT(4),
    REMOVE_FENCE_KEY(5),
    SET_FENCE_RESPONSIVENESS(6),
    REMOVE_FENCE_RESPONSIVENESS(7),
    PROBE_FENCE(8);
    

    /* renamed from: j */
    public final int f163309j;

    private bxgu(int i) {
        this.f163309j = i;
    }

    /* renamed from: a */
    public static bxgu m122699a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FENCE_OPERATION_TYPE;
            case 1:
                return ADD_LISTENER;
            case 2:
                return ADD_PENDING_INTENT;
            case 3:
                return REMOVE_LISTENER;
            case 4:
                return REMOVE_PENDING_INTENT;
            case 5:
                return REMOVE_FENCE_KEY;
            case 6:
                return SET_FENCE_RESPONSIVENESS;
            case 7:
                return REMOVE_FENCE_RESPONSIVENESS;
            case 8:
                return PROBE_FENCE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m122700b() {
        return bxgt.f163298a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f163309j;
    }

    public final String toString() {
        return Integer.toString(this.f163309j);
    }
}
