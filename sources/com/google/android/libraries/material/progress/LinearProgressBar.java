package com.google.android.libraries.material.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LinearProgressBar extends ProgressBar {

    /* renamed from: a */
    private int f111307a;

    /* renamed from: b */
    private int f111308b;

    private LinearProgressBar(Context context) {
        super(context, null, 16842872);
        super.getProgress();
    }

    /* renamed from: a */
    private final void m94776a(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, azzi.f100318a, i, 2132019339);
        this.f111307a = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f111308b = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        int i4 = obtainStyledAttributes.getInt(3, 1);
        if (obtainStyledAttributes.hasValue(0)) {
            i2 = obtainStyledAttributes.getColor(0, -1);
        } else {
            i2 = getResources().getColor(C0126R.color.quantum_googblue);
        }
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes2.getFloat(0, 0.2f);
        obtainStyledAttributes2.recycle();
        int i5 = obtainStyledAttributes.getInt(6, 0);
        if (i5 == 0) {
            i3 = 0;
        } else if (i5 == 1) {
            i3 = 1;
        } else if (i5 == 2) {
            i3 = 2;
        } else {
            StringBuilder sb = new StringBuilder(59);
            sb.append("Invalid attribute value for mtrlLinearGrowFrom: ");
            sb.append(i5);
            throw new IllegalArgumentException(sb.toString());
        }
        int i6 = this.f111307a;
        if (i4 == 2) {
            z = true;
        } else {
            z = false;
        }
        setIndeterminateDrawable(new azzg(i6, i2, -1, f, z, i3));
        setProgressDrawable(new azzc(this.f111307a, i2, -1, f, i3));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    private final void m94777c() {
        setMinimumHeight(this.f111307a);
        boolean isIndeterminate = isIndeterminate();
        boolean z = !isIndeterminate;
        getProgressDrawable().setVisible(z, z);
        getIndeterminateDrawable().setVisible(isIndeterminate, isIndeterminate);
    }

    /* renamed from: d */
    private final Drawable m94778d() {
        return !isIndeterminate() ? getProgressDrawable() : getIndeterminateDrawable();
    }

    /* renamed from: b */
    public final azzc getProgressDrawable() {
        return (azzc) super.getProgressDrawable();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            m94778d().setVisible(true, false);
            setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        ((azys) m94778d()).mo55413a();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        m94778d().draw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int i3 = this.f111307a;
        int i4 = this.f111308b;
        setMeasuredDimension(measuredWidth, resolveSizeAndState(i3 + i4 + i4 + getPaddingTop() + getPaddingBottom(), i2, 0));
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        getIndeterminateDrawable().setBounds(0, 0, paddingLeft, paddingTop);
        getProgressDrawable().setBounds(0, 0, paddingLeft, paddingTop);
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m94778d().setVisible(i == 0, true);
    }

    public LinearProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.getProgress();
        m94776a(context, attributeSet, 0);
        m94777c();
    }

    public LinearProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.getProgress();
        m94776a(context, attributeSet, i);
        m94777c();
    }

    /* renamed from: a */
    public final azzg getIndeterminateDrawable() {
        return (azzg) super.getIndeterminateDrawable();
    }
}
