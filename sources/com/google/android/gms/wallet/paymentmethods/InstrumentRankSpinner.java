package com.google.android.gms.wallet.paymentmethods;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Spinner;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstrumentRankSpinner extends Spinner {

    /* renamed from: b */
    private static int f110304b;

    /* renamed from: c */
    private static int f110305c;

    /* renamed from: a */
    public int f110306a;

    public InstrumentRankSpinner(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = Build.VERSION.SDK_INT;
        if (f110304b == 0) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C0126R.attr.dropdownListPreferredItemHeight});
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
            f110304b = dimensionPixelOffset;
            f110305c = (dimensionPixelOffset - getHeight()) / 2;
            obtainStyledAttributes.recycle();
        }
        setDropDownVerticalOffset(-((f110304b * this.f110306a) + f110305c));
    }

    public InstrumentRankSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstrumentRankSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InstrumentRankSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
