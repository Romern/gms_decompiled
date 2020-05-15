package android.support.wearable.view.drawer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PageIndicatorView extends View implements avq {

    /* renamed from: a */
    public int f1440a;

    /* renamed from: b */
    public int f1441b;

    /* renamed from: c */
    public boolean f1442c;

    /* renamed from: d */
    private int f1443d;

    /* renamed from: e */
    private float f1444e;

    /* renamed from: f */
    private float f1445f;

    /* renamed from: g */
    private int f1446g;

    /* renamed from: h */
    private int f1447h;

    /* renamed from: i */
    private boolean f1448i;

    /* renamed from: j */
    private int f1449j;

    /* renamed from: k */
    private float f1450k;

    /* renamed from: l */
    private float f1451l;

    /* renamed from: m */
    private float f1452m;

    /* renamed from: n */
    private int f1453n;

    /* renamed from: o */
    private int f1454o;

    /* renamed from: p */
    private int f1455p;

    /* renamed from: q */
    private int f1456q;

    /* renamed from: r */
    private final Paint f1457r;

    /* renamed from: s */
    private final Paint f1458s;

    /* renamed from: t */
    private final Paint f1459t;

    /* renamed from: u */
    private final Paint f1460u;

    public PageIndicatorView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void m1445a(long j) {
        this.f1442c = false;
        animate().cancel();
        animate().alpha(0.0f).setStartDelay(j).setDuration((long) this.f1441b).start();
    }

    /* renamed from: b */
    public final void mo1836b(int i) {
        if (this.f1456q != i) {
            this.f1456q = i;
            if (this.f1448i && i == 0) {
                if (!this.f1442c) {
                    this.f1442c = true;
                    animate().cancel();
                    animate().alpha(1.0f).setStartDelay(0).setDuration((long) this.f1449j).setListener(new agc(this)).start();
                    return;
                }
                m1445a((long) this.f1440a);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1454o > 1) {
            int paddingLeft = getPaddingLeft();
            int i = this.f1443d;
            int height = getHeight();
            canvas.save();
            canvas.translate(((float) paddingLeft) + (((float) i) / 2.0f), ((float) height) / 2.0f);
            for (int i2 = 0; i2 < this.f1454o; i2++) {
                if (i2 == this.f1455p) {
                    canvas.drawCircle(this.f1450k, this.f1451l, this.f1445f + this.f1452m, this.f1460u);
                    canvas.drawCircle(0.0f, 0.0f, this.f1445f, this.f1459t);
                } else {
                    canvas.drawCircle(this.f1450k, this.f1451l, this.f1444e + this.f1452m, this.f1458s);
                    canvas.drawCircle(0.0f, 0.0f, this.f1444e, this.f1457r);
                }
                canvas.translate((float) this.f1443d, 0.0f);
            }
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.getSize(i);
        } else {
            i3 = (this.f1454o * this.f1443d) + getPaddingLeft() + getPaddingRight();
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            i4 = View.MeasureSpec.getSize(i2);
        } else {
            float f = this.f1444e;
            float f2 = this.f1452m;
            float max = Math.max(f + f2, this.f1445f + f2);
            i4 = ((int) (((float) ((int) Math.ceil((double) (max + max)))) + this.f1451l)) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(View.resolveSizeAndState(i3, i, 0), View.resolveSizeAndState(i4, i2, 0));
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.RadialGradient.<init>(float, float, float, int[], float[], android.graphics.Shader$TileMode):void}
     arg types: [int, int, float, int[], float[], android.graphics.Shader$TileMode]
     candidates:
      ClspMth{android.graphics.RadialGradient.<init>(float, float, float, long, long, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.RadialGradient.<init>(float, float, float, long[], float[], android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.RadialGradient.<init>(float, float, float, int, int, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.RadialGradient.<init>(float, float, float, int[], float[], android.graphics.Shader$TileMode):void} */
    /* renamed from: a */
    private static final void m1446a(Paint paint, Paint paint2, float f, float f2, int i, int i2) {
        float f3 = f + f2;
        paint2.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{i2, i2, 0}, new float[]{0.0f, f / f3, 1.0f}, Shader.TileMode.CLAMP));
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aem.f345f, i, C0126R.style.PageIndicatorViewStyle);
        this.f1443d = obtainStyledAttributes.getDimensionPixelOffset(12, 0);
        this.f1444e = obtainStyledAttributes.getDimension(6, 0.0f);
        this.f1445f = obtainStyledAttributes.getDimension(7, 0.0f);
        this.f1446g = obtainStyledAttributes.getColor(0, 0);
        this.f1447h = obtainStyledAttributes.getColor(1, 0);
        this.f1440a = obtainStyledAttributes.getInt(3, 0);
        this.f1441b = obtainStyledAttributes.getInt(4, 0);
        this.f1449j = obtainStyledAttributes.getInt(2, 0);
        this.f1448i = obtainStyledAttributes.getBoolean(5, false);
        this.f1450k = obtainStyledAttributes.getDimension(9, 0.0f);
        this.f1451l = obtainStyledAttributes.getDimension(10, 0.0f);
        this.f1452m = obtainStyledAttributes.getDimension(11, 0.0f);
        this.f1453n = obtainStyledAttributes.getColor(8, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f1457r = paint;
        paint.setColor(this.f1446g);
        this.f1457r.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f1459t = paint2;
        paint2.setColor(this.f1447h);
        this.f1459t.setStyle(Paint.Style.FILL);
        this.f1458s = new Paint(1);
        this.f1460u = new Paint(1);
        this.f1456q = 0;
        if (isInEditMode()) {
            this.f1454o = 5;
            this.f1455p = 2;
            this.f1448i = false;
        }
        if (this.f1448i) {
            this.f1442c = false;
            animate().alpha(0.0f).setStartDelay(2000).setDuration((long) this.f1441b).start();
        } else {
            animate().cancel();
            setAlpha(1.0f);
        }
        m1446a(this.f1457r, this.f1458s, this.f1444e, this.f1452m, this.f1446g, this.f1453n);
        m1446a(this.f1459t, this.f1460u, this.f1445f, this.f1452m, this.f1447h, this.f1453n);
    }

    /* renamed from: a */
    public final void mo1834a(int i) {
        if (i != this.f1455p) {
            this.f1455p = i;
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo1835a(int i, float f) {
        if (this.f1448i && this.f1456q == 1) {
            if (f == 0.0f) {
                if (this.f1442c) {
                    m1445a(0L);
                }
            } else if (!this.f1442c) {
                this.f1442c = true;
                animate().cancel();
                animate().alpha(1.0f).setStartDelay(0).setDuration((long) this.f1449j).start();
            }
        }
    }
}
