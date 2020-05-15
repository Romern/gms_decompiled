package p000;

/* renamed from: bows */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bows implements bxvp {
    UNKNOWN_SPAMTYPE(0),
    INCOMING_CALL_ANSWERED(1),
    MISSED_CALL(2),
    VOICEMAIL(3),
    OUTGOING_CALL(4),
    REJECTED_CALL(5),
    BLOCKED_CALL(6),
    ANSWERED_EXTERNALLY(7),
    INCOMING_MESSAGE(8),
    OUTGOING_MESSAGE(9),
    BLOCKED_MESSAGE(10);
    

    /* renamed from: l */
    public final int f135172l;

    private bows(int i) {
        this.f135172l = i;
    }

    /* renamed from: a */
    public static bows m111619a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SPAMTYPE;
            case 1:
                return INCOMING_CALL_ANSWERED;
            case 2:
                return MISSED_CALL;
            case 3:
                return VOICEMAIL;
            case 4:
                return OUTGOING_CALL;
            case 5:
                return REJECTED_CALL;
            case 6:
                return BLOCKED_CALL;
            case 7:
                return ANSWERED_EXTERNALLY;
            case 8:
                return INCOMING_MESSAGE;
            case 9:
                return OUTGOING_MESSAGE;
            case 10:
                return BLOCKED_MESSAGE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m111620b() {
        return bowr.f135159a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f135172l;
    }

    public final String toString() {
        return Integer.toString(this.f135172l);
    }
}
