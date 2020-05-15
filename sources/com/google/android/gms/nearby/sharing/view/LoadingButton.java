package com.google.android.gms.nearby.sharing.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoadingButton extends AppCompatButton {

    /* renamed from: c */
    private int f81149c;

    /* renamed from: d */
    private boolean f81150d = false;

    /* renamed from: e */
    private boolean f81151e = false;

    /* renamed from: f */
    private ajwt f81152f;

    public LoadingButton(Context context) {
        super(context);
        m67623a(context);
    }

    /* renamed from: a */
    private final void m67623a(Context context) {
        this.f81149c = getCurrentTextColor();
        ajwt ajwt = new ajwt(context);
        this.f81152f = ajwt;
        ajwt.setCallback(this);
    }

    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f81150d) {
            this.f81152f.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        double min = (double) Math.min(measuredWidth, measuredHeight);
        Double.isNaN(min);
        int i3 = (int) (min * 0.7d);
        int i4 = i3 / 2;
        int paddingLeft = (getPaddingLeft() + (measuredWidth / 2)) - i4;
        int paddingTop = (getPaddingTop() + (measuredHeight / 2)) - i4;
        this.f81152f.setBounds(paddingLeft, paddingTop, paddingLeft + i3, i3 + paddingTop);
    }

    public final void setTextColor(int i) {
        if (this.f81151e) {
            this.f81149c = i;
        }
        if (this.f81150d) {
            i = 1193046;
        }
        super.setTextColor(i);
    }

    public LoadingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m67623a(context);
    }

    /* renamed from: a */
    public final void mo44654a(boolean z) {
        int i;
        this.f81150d = z;
        this.f81151e = false;
        if (!z) {
            i = this.f81149c;
        } else {
            i = 1193046;
        }
        setTextColor(i);
        this.f81151e = true;
        setEnabled(true ^ this.f81150d);
        if (!this.f81150d) {
            ajwt ajwt = this.f81152f;
            ValueAnimator valueAnimator = ajwt.f71460b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                ajwt.f71460b = null;
            }
            ajwt.invalidateSelf();
        } else {
            ajwt ajwt2 = this.f81152f;
            ajwt2.f71460b = ValueAnimator.ofInt(0, 10000);
            ajwt2.f71460b.setDuration(3000L);
            ajwt2.f71460b.setInterpolator(new LinearInterpolator());
            ajwt2.f71460b.addUpdateListener(new ajws(ajwt2));
            ajwt2.f71460b.setRepeatCount(-1);
            ajwt2.f71460b.start();
        }
        invalidate();
    }

    public LoadingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67623a(context);
    }
}
