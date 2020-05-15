package p000;

/* renamed from: btba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btba implements bxvp {
    PMTC_UNSPECIFIED(0),
    GENERIC(1),
    VIDEO(2),
    VIDEO_BROWSING(3),
    MUSIC(4),
    GAMING(5),
    SOCIAL(6),
    MESSAGING(7),
    VIDEO_OFFLINE(8),
    APP_STORE(9),
    UNRECOGNIZED(-1);
    

    /* renamed from: l */
    private final int f148092l;

    private btba(int i) {
        this.f148092l = i;
    }

    /* renamed from: a */
    public static btba m116385a(int i) {
        switch (i) {
            case 0:
                return PMTC_UNSPECIFIED;
            case 1:
                return GENERIC;
            case 2:
                return VIDEO;
            case 3:
                return VIDEO_BROWSING;
            case 4:
                return MUSIC;
            case 5:
                return GAMING;
            case 6:
                return SOCIAL;
            case 7:
                return MESSAGING;
            case 8:
                return VIDEO_OFFLINE;
            case 9:
                return APP_STORE;
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
            return this.f148092l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
