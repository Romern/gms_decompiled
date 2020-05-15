package com.google.android.gms.udc.p077ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.cast.JGCastService;

/* renamed from: com.google.android.gms.udc.ui.ResizeableContainerMaterialDesignV2 */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ResizeableContainerMaterialDesignV2 extends LinearLayout {

    /* renamed from: a */
    private int f109392a = 0;

    /* renamed from: b */
    private int f109393b = 0;

    public ResizeableContainerMaterialDesignV2(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static int m93674a(int i, float f) {
        return Math.round(((float) i) * f);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        int i5 = displayMetrics.widthPixels;
        if (f != 0.0f) {
            i3 = Math.round(((float) i5) / f);
        } else {
            i3 = 0;
        }
        if (i3 < 600) {
            i4 = getContext().getResources().getConfiguration().orientation == 2 ? m93674a(48, f) : m93674a(24, f);
        } else if (i3 < 936) {
            i4 = m93674a(48, f);
        } else if (i3 < 1240) {
            i = View.MeasureSpec.makeMeasureSpec(m93674a(800, f), JGCastService.FLAG_PRIVATE_DISPLAY);
            i4 = -1;
        } else {
            i4 = m93674a((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, f);
        }
        setPadding(i4, this.f109392a, i4, this.f109393b);
        super.onMeasure(i, i2);
    }

    public ResizeableContainerMaterialDesignV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m93675a(context, attributeSet);
    }

    /* renamed from: a */
    private final void m93675a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842967, 16842969});
        this.f109392a = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.f109393b = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        obtainStyledAttributes.recycle();
    }

    public ResizeableContainerMaterialDesignV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m93675a(context, attributeSet);
    }
}
