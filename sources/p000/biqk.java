package p000;

/* renamed from: biqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum biqk implements bxvp {
    FUEL_TYPE_UNKNOWN(0),
    FUEL_TYPE_UNLEADED(1),
    FUEL_TYPE_LEADED(2),
    FUEL_TYPE_DIESEL_1(3),
    FUEL_TYPE_DIESEL_2(4),
    FUEL_TYPE_BIODIESEL(5),
    FUEL_TYPE_E85(6),
    FUEL_TYPE_LPG(7),
    FUEL_TYPE_CNG(8),
    FUEL_TYPE_LNG(9),
    FUEL_TYPE_ELECTRIC(10),
    FUEL_TYPE_HYDROGEN(11),
    FUEL_TYPE_OTHER(12);
    

    /* renamed from: n */
    private final int f121303n;

    private biqk(int i) {
        this.f121303n = i;
    }

    /* renamed from: a */
    public static biqk m102729a(int i) {
        switch (i) {
            case 0:
                return FUEL_TYPE_UNKNOWN;
            case 1:
                return FUEL_TYPE_UNLEADED;
            case 2:
                return FUEL_TYPE_LEADED;
            case 3:
                return FUEL_TYPE_DIESEL_1;
            case 4:
                return FUEL_TYPE_DIESEL_2;
            case 5:
                return FUEL_TYPE_BIODIESEL;
            case 6:
                return FUEL_TYPE_E85;
            case 7:
                return FUEL_TYPE_LPG;
            case 8:
                return FUEL_TYPE_CNG;
            case 9:
                return FUEL_TYPE_LNG;
            case 10:
                return FUEL_TYPE_ELECTRIC;
            case 11:
                return FUEL_TYPE_HYDROGEN;
            case 12:
                return FUEL_TYPE_OTHER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m102730b() {
        return biqj.f121288a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f121303n;
    }

    public final String toString() {
        return Integer.toString(this.f121303n);
    }
}
