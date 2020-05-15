package p000;

/* renamed from: bmbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmbm implements bxvp {
    UNKNOWN_RELATIVE_REFERENCE(0),
    COUNTRY(1),
    RECIPIENT(2),
    ADDRESS_LINE_1(3),
    ADDRESS_LINE_2(4),
    LOCALITY(5),
    ADMIN_AREA(6),
    POSTAL_CODE(7),
    PHONE_NUMBER(8),
    SORTING_CODE(9),
    DEPENDENT_LOCALITY(10),
    ORGANIZATION(11),
    AVAILABLE_OPTION(12),
    UNSELECTED(13),
    NEW_ADDRESS_SELECTED(14),
    ADDITIONAL_FIELDS(16);
    

    /* renamed from: q */
    public final int f128563q;

    private bmbm(int i) {
        this.f128563q = i;
    }

    /* renamed from: a */
    public static bmbm m107869a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_RELATIVE_REFERENCE;
            case 1:
                return COUNTRY;
            case 2:
                return RECIPIENT;
            case 3:
                return ADDRESS_LINE_1;
            case 4:
                return ADDRESS_LINE_2;
            case 5:
                return LOCALITY;
            case 6:
                return ADMIN_AREA;
            case 7:
                return POSTAL_CODE;
            case 8:
                return PHONE_NUMBER;
            case 9:
                return SORTING_CODE;
            case 10:
                return DEPENDENT_LOCALITY;
            case 11:
                return ORGANIZATION;
            case 12:
                return AVAILABLE_OPTION;
            case 13:
                return UNSELECTED;
            case 14:
                return NEW_ADDRESS_SELECTED;
            case 15:
            default:
                return null;
            case 16:
                return ADDITIONAL_FIELDS;
        }
    }

    /* renamed from: b */
    public static bxvr m107870b() {
        return bmbl.f128545a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f128563q;
    }

    public final String toString() {
        return Integer.toString(this.f128563q);
    }
}
