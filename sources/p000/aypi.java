package p000;

/* renamed from: aypi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum aypi {
    UNKNOWN((byte) -1),
    SUCCESS((byte) 0),
    OP_CODE_NOT_SUPPORTED((byte) 1),
    INVALID_PARAMETER((byte) 2),
    UNSUPPORTED_ORGANIZATION_ID((byte) 3),
    OPERATION_FAILED((byte) 4);
    

    /* renamed from: g */
    private final byte f98170g;

    private aypi(byte b) {
        this.f98170g = b;
    }

    /* renamed from: a */
    public static aypi m84416a(byte[] bArr) {
        if (bArr.length >= 2) {
            byte b = bArr[1];
            aypi[] values = values();
            for (aypi aypi : values) {
                if (aypi.f98170g == b) {
                    return aypi;
                }
            }
        }
        return UNKNOWN;
    }
}
