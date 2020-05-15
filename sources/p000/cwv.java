package p000;

/* renamed from: cwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum cwv {
    PDOL((byte) 16),
    INTERNAL((byte) 32),
    ALT_AID((byte) 64),
    INTERFACE_TYPE_MOBILE((byte) 0),
    INTERFACE_TYPE_CONTACTLESS(Byte.MIN_VALUE);
    

    /* renamed from: f */
    private final byte f12287f;

    private cwv(byte b) {
        this.f12287f = b;
    }

    /* renamed from: a */
    public static cwv m7794a(byte b) {
        byte b2 = (byte) (b & 240);
        cwv[] values = values();
        for (cwv cwv : values) {
            if (cwv.f12287f == b2) {
                return cwv;
            }
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("unknown data type of PDOL check in:");
        sb.append((int) b);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static byte[] m7795a(int i) {
        if (i <= 0) {
            i = 1;
        }
        byte[] bArr = new byte[i];
        bArr[0] = Byte.MIN_VALUE;
        return bArr;
    }
}
