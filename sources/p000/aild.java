package p000;

import java.util.Locale;

/* renamed from: aild */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aild {
    /* renamed from: a */
    static String m57410a(int i) {
        return String.format(Locale.ENGLISH, "[%d]%s", Integer.valueOf(i), i != 0 ? i != 1 ? i != 2 ? i != 3 ? "WIFI_STATE_UNKNOWN" : "WIFI_STATE_ENABLED" : "WIFI_STATE_ENABLING" : "WIFI_STATE_DISABLED" : "WIFI_STATE_DISABLING");
    }
}
