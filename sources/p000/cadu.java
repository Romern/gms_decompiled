package p000;

/* renamed from: cadu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cadu implements bxvp {
    UNKNOWN_SYNC_SOURCE(0),
    PERIODIC(1),
    PEER_CONNECTED(2),
    SESSION_INSERTED(3),
    FIT_APP_INITIATED(4),
    GOAL_UPDATED(5),
    SIGNIFICANT_STEPS(6),
    HEIGHT_UPDATED(7),
    WEIGHT_UPDATED(8),
    SERVER_INITIATED(9);
    

    /* renamed from: k */
    public final int f172744k;

    private cadu(int i) {
        this.f172744k = i;
    }

    /* renamed from: a */
    public static cadu m126522a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SYNC_SOURCE;
            case 1:
                return PERIODIC;
            case 2:
                return PEER_CONNECTED;
            case 3:
                return SESSION_INSERTED;
            case 4:
                return FIT_APP_INITIATED;
            case 5:
                return GOAL_UPDATED;
            case 6:
                return SIGNIFICANT_STEPS;
            case 7:
                return HEIGHT_UPDATED;
            case 8:
                return WEIGHT_UPDATED;
            case 9:
                return SERVER_INITIATED;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f172744k;
    }

    public final String toString() {
        return Integer.toString(this.f172744k);
    }
}
