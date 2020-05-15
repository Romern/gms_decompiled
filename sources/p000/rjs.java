package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: rjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rjs {
    /* renamed from: a */
    public static Status m33676a(int i, String str) {
        sdo.m34959a((Object) str);
        return new Status(i, str);
    }

    /* renamed from: c */
    public static String m33677c(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(i);
                return sb.toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
        }
    }

    /* renamed from: d */
    public static boolean m33678d(int i) {
        return i >= 17600;
    }

    /* renamed from: e */
    public static boolean m33679e(int i) {
        return i <= 0;
    }

    /* renamed from: f */
    public static boolean m33680f(int i) {
        return i <= 0 || (i >= 21020 && i < 21039);
    }

    /* renamed from: g */
    public static boolean m33681g(int i) {
        return i > 0 && i <= 21019;
    }

    /* renamed from: h */
    public static Status m33682h(int i) {
        String str;
        switch (i) {
            case 26000:
                str = "USER_LOCATION_API_INVALID_ARGUMENT";
                break;
            case 26001:
                str = "USER_LOCATION_API_PERSONALIZATION_NOT_ALLOWED";
                break;
            case 26002:
                str = "USER_LOCATION_API_TOO_MANY_REQUESTS";
                break;
            default:
                str = m33677c(i);
                break;
        }
        return new Status(i, str);
    }
}
