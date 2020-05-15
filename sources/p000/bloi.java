package p000;

/* renamed from: bloi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bloi implements bxvp {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);
    

    /* renamed from: m */
    public static final bxvq f127090m = new blog();

    /* renamed from: n */
    public final int f127092n;

    private bloi(int i) {
        this.f127092n = i;
    }

    /* renamed from: a */
    public static bloi m107413a(int i) {
        switch (i) {
            case 1:
                return JANUARY;
            case 2:
                return FEBRUARY;
            case 3:
                return MARCH;
            case 4:
                return APRIL;
            case 5:
                return MAY;
            case 6:
                return JUNE;
            case 7:
                return JULY;
            case 8:
                return AUGUST;
            case 9:
                return SEPTEMBER;
            case 10:
                return OCTOBER;
            case 11:
                return NOVEMBER;
            case 12:
                return DECEMBER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m107414b() {
        return bloh.f127077a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f127092n;
    }

    public final String toString() {
        return Integer.toString(this.f127092n);
    }
}
