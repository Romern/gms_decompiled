package p000;

import android.os.Build;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;

/* renamed from: jde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jde {

    /* renamed from: a */
    public static final boolean f22215a = m16538a();

    /* renamed from: b */
    public static final boolean f22216b;

    /* renamed from: c */
    private static final sek f22217c = jdh.m16547a("AndroidSdkChecker");

    static {
        boolean z = true;
        if (!m16538a() || (!spn.m35887f() && ccfy.f178890a.mo6606a().mo75893h())) {
            z = false;
        }
        f22216b = z;
    }

    /* renamed from: a */
    private static boolean m16538a() {
        int i = Build.VERSION.SDK_INT;
        try {
            RecoveryController.getInstance(rpr.m34216b().getApplicationContext()).getRecoverySecretTypes();
            return true;
        } catch (NullPointerException e) {
            f22217c.mo25417e("Error connecting to locksettings service", e, new Object[0]);
            return !ccfy.m129493e();
        } catch (InternalRecoveryServiceException e2) {
            f22217c.mo25417e("InternalRecoveryServiceException", e2, new Object[0]);
            return !ccfy.m129493e();
        } catch (SecurityException e3) {
            f22217c.mo25417e("Missing RecoverKeyStore permission", e3, new Object[0]);
            return false;
        }
    }
}
