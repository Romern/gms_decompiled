package p000;

/* renamed from: cihm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cihm {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INVALID_STREAM(1),
    UNSUPPORTED_VERSION(1),
    STREAM_IN_USE(1),
    STREAM_ALREADY_CLOSED(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    STREAM_CLOSED(5),
    FRAME_TOO_LARGE(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13),
    INVALID_CREDENTIALS(-1);
    

    /* renamed from: s */
    public final int f190342s;

    private cihm(int i) {
        this.f190342s = i;
    }

    /* renamed from: a */
    public static cihm m150314a(int i) {
        cihm[] values = values();
        for (cihm cihm : values) {
            if (cihm.f190342s == i) {
                return cihm;
            }
        }
        return null;
    }
}
