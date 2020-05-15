package com.google.android.gms.wallet.common.p079ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.cast.JGCastService;

/* renamed from: com.google.android.gms.wallet.common.ui.IndeterminateMultiColorSpinner */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IndeterminateMultiColorSpinner extends ViewGroup {

    /* renamed from: a */
    ImageView f110083a;

    /* renamed from: b */
    sox f110084b;

    /* renamed from: c */
    private int f110085c;

    /* renamed from: d */
    private int f110086d;

    public IndeterminateMultiColorSpinner(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void m93898a(int i) {
        if (i != 0) {
            i = 1;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i == 0) {
            int i2 = (int) (displayMetrics.density * 56.0f);
            this.f110085c = i2;
            this.f110086d = i2;
        } else {
            int i3 = (int) (displayMetrics.density * 40.0f);
            this.f110085c = i3;
            this.f110086d = i3;
        }
        this.f110083a.setImageDrawable(null);
        this.f110084b.mo25910a(i);
        this.f110083a.setImageDrawable(this.f110084b);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int measuredWidth2 = this.f110083a.getMeasuredWidth() / 2;
        int i6 = measuredHeight / 2;
        int measuredHeight2 = this.f110083a.getMeasuredHeight() / 2;
        this.f110083a.layout(i5 - measuredWidth2, i6 - measuredHeight2, i5 + measuredWidth2, i6 + measuredHeight2);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f110083a.measure(View.MeasureSpec.makeMeasureSpec(this.f110085c, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(this.f110086d, JGCastService.FLAG_PRIVATE_DISPLAY));
        setMeasuredDimension(this.f110085c + C1280ps.m19925i(this) + C1280ps.m19927j(this), this.f110086d + getPaddingTop() + getPaddingBottom());
    }

    public final void setVisibility(int i) {
        if (i == 0 && !this.f110084b.isRunning()) {
            this.f110084b.start();
        } else if (i != 0 && this.f110084b.isRunning()) {
            this.f110084b.stop();
        }
        super.setVisibility(i);
        this.f110083a.setVisibility(i);
    }

    public IndeterminateMultiColorSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766});
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        ImageView imageView = new ImageView(getContext());
        this.f110083a = imageView;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        sox sox = new sox(getContext(), this);
        this.f110084b = sox;
        sox.setAlpha(255);
        this.f110083a.setImageDrawable(this.f110084b);
        this.f110083a.setVisibility(8);
        addView(this.f110083a);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, eoi.f15396h);
        int i2 = obtainStyledAttributes2.getInt(2, 0);
        if (i2 == 0) {
            m93898a(1);
        } else if (i2 == 1) {
            m93898a(0);
        } else {
            throw new IllegalArgumentException("Unknown size for IndeterminateMulticolorSpinner");
        }
        int resourceId = obtainStyledAttributes2.getResourceId(1, -1);
        if (resourceId != -1) {
            mo59865a(context.getResources().getIntArray(resourceId));
        }
        int i3 = obtainStyledAttributes2.getInt(0, 0);
        if (i3 != 0) {
            if (i3 != 1) {
                i = 8;
            } else {
                i = 4;
            }
        }
        setVisibility(i);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void mo59865a(int... iArr) {
        this.f110084b.mo25911a(iArr);
    }
}
