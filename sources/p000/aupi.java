package p000;

import android.app.KeyguardManager;
import android.os.Build;

/* renamed from: aupi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aupi {
    /* renamed from: a */
    public static boolean m77556a(KeyguardManager keyguardManager) {
        int i = Build.VERSION.SDK_INT;
        return keyguardManager.isDeviceSecure();
    }
}
