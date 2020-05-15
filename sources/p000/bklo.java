package p000;

/* renamed from: bklo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bklo implements bxvp {
    USER_ATTRIBUTE_NAME_UNSPECIFIED(0),
    EMAIL(1),
    DISPLAY_NAME(2),
    PROVIDER(3),
    PHOTO_URL(4),
    PASSWORD(5),
    RAW_USER_INFO(6);
    

    /* renamed from: h */
    public final int f124818h;

    private bklo(int i) {
        this.f124818h = i;
    }

    /* renamed from: a */
    public static bklo m106108a(int i) {
        switch (i) {
            case 0:
                return USER_ATTRIBUTE_NAME_UNSPECIFIED;
            case 1:
                return EMAIL;
            case 2:
                return DISPLAY_NAME;
            case 3:
                return PROVIDER;
            case 4:
                return PHOTO_URL;
            case 5:
                return PASSWORD;
            case 6:
                return RAW_USER_INFO;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m106109b() {
        return bkln.f124809a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f124818h;
    }

    public final String toString() {
        return Integer.toString(this.f124818h);
    }
}
