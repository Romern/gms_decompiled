package p000;

/* renamed from: ciae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ciae {
    NO_ERROR(0, chuv.f189229p),
    PROTOCOL_ERROR(1, chuv.f189228o),
    INTERNAL_ERROR(2, chuv.f189228o),
    FLOW_CONTROL_ERROR(3, chuv.f189228o),
    SETTINGS_TIMEOUT(4, chuv.f189228o),
    STREAM_CLOSED(5, chuv.f189228o),
    FRAME_SIZE_ERROR(6, chuv.f189228o),
    REFUSED_STREAM(7, chuv.f189229p),
    CANCEL(8, chuv.f189216c),
    COMPRESSION_ERROR(9, chuv.f189228o),
    CONNECT_ERROR(10, chuv.f189228o),
    ENHANCE_YOUR_CALM(11, chuv.f189224k.mo85687a("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, chuv.f189222i.mo85687a("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, chuv.f189217d);
    

    /* renamed from: o */
    public static final ciae[] f189640o;

    /* renamed from: p */
    public final chuv f189642p;

    /* renamed from: q */
    private final int f189643q;

    static {
        ciae[] values = values();
        int length = values.length;
        ciae[] ciaeArr = new ciae[(((int) values[length - 1].mo85862a()) + 1)];
        for (ciae ciae : values) {
            ciaeArr[(int) ciae.mo85862a()] = ciae;
        }
        f189640o = ciaeArr;
    }

    private ciae(int i, chuv chuv) {
        this.f189643q = i;
        String valueOf = String.valueOf(name());
        this.f189642p = chuv.mo85690b(valueOf.length() == 0 ? new String("HTTP/2 error code: ") : "HTTP/2 error code: ".concat(valueOf));
    }

    /* renamed from: a */
    public final long mo85862a() {
        return (long) this.f189643q;
    }
}
