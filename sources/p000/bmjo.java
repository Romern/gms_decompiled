package p000;

/* renamed from: bmjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmjo implements bxvp {
    UNKNOWN_ANIMATION_TYPE(0),
    SCROLL_IMAGE_INTO_ACTION_BAR(1);
    

    /* renamed from: c */
    private final int f129728c;

    private bmjo(int i) {
        this.f129728c = i;
    }

    /* renamed from: a */
    public static bmjo m108093a(int i) {
        if (i == 0) {
            return UNKNOWN_ANIMATION_TYPE;
        }
        if (i != 1) {
            return null;
        }
        return SCROLL_IMAGE_INTO_ACTION_BAR;
    }

    /* renamed from: b */
    public static bxvr m108094b() {
        return bmjn.f129724a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f129728c;
    }

    public final String toString() {
        return Integer.toString(this.f129728c);
    }
}
