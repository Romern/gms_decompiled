package p000;

/* renamed from: bzpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzpz implements bxvp {
    UNKNOWN_PROMOTION_PLACEMENT(0),
    PROMOTION_PLACEMENT_TOP(1),
    PROMOTION_PLACEMENT_BOTTOM(2);
    

    /* renamed from: d */
    public final int f170973d;

    private bzpz(int i) {
        this.f170973d = i;
    }

    /* renamed from: a */
    public static bzpz m126030a(int i) {
        if (i == 0) {
            return UNKNOWN_PROMOTION_PLACEMENT;
        }
        if (i == 1) {
            return PROMOTION_PLACEMENT_TOP;
        }
        if (i != 2) {
            return null;
        }
        return PROMOTION_PLACEMENT_BOTTOM;
    }

    /* renamed from: b */
    public static bxvr m126031b() {
        return bzpy.f170968a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f170973d;
    }

    public final String toString() {
        return Integer.toString(this.f170973d);
    }
}
