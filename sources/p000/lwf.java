package p000;

/* renamed from: lwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lwf {

    /* renamed from: a */
    private static final lvn f33108a = new lvn("FrameworkCryptoCapabilityCheck");

    /* renamed from: a */
    public static boolean m24546a() {
        try {
            Class.forName("android.security.keystore.recovery.RecoveryController");
            return true;
        } catch (ClassNotFoundException e) {
            try {
                Class.forName("android.security.keystore.RecoveryController");
                f33108a.mo25412b("Found legacy crypto api but not new api, build must be old. Disabling crypto.", new Object[0]);
            } catch (ClassNotFoundException e2) {
            }
            return false;
        }
    }
}
