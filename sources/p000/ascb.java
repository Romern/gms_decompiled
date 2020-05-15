package p000;

import android.app.KeyguardManager;
import android.content.Context;

/* renamed from: ascb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ascb {
    /* renamed from: a */
    public static boolean m73766a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.isKeyguardSecure();
    }
}
