package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.google.android.wallet.ui.common.MaterialFieldInputLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MaterialFieldInputLayout extends LinearLayout implements bkdd {

    /* renamed from: a */
    private TextView f152138a;

    public MaterialFieldInputLayout(Context context) {
        super(context);
        setOrientation(0);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (bkfr.m105619g(view)) {
            if (this.f152138a == null) {
                this.f152138a = (TextView) view;
            } else {
                throw new IllegalStateException("More than one editable TextView not supported");
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public final View mo65860b() {
        return this.f152138a;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public MaterialFieldInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
    }

    public MaterialFieldInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }

    public MaterialFieldInputLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setOrientation(0);
    }
}
