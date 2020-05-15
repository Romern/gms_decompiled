package com.google.android.gms.tapandpay.wear.dialog;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearSecureKeyguardDialogChimeraActivity extends WearTapAndPayDialogChimeraActivity {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: e */
    public final void mo59507e() {
        Intent intent = new Intent("com.google.android.gms.tapandpay.ACTION_ENABLE_SECURE_KEYGUARD");
        intent.setClassName("com.google.android.gms", "com.google.android.gms.tapandpay.ui.EnableSecureKeyguardActivity");
        startActivityForResult(intent, 1);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        setResult(i2);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (asjk.m74228b(this)) {
            atah.m75278c();
            setResult(-1);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Setup Security");
    }
}
