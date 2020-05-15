package p000;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.security.keystore.recovery.RecoveryController;

/* renamed from: lwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lwb {

    /* renamed from: a */
    private static final lvn f33095a = new lvn("CryptoEnableCheck");

    /* renamed from: b */
    private final Context f33096b;

    /* renamed from: c */
    private final KeyguardManager f33097c;

    private lwb(Context context, KeyguardManager keyguardManager) {
        this.f33096b = context;
        this.f33097c = keyguardManager;
    }

    /* renamed from: a */
    public static lwb m24518a(Context context) {
        return new lwb(context, (KeyguardManager) context.getSystemService("keyguard"));
    }

    /* renamed from: c */
    public static boolean m24519c() {
        if (!ccno.f179554a.mo6606a().mo76470b()) {
            return lwf.m24546a();
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: d */
    private final boolean m24520d() {
        return !cclp.f179364a.mo6606a().mo76309l() || lvr.f33060a.mo19662g(this.f33096b);
    }

    /* renamed from: e */
    private final void m24521e() {
        sre.m36089i(this.f33096b);
    }

    /* renamed from: b */
    public final boolean mo19690b() {
        if (!cclp.f179364a.mo6606a().mo76316s()) {
            try {
                return ((Boolean) Class.forName("android.security.keystore.recovery.RecoveryController").getMethod("isRecoverableKeyStoreSupported", new Class[0]).invoke(null, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e) {
                lvn lvn = f33095a;
                String valueOf = String.valueOf(e.getMessage());
                lvn.mo25414c(valueOf.length() == 0 ? new String("Reflection error calling isRecoverableKeyStoreSupported: ") : "Reflection error calling isRecoverableKeyStoreSupported: ".concat(valueOf), new Object[0]);
                return this.f33097c.isDeviceSecure();
            }
        } else if (!m24519c() || !RecoveryController.isRecoverableKeyStoreEnabled(this.f33096b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo19689a() {
        boolean z;
        if (!cclp.f179364a.mo6606a().mo76315r()) {
            boolean c = m24519c();
            boolean b = mo19690b();
            m24521e();
            boolean d = m24520d();
            if (!c) {
                z = false;
            } else {
                z = b && d;
            }
            f33095a.logVerbose("encryptBackups:%s = enableCrypto:%s && hasLockScreen:%s && supportedDevice:%s && userOptedIn:%s", Boolean.valueOf(z), Boolean.valueOf(c), Boolean.valueOf(b), true, Boolean.valueOf(d));
            return z;
        } else if (!m24519c()) {
            f33095a.mo25414c("Should not encrypt backups: unsupported by SDK.", new Object[0]);
            return false;
        } else if (!mo19690b()) {
            f33095a.mo25414c("Should not encrypt backups: device has no lock screen.", new Object[0]);
            return false;
        } else {
            m24521e();
            if (!m24520d()) {
                f33095a.mo25414c("Should not encrypt backups: user not opted in.", new Object[0]);
                return false;
            }
            f33095a.logVerbose("Should encrypt backups.", new Object[0]);
            return true;
        }
    }
}
