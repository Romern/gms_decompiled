package p000;

/* renamed from: bmkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmkf implements bxvp {
    UNKNOWN(0),
    FULLSCREEN(2),
    CHROME_CUSTOM_TAB(3);
    

    /* renamed from: d */
    public final int f129800d;

    private bmkf(int i) {
        this.f129800d = i;
    }

    /* renamed from: a */
    public static bmkf m108112a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 2) {
            return FULLSCREEN;
        }
        if (i != 3) {
            return null;
        }
        return CHROME_CUSTOM_TAB;
    }

    /* renamed from: b */
    public static bxvr m108113b() {
        return bmke.f129795a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f129800d;
    }

    public final String toString() {
        return Integer.toString(this.f129800d);
    }
}
