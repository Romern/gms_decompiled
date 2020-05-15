package p000;

/* renamed from: bwyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwyi implements bxvp {
    FONT_WEIGHT_UNKNOWN(0),
    FONT_WEIGHT_LIGHT(1),
    FONT_WEIGHT_NORMAL(2),
    FONT_WEIGHT_LIGHT_BOLD(3),
    FONT_WEIGHT_BOLD(4),
    FONT_WEIGHT_DARK_BOLD(5),
    FONT_WEIGHT_DARKEST_BOLD(6);
    

    /* renamed from: h */
    private final int f161463h;

    private bwyi(int i) {
        this.f161463h = i;
    }

    /* renamed from: a */
    public static bwyi m122435a(int i) {
        switch (i) {
            case 0:
                return FONT_WEIGHT_UNKNOWN;
            case 1:
                return FONT_WEIGHT_LIGHT;
            case 2:
                return FONT_WEIGHT_NORMAL;
            case 3:
                return FONT_WEIGHT_LIGHT_BOLD;
            case 4:
                return FONT_WEIGHT_BOLD;
            case 5:
                return FONT_WEIGHT_DARK_BOLD;
            case 6:
                return FONT_WEIGHT_DARKEST_BOLD;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m122436b() {
        return bwyh.f161454a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f161463h;
    }

    public final String toString() {
        return Integer.toString(this.f161463h);
    }
}
