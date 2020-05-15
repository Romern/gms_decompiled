package p000;

import java.util.logging.Level;

/* renamed from: bntv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bntv {
    /* renamed from: a */
    public static int m110419a(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue < Level.INFO.intValue()) {
            return intValue < Level.CONFIG.intValue() ? 2 : 3;
        }
        return 4;
    }
}
