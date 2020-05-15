package p000;

/* renamed from: bvyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvyy implements bxvp {
    AC_UNKNOWN(0),
    AC_GET_REPORTING_STATE_SAFE(1),
    AC_TRY_OPT_IN(2),
    AC_TRY_OPT_IN_REQUEST(3),
    AC_REQUEST_UPLOAD(4),
    AC_CANCEL_UPLOAD(5),
    AC_REPORT_PLACE(6),
    AC_SEND_DATA(7),
    AC_INCOGNITO_MODE_TOGGLE_ON(8),
    AC_INCOGNITO_MODE_TOGGLE_OFF(9),
    AC_PRIVATE_MODE_TOGGLE_ON(10),
    AC_PRIVATE_MODE_TOGGLE_OFF(11);
    

    /* renamed from: m */
    public final int f158253m;

    private bvyy(int i) {
        this.f158253m = i;
    }

    /* renamed from: a */
    public static bvyy m121607a(int i) {
        switch (i) {
            case 0:
                return AC_UNKNOWN;
            case 1:
                return AC_GET_REPORTING_STATE_SAFE;
            case 2:
                return AC_TRY_OPT_IN;
            case 3:
                return AC_TRY_OPT_IN_REQUEST;
            case 4:
                return AC_REQUEST_UPLOAD;
            case 5:
                return AC_CANCEL_UPLOAD;
            case 6:
                return AC_REPORT_PLACE;
            case 7:
                return AC_SEND_DATA;
            case 8:
                return AC_INCOGNITO_MODE_TOGGLE_ON;
            case 9:
                return AC_INCOGNITO_MODE_TOGGLE_OFF;
            case 10:
                return AC_PRIVATE_MODE_TOGGLE_ON;
            case 11:
                return AC_PRIVATE_MODE_TOGGLE_OFF;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m121608b() {
        return bvyx.f158239a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f158253m;
    }

    public final String toString() {
        return Integer.toString(this.f158253m);
    }
}
