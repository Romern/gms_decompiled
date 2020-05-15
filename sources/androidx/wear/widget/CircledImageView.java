package androidx.wear.widget;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CircledImageView extends View {

    /* renamed from: a */
    public int f1785a;

    /* renamed from: b */
    private final RectF f1786b;

    /* renamed from: c */
    private final Paint f1787c;

    /* renamed from: d */
    private final awa f1788d;

    /* renamed from: e */
    private final awc f1789e;

    /* renamed from: f */
    private final Drawable.Callback f1790f;

    /* renamed from: g */
    private ColorStateList f1791g;

    /* renamed from: h */
    private Drawable f1792h;

    /* renamed from: i */
    private float f1793i;

    /* renamed from: j */
    private float f1794j;

    /* renamed from: k */
    private float f1795k;

    /* renamed from: l */
    private float f1796l;

    /* renamed from: m */
    private float f1797m;

    /* renamed from: n */
    private int f1798n;

    /* renamed from: o */
    private Paint.Cap f1799o;

    /* renamed from: p */
    private float f1800p;

    /* renamed from: q */
    private float f1801q;

    /* renamed from: r */
    private boolean f1802r;

    /* renamed from: s */
    private float f1803s;

    /* renamed from: t */
    private float f1804t;

    /* renamed from: u */
    private Integer f1805u;

    /* renamed from: v */
    private Integer f1806v;

    static {
        new ArgbEvaluator();
    }

    public CircledImageView(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private final void m1718d() {
        int colorForState = this.f1791g.getColorForState(getDrawableState(), this.f1791g.getDefaultColor());
        if (colorForState != this.f1785a) {
            this.f1785a = colorForState;
            invalidate();
        }
    }

    /* renamed from: a */
    public final float mo2181a() {
        float f = this.f1793i;
        if (f <= 0.0f && this.f1794j > 0.0f) {
            f = ((float) Math.max(getMeasuredHeight(), getMeasuredWidth())) * this.f1794j;
        }
        return f - this.f1797m;
    }

    /* renamed from: b */
    public final float mo2182b() {
        float f = this.f1795k;
        if (f <= 0.0f && this.f1796l > 0.0f) {
            f = ((float) Math.max(getMeasuredHeight(), getMeasuredWidth())) * this.f1796l;
        }
        return f - this.f1797m;
    }

    /* renamed from: c */
    public final void mo2183c() {
        awc awc = this.f1789e;
        if (awc != null) {
            awc.f2414a.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m1718d();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        float a = !this.f1802r ? mo2181a() : mo2182b();
        getAlpha();
        if (this.f1800p > 0.0f) {
            this.f1786b.set((float) paddingLeft, (float) paddingTop, (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
            RectF rectF = this.f1786b;
            rectF.set(rectF.centerX() - a, this.f1786b.centerY() - a, this.f1786b.centerX() + a, this.f1786b.centerY() + a);
            this.f1787c.setColor(this.f1798n);
            Paint paint = this.f1787c;
            paint.setAlpha(Math.round(((float) paint.getAlpha()) * getAlpha()));
            this.f1787c.setStyle(Paint.Style.STROKE);
            this.f1787c.setStrokeWidth(this.f1800p);
            this.f1787c.setStrokeCap(this.f1799o);
            canvas.drawArc(this.f1786b, -90.0f, this.f1801q * 360.0f, false, this.f1787c);
        }
        this.f1786b.set((float) paddingLeft, (float) paddingTop, (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
        this.f1787c.setColor(this.f1785a);
        Paint paint2 = this.f1787c;
        paint2.setAlpha(Math.round(((float) paint2.getAlpha()) * getAlpha()));
        this.f1787c.setStyle(Paint.Style.FILL);
        canvas.drawCircle(this.f1786b.centerX(), this.f1786b.centerY(), a, this.f1787c);
        Drawable drawable = this.f1792h;
        if (drawable != null) {
            drawable.setAlpha(Math.round(getAlpha() * 255.0f));
            Integer num = this.f1805u;
            if (num != null) {
                this.f1792h.setTint(num.intValue());
            }
            this.f1792h.draw(canvas);
        }
        super.onDraw(canvas);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        Drawable drawable = this.f1792h;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f1792h.getIntrinsicHeight();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f3 = this.f1803s;
            if (f3 <= 0.0f) {
                f3 = 1.0f;
            }
            float f4 = (float) intrinsicWidth;
            if (f4 != 0.0f) {
                f = (((float) measuredWidth) * f3) / f4;
            } else {
                f = 1.0f;
            }
            float f5 = (float) intrinsicHeight;
            if (f5 != 0.0f) {
                f2 = (f3 * ((float) measuredHeight)) / f5;
            } else {
                f2 = 1.0f;
            }
            float min = Math.min(1.0f, Math.min(f, f2));
            int round = Math.round(f4 * min);
            int round2 = Math.round(min * f5);
            int round3 = ((measuredWidth - round) / 2) + Math.round(this.f1804t * ((float) round));
            int i5 = (measuredHeight - round2) / 2;
            this.f1792h.setBounds(round3, i5, round + round3, round2 + i5);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        float a = mo2181a();
        float f = this.f1800p;
        awa awa = this.f1788d;
        float f2 = awa.f2403a;
        float f3 = awa.f2404b;
        float f4 = a + f + (f2 * 0.0f);
        float f5 = f4 + f4;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? (int) Math.min(f5, (float) size) : (int) f5;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? (int) Math.min(f5, (float) size2) : (int) f5;
        }
        Integer num = this.f1806v;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                size = size2;
            } else if (intValue == 2) {
                size2 = size;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(size2, JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    /* access modifiers changed from: protected */
    public final boolean onSetAlpha(int i) {
        return true;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3 || i2 != i4) {
            this.f1788d.mo2737a(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        }
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        mo2183c();
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        mo2183c();
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        if (!(i == getPaddingLeft() && i2 == getPaddingTop() && i3 == getPaddingRight() && i4 == getPaddingBottom())) {
            this.f1788d.mo2737a(i, i2, getWidth() - i3, getHeight() - i4);
        }
        super.setPadding(i, i2, i3, i4);
    }

    public final void setPressed(boolean z) {
        super.setPressed(z);
        if (z != this.f1802r) {
            this.f1802r = z;
            awa awa = this.f1788d;
            awa.f2405c = !z ? mo2181a() : mo2182b();
            awa.mo2736a();
            invalidate();
        }
    }

    public CircledImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircledImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Rect();
        this.f1790f = new avy(this);
        this.f1801q = 1.0f;
        this.f1802r = false;
        this.f1803s = 1.0f;
        this.f1804t = 0.0f;
        new avz(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, avv.f2395b);
        C1280ps.m19886a(this, context, avv.f2395b, attributeSet, obtainStyledAttributes, 0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f1792h = drawable;
        if (!(drawable == null || drawable.getConstantState() == null)) {
            Drawable newDrawable = this.f1792h.getConstantState().newDrawable(context.getResources(), context.getTheme());
            this.f1792h = newDrawable;
            this.f1792h = newDrawable.mutate();
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(4);
        this.f1791g = colorStateList;
        if (colorStateList == null) {
            this.f1791g = ColorStateList.valueOf(context.getColor(17170432));
        }
        float dimension = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f1793i = dimension;
        this.f1795k = obtainStyledAttributes.getDimension(7, dimension);
        this.f1798n = obtainStyledAttributes.getColor(2, -16777216);
        this.f1799o = Paint.Cap.values()[obtainStyledAttributes.getInt(1, 0)];
        float dimension2 = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f1800p = dimension2;
        if (dimension2 > 0.0f) {
            this.f1797m += dimension2 / 2.0f;
        }
        float dimension3 = obtainStyledAttributes.getDimension(25, 0.0f);
        if (dimension3 > 0.0f) {
            this.f1797m += dimension3;
        }
        this.f1803s = obtainStyledAttributes.getFloat(23, 0.0f);
        this.f1804t = obtainStyledAttributes.getFloat(24, 0.0f);
        if (obtainStyledAttributes.hasValue(26)) {
            this.f1805u = Integer.valueOf(obtainStyledAttributes.getColor(26, 0));
        }
        if (obtainStyledAttributes.hasValue(19)) {
            this.f1806v = Integer.valueOf(obtainStyledAttributes.getInt(19, 0));
        }
        float fraction = obtainStyledAttributes.getFraction(6, 1, 1, 0.0f);
        this.f1794j = fraction;
        this.f1796l = obtainStyledAttributes.getFraction(8, 1, 1, fraction);
        float dimension4 = obtainStyledAttributes.getDimension(9, 0.0f);
        obtainStyledAttributes.recycle();
        this.f1786b = new RectF();
        Paint paint = new Paint();
        this.f1787c = paint;
        paint.setAntiAlias(true);
        this.f1788d = new awa(dimension4, mo2181a(), this.f1800p);
        awc awc = new awc();
        this.f1789e = awc;
        awc.setCallback(this.f1790f);
        setWillNotDraw(false);
        m1718d();
    }
}
