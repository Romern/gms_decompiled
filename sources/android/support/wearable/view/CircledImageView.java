package android.support.wearable.view;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.cast.JGCastService;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CircledImageView extends View {

    /* renamed from: a */
    final RectF f1418a;

    /* renamed from: b */
    public int f1419b;

    /* renamed from: c */
    private final Paint f1420c;

    /* renamed from: d */
    private final afv f1421d;

    /* renamed from: e */
    private ColorStateList f1422e;

    /* renamed from: f */
    private Drawable f1423f;

    /* renamed from: g */
    private float f1424g;

    /* renamed from: h */
    private float f1425h;

    /* renamed from: i */
    private float f1426i;

    /* renamed from: j */
    private float f1427j;

    /* renamed from: k */
    private float f1428k;

    /* renamed from: l */
    private int f1429l;

    /* renamed from: m */
    private Paint.Cap f1430m;

    /* renamed from: n */
    private float f1431n;

    /* renamed from: o */
    private float f1432o;

    /* renamed from: p */
    private boolean f1433p;

    /* renamed from: q */
    private final aga f1434q;

    /* renamed from: r */
    private float f1435r;

    /* renamed from: s */
    private float f1436s;

    /* renamed from: t */
    private Integer f1437t;

    /* renamed from: u */
    private Integer f1438u;

    /* renamed from: v */
    private final Drawable.Callback f1439v;

    static {
        new ArgbEvaluator();
    }

    public CircledImageView(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private final void m1441d() {
        int colorForState = this.f1422e.getColorForState(getDrawableState(), this.f1422e.getDefaultColor());
        if (colorForState != this.f1419b) {
            this.f1419b = colorForState;
            invalidate();
        }
    }

    /* renamed from: a */
    public final float mo1821a() {
        float f = this.f1424g;
        if (f <= 0.0f && this.f1425h > 0.0f) {
            f = ((float) Math.max(getMeasuredHeight(), getMeasuredWidth())) * this.f1425h;
        }
        return f - this.f1428k;
    }

    /* renamed from: b */
    public final float mo1822b() {
        float f = this.f1426i;
        if (f <= 0.0f && this.f1427j > 0.0f) {
            f = ((float) Math.max(getMeasuredHeight(), getMeasuredWidth())) * this.f1427j;
        }
        return f - this.f1428k;
    }

    /* renamed from: c */
    public final void mo1823c() {
        aga aga = this.f1434q;
        if (aga != null) {
            aga.f496a.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m1441d();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        float a = !this.f1433p ? mo1821a() : mo1822b();
        getAlpha();
        this.f1418a.set((float) paddingLeft, (float) paddingTop, (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
        RectF rectF = this.f1418a;
        rectF.set(rectF.centerX() - a, this.f1418a.centerY() - a, this.f1418a.centerX() + a, this.f1418a.centerY() + a);
        if (this.f1431n > 0.0f) {
            this.f1420c.setColor(this.f1429l);
            Paint paint = this.f1420c;
            paint.setAlpha(Math.round(((float) paint.getAlpha()) * getAlpha()));
            this.f1420c.setStyle(Paint.Style.STROKE);
            this.f1420c.setStrokeWidth(this.f1431n);
            this.f1420c.setStrokeCap(this.f1430m);
            canvas.drawArc(this.f1418a, -90.0f, this.f1432o * 360.0f, false, this.f1420c);
        }
        this.f1420c.setColor(this.f1419b);
        Paint paint2 = this.f1420c;
        paint2.setAlpha(Math.round(((float) paint2.getAlpha()) * getAlpha()));
        this.f1420c.setStyle(Paint.Style.FILL);
        canvas.drawCircle(this.f1418a.centerX(), this.f1418a.centerY(), a, this.f1420c);
        Drawable drawable = this.f1423f;
        if (drawable != null) {
            drawable.setAlpha(Math.round(getAlpha() * 255.0f));
            Integer num = this.f1437t;
            if (num != null) {
                this.f1423f.setTint(num.intValue());
            }
            this.f1423f.draw(canvas);
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
        Drawable drawable = this.f1423f;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f1423f.getIntrinsicHeight();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f3 = this.f1435r;
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
            int round3 = ((measuredWidth - round) / 2) + Math.round(this.f1436s * ((float) round));
            int i5 = (measuredHeight - round2) / 2;
            this.f1423f.setBounds(round3, i5, round + round3, round2 + i5);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        float a = mo1821a();
        float f = this.f1431n;
        afv afv = this.f1421d;
        float f2 = afv.f472a;
        float f3 = afv.f473b;
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
        Integer num = this.f1438u;
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
            this.f1421d.mo622a(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        }
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        mo1823c();
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        mo1823c();
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        if (!(i == getPaddingLeft() && i2 == getPaddingTop() && i3 == getPaddingRight() && i4 == getPaddingBottom())) {
            this.f1421d.mo622a(i, i2, getWidth() - i3, getHeight() - i4);
        }
        super.setPadding(i, i2, i3, i4);
    }

    public final void setPressed(boolean z) {
        super.setPressed(z);
        if (z != this.f1433p) {
            this.f1433p = z;
            afv afv = this.f1421d;
            afv.f474c = !z ? mo1821a() : mo1822b();
            afv.mo621a();
            invalidate();
        }
    }

    public CircledImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircledImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Rect();
        this.f1432o = 1.0f;
        this.f1433p = false;
        this.f1435r = 1.0f;
        this.f1436s = 0.0f;
        this.f1439v = new aft(this);
        new afu(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aem.f342c);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f1423f = drawable;
        if (!(drawable == null || drawable.getConstantState() == null)) {
            int i2 = Build.VERSION.SDK_INT;
            Drawable newDrawable = this.f1423f.getConstantState().newDrawable(context.getResources(), context.getTheme());
            this.f1423f = newDrawable;
            this.f1423f = newDrawable.mutate();
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(13);
        this.f1422e = colorStateList;
        if (colorStateList == null) {
            this.f1422e = ColorStateList.valueOf(17170432);
        }
        float dimension = obtainStyledAttributes.getDimension(15, 0.0f);
        this.f1424g = dimension;
        this.f1426i = obtainStyledAttributes.getDimension(17, dimension);
        this.f1429l = obtainStyledAttributes.getColor(11, -16777216);
        this.f1430m = Paint.Cap.values()[obtainStyledAttributes.getInt(10, 0)];
        float dimension2 = obtainStyledAttributes.getDimension(12, 0.0f);
        this.f1431n = dimension2;
        if (dimension2 > 0.0f) {
            this.f1428k += dimension2 / 2.0f;
        }
        float dimension3 = obtainStyledAttributes.getDimension(14, 0.0f);
        if (dimension3 > 0.0f) {
            this.f1428k += dimension3;
        }
        this.f1435r = obtainStyledAttributes.getFloat(20, 0.0f);
        this.f1436s = obtainStyledAttributes.getFloat(21, 0.0f);
        if (obtainStyledAttributes.hasValue(22)) {
            this.f1437t = Integer.valueOf(obtainStyledAttributes.getColor(22, 0));
        }
        if (obtainStyledAttributes.hasValue(28)) {
            this.f1438u = Integer.valueOf(obtainStyledAttributes.getInt(28, 0));
        }
        float fraction = obtainStyledAttributes.getFraction(16, 1, 1, 0.0f);
        this.f1425h = fraction;
        this.f1427j = obtainStyledAttributes.getFraction(18, 1, 1, fraction);
        float dimension4 = obtainStyledAttributes.getDimension(27, 0.0f);
        obtainStyledAttributes.recycle();
        this.f1418a = new RectF();
        Paint paint = new Paint();
        this.f1420c = paint;
        paint.setAntiAlias(true);
        this.f1421d = new afv(dimension4, mo1821a(), this.f1431n);
        aga aga = new aga();
        this.f1434q = aga;
        aga.setCallback(this.f1439v);
        setWillNotDraw(false);
        m1441d();
    }
}
