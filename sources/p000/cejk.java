package p000;

/* renamed from: cejk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cejk {
    STRING_VALUE,
    BYTES_VALUE,
    INT_VALUE,
    LONG_VALUE,
    BOOLEAN_VALUE,
    DOUBLE_VALUE,
    VALUE_NOT_SET;

    /* renamed from: a */
    public static cejk m136983a(int i) {
        if (i == 0) {
            return VALUE_NOT_SET;
        }
        switch (i) {
            case 2:
                return STRING_VALUE;
            case 3:
                return BYTES_VALUE;
            case 4:
                return INT_VALUE;
            case 5:
                return LONG_VALUE;
            case 6:
                return BOOLEAN_VALUE;
            case 7:
                return DOUBLE_VALUE;
            default:
                return null;
        }
    }
}
