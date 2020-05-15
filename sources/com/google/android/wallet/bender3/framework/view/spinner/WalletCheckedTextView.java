package com.google.android.wallet.bender3.framework.view.spinner;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WalletCheckedTextView extends C1494xq {
    public WalletCheckedTextView(Context context) {
        super(context);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(null)) {
            accessibilityNodeInfo.setText(String.format(Locale.US, "%s %s", null, getText()));
        }
    }

    public WalletCheckedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WalletCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
