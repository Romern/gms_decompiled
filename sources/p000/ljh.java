package p000;

import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.widget.Switch;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ljh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ljh extends lim {

    /* renamed from: d */
    public final lho f26190d;

    /* renamed from: e */
    private final bmxv f26191e;

    /* renamed from: f */
    private final bmxv f26192f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ljh(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        bmvz bmvz = bmvz.f131120a;
        bmvz bmvz2 = bmvz.f131120a;
        this.f26190d = krc.m18382a(lir).mo14830e();
        this.f26191e = bmvz;
        this.f26192f = bmvz2;
    }

    /* renamed from: h */
    private final boolean m19225h() {
        bmxv bmxv = this.f26191e;
        BiometricManager biometricManager = (BiometricManager) this.f26159a.getSystemService(BiometricManager.class);
        bmxv.mo66812a(biometricManager);
        if (biometricManager == null || biometricManager.canAuthenticate() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo15164a() {
        int i;
        boolean z;
        C1341rz aW;
        Switch switchR;
        Switch switchR2;
        lir lir = this.f26159a;
        if (!ccip.m129866f()) {
            i = 2132019642;
        } else {
            i = 2132019639;
        }
        lir.setTheme(i);
        boolean z2 = false;
        if (ccit.m129946c()) {
            int i2 = Build.VERSION.SDK_INT;
            if (!m19225h()) {
                int i3 = Build.VERSION.SDK_INT;
                bmxv bmxv = this.f26192f;
                FingerprintManager fingerprintManager = (FingerprintManager) this.f26159a.getSystemService("fingerprint");
                bmxv.mo66812a(fingerprintManager);
                if (fingerprintManager != null && fingerprintManager.isHardwareDetected()) {
                    if (!fingerprintManager.hasEnrolledFingerprints()) {
                        z = false;
                        if (ccit.m129945b()) {
                            int i4 = Build.VERSION.SDK_INT;
                            if (m19225h()) {
                                z2 = true;
                            }
                        }
                        if (!z && z2) {
                            this.f26159a.setContentView((int) C0126R.C0128layout.biometrics_settings_activity_full);
                        } else if (z) {
                            this.f26159a.setContentView((int) C0126R.C0128layout.biometrics_settings_activity_payment_info_only);
                        } else if (z2) {
                            this.f26159a.setContentView((int) C0126R.C0128layout.biometrics_settings_activity_credentials_only);
                        }
                        Toolbar toolbar = (Toolbar) this.f26159a.findViewById(C0126R.C0129id.toolbar);
                        this.f26159a.mo8626a(toolbar);
                        aW = this.f26159a.mo8628aW();
                        if (aW != null) {
                            aW.mo15855c((int) C0126R.string.autofill_biometrics_label);
                            aW.mo15853b(true);
                            toolbar.mo1678a(new lje(this));
                        }
                        if (z && (switchR2 = (Switch) this.f26159a.findViewById(C0126R.C0129id.payment_info_switch)) != null) {
                            switchR2.setChecked(this.f26190d.mo15093m());
                            switchR2.setOnClickListener(new ljf(this, switchR2));
                        }
                        if (!z2 && (switchR = (Switch) this.f26159a.findViewById(C0126R.C0129id.credentials_switch)) != null) {
                            switchR.setChecked(this.f26190d.mo15094n());
                            switchR.setOnClickListener(new ljg(this, switchR));
                            return;
                        }
                        return;
                    }
                }
            }
            z = true;
            if (ccit.m129945b()) {
            }
            if (!z) {
            }
            if (z) {
            }
            Toolbar toolbar2 = (Toolbar) this.f26159a.findViewById(C0126R.C0129id.toolbar);
            this.f26159a.mo8626a(toolbar2);
            aW = this.f26159a.mo8628aW();
            if (aW != null) {
            }
            switchR2.setChecked(this.f26190d.mo15093m());
            switchR2.setOnClickListener(new ljf(this, switchR2));
            if (!z2) {
                return;
            }
            return;
        }
        z = false;
        if (ccit.m129945b()) {
        }
        if (!z) {
        }
        if (z) {
        }
        Toolbar toolbar22 = (Toolbar) this.f26159a.findViewById(C0126R.C0129id.toolbar);
        this.f26159a.mo8626a(toolbar22);
        aW = this.f26159a.mo8628aW();
        if (aW != null) {
        }
        switchR2.setChecked(this.f26190d.mo15093m());
        switchR2.setOnClickListener(new ljf(this, switchR2));
        if (!z2) {
        }
    }
}
