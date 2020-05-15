package com.google.android.gms.wallet.p088ui.component.pageheader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.wallet.ui.component.pageheader.SetupWizardPageHeaderView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupWizardPageHeaderView extends PageHeaderView {
    public SetupWizardPageHeaderView(Context context) {
        super(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.wallet.ui.component.pageheader.SetupWizardPageHeaderView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60126a() {
        LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.wallet_sw_view_top_image_header, (ViewGroup) this, true);
    }

    public SetupWizardPageHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SetupWizardPageHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SetupWizardPageHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
