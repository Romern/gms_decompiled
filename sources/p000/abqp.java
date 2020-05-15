package p000;

/* renamed from: abqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum abqp {
    UPDATE,
    f57994b,
    REMOVE,
    REMOVE_ALL,
    REMOVE_TYPE,
    USER_ACTION,
    REQUEST_NOT_SET;

    /* renamed from: a */
    public static abqp m48084a(int i) {
        switch (i) {
            case 0:
                return REQUEST_NOT_SET;
            case 1:
                return UPDATE;
            case 2:
                return f57994b;
            case 3:
                return REMOVE;
            case 4:
                return REMOVE_ALL;
            case 5:
                return REMOVE_TYPE;
            case 6:
                return USER_ACTION;
            default:
                return null;
        }
    }
}
