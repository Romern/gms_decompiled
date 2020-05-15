package com.google.android.gms.auth.setup.d2d;

import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SmartDeviceChimeraActivity extends jtw {

    /* renamed from: e */
    public static final sek f11259e = new sek("SmartDevice", "D2D", "SmartDeviceActivity");

    /* renamed from: f */
    public static final imr f11260f = imr.m15727a("callerIdentity");

    /* renamed from: g */
    public static final imr f11261g = imr.m15727a("d2d_options");

    /* renamed from: h */
    public static final rtc f11262h = rtc.m34379a("smartdevice:enable_d2d_v2_target", true);

    /* renamed from: p */
    private boolean f11263p = false;

    /* renamed from: q */
    private boolean f11264q = false;

    /* renamed from: a */
    public final void mo7768a() {
        mo7860c();
    }

    /* renamed from: bd */
    public final void mo7769bd() {
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f11264q = true;
        sek sek = f11259e;
        Integer valueOf = Integer.valueOf(i2);
        sek.mo25409a("onActivityResult(requestCode=%d, resultCode=%d)", Integer.valueOf(i), valueOf);
        if (i == 1234) {
            if (i2 != -1) {
                if (i2 == 0) {
                    f11259e.mo25414c("Smartdevice setup was canceled", new Object[0]);
                    mo7874a(0, intent);
                    return;
                } else if (i2 == 1) {
                    f11259e.mo25414c("Smartdevice setup was skipped", new Object[0]);
                    mo7860c();
                    return;
                } else if (!(i2 == 102 || i2 == 103)) {
                    f11259e.mo25416d("Unrecognised result code from SmartDevice. Ignoring.", new Object[0]);
                    return;
                }
            }
            f11259e.mo25414c("SmartDevice setup was completed with result code: %d", valueOf);
            this.f23206c.set(false);
            mo7874a(i2, intent);
            ((jtw) this).f23207d.mo64987a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f11263p = true;
            Intent intent = new Intent();
            intent.putExtra("smartdevice.use_immersive_mode", (Serializable) mo14202g().mo13147a(jtw.f23205b, false));
            intent.putExtra("smartdevice.theme", (String) mo14202g().mo13146a(jtw.f23204a));
            intent.putExtra(f11260f.f21366a, (String) mo14202g().mo13146a(f11260f));
            intent.putExtra(f11261g.f21366a, (byte[]) mo14202g().mo13146a(f11261g));
            intent.setClassName("com.google.android.gms", "com.google.android.gms.smartdevice.d2d.ui.TargetActivity");
            bizc.m103024a(getIntent(), intent);
            startActivityForResult(intent, 1234);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (!this.f11263p && !this.f11264q) {
            f11259e.mo25418e("The child activity crashed. Skipping D2d.", new Object[0]);
            mo7860c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("launchedTargetActivity", true);
    }
}
