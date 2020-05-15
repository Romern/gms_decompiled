package p000;

/* renamed from: bpms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpms implements bxvp {
    INVALID_STATE(0),
    NOT_INITIALIZED(1),
    NO_GEOFENCE(2),
    DISABLED(3),
    HAS_GEOFENCE(4),
    UNAVAILABLE_ACTIVITY(5),
    UNKNOWN_ACTIVITY(6),
    STILL_ACTIVITY(7),
    WALKING_ACTIVITY(8),
    FAST_MOVING_ACTIVITY(9),
    BACKGROUND_USER(10),
    CHRE_GEOFENCING(11);
    

    /* renamed from: m */
    public final int f138340m;

    private bpms(int i) {
        this.f138340m = i;
    }

    /* renamed from: a */
    public static bpms m112073a(int i) {
        switch (i) {
            case 0:
                return INVALID_STATE;
            case 1:
                return NOT_INITIALIZED;
            case 2:
                return NO_GEOFENCE;
            case 3:
                return DISABLED;
            case 4:
                return HAS_GEOFENCE;
            case 5:
                return UNAVAILABLE_ACTIVITY;
            case 6:
                return UNKNOWN_ACTIVITY;
            case 7:
                return STILL_ACTIVITY;
            case 8:
                return WALKING_ACTIVITY;
            case 9:
                return FAST_MOVING_ACTIVITY;
            case 10:
                return BACKGROUND_USER;
            case 11:
                return CHRE_GEOFENCING;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112074b() {
        return bpmr.f138326a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f138340m;
    }

    public final String toString() {
        return Integer.toString(this.f138340m);
    }
}
