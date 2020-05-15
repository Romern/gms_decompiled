package com.google.android.setupwizard.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupWizardIllustration extends FrameLayout {

    /* renamed from: a */
    public Drawable f151549a;

    /* renamed from: b */
    private float f151550b;

    /* renamed from: c */
    private Drawable f151551c;

    /* renamed from: d */
    private final Rect f151552d;

    /* renamed from: e */
    private final Rect f151553e;

    /* renamed from: f */
    private float f151554f;

    /* renamed from: g */
    private float f151555g;

    /* renamed from: h */
    private float f151556h;

    public SetupWizardIllustration(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void m117926a(int i, int i2, Rect rect, Rect rect2, int i3) {
        Gravity.apply(55, i, i2, rect, rect2, i3);
        this.f151554f = ((float) rect2.width()) / ((float) i);
        this.f151555g = ((float) rect2.height()) / ((float) i2);
    }

    public final void onDraw(Canvas canvas) {
        int layoutDirection = getLayoutDirection();
        if (this.f151551c != null) {
            canvas.save();
            canvas.translate(0.0f, (float) this.f151553e.height());
            canvas.scale(this.f151554f, this.f151555g, 0.0f, 0.0f);
            if (layoutDirection == 1 && this.f151551c.isAutoMirrored()) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.f151551c.getBounds().width()), 0.0f);
            }
            this.f151551c.draw(canvas);
            canvas.restore();
        }
        if (this.f151549a != null) {
            canvas.save();
            if (layoutDirection == 1 && this.f151549a.isAutoMirrored()) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.f151553e.width()), 0.0f);
            }
            this.f151549a.draw(canvas);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        Drawable drawable = this.f151549a;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f151549a.getIntrinsicHeight();
            int layoutDirection = getLayoutDirection();
            this.f151552d.set(0, 0, i5, i6);
            m117926a(intrinsicWidth, intrinsicHeight, this.f151552d, this.f151553e, layoutDirection);
            if (this.f151556h != 0.0f) {
                float f = this.f151554f;
                m117926a((int) (((float) intrinsicWidth) * f), (int) (((float) intrinsicHeight) * f), this.f151552d, this.f151553e, layoutDirection);
            }
            this.f151549a.setBounds(this.f151553e);
        }
        Drawable drawable2 = this.f151551c;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, (int) Math.ceil((double) (((float) i5) / this.f151554f)), (int) Math.ceil((double) (((float) (i6 - this.f151553e.height())) / this.f151555g)));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f151556h != 0.0f) {
            float size = (float) ((int) (((float) View.MeasureSpec.getSize(i)) / this.f151556h));
            setPadding(0, (int) (size - (size % this.f151550b)), 0, 0);
        }
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        super.onMeasure(i, i2);
    }

    public final void setBackground(Drawable drawable) {
        this.f151551c = drawable;
    }

    public final void setForeground(Drawable drawable) {
        this.f151549a = drawable;
    }

    public SetupWizardIllustration(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SetupWizardIllustration(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SetupWizardIllustration(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f151552d = new Rect();
        this.f151553e = new Rect();
        this.f151554f = 1.0f;
        this.f151555g = 1.0f;
        this.f151556h = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eoi.f15403o, 0, 0);
            this.f151556h = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
        this.f151550b = getResources().getDisplayMetrics().density * 8.0f;
        setWillNotDraw(false);
    }
}
