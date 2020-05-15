package p000;

/* renamed from: bxzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxzf {
    DOUBLE(bxzg.DOUBLE, 1),
    FLOAT(bxzg.FLOAT, 5),
    INT64(bxzg.LONG, 0),
    UINT64(bxzg.LONG, 0),
    INT32(bxzg.INT, 0),
    FIXED64(bxzg.LONG, 1),
    FIXED32(bxzg.INT, 5),
    BOOL(bxzg.BOOLEAN, 0),
    STRING(bxzg.STRING, 2),
    GROUP(bxzg.MESSAGE, 3),
    MESSAGE(bxzg.MESSAGE, 2),
    BYTES(bxzg.BYTE_STRING, 2),
    UINT32(bxzg.INT, 0),
    ENUM(bxzg.ENUM, 0),
    SFIXED32(bxzg.INT, 5),
    SFIXED64(bxzg.LONG, 1),
    SINT32(bxzg.INT, 0),
    SINT64(bxzg.LONG, 0);
    

    /* renamed from: s */
    public final bxzg f165148s;

    /* renamed from: t */
    public final int f165149t;

    private bxzf(bxzg bxzg, int i) {
        this.f165148s = bxzg;
        this.f165149t = i;
    }
}
