package p000;

/* renamed from: bxuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxuy {
    DOUBLE(0, 1, bxwg.DOUBLE),
    FLOAT(1, 1, bxwg.FLOAT),
    INT64(2, 1, bxwg.LONG),
    UINT64(3, 1, bxwg.LONG),
    INT32(4, 1, bxwg.INT),
    FIXED64(5, 1, bxwg.LONG),
    FIXED32(6, 1, bxwg.INT),
    BOOL(7, 1, bxwg.BOOLEAN),
    STRING(8, 1, bxwg.STRING),
    MESSAGE(9, 1, bxwg.MESSAGE),
    BYTES(10, 1, bxwg.BYTE_STRING),
    UINT32(11, 1, bxwg.INT),
    ENUM(12, 1, bxwg.ENUM),
    SFIXED32(13, 1, bxwg.INT),
    SFIXED64(14, 1, bxwg.LONG),
    SINT32(15, 1, bxwg.INT),
    SINT64(16, 1, bxwg.LONG),
    GROUP(17, 1, bxwg.MESSAGE),
    DOUBLE_LIST(18, 2, bxwg.DOUBLE),
    FLOAT_LIST(19, 2, bxwg.FLOAT),
    INT64_LIST(20, 2, bxwg.LONG),
    UINT64_LIST(21, 2, bxwg.LONG),
    INT32_LIST(22, 2, bxwg.INT),
    FIXED64_LIST(23, 2, bxwg.LONG),
    FIXED32_LIST(24, 2, bxwg.INT),
    BOOL_LIST(25, 2, bxwg.BOOLEAN),
    STRING_LIST(26, 2, bxwg.STRING),
    MESSAGE_LIST(27, 2, bxwg.MESSAGE),
    BYTES_LIST(28, 2, bxwg.BYTE_STRING),
    UINT32_LIST(29, 2, bxwg.INT),
    ENUM_LIST(30, 2, bxwg.ENUM),
    SFIXED32_LIST(31, 2, bxwg.INT),
    SFIXED64_LIST(32, 2, bxwg.LONG),
    SINT32_LIST(33, 2, bxwg.INT),
    SINT64_LIST(34, 2, bxwg.LONG),
    DOUBLE_LIST_PACKED(35, 3, bxwg.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, bxwg.FLOAT),
    INT64_LIST_PACKED(37, 3, bxwg.LONG),
    UINT64_LIST_PACKED(38, 3, bxwg.LONG),
    INT32_LIST_PACKED(39, 3, bxwg.INT),
    FIXED64_LIST_PACKED(40, 3, bxwg.LONG),
    FIXED32_LIST_PACKED(41, 3, bxwg.INT),
    BOOL_LIST_PACKED(42, 3, bxwg.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, bxwg.INT),
    ENUM_LIST_PACKED(44, 3, bxwg.ENUM),
    SFIXED32_LIST_PACKED(45, 3, bxwg.INT),
    SFIXED64_LIST_PACKED(46, 3, bxwg.LONG),
    SINT32_LIST_PACKED(47, 3, bxwg.INT),
    SINT64_LIST_PACKED(48, 3, bxwg.LONG),
    GROUP_LIST(49, 2, bxwg.MESSAGE),
    MAP(50, 4, bxwg.VOID);
    

    /* renamed from: aa */
    private static final bxuy[] f164911aa;

    /* renamed from: Z */
    public final int f164938Z;

    static {
        bxuy[] values = values();
        int length = values.length;
        f164911aa = new bxuy[length];
        for (bxuy bxuy : values) {
            f164911aa[bxuy.f164938Z] = bxuy;
        }
    }

    private bxuy(int i, int i2, bxwg bxwg) {
        this.f164938Z = i;
        bxwg bxwg2 = bxwg.VOID;
        if (i2 == 1) {
            bxwg.ordinal();
        }
    }
}
