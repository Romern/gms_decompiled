package p000;

/* renamed from: bmap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmap implements bxvp {
    UNKNOWN(0),
    DISABLE_ANIMATIONS(1),
    ENABLE_SCROLL_TO_TOP(2),
    ENABLE_SMOOTH_SCROLLING(3),
    DISABLE_BOTTOM_SHEET_SCROLL_DISMISS(4),
    ENABLE_SCROLL_TO_TOP_PADDING_INJECTION_FOR_ADJUST_PAN(5),
    ENABLE_CANCEL_CONFIRMATION_DIALOG(6);
    

    /* renamed from: h */
    public final int f128476h;

    private bmap(int i) {
        this.f128476h = i;
    }

    /* renamed from: a */
    public static bmap m107840a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return DISABLE_ANIMATIONS;
            case 2:
                return ENABLE_SCROLL_TO_TOP;
            case 3:
                return ENABLE_SMOOTH_SCROLLING;
            case 4:
                return DISABLE_BOTTOM_SHEET_SCROLL_DISMISS;
            case 5:
                return ENABLE_SCROLL_TO_TOP_PADDING_INJECTION_FOR_ADJUST_PAN;
            case 6:
                return ENABLE_CANCEL_CONFIRMATION_DIALOG;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m107841b() {
        return bmao.f128467a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f128476h;
    }

    public final String toString() {
        return Integer.toString(this.f128476h);
    }
}
