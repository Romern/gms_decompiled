package p000;

/* renamed from: bwye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwye implements bxvp {
    FONT_STYLE_UNKNOWN(0),
    FONT_STYLE_ITALIC(1);
    

    /* renamed from: c */
    private final int f161448c;

    private bwye(int i) {
        this.f161448c = i;
    }

    /* renamed from: a */
    public static bwye m122427a(int i) {
        if (i == 0) {
            return FONT_STYLE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return FONT_STYLE_ITALIC;
    }

    /* renamed from: b */
    public static bxvr m122428b() {
        return bwyd.f161444a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f161448c;
    }

    public final String toString() {
        return Integer.toString(this.f161448c);
    }
}
