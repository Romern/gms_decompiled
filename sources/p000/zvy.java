package p000;

import android.util.Log;
import java.util.logging.Level;

/* renamed from: zvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zvy implements zvu {

    /* renamed from: a */
    public static final ThreadLocal f56038a = new zvx();

    /* renamed from: a */
    public static void m46586a(int i, String str, Object[] objArr) {
        Log.println(i, "Fitness", zvw.m46585a(str, objArr));
    }

    /* renamed from: b */
    public static int m46588b(Level level) {
        int intValue = level.intValue();
        if (intValue == Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue == Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue == Level.INFO.intValue()) {
            return 4;
        }
        if (intValue == Level.CONFIG.intValue()) {
            return 3;
        }
        if (intValue == Level.FINE.intValue() || intValue == Level.FINER.intValue() || intValue == Level.FINEST.intValue()) {
            return 2;
        }
        String valueOf = String.valueOf(level);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Unrecognized level: ");
        sb.append(valueOf);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public static boolean m46587a(int i) {
        return Log.isLoggable("Fitness", i);
    }

    /* renamed from: a */
    public final boolean mo31540a(Level level) {
        return m46587a(m46588b(level));
    }
}
