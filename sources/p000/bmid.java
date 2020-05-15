package p000;

/* renamed from: bmid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmid implements bxvp {
    UNKNOWN_RELATIVE_REFERENCE(0),
    CVC(1),
    EXPIRATION_MONTH(2),
    EXPIRATION_YEAR(3),
    EXPIRATION_DATE(5),
    CARDHOLDER_NAME(4);
    

    /* renamed from: g */
    public final int f129544g;

    private bmid(int i) {
        this.f129544g = i;
    }

    /* renamed from: a */
    public static bmid m108054a(int i) {
        if (i == 0) {
            return UNKNOWN_RELATIVE_REFERENCE;
        }
        if (i == 1) {
            return CVC;
        }
        if (i == 2) {
            return EXPIRATION_MONTH;
        }
        if (i == 3) {
            return EXPIRATION_YEAR;
        }
        if (i == 4) {
            return CARDHOLDER_NAME;
        }
        if (i != 5) {
            return null;
        }
        return EXPIRATION_DATE;
    }

    /* renamed from: b */
    public static bxvr m108055b() {
        return bmic.f129536a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f129544g;
    }

    public final String toString() {
        return Integer.toString(this.f129544g);
    }
}
