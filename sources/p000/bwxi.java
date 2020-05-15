package p000;

/* renamed from: bwxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwxi implements bxvp {
    JUSTIFICATION_UNKNOWN(0),
    JUSTIFICATION_START(1),
    JUSTIFICATION_END(2),
    JUSTIFICATION_CENTER(3),
    JUSTIFICATION_SPACE_AROUND(4),
    JUSTIFICATION_SPACE_BETWEEN(5);
    

    /* renamed from: g */
    private final int f161359g;

    private bwxi(int i) {
        this.f161359g = i;
    }

    /* renamed from: a */
    public static bwxi m122399a(int i) {
        if (i == 0) {
            return JUSTIFICATION_UNKNOWN;
        }
        if (i == 1) {
            return JUSTIFICATION_START;
        }
        if (i == 2) {
            return JUSTIFICATION_END;
        }
        if (i == 3) {
            return JUSTIFICATION_CENTER;
        }
        if (i == 4) {
            return JUSTIFICATION_SPACE_AROUND;
        }
        if (i != 5) {
            return null;
        }
        return JUSTIFICATION_SPACE_BETWEEN;
    }

    /* renamed from: b */
    public static bxvr m122400b() {
        return bwxh.f161351a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f161359g;
    }

    public final String toString() {
        return Integer.toString(this.f161359g);
    }
}
