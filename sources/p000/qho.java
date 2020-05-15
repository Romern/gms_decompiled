package p000;

/* renamed from: qho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum qho implements bxvp {
    OTHER(1),
    PHONE(2),
    TABLET(3),
    TV(4),
    GLASS(5),
    CAR(6),
    WEARABLE(7),
    THINGS(8);
    

    /* renamed from: i */
    public final int f41394i;

    private qho(int i) {
        this.f41394i = i;
    }

    /* renamed from: a */
    public static qho m32178a(int i) {
        switch (i) {
            case 1:
                return OTHER;
            case 2:
                return PHONE;
            case 3:
                return TABLET;
            case 4:
                return TV;
            case 5:
                return GLASS;
            case 6:
                return CAR;
            case 7:
                return WEARABLE;
            case 8:
                return THINGS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m32179b() {
        return qhn.f41384a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f41394i;
    }

    public final String toString() {
        return Integer.toString(this.f41394i);
    }
}
