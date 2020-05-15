package p000;

/* renamed from: cbei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cbei implements bxvp {
    UNKNOWN(0),
    CUSTOM_VALUE(1),
    TEXT(2),
    PHOTO(3),
    AUDIO(4),
    VIDEO(5),
    EVENT(6),
    RICH_TEXT(7),
    CHIPS_ONLY(8),
    RICH_CARD(9),
    UNRECOGNIZED(-1);
    

    /* renamed from: l */
    private final int f176856l;

    private cbei(int i) {
        this.f176856l = i;
    }

    /* renamed from: a */
    public static cbei m127772a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CUSTOM_VALUE;
            case 2:
                return TEXT;
            case 3:
                return PHOTO;
            case 4:
                return AUDIO;
            case 5:
                return VIDEO;
            case 6:
                return EVENT;
            case 7:
                return RICH_TEXT;
            case 8:
                return CHIPS_ONLY;
            case 9:
                return RICH_CARD;
            default:
                return null;
        }
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f176856l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
