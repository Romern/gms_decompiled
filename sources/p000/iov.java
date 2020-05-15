package p000;

/* renamed from: iov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iov extends rjs {
    /* renamed from: a */
    public static boolean m15808a(int i) {
        return i == -25503 || i == -25504;
    }

    /* renamed from: b */
    public static String m15809b(int i) {
        switch (i) {
            case -25505:
                return "NO_SYNC_REQUIRED";
            case -25504:
                return "TEMPORARY_ERROR_RETRY_SCHEDULED";
            case -25503:
                return "ENROLLMENT_RUN_SCHEDULED";
            case -25502:
                return "NO_NEW_KEY_NEEDED";
            case -25501:
                return "NEW_ACTIVE_KEY_ENROLLED";
            default:
                switch (i) {
                    case 25501:
                        return "INVALID_REQUEST_ERROR";
                    case 25502:
                        return "MISSING_CUSTOM_DATA";
                    case 25503:
                        return "KEY_INSERTION_FAILED";
                    case 25504:
                        return "BAD_CLIENT_STATE";
                    case 25505:
                        return "PUBLIC_KEY_NOT_FOUND";
                    case 25506:
                        return "EXPORTABLE_SYMMETRIC_KEY_NOT_FOUND";
                    case 25507:
                        return "FAILED_CRYPTOGRAPHIC_OPERATION";
                    case 25508:
                        return "NO_VALID_KEY_FOR_CRYPTOGRAPHIC_OPERATION";
                    default:
                        return rjs.m33677c(i);
                }
        }
    }
}
