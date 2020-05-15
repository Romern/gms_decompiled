package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.google.android.wallet.ui.common.FieldContainerRelativeLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FieldContainerRelativeLayout extends RelativeLayout implements bkdd {

    /* renamed from: a */
    private int f151946a;

    /* renamed from: b */
    private View f151947b;

    public FieldContainerRelativeLayout(Context context) {
        super(context);
        m118449a(context, null, 0, 0);
    }

    /* renamed from: a */
    private final void m118449a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkju.f124465c, i, i2);
        this.f151946a = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final View mo65860b() {
        if (this.f151947b == null) {
            this.f151947b = findViewById(this.f151946a);
        }
        return this.f151947b;
    }

    public FieldContainerRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118449a(context, attributeSet, 0, 0);
    }

    public FieldContainerRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118449a(context, attributeSet, i, 0);
    }

    public FieldContainerRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m118449a(context, attributeSet, i, i2);
    }
}
