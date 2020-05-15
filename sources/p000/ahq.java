package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: ahq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahq extends Drawable {

    /* renamed from: a */
    public float f552a;

    /* renamed from: b */
    public float f553b;

    /* renamed from: c */
    public boolean f554c = false;

    /* renamed from: d */
    public boolean f555d = true;

    /* renamed from: e */
    public ColorStateList f556e;

    /* renamed from: f */
    private final Paint f557f;

    /* renamed from: g */
    private final RectF f558g;

    /* renamed from: h */
    private final Rect f559h;

    /* renamed from: i */
    private PorterDuffColorFilter f560i;

    /* renamed from: j */
    private ColorStateList f561j;

    /* renamed from: k */
    private PorterDuff.Mode f562k = PorterDuff.Mode.SRC_IN;

    public ahq(ColorStateList colorStateList, float f) {
        this.f552a = f;
        this.f557f = new Paint(5);
        mo712a(colorStateList);
        this.f558g = new RectF();
        this.f559h = new Rect();
    }

    /* renamed from: a */
    private final PorterDuffColorFilter m766a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void draw(Canvas canvas) {
        Paint paint = this.f557f;
        boolean z = false;
        if (this.f560i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f560i);
            z = true;
        }
        RectF rectF = this.f558g;
        float f = this.f552a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f559h, this.f552a);
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f561j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f556e;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo713a(rect);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f556e;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f557f.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f557f.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f561j;
        if (colorStateList2 == null || (mode = this.f562k) == null) {
            return z;
        }
        this.f560i = m766a(colorStateList2, mode);
        return true;
    }

    public final void setAlpha(int i) {
        this.f557f.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f557f.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f561j = colorStateList;
        this.f560i = m766a(colorStateList, this.f562k);
        invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f562k = mode;
        this.f560i = m766a(this.f561j, mode);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo712a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f556e = colorStateList;
        this.f557f.setColor(colorStateList.getColorForState(getState(), this.f556e.getDefaultColor()));
    }

    /* renamed from: a */
    public final void mo713a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f558g.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f559h.set(rect);
        if (this.f554c) {
            float a = ahr.m769a(this.f553b, this.f552a, this.f555d);
            this.f559h.inset((int) Math.ceil((double) ahr.m770b(this.f553b, this.f552a, this.f555d)), (int) Math.ceil((double) a));
            this.f558g.set(this.f559h);
        }
    }
}
