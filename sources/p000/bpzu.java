package p000;

/* renamed from: bpzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpzu implements bxvp {
    UNKNOWN(0),
    PERIODIC(1),
    ONE_OFF(2),
    DEBUG_UI(3),
    ONE_OFF_REASON_INSTALL(4),
    ONE_OFF_REASON_REBUILD(5),
    DEBUG_UI_REASON_REFRESH(6),
    DEBUG_UI_REASON_REBUILD(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: j */
    private final int f140114j;

    private bpzu(int i) {
        this.f140114j = i;
    }

    /* renamed from: a */
    public static bpzu m112450a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return PERIODIC;
            case 2:
                return ONE_OFF;
            case 3:
                return DEBUG_UI;
            case 4:
                return ONE_OFF_REASON_INSTALL;
            case 5:
                return ONE_OFF_REASON_REBUILD;
            case 6:
                return DEBUG_UI_REASON_REFRESH;
            case 7:
                return DEBUG_UI_REASON_REBUILD;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112451b() {
        return bpzt.f140103a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f140114j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
