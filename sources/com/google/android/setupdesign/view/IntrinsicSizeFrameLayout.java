package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IntrinsicSizeFrameLayout extends FrameLayout {

    /* renamed from: a */
    private int f151531a = 0;

    /* renamed from: b */
    private int f151532b = 0;

    public IntrinsicSizeFrameLayout(Context context) {
        super(context);
        m117916a(context, null, 0);
    }

    /* renamed from: a */
    private final int m117915a(int i, int i2) {
        if (i2 <= 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(this.f151531a, JGCastService.FLAG_PRIVATE_DISPLAY);
        }
        return mode == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(Math.min(size, this.f151531a), JGCastService.FLAG_PRIVATE_DISPLAY) : i;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(m117915a(i, this.f151532b), m117915a(i2, this.f151531a));
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m117916a(context, attributeSet, 0);
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m117916a(context, attributeSet, i);
    }

    /* renamed from: a */
    private final void m117916a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bizg.f122377k, i, 0);
        this.f151531a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f151532b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }
}
