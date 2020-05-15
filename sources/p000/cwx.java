package p000;

/* renamed from: cwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum cwx {
    NEVER_MATCHER(Byte.MIN_VALUE),
    EXACT_MATCHER((byte) 64),
    DIFFERENT_MATCHER((byte) 32),
    EQ_OR_GREATER_MATCHER((byte) 16),
    ALWAYS_MATCHER((byte) 0);
    

    /* renamed from: f */
    private final byte f12298f;

    private cwx(byte b) {
        this.f12298f = b;
    }

    /* renamed from: a */
    public static cwx m7797a(byte b) {
        byte b2 = (byte) (b & 240);
        cwx[] values = values();
        for (cwx cwx : values) {
            if (cwx.f12298f == b2) {
                return cwx;
            }
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("unknown data type of PDOL check in:");
        sb.append((int) b);
        throw new IllegalArgumentException(sb.toString());
    }
}
