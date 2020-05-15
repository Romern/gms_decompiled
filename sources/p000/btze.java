package p000;

/* renamed from: btze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btze implements bxvp {
    UNKNOWN_UI_CONTEXT(0),
    DRIVING_MODE(1),
    DRIVING_MODE_FRX_INTRO(2),
    DRIVING_MODE_FRX_SUCCESS(3),
    DRIVING_MODE_FRX_CHOOSE_BEHAVIOR(4),
    DRIVING_MODE_FRX_DND_ACCESS_REQUEST(5),
    DRIVING_MODE_FRX_DOWNLOAD(6),
    DRIVING_MODE_FRX_ERROR(7),
    DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER(8),
    DRIVING_MODE_FRX_GEARHEAD_SETUP(9);
    

    /* renamed from: k */
    public final int f153104k;

    private btze(int i) {
        this.f153104k = i;
    }

    /* renamed from: a */
    public static btze m119037a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_UI_CONTEXT;
            case 1:
                return DRIVING_MODE;
            case 2:
                return DRIVING_MODE_FRX_INTRO;
            case 3:
                return DRIVING_MODE_FRX_SUCCESS;
            case 4:
                return DRIVING_MODE_FRX_CHOOSE_BEHAVIOR;
            case 5:
                return DRIVING_MODE_FRX_DND_ACCESS_REQUEST;
            case 6:
                return DRIVING_MODE_FRX_DOWNLOAD;
            case 7:
                return DRIVING_MODE_FRX_ERROR;
            case 8:
                return DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER;
            case 9:
                return DRIVING_MODE_FRX_GEARHEAD_SETUP;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m119038b() {
        return btzd.f153092a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f153104k;
    }

    public final String toString() {
        return Integer.toString(this.f153104k);
    }
}
