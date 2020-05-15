package p000;

/* renamed from: bwxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwxb implements bxvp {
    DIRECTION_UNKNOWN(0),
    DIRECTION_ROW(1),
    DIRECTION_ROW_REVERSE(2),
    DIRECTION_COLUMN(3),
    DIRECTION_COLUMN_REVERSE(4);
    

    /* renamed from: f */
    private final int f161320f;

    private bwxb(int i) {
        this.f161320f = i;
    }

    /* renamed from: a */
    public static bwxb m122390a(int i) {
        if (i == 0) {
            return DIRECTION_UNKNOWN;
        }
        if (i == 1) {
            return DIRECTION_ROW;
        }
        if (i == 2) {
            return DIRECTION_ROW_REVERSE;
        }
        if (i == 3) {
            return DIRECTION_COLUMN;
        }
        if (i != 4) {
            return null;
        }
        return DIRECTION_COLUMN_REVERSE;
    }

    /* renamed from: b */
    public static bxvr m122391b() {
        return bwxa.f161313a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f161320f;
    }

    public final String toString() {
        return Integer.toString(this.f161320f);
    }
}
