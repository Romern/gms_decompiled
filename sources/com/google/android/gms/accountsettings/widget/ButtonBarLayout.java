package com.google.android.gms.accountsettings.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f7813a;

    /* renamed from: b */
    private int f7814b = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = context.getResources().getConfiguration().screenHeightDp >= 320;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eoi.f15392d);
        this.f7813a = obtainStyledAttributes.getBoolean(0, z);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final boolean m5030a() {
        return getOrientation() == 1;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        boolean z = false;
        if (this.f7813a) {
            if (size > this.f7814b && m5030a()) {
                mo6359a(false);
            }
            this.f7814b = size;
        }
        if (m5030a() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f7813a && !m5030a() && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            mo6359a(true);
        } else if (!z) {
            return;
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6359a(boolean z) {
        int i;
        int i2;
        setOrientation(z ? 1 : 0);
        if (!z) {
            i = 80;
        } else {
            i = 8388613;
        }
        setGravity(i);
        View findViewById = findViewById(C0126R.C0129id.spacer);
        if (findViewById != null) {
            if (!z) {
                i2 = 4;
            } else {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
        if (!z) {
            bringChildToFront(findViewById(C0126R.C0129id.button_positive));
        } else {
            bringChildToFront(findViewById(C0126R.C0129id.button_negative));
        }
    }
}
