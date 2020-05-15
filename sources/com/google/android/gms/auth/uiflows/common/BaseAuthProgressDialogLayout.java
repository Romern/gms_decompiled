package com.google.android.gms.auth.uiflows.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BaseAuthProgressDialogLayout extends imi {
    public BaseAuthProgressDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.common_progress_dialog, this);
    }

    /* renamed from: a */
    public final void mo7879a(CharSequence charSequence) {
        ((TextView) findViewById(C0126R.C0129id.message)).setText(charSequence);
    }
}
