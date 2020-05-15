package p000;

/* renamed from: lbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum lbc implements bxvp {
    UNKNOWN_DETECTION_METHOD(0),
    CLIENT_HEURISTICS(1),
    AUTOFILL_HINTS(2),
    WEBVIEW_HINTS(3),
    SERVER_TRUTH_DATA(4),
    SERVER_CROWDSOURCING(5),
    EXTENDED_AUTOFILL_HINTS(7),
    CLIENT_ML(8),
    ML_LITE(9),
    UNRECOGNIZED(-1);
    

    /* renamed from: k */
    private final int f25693k;

    private lbc(int i) {
        this.f25693k = i;
    }

    /* renamed from: a */
    public static lbc m18872a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_DETECTION_METHOD;
            case 1:
                return CLIENT_HEURISTICS;
            case 2:
                return AUTOFILL_HINTS;
            case 3:
                return WEBVIEW_HINTS;
            case 4:
                return SERVER_TRUTH_DATA;
            case 5:
                return SERVER_CROWDSOURCING;
            case 6:
            default:
                return null;
            case 7:
                return EXTENDED_AUTOFILL_HINTS;
            case 8:
                return CLIENT_ML;
            case 9:
                return ML_LITE;
        }
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f25693k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
