package com.google.android.setupdesign.view;

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

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Illustration extends FrameLayout {

    /* renamed from: a */
    public float f151524a = 0.0f;

    /* renamed from: b */
    private float f151525b;

    /* renamed from: c */
    private Drawable f151526c;

    /* renamed from: d */
    private Drawable f151527d;

    /* renamed from: e */
    private final Rect f151528e = new Rect();

    /* renamed from: f */
    private final Rect f151529f = new Rect();

    /* renamed from: g */
    private float f151530g = 1.0f;

    public Illustration(Context context) {
        super(context);
        m117912a((AttributeSet) null, 0);
    }

    /* renamed from: a */
    private final void m117912a(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bizg.f122376j, i, 0);
            this.f151524a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
        this.f151525b = getResources().getDisplayMetrics().density * 8.0f;
        setWillNotDraw(false);
    }

    public final void onDraw(Canvas canvas) {
        if (this.f151526c != null) {
            canvas.save();
            canvas.translate(0.0f, (float) this.f151529f.height());
            float f = this.f151530g;
            canvas.scale(f, f, 0.0f, 0.0f);
            int i = Build.VERSION.SDK_INT;
            if (m117913a(this.f151526c, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.f151526c.getBounds().width()), 0.0f);
            }
            this.f151526c.draw(canvas);
            canvas.restore();
        }
        if (this.f151527d != null) {
            canvas.save();
            int i2 = Build.VERSION.SDK_INT;
            if (m117913a(this.f151527d, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.f151529f.width()), 0.0f);
            }
            this.f151527d.draw(canvas);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        Drawable drawable = this.f151527d;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f151527d.getIntrinsicHeight();
            this.f151528e.set(0, 0, i5, i6);
            if (this.f151524a != 0.0f) {
                float f = ((float) i5) / ((float) intrinsicWidth);
                this.f151530g = f;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
                intrinsicWidth = i5;
            }
            Gravity.apply(55, intrinsicWidth, intrinsicHeight, this.f151528e, this.f151529f);
            this.f151527d.setBounds(this.f151529f);
        }
        Drawable drawable2 = this.f151526c;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, (int) Math.ceil((double) (((float) i5) / this.f151530g)), (int) Math.ceil((double) (((float) (i6 - this.f151529f.height())) / this.f151530g)));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f151524a != 0.0f) {
            float size = (float) ((int) (((float) View.MeasureSpec.getSize(i)) / this.f151524a));
            setPadding(0, (int) (size - (size % this.f151525b)), 0, 0);
        }
        int i3 = Build.VERSION.SDK_INT;
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        super.onMeasure(i, i2);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != this.f151526c) {
            this.f151526c = drawable;
            invalidate();
            requestLayout();
        }
    }

    @Deprecated
    public final void setForeground(Drawable drawable) {
        mo71415a(drawable);
    }

    /* renamed from: a */
    private static final boolean m117913a(Drawable drawable, int i) {
        if (i != 1) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        return drawable.isAutoMirrored();
    }

    public Illustration(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m117912a(attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo71415a(Drawable drawable) {
        if (drawable != this.f151527d) {
            this.f151527d = drawable;
            invalidate();
            requestLayout();
        }
    }

    public Illustration(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m117912a(attributeSet, i);
    }
}
