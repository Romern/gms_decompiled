package p000;

/* renamed from: blsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum blsw implements bxvp {
    CASTV2_1_0(0),
    CASTV2_1_1(1),
    CASTV2_1_2(2),
    CASTV2_1_3(3),
    NOT_SUPPORTED_PROTOCOL_VERSION_FOR_TEST(999);
    

    /* renamed from: f */
    public final int f127636f;

    private blsw(int i) {
        this.f127636f = i;
    }

    /* renamed from: a */
    public static blsw m107539a(int i) {
        if (i == 0) {
            return CASTV2_1_0;
        }
        if (i == 1) {
            return CASTV2_1_1;
        }
        if (i == 2) {
            return CASTV2_1_2;
        }
        if (i == 3) {
            return CASTV2_1_3;
        }
        if (i != 999) {
            return null;
        }
        return NOT_SUPPORTED_PROTOCOL_VERSION_FOR_TEST;
    }

    /* renamed from: b */
    public static bxvr m107540b() {
        return blsv.f127629a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f127636f;
    }

    public final String toString() {
        return Integer.toString(this.f127636f);
    }
}
