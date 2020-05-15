package p000;

/* renamed from: bowh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bowh implements bxvp {
    DEFAULT(0),
    COLOR_SHAPES(1),
    COLOR_SHAPES_AND_PIN(2),
    HEX_PIN(3),
    GOOGLE_HEX(4),
    OUT_OF_BAND(5);
    

    /* renamed from: g */
    public final int f135131g;

    private bowh(int i) {
        this.f135131g = i;
    }

    /* renamed from: a */
    public static bowh m111606a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return COLOR_SHAPES;
        }
        if (i == 2) {
            return COLOR_SHAPES_AND_PIN;
        }
        if (i == 3) {
            return HEX_PIN;
        }
        if (i == 4) {
            return GOOGLE_HEX;
        }
        if (i != 5) {
            return null;
        }
        return OUT_OF_BAND;
    }

    /* renamed from: b */
    public static bxvr m111607b() {
        return bowg.f135123a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f135131g;
    }

    public final String toString() {
        return Integer.toString(this.f135131g);
    }
}
