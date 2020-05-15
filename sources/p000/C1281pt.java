package p000;

import android.os.Build;
import android.view.ViewConfiguration;

/* renamed from: pt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1281pt {
    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static float m19945a(ViewConfiguration viewConfiguration) {
        int i = Build.VERSION.SDK_INT;
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    /* renamed from: b */
    public static float m19946b(ViewConfiguration viewConfiguration) {
        int i = Build.VERSION.SDK_INT;
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    /* renamed from: c */
    public static boolean m19947c(ViewConfiguration viewConfiguration) {
        int i = Build.VERSION.SDK_INT;
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
