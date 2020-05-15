package com.google.android.gms.wallet.common.p079ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.wallet.common.ui.WalletSecureLinearLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WalletSecureLinearLayout extends LinearLayout {
    public WalletSecureLinearLayout(Context context) {
        super(context);
        m93926a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(android.view.View, boolean):void
     arg types: [com.google.android.gms.wallet.common.ui.WalletSecureLinearLayout, int]
     candidates:
      awia.a(android.accounts.Account, int):bmaw
      awia.a(android.content.Context, bmbd):bmbd
      awia.a(com.google.android.chimera.Fragment, android.os.Bundle):bmfv
      awia.a(android.content.Context, android.view.View):void
      awia.a(android.view.ViewParent, android.view.View):void
      awia.a(com.google.android.wallet.ui.common.FifeNetworkImageView, bmno):void
      awia.a(android.accounts.Account[], bmbd):void
      awia.a(bkdx, bmfu):boolean
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig):boolean
      awia.a(com.google.android.gms.wallet.firstparty.WalletCustomTheme, int):boolean
      awia.a(android.view.View, boolean):void */
    /* renamed from: a */
    private final void m93926a() {
        awia.m79979a((View) this, true);
    }

    public final boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        boolean onFilterTouchEventForSecurity = super.onFilterTouchEventForSecurity(motionEvent);
        if (!onFilterTouchEventForSecurity) {
            Toast.makeText(getContext(), (int) C0126R.string.wallet_screen_blocked, 1).show();
        }
        return onFilterTouchEventForSecurity;
    }

    public WalletSecureLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m93926a();
    }

    public WalletSecureLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m93926a();
    }

    public WalletSecureLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m93926a();
    }
}
