package com.google.android.gms.tapandpay.wear;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearActionView extends TextView {
    public WearActionView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Drawable[] compoundDrawables = getCompoundDrawables();
        int length = compoundDrawables.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 < length) {
                Drawable drawable = compoundDrawables[i6];
                if (drawable != null) {
                    i5 = drawable.getIntrinsicWidth();
                    break;
                }
                i6++;
            } else {
                break;
            }
        }
        int compoundDrawablePadding = getCompoundDrawablePadding();
        int width = (getWidth() - ((i5 + compoundDrawablePadding) + Math.round(getPaint().measureText(getText().toString())))) / 2;
        setPadding(width, getPaddingTop(), width, getPaddingBottom());
    }

    public WearActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WearActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
