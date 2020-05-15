package p000;

/* renamed from: bmpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmpw implements bxvp {
    UNKNOWN_KEYBOARD_LAYOUT_VARIATION(0),
    VARIATION_NUMBER_DECIMAL(1),
    VARIATION_NUMBER_SIGNED(2),
    VARIATION_TEXT_CAP_CHARACTERS(3),
    VARIATION_TEXT_CAP_SENTENCES(4),
    VARIATION_TEXT_CAP_WORDS(5),
    VARIATION_TEXT_EMAIL_ADDRESS(6),
    VARIATION_TEXT_PERSON_NAME(7),
    VARIATION_TEXT_POSTAL_ADDRESS(8),
    VARIATION_TEXT_URI(9),
    VARIATION_TEXT_NO_SUGGESTIONS(10);
    

    /* renamed from: l */
    private final int f130339l;

    private bmpw(int i) {
        this.f130339l = i;
    }

    /* renamed from: a */
    public static bmpw m108268a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_KEYBOARD_LAYOUT_VARIATION;
            case 1:
                return VARIATION_NUMBER_DECIMAL;
            case 2:
                return VARIATION_NUMBER_SIGNED;
            case 3:
                return VARIATION_TEXT_CAP_CHARACTERS;
            case 4:
                return VARIATION_TEXT_CAP_SENTENCES;
            case 5:
                return VARIATION_TEXT_CAP_WORDS;
            case 6:
                return VARIATION_TEXT_EMAIL_ADDRESS;
            case 7:
                return VARIATION_TEXT_PERSON_NAME;
            case 8:
                return VARIATION_TEXT_POSTAL_ADDRESS;
            case 9:
                return VARIATION_TEXT_URI;
            case 10:
                return VARIATION_TEXT_NO_SUGGESTIONS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m108269b() {
        return bmpv.f130326a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f130339l;
    }

    public final String toString() {
        return Integer.toString(this.f130339l);
    }
}
