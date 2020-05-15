package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.support.p002v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.google.android.wallet.ui.common.NonEditableTextView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NonEditableTextView extends AppCompatTextView {

    /* renamed from: b */
    public View f152177b;

    public NonEditableTextView(Context context) {
        super(context);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f152177b;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public NonEditableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NonEditableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
