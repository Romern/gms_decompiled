package p000;

/* renamed from: bwyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwyc implements bxvp {
    BORDER_STYLE_UNKNOWN(0),
    BORDER_STYLE_DASHED(1),
    BORDER_STYLE_SOLID(2);
    

    /* renamed from: d */
    private final int f161443d;

    private bwyc(int i) {
        this.f161443d = i;
    }

    /* renamed from: a */
    public static bwyc m122423a(int i) {
        if (i == 0) {
            return BORDER_STYLE_UNKNOWN;
        }
        if (i == 1) {
            return BORDER_STYLE_DASHED;
        }
        if (i != 2) {
            return null;
        }
        return BORDER_STYLE_SOLID;
    }

    /* renamed from: b */
    public static bxvr m122424b() {
        return bwyb.f161438a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f161443d;
    }

    public final String toString() {
        return Integer.toString(this.f161443d);
    }
}
