package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Illustration extends FrameLayout {

    /* renamed from: a */
    private float f7238a;

    /* renamed from: b */
    private Drawable f7239b;

    /* renamed from: c */
    private Drawable f7240c;

    /* renamed from: d */
    private final Rect f7241d = new Rect();

    /* renamed from: e */
    private final Rect f7242e = new Rect();

    /* renamed from: f */
    private float f7243f = 1.0f;

    /* renamed from: g */
    private float f7244g = 0.0f;

    public Illustration(Context context) {
        super(context);
        m4741a((AttributeSet) null, 0);
    }

    /* renamed from: a */
    private final void m4741a(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, blz.f5144k, i, 0);
            this.f7244g = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
        this.f7238a = getResources().getDisplayMetrics().density * 8.0f;
        setWillNotDraw(false);
    }

    public final void onDraw(Canvas canvas) {
        if (this.f7239b != null) {
            canvas.save();
            canvas.translate(0.0f, (float) this.f7242e.height());
            float f = this.f7243f;
            canvas.scale(f, f, 0.0f, 0.0f);
            int i = Build.VERSION.SDK_INT;
            if (m4742a(this.f7239b, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.f7239b.getBounds().width()), 0.0f);
            }
            this.f7239b.draw(canvas);
            canvas.restore();
        }
        if (this.f7240c != null) {
            canvas.save();
            int i2 = Build.VERSION.SDK_INT;
            if (m4742a(this.f7240c, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.f7242e.width()), 0.0f);
            }
            this.f7240c.draw(canvas);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        Drawable drawable = this.f7240c;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f7240c.getIntrinsicHeight();
            this.f7241d.set(0, 0, i5, i6);
            if (this.f7244g != 0.0f) {
                float f = ((float) i5) / ((float) intrinsicWidth);
                this.f7243f = f;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
                intrinsicWidth = i5;
            }
            Gravity.apply(55, intrinsicWidth, intrinsicHeight, this.f7241d, this.f7242e);
            this.f7240c.setBounds(this.f7242e);
        }
        Drawable drawable2 = this.f7239b;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, (int) Math.ceil((double) (((float) i5) / this.f7243f)), (int) Math.ceil((double) (((float) (i6 - this.f7242e.height())) / this.f7243f)));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f7244g != 0.0f) {
            float size = (float) ((int) (((float) View.MeasureSpec.getSize(i)) / this.f7244g));
            setPadding(0, (int) (size - (size % this.f7238a)), 0, 0);
        }
        int i3 = Build.VERSION.SDK_INT;
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        super.onMeasure(i, i2);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != this.f7239b) {
            this.f7239b = drawable;
            invalidate();
            requestLayout();
        }
    }

    @Deprecated
    public final void setForeground(Drawable drawable) {
        if (drawable != this.f7240c) {
            this.f7240c = drawable;
            invalidate();
            requestLayout();
        }
    }

    /* renamed from: a */
    private static final boolean m4742a(Drawable drawable, int i) {
        if (i != 1) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        return drawable.isAutoMirrored();
    }

    public Illustration(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4741a(attributeSet, 0);
    }

    public Illustration(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4741a(attributeSet, i);
    }
}
