package com.google.android.gms.auth.api.credentials.yolo.p023ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* renamed from: com.google.android.gms.auth.api.credentials.yolo.ui.MaxHeightListView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MaxHeightListView extends ListView {

    /* renamed from: a */
    private int f10197a;

    public MaxHeightListView(Context context) {
        super(context);
        m6393a(context, null);
    }

    /* renamed from: a */
    private final void m6393a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eoi.f15398j);
        this.f10197a = obtainStyledAttributes.getDimensionPixelSize(0, 300);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f10197a > 0) {
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size, this.f10197a), mode);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec(this.f10197a, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }

    public MaxHeightListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        m6393a(context, attributeSet);
    }

    public MaxHeightListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6393a(context, attributeSet);
    }
}
