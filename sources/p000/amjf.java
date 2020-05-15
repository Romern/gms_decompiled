package p000;

/* renamed from: amjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum amjf implements bxvp {
    UNSPECIFIED(0),
    CONTACT(1),
    GROUP(2),
    PHOTO(3),
    CONTACT_FIELD(4),
    PHOTO_HIGH_RES(5),
    PHOTO_LOW_RES(6);
    

    /* renamed from: h */
    public final int f74994h;

    private amjf(int i) {
        this.f74994h = i;
    }

    /* renamed from: a */
    public static amjf m62965a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return CONTACT;
            case 2:
                return GROUP;
            case 3:
                return PHOTO;
            case 4:
                return CONTACT_FIELD;
            case 5:
                return PHOTO_HIGH_RES;
            case 6:
                return PHOTO_LOW_RES;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m62966b() {
        return amje.f74985a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f74994h;
    }

    public final String toString() {
        return Integer.toString(this.f74994h);
    }
}
