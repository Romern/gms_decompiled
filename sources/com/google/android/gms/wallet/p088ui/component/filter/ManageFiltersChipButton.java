package com.google.android.gms.wallet.p088ui.component.filter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.p002v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.wallet.ui.component.filter.ManageFiltersChipButton */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ManageFiltersChipButton extends AppCompatButton {
    public ManageFiltersChipButton(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        ColorStateList d = bkfr.m105606d(getContext(), (int) C0126R.attr.uicColorMaterialAccent);
        setTextColor(d);
        int i = Build.VERSION.SDK_INT;
        GradientDrawable gradientDrawable = (GradientDrawable) getBackground();
        gradientDrawable.setStroke(getResources().getDimensionPixelSize(C0126R.dimen.wallet_manage_filters_chip_button_stroke_width), d);
        setBackground(gradientDrawable);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (getBackground() != null) {
            getBackground().setAlpha(!z ? 77 : 255);
        }
    }

    public ManageFiltersChipButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ManageFiltersChipButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
