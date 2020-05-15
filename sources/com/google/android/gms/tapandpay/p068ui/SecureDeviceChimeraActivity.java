package com.google.android.gms.tapandpay.p068ui;

import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Looper;
import android.view.Window;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.tapandpay.ui.SecureDeviceChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SecureDeviceChimeraActivity extends atex {

    /* renamed from: d */
    public static final /* synthetic */ int f108954d = 0;

    /* renamed from: b */
    atwv f108955b;

    /* renamed from: c */
    rjx f108956c;

    /* renamed from: e */
    private BroadcastReceiver f108957e;

    /* renamed from: f */
    private boolean f108958f;

    /* renamed from: g */
    private atam f108959g;

    /* renamed from: h */
    private long f108960h = -1;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: g */
    private final void m93311g() {
        if (this.f108957e == null) {
            C16683 r0 = new aacn("tapandpay") {
                /* class com.google.android.gms.tapandpay.p068ui.SecureDeviceChimeraActivity.C16683 */

                /* renamed from: a */
                public final void mo6253a(Context context, Intent intent) {
                    if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                        SecureDeviceChimeraActivity secureDeviceChimeraActivity = SecureDeviceChimeraActivity.this;
                        int i = SecureDeviceChimeraActivity.f108954d;
                        secureDeviceChimeraActivity.mo59497a(-1, 4);
                    }
                }
            };
            this.f108957e = r0;
            registerReceiver(r0, new IntentFilter("android.intent.action.USER_PRESENT"));
        }
    }

    /* renamed from: a */
    public final void mo59497a(int i, int i2) {
        boolean z;
        if (this.f108960h != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f108960h;
            if (i == -1) {
                z = true;
            } else {
                z = false;
            }
            atam atam = this.f108959g;
            bxvd g = atam.mo49765g(143);
            bxvd da = bpbg.f135592e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpbg bpbg = (bpbg) da.f164949b;
            bpbg.f135595b = i2 - 1;
            int i3 = bpbg.f135594a | 1;
            bpbg.f135594a = i3;
            int i4 = i3 | 2;
            bpbg.f135594a = i4;
            bpbg.f135596c = currentTimeMillis;
            bpbg.f135594a = i4 | 4;
            bpbg.f135597d = z;
            if (g.f164950c) {
                g.mo74035c();
                g.f164950c = false;
            }
            bpbx bpbx = (bpbx) g.f164949b;
            bpbg bpbg2 = (bpbg) da.mo74062i();
            bpbx bpbx2 = bpbx.f135635S;
            bpbg2.getClass();
            bpbx.f135648L = bpbg2;
            bpbx.f135656b |= 512;
            atam.mo49741a((bpbx) g.mo74062i());
        }
        setResult(i);
        rjx.m33696b(getApplicationContext()).mo24772z();
        finish();
    }

    /* renamed from: e */
    public final void mo59498e() {
        Intent b = atah.m75276b(this);
        if (b != null) {
            this.f108958f = true;
            startActivityForResult(b, 1);
        } else if (asjk.m74232f(this)) {
            m93311g();
            if (asjk.m74232f(this)) {
                asfb asfb = new asfb(this, 268435482, "TpDeviceAdminManager", null, "com.google.android.gms");
                ((DevicePolicyManager) getSystemService("device_policy")).lockNow();
                asfb.mo49111a(1);
            }
        } else {
            mo59497a(0, 2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                rjx.m33696b(getApplicationContext()).mo24771y();
                mo59497a(-1, 2);
                return;
            }
            mo59497a(445, 4);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.addFlags(128);
        this.f108959g = new atam(this, mo49917k().f90210a);
        this.f108960h = System.currentTimeMillis();
        if (this.f108956c == null) {
            this.f108956c = aula.m77249a(this);
        }
        if (!cgwn.m147259i()) {
            window.addFlags(4194304);
        } else {
            int i = Build.VERSION.SDK_INT;
        }
        setContentView((int) C0126R.C0128layout.tp_spinner_activity);
        int i2 = Build.VERSION.SDK_INT;
        setRequestedOrientation(1);
        setTitle("");
        if (bundle != null) {
            this.f108958f = bundle.getBoolean("has_shown_device_credentials_screen");
        }
        if (this.f108955b == null) {
            int i3 = Build.VERSION.SDK_INT;
            this.f108955b = new atwv(this, this);
        }
        if (!this.f108958f) {
            sre.m36089i(this);
            if (cgvl.f187821a.mo6606a().mo84545a() && new atah(this).mo49729a()) {
                int i4 = Build.VERSION.SDK_INT;
                BiometricManager biometricManager = (BiometricManager) getSystemService(BiometricManager.class);
                if (biometricManager != null && biometricManager.canAuthenticate() == 0) {
                    atwv atwv = this.f108955b;
                    atws atws = new atws(this);
                    adzt adzt = new adzt(Looper.getMainLooper());
                    adzt.getClass();
                    atwt atwt = new atwt(adzt);
                    new BiometricPrompt.Builder(atwv.f91062a).setTitle(atwv.f91063b.getString(C0126R.string.tp_biometric_prompt_title)).setNegativeButton(atwv.f91063b.getString(C0126R.string.tp_biometric_prompt_negative_button), atwt, new atwu(atwv)).build().authenticate(new CancellationSignal(), atwt, atws);
                    return;
                }
            }
            if (cgwn.m147259i()) {
                int i5 = Build.VERSION.SDK_INT;
                ((KeyguardManager) getSystemService("keyguard")).requestDismissKeyguard(getContainerActivity(), new atwr(this));
            } else if (new atah(this).mo49729a()) {
                mo59498e();
            } else {
                int i6 = Build.VERSION.SDK_INT;
                m93311g();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.f108957e;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.f108957e = null;
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("has_shown_device_credentials_screen", this.f108958f);
    }
}
