package p000;

/* renamed from: cadl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cadl implements bxvp {
    UNKNOWN_BUCKET(0),
    TIME_BUCKET(1),
    SESSION_BUCKET(2),
    ACTIVITY_TYPE_BUCKET(3),
    ACTIVITY_SEGMENT_BUCKET(4),
    TIME_INTERVAL_BUCKET(5);
    

    /* renamed from: g */
    public final int f172698g;

    private cadl(int i) {
        this.f172698g = i;
    }

    /* renamed from: a */
    public static cadl m126501a(int i) {
        if (i == 0) {
            return UNKNOWN_BUCKET;
        }
        if (i == 1) {
            return TIME_BUCKET;
        }
        if (i == 2) {
            return SESSION_BUCKET;
        }
        if (i == 3) {
            return ACTIVITY_TYPE_BUCKET;
        }
        if (i == 4) {
            return ACTIVITY_SEGMENT_BUCKET;
        }
        if (i != 5) {
            return null;
        }
        return TIME_INTERVAL_BUCKET;
    }

    /* renamed from: b */
    public static bxvr m126502b() {
        return cadk.f172690a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f172698g;
    }

    public final String toString() {
        return Integer.toString(this.f172698g);
    }
}
