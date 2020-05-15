package p000;

/* renamed from: bwyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwyg implements bxvp {
    FONT_TRANSFORMATION_UNKNOWN(0),
    FONT_TRANSFORMATION_UPPERCASE(1);
    

    /* renamed from: c */
    private final int f161453c;

    private bwyg(int i) {
        this.f161453c = i;
    }

    /* renamed from: a */
    public static bwyg m122431a(int i) {
        if (i == 0) {
            return FONT_TRANSFORMATION_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return FONT_TRANSFORMATION_UPPERCASE;
    }

    /* renamed from: b */
    public static bxvr m122432b() {
        return bwyf.f161449a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f161453c;
    }

    public final String toString() {
        return Integer.toString(this.f161453c);
    }
}
