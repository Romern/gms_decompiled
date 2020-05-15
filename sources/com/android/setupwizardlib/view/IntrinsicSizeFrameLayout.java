package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.cast.JGCastService;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IntrinsicSizeFrameLayout extends FrameLayout {

    /* renamed from: a */
    private int f7245a = 0;

    /* renamed from: b */
    private int f7246b = 0;

    public IntrinsicSizeFrameLayout(Context context) {
        super(context);
        m4744a(context, null, 0);
    }

    /* renamed from: a */
    private final int m4743a(int i, int i2) {
        if (i2 <= 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(this.f7245a, JGCastService.FLAG_PRIVATE_DISPLAY);
        }
        return mode == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(Math.min(size, this.f7245a), JGCastService.FLAG_PRIVATE_DISPLAY) : i;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(m4743a(i, this.f7246b), m4743a(i2, this.f7245a));
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4744a(context, attributeSet, 0);
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4744a(context, attributeSet, i);
    }

    /* renamed from: a */
    private final void m4744a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, blz.f5145l, i, 0);
        this.f7245a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f7246b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }
}
