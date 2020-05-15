package p000;

/* renamed from: cavl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cavl {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    HTTP_1_1_REQUIRED(13, -1, -1),
    INVALID_CREDENTIALS(-1, 10, -1);
    

    /* renamed from: s */
    public final int f176159s;

    /* renamed from: t */
    public final int f176160t;

    /* renamed from: u */
    public final int f176161u;

    private cavl(int i, int i2, int i3) {
        this.f176159s = i;
        this.f176160t = i2;
        this.f176161u = i3;
    }

    /* renamed from: a */
    public static cavl m127321a(int i) {
        cavl[] values = values();
        for (cavl cavl : values) {
            if (cavl.f176159s == i) {
                return cavl;
            }
        }
        return null;
    }
}
