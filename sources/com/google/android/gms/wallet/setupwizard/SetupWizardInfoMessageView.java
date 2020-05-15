package com.google.android.gms.wallet.setupwizard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupWizardInfoMessageView extends InfoMessageView {
    public SetupWizardInfoMessageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60042a() {
        setOrientation(0);
        LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.view_sw_info_message_view, this);
        this.f152077a = (ViewGroup) findViewById(C0126R.C0129id.message_views_container);
        this.f152078b = (TextView) findViewById(C0126R.C0129id.sud_layout_description);
        this.f152079c = (TextView) findViewById(C0126R.C0129id.detailed_message);
        setVisibility(getVisibility());
    }

    public SetupWizardInfoMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SetupWizardInfoMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
