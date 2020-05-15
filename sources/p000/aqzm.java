package p000;

/* renamed from: aqzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum aqzm {
    UNKNOWN((byte) 0),
    PHONE((byte) 1),
    TABLET((byte) 2),
    TV((byte) 3),
    WEAR((byte) 4),
    WEAVE((byte) 5),
    AUTO((byte) 6);
    

    /* renamed from: h */
    public final byte f87167h;

    private aqzm(byte b) {
        this.f87167h = b;
    }

    /* renamed from: a */
    public static aqzm m72294a(String str) {
        if (str != null) {
            aqzm[] values = values();
            for (aqzm aqzm : values) {
                if (bmwb.m108443a(aqzm.name(), str)) {
                    return aqzm;
                }
            }
        }
        return UNKNOWN;
    }
}
