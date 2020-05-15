package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

@Deprecated
/* renamed from: afx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afx extends View {

    /* renamed from: f */
    public static final /* synthetic */ int f482f = 0;

    /* renamed from: g */
    private static final double f483g = Math.sqrt(2.0d);

    /* renamed from: a */
    public final ShapeDrawable f484a;

    /* renamed from: b */
    public ColorStateList f485b;

    /* renamed from: c */
    public Drawable f486c;

    /* renamed from: d */
    public int f487d;

    /* renamed from: e */
    public int f488e = 0;

    /* renamed from: h */
    private RippleDrawable f489h;

    /* renamed from: i */
    private final Interpolator f490i = new AccelerateInterpolator(2.0f);

    /* renamed from: a */
    private final void m725a(Animator animator) {
        animator.setInterpolator(this.f490i);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.f485b;
        if (colorStateList != null && colorStateList.isStateful()) {
            this.f484a.getPaint().setColor(this.f485b.getColorForState(getDrawableState(), this.f485b.getDefaultColor()));
            this.f484a.invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f486c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        int i7 = i3 - i;
        int i8 = i4 - i2;
        Drawable drawable = this.f486c;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f486c.getIntrinsicHeight();
            if (this.f488e == 0 || !m726a(this.f486c)) {
                double d = (double) (this.f487d / 2);
                double d2 = f483g;
                Double.isNaN(d);
                int floor = (int) Math.floor(d * d2);
                int i9 = (this.f487d - floor) / 2;
                if (!m726a(this.f486c)) {
                    int i10 = floor + i9;
                    this.f486c.setBounds(i9, i9, i10, i10);
                    return;
                }
                if (intrinsicWidth != intrinsicHeight) {
                    float f = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                    if (intrinsicWidth <= intrinsicHeight) {
                        int i11 = (int) (((float) floor) * f);
                        floor = i11;
                        i6 = floor;
                        i9 = (int) (((float) (floor - i11)) / 2.0f);
                        i5 = i9;
                    } else {
                        i6 = (int) (((float) floor) / f);
                        i5 = (int) (((float) (floor - i6)) / 2.0f);
                    }
                } else {
                    i6 = floor;
                    i5 = i9;
                }
                this.f486c.setBounds(i9, i5, floor + i9, i6 + i5);
                return;
            }
            int i12 = (int) (((float) (i7 - intrinsicWidth)) / 2.0f);
            int i13 = (int) (((float) (i8 - intrinsicHeight)) / 2.0f);
            this.f486c.setBounds(i12, i13, intrinsicWidth + i12, intrinsicHeight + i13);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            size = Math.min(size, size2);
            this.f487d = size;
        } else if (mode == 1073741824) {
            this.f487d = size;
        } else if (mode2 != 1073741824) {
            if (!m726a(this.f486c)) {
                i3 = (int) Math.ceil((double) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
            } else {
                i3 = Math.max(this.f486c.getIntrinsicHeight(), this.f486c.getIntrinsicWidth());
            }
            if (mode == Integer.MIN_VALUE || mode2 == Integer.MIN_VALUE) {
                if (mode != Integer.MIN_VALUE) {
                    size = size2;
                } else if (mode2 == Integer.MIN_VALUE) {
                    size = Math.min(size, size2);
                }
                double d = (double) i3;
                double d2 = f483g;
                Double.isNaN(d);
                int floor = (int) Math.floor(d / d2);
                size = Math.min(size, floor + floor);
                this.f487d = size;
            } else {
                this.f487d = i3;
                size = i3;
            }
        } else {
            this.f487d = size2;
            size = size2;
        }
        setMeasuredDimension(size, size);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!onTouchEvent || (motionEvent.getAction() & 255) != 0) {
            return onTouchEvent;
        }
        getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return this.f486c == drawable || super.verifyDrawable(drawable);
    }

    public afx(Context context) {
        super(context, null, 0, 0);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.f484a = shapeDrawable;
        shapeDrawable.getPaint().setColor(-3355444);
        super.setBackgroundDrawable(this.f484a);
        setOutlineProvider(new afw(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, aem.f343d, 0, 0);
        boolean z = true;
        for (int i = 0; i < obtainStyledAttributes.getIndexCount(); i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 2) {
                this.f485b = obtainStyledAttributes.getColorStateList(2);
                this.f484a.getPaint().setColor(this.f485b.getDefaultColor());
            } else if (index == 1) {
                this.f486c = obtainStyledAttributes.getDrawable(1);
            } else if (index == 5) {
                mo625a(obtainStyledAttributes.getColor(5, -1));
            } else if (index == 7) {
                mo624a(obtainStyledAttributes.getDimension(7, 0.0f));
            } else if (index == 6) {
                this.f488e = obtainStyledAttributes.getInt(6, this.f488e);
            } else if (index == 0) {
                z = obtainStyledAttributes.getBoolean(0, z);
            }
        }
        obtainStyledAttributes.recycle();
        setClickable(z);
    }

    /* renamed from: a */
    private static boolean m726a(Drawable drawable) {
        return drawable != null && drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0;
    }

    /* renamed from: a */
    public final void mo624a(float f) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        int[] iArr = PRESSED_ENABLED_STATE_SET;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationZ", f);
        m725a(ofFloat);
        stateListAnimator.addState(iArr, ofFloat);
        int[] iArr2 = ENABLED_FOCUSED_STATE_SET;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "translationZ", f);
        m725a(ofFloat2);
        stateListAnimator.addState(iArr2, ofFloat2);
        int[] iArr3 = EMPTY_STATE_SET;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "translationZ", getElevation());
        m725a(ofFloat3);
        stateListAnimator.addState(iArr3, ofFloat3);
        setStateListAnimator(stateListAnimator);
    }

    /* renamed from: a */
    public final void mo625a(int i) {
        RippleDrawable rippleDrawable = this.f489h;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(ColorStateList.valueOf(i));
        } else if (i != -1 && !isInEditMode()) {
            ColorStateList valueOf = ColorStateList.valueOf(i);
            ShapeDrawable shapeDrawable = this.f484a;
            RippleDrawable rippleDrawable2 = new RippleDrawable(valueOf, shapeDrawable, shapeDrawable);
            this.f489h = rippleDrawable2;
            super.setBackgroundDrawable(rippleDrawable2);
        } else {
            this.f489h = null;
            super.setBackgroundDrawable(this.f484a);
        }
    }
}
