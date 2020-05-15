package p000;

/* renamed from: cimj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cimj implements bxvp {
    UNKNOWN(0),
    FOREGROUND_TO_BACKGROUND(1),
    BACKGROUND_TO_FOREGROUND(2),
    FOREGROUND_SERVICE_START(3),
    FOREGROUND_SERVICE_STOP(4),
    CUSTOM_MEASURE_START(5),
    CUSTOM_MEASURE_STOP(6);
    

    /* renamed from: h */
    public final int f190729h;

    private cimj(int i) {
        this.f190729h = i;
    }

    /* renamed from: a */
    public static cimj m150575a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return FOREGROUND_TO_BACKGROUND;
            case 2:
                return BACKGROUND_TO_FOREGROUND;
            case 3:
                return FOREGROUND_SERVICE_START;
            case 4:
                return FOREGROUND_SERVICE_STOP;
            case 5:
                return CUSTOM_MEASURE_START;
            case 6:
                return CUSTOM_MEASURE_STOP;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m150576b() {
        return cimi.f190720a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f190729h;
    }

    public final String toString() {
        return Integer.toString(this.f190729h);
    }
}
