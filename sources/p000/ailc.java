package p000;

import java.util.Locale;

/* renamed from: ailc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ailc {
    /* renamed from: a */
    static String m57409a(int i) {
        return String.format(Locale.ENGLISH, "[%d]%s", Integer.valueOf(i), i != 0 ? i != 3 ? i != 4 ? "UNKNOWN" : "FAILURE_MAX_LIMIT" : "FAILURE_ALREADY_ACTIVE" : "FAILURE_INTERNAL_ERROR");
    }
}
