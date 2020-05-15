package p000;

import android.accounts.Account;
import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: xby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xby {

    /* renamed from: e */
    private static final Logger f51902e = new Logger(new String[]{"FidoV2EnrollmentController"}, (short[]) null);

    /* renamed from: a */
    private final xwj f51903a = xwj.m43507a(xwi.FIDO_AUTOENROLLMENT_V2);

    /* renamed from: b */
    private final xbx f51904b = new xbx(rpr.m34216b());

    /* renamed from: c */
    private final xwn f51905c = xwm.m43525a();

    /* renamed from: d */
    private final ios f51906d = inl.m15759a(rpr.m34216b());

    /* renamed from: a */
    private final void m42631a(Exception exc, wzu wzu) {
        f51902e.mo25417e("Failed to auto-enroll a v2 key.", exc, new Object[0]);
        this.f51905c.mo30193a(this.f51903a, wzs.EVENT_TYPE_ENROLLMENT_ERROR, wzu, 3, exc);
    }

    /* renamed from: a */
    private final void m42632a(String str, List list, wzu wzu) {
        try {
            int i = ((KeyRegistrationResult) aucu.m76783a(this.f51906d.mo13178a(1, list, "fido", new Account(str, "com.google"), null), 10000, TimeUnit.MILLISECONDS)).f10542b.f30115i;
            Logger Logger = f51902e;
            String valueOf = String.valueOf(iov.m15809b(i));
            Logger.mo25412b(valueOf.length() == 0 ? new String("Result status code of key registration is ") : "Result status code of key registration is ".concat(valueOf), new Object[0]);
            if (i != -25501) {
                if (i != -25503) {
                    String valueOf2 = String.valueOf(iov.m15809b(i));
                    m42631a(new xma(valueOf2.length() == 0 ? new String("CryptAuth error: ") : "CryptAuth error: ".concat(valueOf2)), wzu);
                    return;
                }
            }
            f51902e.mo25412b("Enrolled a v2 key.", new Object[0]);
            this.f51905c.mo30193a(this.f51903a, wzs.EVENT_TYPE_ENROLLMENT_SUCCESS, wzu, 3, null);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            m42631a(e, wzu);
        }
    }

    /* renamed from: a */
    private final void m42633a(String str, wzu wzu) {
        f51902e.mo25412b("Execute registerFor API", new Object[0]);
        ArrayList a = bnkn.m109661a();
        wzu wzu2 = wzu.KEY_TYPE_UNDEFINED_DO_NOT_USE;
        int ordinal = wzu.ordinal();
        if (ordinal == 1) {
            a.add("fido:android_software_key");
            a.add("fido:android_software_key_cable_lk");
            a.add("fido:android_software_key_cable_irk");
        } else if (ordinal == 3) {
            a.add("fido:android_strongbox_key");
            a.add("fido:android_strongbox_key_cable_lk");
            a.add("fido:android_strongbox_key_cable_irk");
        } else if (ordinal != 4) {
            String valueOf = String.valueOf(wzu);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
            sb.append("Unknown key type: ");
            sb.append(valueOf);
            m42631a(new xma(sb.toString()), wzu);
            return;
        } else {
            a.add("fido:android_strong_auth_key");
        }
        try {
            if (((Boolean) aucu.m76783a(this.f51906d.mo13180a((String) a.get(0), new Account(str, "com.google")), 10000, TimeUnit.MILLISECONDS)).booleanValue()) {
                f51902e.mo25412b("Key already exists, no need to register.", new Object[0]);
            } else {
                m42632a(str, a, wzu);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            m42631a(e, wzu);
        }
    }

    /* renamed from: a */
    public final void mo29624a() {
        f51902e.mo25412b("Autoenrollment V2 Triggered", new Object[0]);
        if (cdvq.f181813a.mo6606a().mo78378d()) {
            for (String str : this.f51904b.mo29621a()) {
                m42633a(str, wzu.KEY_TYPE_SOFTWARE);
            }
        }
        if (cdvq.m135121c()) {
            rpr b = rpr.m34216b();
            int i = Build.VERSION.SDK_INT;
            if (sre.m36086f(b) && b.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                for (String str2 : this.f51904b.mo29621a()) {
                    m42633a(str2, wzu.KEY_TYPE_STRONGBOX);
                }
            }
        }
        if (cdvq.f181813a.mo6606a().mo78379e()) {
            int i2 = Build.VERSION.SDK_INT;
            BiometricManager biometricManager = (BiometricManager) rpr.m34216b().getSystemService(BiometricManager.class);
            if (biometricManager == null || biometricManager.canAuthenticate() != 0) {
                int i3 = Build.VERSION.SDK_INT;
                FingerprintManager fingerprintManager = (FingerprintManager) rpr.m34216b().getSystemService(FingerprintManager.class);
                if (fingerprintManager == null || !fingerprintManager.isHardwareDetected() || !fingerprintManager.hasEnrolledFingerprints()) {
                    return;
                }
            }
            for (String str3 : this.f51904b.mo29621a()) {
                m42633a(str3, wzu.KEY_TYPE_STRONG_AUTH);
            }
        }
    }
}
