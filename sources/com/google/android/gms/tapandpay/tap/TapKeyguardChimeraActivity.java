package com.google.android.gms.tapandpay.tap;

import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapKeyguardChimeraActivity extends atex {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        getWindow().addFlags(4194304);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
            obtain.setContentDescription(getString(C0126R.string.tp_key_guard_unlock));
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
        new adzt().postDelayed(new atmy(this), 200);
    }
}
