package p000;

/* renamed from: buuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum buuw implements bxvp {
    UNKNOWN_FRAME_TYPE(0),
    CONNECTION_REQUEST(1),
    CONNECTION_RESPONSE(2),
    PAYLOAD_TRANSFER(3),
    BANDWIDTH_UPGRADE_NEGOTIATION(4),
    KEEP_ALIVE(5),
    DISCONNECTION(6),
    PAIRED_KEY_ENCRYPTION(7);
    

    /* renamed from: i */
    public final int f155002i;

    private buuw(int i) {
        this.f155002i = i;
    }

    /* renamed from: a */
    public static buuw m120478a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FRAME_TYPE;
            case 1:
                return CONNECTION_REQUEST;
            case 2:
                return CONNECTION_RESPONSE;
            case 3:
                return PAYLOAD_TRANSFER;
            case 4:
                return BANDWIDTH_UPGRADE_NEGOTIATION;
            case 5:
                return KEEP_ALIVE;
            case 6:
                return DISCONNECTION;
            case 7:
                return PAIRED_KEY_ENCRYPTION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m120479b() {
        return buuv.f154992a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f155002i;
    }

    public final String toString() {
        return Integer.toString(this.f155002i);
    }
}
