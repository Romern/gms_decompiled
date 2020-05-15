package p000;

import com.google.android.gms.clearcut.internal.PlayLoggerContext;

/* renamed from: rer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rer {
    /* renamed from: a */
    public static String m33480a(caik caik) {
        if (caik.f174721i.isEmpty()) {
            return (caik.f174713a & 8) != 0 ? Integer.toString(caik.f174716d) : "";
        }
        return caik.f174721i;
    }

    /* renamed from: a */
    public static String m33481a(PlayLoggerContext playLoggerContext) {
        if (!bmxx.m108577a(playLoggerContext.f30048g)) {
            return playLoggerContext.f30048g;
        }
        int i = playLoggerContext.f30044c;
        return i > 0 ? String.valueOf(i) : "";
    }
}
