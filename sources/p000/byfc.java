package p000;

/* renamed from: byfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum byfc implements bxvp {
    SEMANTIC_UNKNOWN(0),
    SEMANTIC_REROUTE_SOURCE(1),
    SEMANTIC_REROUTE_PROPOSED(2),
    SEMANTIC_REROUTE_TAKEN(3),
    SEMANTIC_HOME(4),
    SEMANTIC_WORK(5),
    SEMANTIC_ONBOARD_TRANSIT(6),
    SEMANTIC_MAPS_SEARCH(7),
    SEMANTIC_FREQUENT_PLACE(8),
    SEMANTIC_OTHER(9);
    

    /* renamed from: k */
    public final int f166005k;

    private byfc(int i) {
        this.f166005k = i;
    }

    /* renamed from: a */
    public static byfc m124749a(int i) {
        switch (i) {
            case 0:
                return SEMANTIC_UNKNOWN;
            case 1:
                return SEMANTIC_REROUTE_SOURCE;
            case 2:
                return SEMANTIC_REROUTE_PROPOSED;
            case 3:
                return SEMANTIC_REROUTE_TAKEN;
            case 4:
                return SEMANTIC_HOME;
            case 5:
                return SEMANTIC_WORK;
            case 6:
                return SEMANTIC_ONBOARD_TRANSIT;
            case 7:
                return SEMANTIC_MAPS_SEARCH;
            case 8:
                return SEMANTIC_FREQUENT_PLACE;
            case 9:
                return SEMANTIC_OTHER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m124750b() {
        return byfb.f165993a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f166005k;
    }

    public final String toString() {
        return Integer.toString(this.f166005k);
    }
}
