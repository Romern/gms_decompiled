package p000;

/* renamed from: blyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum blyl implements bxvp {
    UNKNOWN(0),
    ENABLE_SIDE_STICKY_HEADER_IN_LANDSCAPE(1),
    ENABLE_FORCE_SUBMIT_BUTTON_ABOVE_FOLD(2),
    ENABLE_FORCE_CONTENT_ABOVE_FOLD(3);
    

    /* renamed from: e */
    public final int f128213e;

    private blyl(int i) {
        this.f128213e = i;
    }

    /* renamed from: a */
    public static blyl m107777a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ENABLE_SIDE_STICKY_HEADER_IN_LANDSCAPE;
        }
        if (i == 2) {
            return ENABLE_FORCE_SUBMIT_BUTTON_ABOVE_FOLD;
        }
        if (i != 3) {
            return null;
        }
        return ENABLE_FORCE_CONTENT_ABOVE_FOLD;
    }

    /* renamed from: b */
    public static bxvr m107778b() {
        return blyk.f128207a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f128213e;
    }

    public final String toString() {
        return Integer.toString(this.f128213e);
    }
}
