package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: azxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azxf extends Drawable {

    /* renamed from: a */
    private final Drawable f100164a;

    /* renamed from: b */
    private final Drawable f100165b;

    /* renamed from: c */
    private final float[] f100166c = new float[2];

    /* renamed from: d */
    private float f100167d;

    public azxf(Drawable drawable, Drawable drawable2) {
        this.f100164a = drawable.getConstantState().newDrawable().mutate();
        Drawable mutate = drawable2.getConstantState().newDrawable().mutate();
        this.f100165b = mutate;
        mutate.setAlpha(0);
    }

    /* renamed from: a */
    public final void mo55356a(float f) {
        if (this.f100167d != f) {
            this.f100167d = f;
            azxh.m86326a(f, this.f100166c);
            this.f100164a.setAlpha((int) (this.f100166c[0] * 255.0f));
            this.f100165b.setAlpha((int) (this.f100166c[1] * 255.0f));
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        this.f100164a.draw(canvas);
        this.f100165b.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.f100164a.getIntrinsicHeight(), this.f100165b.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.f100164a.getIntrinsicWidth(), this.f100165b.getIntrinsicWidth());
    }

    public final int getMinimumHeight() {
        return Math.max(this.f100164a.getMinimumHeight(), this.f100165b.getMinimumHeight());
    }

    public final int getMinimumWidth() {
        return Math.max(this.f100164a.getMinimumWidth(), this.f100165b.getMinimumWidth());
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return this.f100164a.isStateful() || this.f100165b.isStateful();
    }

    public final void setAlpha(int i) {
        if (this.f100167d <= 0.5f) {
            this.f100164a.setAlpha(i);
            this.f100165b.setAlpha(0);
        } else {
            this.f100164a.setAlpha(0);
            this.f100165b.setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f100164a.setBounds(i, i2, i3, i4);
        this.f100165b.setBounds(i, i2, i3, i4);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f100164a.setColorFilter(colorFilter);
        this.f100165b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setState(int[] iArr) {
        return this.f100164a.setState(iArr) || this.f100165b.setState(iArr);
    }
}
