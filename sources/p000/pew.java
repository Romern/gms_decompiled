package p000;

import java.util.Locale;

/* renamed from: pew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pew extends rjs {
    /* renamed from: a */
    public static String m30274a(int i) {
        if (i >= 2200) {
            if (i < 2300) {
                return String.format(Locale.ROOT, "Cast remote display status code %d", Integer.valueOf(i));
            } else if (i < 2400) {
                return String.format(Locale.ROOT, "Cast service status code %d", Integer.valueOf(i));
            } else if (i < 2500) {
                return String.format(Locale.ROOT, "Relay casting status code %d", Integer.valueOf(i));
            } else if (i < 2600) {
                return String.format(Locale.ROOT, "Nearby casting status code %d", Integer.valueOf(i));
            } else if (i < 2700) {
                return String.format(Locale.ROOT, "Cast multizone device status code %d", Integer.valueOf(i));
            } else if (i < 2800) {
                return String.format(Locale.ROOT, "Cast socket status code %d", Integer.valueOf(i));
            } else if (i < 2900) {
                return String.format(Locale.ROOT, "Cast application status code %d", Integer.valueOf(i));
            } else if (i < 3000) {
                return String.format(Locale.ROOT, "Cast endpoint switch status code %d", Integer.valueOf(i));
            } else if (i < 3100) {
                return String.format(Locale.ROOT, "Cast media loading status code %d", Integer.valueOf(i));
            } else if (i >= 3200) {
                return String.format(Locale.ROOT, "Unknown status code %d", Integer.valueOf(i));
            } else {
                return String.format(Locale.ROOT, "Cast session status code %d", Integer.valueOf(i));
            }
        } else if (i == 0) {
            return "SUCCESS";
        } else {
            if (i == 2015) {
                return "TCP_PROBER_FAIL_TO_VERIFY_DEVICE";
            }
            if (i == 7) {
                return "NETWORK_ERROR";
            }
            if (i == 8) {
                return "INTERNAL_ERROR";
            }
            switch (i) {
                case 13:
                    return "UNKNOWN_ERROR";
                case 14:
                    return "INTERRUPTED";
                case 15:
                    return "TIMEOUT";
                default:
                    switch (i) {
                        case 2000:
                            return "AUTHENTICATION_FAILED";
                        case 2001:
                            return "INVALID_REQUEST";
                        case 2002:
                            return "CANCELED";
                        case 2003:
                            return "NOT_ALLOWED";
                        case 2004:
                            return "APPLICATION_NOT_FOUND";
                        case 2005:
                            return "APPLICATION_NOT_RUNNING";
                        case 2006:
                            return "MESSAGE_TOO_LARGE";
                        case 2007:
                            return "MESSAGE_SEND_BUFFER_TOO_FULL";
                        default:
                            switch (i) {
                                case 2100:
                                    return "FAILED";
                                case 2101:
                                    return "STATUS_CANCELLED";
                                case 2102:
                                    return "STATUS_TIMED_OUT";
                                case 2103:
                                    return "REPLACED";
                                case 2104:
                                    return "MEDIA_ERROR";
                                default:
                                    return rjs.m33677c(i);
                            }
                    }
            }
        }
    }
}
