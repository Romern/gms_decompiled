package com.google.android.gms.auth.uiflows.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.SetupWizardLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupWizardAuthAccountLayout extends SetupWizardLayout implements img, imj {
    public SetupWizardAuthAccountLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo7880a() {
        mo71377c().f151533a.setEnabled(false);
    }

    /* renamed from: b */
    public final void mo7885b() {
        mo71376b(true);
    }

    /* renamed from: c */
    public final void mo7889c(CharSequence charSequence) {
        mo71377c().f151534b.setText(charSequence);
    }

    public SetupWizardAuthAccountLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo7881a(Window window) {
        biyt biyt = (biyt) mo71342a(biyt.class);
        biyt.m103011a(window);
    }

    /* renamed from: b */
    public final void mo7886b(Window window) {
        mo7881a(window);
    }

    public SetupWizardAuthAccountLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.auth_setup_wizard_auth_account_layout, this);
    }

    /* renamed from: a */
    public final void mo7882a(Window window, Context context) {
        ((biyt) mo71342a(biyt.class)).mo64892a(window, context);
    }

    /* renamed from: b */
    public final void mo7887b(Window window, Context context) {
        mo7882a(window, context);
    }

    /* renamed from: a */
    public final void mo7883a(imf imf) {
        mo71377c().mo71422a(new jxh(imf));
    }

    /* renamed from: b */
    public final void mo7888b(CharSequence charSequence) {
        ((TextView) findViewById(C0126R.C0129id.message)).setText(charSequence);
    }

    /* renamed from: a */
    public final void mo7884a(boolean z) {
        mo71377c().f151534b.setVisibility(!z ? 8 : 0);
    }
}
