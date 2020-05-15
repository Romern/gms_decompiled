package com.google.android.gms.contactsheet.header;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class QuickActionsBarContainerView extends LinearLayout {
    public QuickActionsBarContainerView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m22841a() {
        if (!cgnk.f187363a.mo6606a().mo84161d()) {
            inflate(getContext(), C0126R.C0128layout.gm_quick_actions_bar, this);
        } else {
            inflate(getContext(), C0126R.C0128layout.gm_quick_actions_bar_fix, this);
        }
    }

    public QuickActionsBarContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22841a();
    }

    public QuickActionsBarContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m22841a();
    }
}
