package p000;

/* renamed from: calc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum calc implements bxvp {
    UNKNOWN(0),
    ALARM(1),
    ERROR_REPORTED(2),
    CHARGING(3),
    DISCHARGING(4),
    SCREEN_ON(5),
    SCREEN_OFF(6),
    ERROR_ALARM(7);
    

    /* renamed from: i */
    public final int f175111i;

    private calc(int i) {
        this.f175111i = i;
    }

    /* renamed from: a */
    public static calc m126745a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ALARM;
            case 2:
                return ERROR_REPORTED;
            case 3:
                return CHARGING;
            case 4:
                return DISCHARGING;
            case 5:
                return SCREEN_ON;
            case 6:
                return SCREEN_OFF;
            case 7:
                return ERROR_ALARM;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m126746b() {
        return calb.f175101a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f175111i;
    }

    public final String toString() {
        return Integer.toString(this.f175111i);
    }
}
