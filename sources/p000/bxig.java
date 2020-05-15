package p000;

/* renamed from: bxig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxig implements bxvp {
    UNKNOWN(0),
    NULL_PLACE_INFERENCE(1),
    PLACES_DID_CHANGE(2),
    NO_PLACE_RESULT_WITHIN_TIMEOUT_PERIOD(3),
    SCREEN_IS_OFF(4),
    EMPTY_PLACE_INFERENCE_WITHIN_TIMEOUT_PERIOD(5),
    SAME_PLACE_ON_CONSECUTIVE_SCREEN_ONS(6);
    

    /* renamed from: h */
    public final int f163521h;

    private bxig(int i) {
        this.f163521h = i;
    }

    /* renamed from: a */
    public static bxig m122741a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return NULL_PLACE_INFERENCE;
            case 2:
                return PLACES_DID_CHANGE;
            case 3:
                return NO_PLACE_RESULT_WITHIN_TIMEOUT_PERIOD;
            case 4:
                return SCREEN_IS_OFF;
            case 5:
                return EMPTY_PLACE_INFERENCE_WITHIN_TIMEOUT_PERIOD;
            case 6:
                return SAME_PLACE_ON_CONSECUTIVE_SCREEN_ONS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m122742b() {
        return bxif.f163512a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f163521h;
    }

    public final String toString() {
        return Integer.toString(this.f163521h);
    }
}
