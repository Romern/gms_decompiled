package com.google.android.gms.wallet.common.p079ui;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.wallet.common.ui.TopBarView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TopBarView extends LinearLayout {

    /* renamed from: a */
    public AccountSelector f110126a;

    /* renamed from: b */
    private boolean f110127b = false;

    public TopBarView(Context context) {
        super(context);
        m93920a(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.wallet.common.ui.TopBarView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final void m93920a(Context context) {
        setOrientation(1);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.wallet_view_top_bar, (ViewGroup) this, true);
        this.f110126a = (AccountSelector) findViewById(C0126R.C0129id.account_selector);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            if (bundle.containsKey("visibleAccountSelector")) {
                this.f110127b = bundle.getBoolean("visibleAccountSelector");
            }
            mo59894a(this.f110127b);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putBoolean("visibleAccountSelector", this.f110127b);
        return bundle;
    }

    public TopBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m93920a(context);
    }

    /* renamed from: a */
    public final void mo59893a(Account account) {
        AccountSelector accountSelector = this.f110126a;
        if (accountSelector != null) {
            accountSelector.mo59831a(account);
        }
    }

    public TopBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m93920a(context);
    }

    /* renamed from: a */
    public final void mo59894a(boolean z) {
        this.f110127b = z;
        AccountSelector accountSelector = this.f110126a;
        if (accountSelector != null) {
            accountSelector.setEnabled(z);
        }
    }
}
