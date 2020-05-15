package com.google.android.gms.wallet.p088ui.component.filter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.p088ui.common.ClickableImageView;

/* renamed from: com.google.android.gms.wallet.ui.component.filter.FilterCategoryChipButton */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FilterCategoryChipButton extends LinearLayout implements View.OnClickListener, bjwh {

    /* renamed from: a */
    public TextView f110515a;

    /* renamed from: b */
    public ClickableImageView f110516b;

    /* renamed from: c */
    public bwhw f110517c;

    /* renamed from: d */
    public bjwk f110518d;

    /* renamed from: e */
    public axan f110519e;

    public FilterCategoryChipButton(Context context) {
        super(context);
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        bjwl.m104790b(this.f110516b, this.f110517c.f159588a, this.f110518d);
    }

    public void onClick(View view) {
        axan axan = this.f110519e;
        if (axan != null) {
            ((axaq) axan).mo52952a(this.f110517c);
            return;
        }
        throw new IllegalStateException("FilterCategoryClickedListener is not set in FilterCategoryChipButton");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this);
        this.f110515a = (TextView) findViewById(C0126R.C0129id.chip_button_text);
        ClickableImageView clickableImageView = (ClickableImageView) findViewById(C0126R.C0129id.remove_icon);
        this.f110516b = clickableImageView;
        bkfr.m105572a(clickableImageView, ColorStateList.valueOf(bkfr.m105542a(getContext(), 16842801)));
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        bkfr.m105608d(this, z);
    }

    public FilterCategoryChipButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FilterCategoryChipButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FilterCategoryChipButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
