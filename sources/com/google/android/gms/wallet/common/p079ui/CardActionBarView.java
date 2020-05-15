package com.google.android.gms.wallet.common.p079ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.wallet.common.ui.CardActionBarView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardActionBarView extends LinearLayout {

    /* renamed from: a */
    public ViewGroup f110061a;

    public CardActionBarView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f110061a = (ViewGroup) findViewById(C0126R.C0129id.actions_container);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        bkfr.m105608d(this, z);
    }

    public CardActionBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
