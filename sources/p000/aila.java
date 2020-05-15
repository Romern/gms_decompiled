package p000;

import java.util.Locale;

/* renamed from: aila */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aila {
    /* renamed from: a */
    public static String m57407a(int i) {
        return String.format(Locale.ENGLISH, "[%d]%s", Integer.valueOf(i), i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "ADVERTISE_FAILED_FEATURE_UNSUPPORTED" : "ADVERTISE_FAILED_INTERNAL_ERROR" : "ADVERTISE_FAILED_ALREADY_STARTED" : "ADVERTISE_FAILED_TOO_MANY_ADVERTISERS" : "ADVERTISE_FAILED_DATA_TOO_LARGE");
    }
}
