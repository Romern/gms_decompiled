package p000;

/* renamed from: bpsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpsg implements bxvp {
    EVENT_TYPE_UNKNOWN(0),
    EVENT_TYPE_SESSION_START(1),
    EVENT_TYPE_SESSION_END(2),
    EVENT_TYPE_API_REQUEST_START(3),
    EVENT_TYPE_API_REQUEST_END(4),
    EVENT_TYPE_PREFETCHED_INITIALIZE(5),
    EVENT_TYPE_PAGE_INTERACTABLE(6),
    EVENT_TYPE_EVENT_RULE_EVALUATION(7),
    EVENT_TYPE_DATA_VALUE_CHANGE(8),
    EVENT_TYPE_FUNCTIONAL_DATA_VALUE_CHANGE(9),
    EVENT_TYPE_VALIDATION_ERROR(10);
    

    /* renamed from: l */
    public final int f138957l;

    private bpsg(int i) {
        this.f138957l = i;
    }

    /* renamed from: a */
    public static bpsg m112232a(int i) {
        switch (i) {
            case 0:
                return EVENT_TYPE_UNKNOWN;
            case 1:
                return EVENT_TYPE_SESSION_START;
            case 2:
                return EVENT_TYPE_SESSION_END;
            case 3:
                return EVENT_TYPE_API_REQUEST_START;
            case 4:
                return EVENT_TYPE_API_REQUEST_END;
            case 5:
                return EVENT_TYPE_PREFETCHED_INITIALIZE;
            case 6:
                return EVENT_TYPE_PAGE_INTERACTABLE;
            case 7:
                return EVENT_TYPE_EVENT_RULE_EVALUATION;
            case 8:
                return EVENT_TYPE_DATA_VALUE_CHANGE;
            case 9:
                return EVENT_TYPE_FUNCTIONAL_DATA_VALUE_CHANGE;
            case 10:
                return EVENT_TYPE_VALIDATION_ERROR;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112233b() {
        return bpsf.f138944a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f138957l;
    }

    public final String toString() {
        return Integer.toString(this.f138957l);
    }
}
