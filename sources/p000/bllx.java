package p000;

/* renamed from: bllx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bllx implements bxvp {
    UNKNOWN(0),
    BUNDLE_START(1),
    BUNDLE_END(2),
    RAW(3),
    INT32(4),
    INT64(5),
    STRING(6),
    BOOL(7),
    OBJECT(8),
    FLOAT(9),
    DOUBLE(10);
    

    /* renamed from: l */
    public final int f126819l;

    private bllx(int i) {
        this.f126819l = i;
    }

    /* renamed from: a */
    public static bllx m107351a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return BUNDLE_START;
            case 2:
                return BUNDLE_END;
            case 3:
                return RAW;
            case 4:
                return INT32;
            case 5:
                return INT64;
            case 6:
                return STRING;
            case 7:
                return BOOL;
            case 8:
                return OBJECT;
            case 9:
                return FLOAT;
            case 10:
                return DOUBLE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m107352b() {
        return bllw.f126806a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f126819l;
    }

    public final String toString() {
        return Integer.toString(this.f126819l);
    }
}
