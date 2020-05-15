package p000;

/* renamed from: buce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum buce implements bxvp {
    INVALID_ACTIVITY(0),
    IN_VEHICLE(1),
    ON_BICYCLE(2),
    WALKING(3),
    RUNNING(4),
    STILL(5),
    INCONSISTENT(6),
    TILTING(7),
    IN_ROAD_VEHICLE(8),
    IN_RAIL_VEHICLE(9);
    

    /* renamed from: k */
    public final int f153340k;

    private buce(int i) {
        this.f153340k = i;
    }

    /* renamed from: a */
    public static buce m119318a(int i) {
        switch (i) {
            case 0:
                return INVALID_ACTIVITY;
            case 1:
                return IN_VEHICLE;
            case 2:
                return ON_BICYCLE;
            case 3:
                return WALKING;
            case 4:
                return RUNNING;
            case 5:
                return STILL;
            case 6:
                return INCONSISTENT;
            case 7:
                return TILTING;
            case 8:
                return IN_ROAD_VEHICLE;
            case 9:
                return IN_RAIL_VEHICLE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m119319b() {
        return bucd.f153328a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f153340k;
    }

    public final String toString() {
        return Integer.toString(this.f153340k);
    }
}
