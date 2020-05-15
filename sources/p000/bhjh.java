package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Gravity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bhjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhjh extends LinearLayoutCompat {

    /* renamed from: a */
    protected boolean f118837a;

    /* renamed from: b */
    boolean f118838b;

    /* renamed from: c */
    private Drawable f118839c;

    /* renamed from: d */
    private final Rect f118840d;

    /* renamed from: e */
    private final Rect f118841e;

    /* renamed from: i */
    private int f118842i;

    public bhjh(Context context) {
        this(context, null);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f118839c;
        if (drawable != null) {
            if (this.f118838b) {
                this.f118838b = false;
                Rect rect = this.f118840d;
                Rect rect2 = this.f118841e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f118837a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f118842i, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f118839c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f118839c;
        if (drawable != null && drawable.isStateful()) {
            this.f118839c.setState(getDrawableState());
        }
    }

    public final Drawable getForeground() {
        return this.f118839c;
    }

    public final int getForegroundGravity() {
        return this.f118842i;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f118839c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f118838b = z | this.f118838b;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f118838b = true;
    }

    public final void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f118839c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f118839c);
            }
            this.f118839c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f118842i == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public final void setForegroundGravity(int i) {
        if (this.f118842i != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS) == 0) {
                i |= 48;
            }
            this.f118842i = i;
            if (i == 119 && this.f118839c != null) {
                this.f118839c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f118839c;
    }

    public bhjh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bhjh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f118840d = new Rect();
        this.f118841e = new Rect();
        this.f118842i = 119;
        this.f118837a = true;
        this.f118838b = false;
        TypedArray a = bhki.m101052a(context, attributeSet, bhjv.f118876b, i, 0, new int[0]);
        this.f118842i = a.getInt(1, this.f118842i);
        Drawable drawable = a.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f118837a = a.getBoolean(2, true);
        a.recycle();
    }
}
