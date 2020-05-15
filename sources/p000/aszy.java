package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: aszy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aszy {

    /* renamed from: a */
    private static final srn f89935a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private static boolean f89936b = false;

    /* renamed from: a */
    public static void m75267a() {
        int i = Build.VERSION.SDK_INT;
        atak.m75286a("google_pay_keyguard_fuse_key", 315360000, false);
    }

    /* renamed from: b */
    public static void m75269b() {
        int i = Build.VERSION.SDK_INT;
        atak.m75287a("google_pay_keyguard_fuse_key");
    }

    /* renamed from: c */
    public static void m75271c() {
        int i = Build.VERSION.SDK_INT;
        atak.m75287a("android_pay_recent_unlock_key_2");
        atak.m75287a("android_pay_cdcvm_key");
    }

    /* renamed from: d */
    public static void m75273d(Context context) {
        int i = Build.VERSION.SDK_INT;
        sre.m36089i(context);
        try {
            if (atak.m75288a(atak.m75286a("android_pay_recent_unlock_key_2", 30, false))) {
                return;
            }
        } catch (ataf | atag e) {
        }
        bnsl bnsl = (bnsl) f89935a.mo68388c();
        bnsl.mo68432a("aszy", "d", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Keyguard key not reachable. Recreating.");
        m75272c(context);
    }

    /* renamed from: a */
    public static synchronized void m75268a(Context context) {
        synchronized (aszy.class) {
            if (!f89936b) {
                f89936b = true;
                m75270b(context);
            }
        }
    }

    /* renamed from: c */
    public static void m75272c(Context context) {
        m75271c();
        m75270b(context);
    }

    /* renamed from: b */
    public static void m75270b(Context context) {
        int i = Build.VERSION.SDK_INT;
        sre.m36089i(context);
        atak.m75286a("android_pay_recent_unlock_key_2", 30, false);
    }
}
