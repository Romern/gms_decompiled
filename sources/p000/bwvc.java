package p000;

/* renamed from: bwvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwvc implements bxvp {
    DATE_COMPONENT_UNKNOWN(0),
    DATE_COMPONENT_MONTH(1),
    DATE_COMPONENT_YEAR_TWO_DIGITS(2),
    DATE_COMPONENT_YEAR_FOUR_DIGITS(3),
    DATE_COMPONENT_DAY(4);
    

    /* renamed from: f */
    private final int f161100f;

    private bwvc(int i) {
        this.f161100f = i;
    }

    /* renamed from: a */
    public static bwvc m122335a(int i) {
        if (i == 0) {
            return DATE_COMPONENT_UNKNOWN;
        }
        if (i == 1) {
            return DATE_COMPONENT_MONTH;
        }
        if (i == 2) {
            return DATE_COMPONENT_YEAR_TWO_DIGITS;
        }
        if (i == 3) {
            return DATE_COMPONENT_YEAR_FOUR_DIGITS;
        }
        if (i != 4) {
            return null;
        }
        return DATE_COMPONENT_DAY;
    }

    /* renamed from: b */
    public static bxvr m122336b() {
        return bwvb.f161093a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f161100f;
    }

    public final String toString() {
        return Integer.toString(this.f161100f);
    }
}
