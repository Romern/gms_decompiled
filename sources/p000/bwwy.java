package p000;

/* renamed from: bwwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwwy implements bxvp {
    ALIGNMENT_UNKNOWN(0),
    ALIGNMENT_AUTO(1),
    ALIGNMENT_START(2),
    ALIGNMENT_END(3),
    ALIGNMENT_CENTER(4),
    ALIGNMENT_BASELINE_FIRST(5),
    ALIGNMENT_BASELINE_LAST(6),
    ALIGNMENT_STRETCH(7);
    

    /* renamed from: i */
    public final int f161307i;

    private bwwy(int i) {
        this.f161307i = i;
    }

    /* renamed from: a */
    public static bwwy m122385a(int i) {
        switch (i) {
            case 0:
                return ALIGNMENT_UNKNOWN;
            case 1:
                return ALIGNMENT_AUTO;
            case 2:
                return ALIGNMENT_START;
            case 3:
                return ALIGNMENT_END;
            case 4:
                return ALIGNMENT_CENTER;
            case 5:
                return ALIGNMENT_BASELINE_FIRST;
            case 6:
                return ALIGNMENT_BASELINE_LAST;
            case 7:
                return ALIGNMENT_STRETCH;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m122386b() {
        return bwwx.f161297a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f161307i;
    }

    public final String toString() {
        return Integer.toString(this.f161307i);
    }
}
