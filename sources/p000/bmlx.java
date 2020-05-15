package p000;

/* renamed from: bmlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmlx implements bxvp {
    UNKNOWN_CREDIT_CARD_OCR_OPTION(0),
    PREVIEW_EXP_DATE(2),
    PREVIEW_CARDHOLDER_NAME(3),
    DISPLAY_EXP_DATE_SUGGESTIONS(5),
    DISPLAY_NAME_SUGGESTIONS(6),
    DISPLAY_PAN_SUGGESTIONS(7);
    

    /* renamed from: g */
    private final int f129988g;

    private bmlx(int i) {
        this.f129988g = i;
    }

    /* renamed from: a */
    public static bmlx m108160a(int i) {
        if (i == 0) {
            return UNKNOWN_CREDIT_CARD_OCR_OPTION;
        }
        if (i == 2) {
            return PREVIEW_EXP_DATE;
        }
        if (i == 3) {
            return PREVIEW_CARDHOLDER_NAME;
        }
        if (i == 5) {
            return DISPLAY_EXP_DATE_SUGGESTIONS;
        }
        if (i == 6) {
            return DISPLAY_NAME_SUGGESTIONS;
        }
        if (i != 7) {
            return null;
        }
        return DISPLAY_PAN_SUGGESTIONS;
    }

    /* renamed from: b */
    public static bxvr m108161b() {
        return bmlw.f129980a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f129988g;
    }

    public final String toString() {
        return Integer.toString(this.f129988g);
    }
}
