package p000;

import java.util.Locale;

/* renamed from: ailb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ailb {
    /* renamed from: a */
    public static String m57408a(int i) {
        String str;
        switch (i) {
            case 1:
                str = "SCAN_FAILED_ALREADY_STARTED";
                break;
            case 2:
                str = "SCAN_FAILED_APPLICATION_REGISTRATION_FAILED";
                break;
            case 3:
                str = "SCAN_FAILED_INTERNAL_ERROR";
                break;
            case 4:
                str = "SCAN_FAILED_FEATURE_UNSUPPORTED";
                break;
            case 5:
                str = "SCAN_FAILED_BLUETOOTH_DISABLED";
                break;
            case 6:
                str = "SCAN_FILTERS_NOT_ALLOWED_FOR_LOCATION";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return String.format(Locale.ENGLISH, "[%d]%s", Integer.valueOf(i), str);
    }
}
