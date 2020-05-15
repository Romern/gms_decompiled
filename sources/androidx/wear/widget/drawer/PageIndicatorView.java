package androidx.wear.widget.drawer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PageIndicatorView extends View implements avq {

    /* renamed from: a */
    public int f1816a;

    /* renamed from: b */
    public int f1817b;

    /* renamed from: c */
    public boolean f1818c;

    /* renamed from: d */
    private final Paint f1819d;

    /* renamed from: e */
    private final Paint f1820e;

    /* renamed from: f */
    private final Paint f1821f;

    /* renamed from: g */
    private final Paint f1822g;

    /* renamed from: h */
    private int f1823h;

    /* renamed from: i */
    private float f1824i;

    /* renamed from: j */
    private float f1825j;

    /* renamed from: k */
    private int f1826k;

    /* renamed from: l */
    private int f1827l;

    /* renamed from: m */
    private boolean f1828m;

    /* renamed from: n */
    private int f1829n;

    /* renamed from: o */
    private float f1830o;

    /* renamed from: p */
    private float f1831p;

    /* renamed from: q */
    private float f1832q;

    /* renamed from: r */
    private int f1833r;

    /* renamed from: s */
    private int f1834s;

    /* renamed from: t */
    private int f1835t;

    /* renamed from: u */
    private int f1836u;

    public PageIndicatorView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void m1723a(long j) {
        this.f1818c = false;
        animate().cancel();
        animate().alpha(0.0f).setStartDelay(j).setDuration((long) this.f1817b).start();
    }

    /* renamed from: b */
    public final void mo1836b(int i) {
        if (this.f1836u != i) {
            this.f1836u = i;
            if (this.f1828m && i == 0) {
                if (!this.f1818c) {
                    this.f1818c = true;
                    animate().cancel();
                    animate().alpha(1.0f).setStartDelay(0).setDuration((long) this.f1829n).setListener(new awl(this)).start();
                    return;
                }
                m1723a((long) this.f1816a);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1834s > 1) {
            int paddingLeft = getPaddingLeft();
            int i = this.f1823h;
            int height = getHeight();
            canvas.save();
            canvas.translate(((float) paddingLeft) + (((float) i) / 2.0f), ((float) height) / 2.0f);
            for (int i2 = 0; i2 < this.f1834s; i2++) {
                if (i2 == this.f1835t) {
                    canvas.drawCircle(this.f1830o, this.f1831p, this.f1825j + this.f1832q, this.f1822g);
                    canvas.drawCircle(0.0f, 0.0f, this.f1825j, this.f1821f);
                } else {
                    canvas.drawCircle(this.f1830o, this.f1831p, this.f1824i + this.f1832q, this.f1820e);
                    canvas.drawCircle(0.0f, 0.0f, this.f1824i, this.f1819d);
                }
                canvas.translate((float) this.f1823h, 0.0f);
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
            i3 = (this.f1834s * this.f1823h) + getPaddingLeft() + getPaddingRight();
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            i4 = View.MeasureSpec.getSize(i2);
        } else {
            float f = this.f1824i;
            float f2 = this.f1832q;
            float max = Math.max(f + f2, this.f1825j + f2);
            i4 = ((int) (((float) ((int) Math.ceil((double) (max + max)))) + this.f1831p)) + getPaddingTop() + getPaddingBottom();
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
    private static final void m1724a(Paint paint, Paint paint2, float f, float f2, int i, int i2) {
        float f3 = f + f2;
        paint2.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{i2, i2, 0}, new float[]{0.0f, f / f3, 1.0f}, Shader.TileMode.CLAMP));
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, avv.f2396c, i, C0126R.style.WsPageIndicatorViewStyle);
        this.f1823h = obtainStyledAttributes.getDimensionPixelOffset(25, 0);
        this.f1824i = obtainStyledAttributes.getDimension(19, 0.0f);
        this.f1825j = obtainStyledAttributes.getDimension(20, 0.0f);
        this.f1826k = obtainStyledAttributes.getColor(13, 0);
        this.f1827l = obtainStyledAttributes.getColor(14, 0);
        this.f1816a = obtainStyledAttributes.getInt(16, 0);
        this.f1817b = obtainStyledAttributes.getInt(17, 0);
        this.f1829n = obtainStyledAttributes.getInt(15, 0);
        this.f1828m = obtainStyledAttributes.getBoolean(18, false);
        this.f1830o = obtainStyledAttributes.getDimension(22, 0.0f);
        this.f1831p = obtainStyledAttributes.getDimension(23, 0.0f);
        this.f1832q = obtainStyledAttributes.getDimension(24, 0.0f);
        this.f1833r = obtainStyledAttributes.getColor(21, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f1819d = paint;
        paint.setColor(this.f1826k);
        this.f1819d.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f1821f = paint2;
        paint2.setColor(this.f1827l);
        this.f1821f.setStyle(Paint.Style.FILL);
        this.f1820e = new Paint(1);
        this.f1822g = new Paint(1);
        this.f1836u = 0;
        if (isInEditMode()) {
            this.f1834s = 5;
            this.f1835t = 2;
            this.f1828m = false;
        }
        if (this.f1828m) {
            this.f1818c = false;
            animate().alpha(0.0f).setStartDelay(2000).setDuration((long) this.f1817b).start();
        } else {
            animate().cancel();
            setAlpha(1.0f);
        }
        m1724a(this.f1819d, this.f1820e, this.f1824i, this.f1832q, this.f1826k, this.f1833r);
        m1724a(this.f1821f, this.f1822g, this.f1825j, this.f1832q, this.f1827l, this.f1833r);
    }

    /* renamed from: a */
    public final void mo1834a(int i) {
        if (i != this.f1835t) {
            this.f1835t = i;
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo1835a(int i, float f) {
        if (this.f1828m && this.f1836u == 1) {
            if (f == 0.0f) {
                if (this.f1818c) {
                    m1723a(0L);
                }
            } else if (!this.f1818c) {
                this.f1818c = true;
                animate().cancel();
                animate().alpha(1.0f).setStartDelay(0).setDuration((long) this.f1829n).start();
            }
        }
    }
}
