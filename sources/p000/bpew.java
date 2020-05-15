package p000;

/* renamed from: bpew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpew implements bxvp {
    DISCOVERY_STOP_UNKNOWN(0),
    DISCOVERY_STOP_CRITERIA_CHANGED(1),
    DISCOVERY_STOP_NETWORK_CHANGE(2),
    DISCOVERY_STOP_SCREEN_OFF(3),
    DISCOVERY_STOP_BACKGROUND_MODE(4),
    DISCOVERY_STOP_CONFIGURATION_UPDATED(5),
    DISCOVERY_STOP_APPLICATION_FINISHED(6);
    

    /* renamed from: h */
    public final int f137365h;

    private bpew(int i) {
        this.f137365h = i;
    }

    /* renamed from: a */
    public static bpew m111849a(int i) {
        switch (i) {
            case 0:
                return DISCOVERY_STOP_UNKNOWN;
            case 1:
                return DISCOVERY_STOP_CRITERIA_CHANGED;
            case 2:
                return DISCOVERY_STOP_NETWORK_CHANGE;
            case 3:
                return DISCOVERY_STOP_SCREEN_OFF;
            case 4:
                return DISCOVERY_STOP_BACKGROUND_MODE;
            case 5:
                return DISCOVERY_STOP_CONFIGURATION_UPDATED;
            case 6:
                return DISCOVERY_STOP_APPLICATION_FINISHED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m111850b() {
        return bpev.f137356a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f137365h;
    }

    public final String toString() {
        return Integer.toString(this.f137365h);
    }
}
