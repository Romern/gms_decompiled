package com.google.android.gms.smartdevice.setup.p066ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: com.google.android.gms.smartdevice.setup.ui.ShapeVerificationView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ShapeVerificationView extends LinearLayout {

    /* renamed from: a */
    public static final Typeface f108234a = Typeface.create("google-sans", 0);

    /* renamed from: b */
    public int[] f108235b;

    /* renamed from: c */
    public boolean f108236c;

    /* renamed from: d */
    public int f108237d;

    /* renamed from: e */
    public int f108238e;

    public ShapeVerificationView(Context context) {
        super(context);
        m92964a(context);
    }

    /* renamed from: a */
    public static asao m92963a(int i, int i2, int[] iArr) {
        int i3 = (i & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC) >> 6;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1) {
            i4 = i3 != 2 ? 4 : 3;
        }
        return new asao(i4, iArr[(i & 48) >> 4], String.valueOf(Math.abs(((i << 8) | i2) % 10)));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int childCount = getChildCount();
        if (childCount > 0) {
            int measuredWidth2 = getChildAt(0).getMeasuredWidth() * childCount;
            if (measuredWidth2 > measuredWidth) {
                int i3 = this.f108237d - ((measuredWidth2 - measuredWidth) / childCount);
                for (int i4 = 0; i4 < childCount; i4++) {
                    ViewGroup.LayoutParams layoutParams = getChildAt(i4).findViewById(16908294).getLayoutParams();
                    layoutParams.width = i3;
                    layoutParams.height = i3;
                }
                invalidate();
            }
        }
    }

    public ShapeVerificationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m92964a(context);
    }

    public ShapeVerificationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m92964a(context);
    }

    /* renamed from: a */
    private final void m92964a(Context context) {
        this.f108235b = context.getResources().getIntArray(C0126R.array.smartdevice_google_500_colors);
        Resources resources = getResources();
        this.f108237d = resources.getDimensionPixelSize(C0126R.dimen.smartdevice_verification_shape_size);
        this.f108238e = resources.getDimensionPixelSize(C0126R.dimen.smartdevice_verification_shape_padding);
    }
}
