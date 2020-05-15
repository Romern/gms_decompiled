package com.google.android.gms.ocr.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FixedAspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    private float f81370a;

    public FixedAspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f81370a > 0.0f) {
            if (View.MeasureSpec.getMode(i) == 0) {
                View.MeasureSpec.makeMeasureSpec(0, JGCastService.FLAG_PRIVATE_DISPLAY);
            }
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            int round = Math.round(((float) size) / this.f81370a);
            if (mode == Integer.MIN_VALUE) {
                size2 = Math.min(round, size2);
            } else if (mode != 1073741824) {
                size2 = round;
            }
            setMeasuredDimension(size, size2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, JGCastService.FLAG_PRIVATE_DISPLAY);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, JGCastService.FLAG_PRIVATE_DISPLAY);
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                getChildAt(i3).measure(makeMeasureSpec, makeMeasureSpec2);
            }
            return;
        }
        super.onMeasure(i, i2);
    }

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81370a = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eoi.f15399k);
            try {
                this.f81370a = obtainStyledAttributes.getFloat(0, this.f81370a);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
