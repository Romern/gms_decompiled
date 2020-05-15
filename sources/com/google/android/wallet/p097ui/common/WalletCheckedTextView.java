package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.wallet.ui.common.WalletCheckedTextView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WalletCheckedTextView extends CheckedTextView {

    /* renamed from: a */
    private String f152237a;

    public WalletCheckedTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static WalletCheckedTextView m118769a(View view) {
        if (view instanceof WalletCheckedTextView) {
            return (WalletCheckedTextView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            WalletCheckedTextView a = m118769a(viewGroup.getChildAt(i));
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.f152237a)) {
            accessibilityNodeInfo.setText(getResources().getString(C0126R.string.wallet_uic_accessibility_form_spinner_item, this.f152237a, getText()));
        }
    }

    public WalletCheckedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WalletCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public static void m118770a(View view, String str) {
        WalletCheckedTextView a = m118769a(view);
        if (a != null) {
            a.f152237a = str;
        }
    }

    public WalletCheckedTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
