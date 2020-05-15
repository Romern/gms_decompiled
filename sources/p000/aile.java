package p000;

import java.util.Locale;

/* renamed from: aile */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aile {
    /* renamed from: a */
    static String m57411a(int i) {
        return String.format(Locale.ENGLISH, "[%d]%s", Integer.valueOf(i), i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "BUSY" : "P2P_UNSUPPORTED" : "ERROR");
    }
}
