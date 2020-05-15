package p000;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bhje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhje {

    /* renamed from: A */
    private bhkw f118783A;

    /* renamed from: B */
    private bhkw f118784B;

    /* renamed from: C */
    private CharSequence f118785C;

    /* renamed from: D */
    private float f118786D;

    /* renamed from: E */
    private float f118787E;

    /* renamed from: F */
    private int[] f118788F;

    /* renamed from: G */
    private boolean f118789G;

    /* renamed from: H */
    private final TextPaint f118790H;

    /* renamed from: I */
    private TimeInterpolator f118791I;

    /* renamed from: J */
    private float f118792J;

    /* renamed from: K */
    private float f118793K;

    /* renamed from: L */
    private float f118794L;

    /* renamed from: M */
    private ColorStateList f118795M;

    /* renamed from: N */
    private float f118796N;

    /* renamed from: O */
    private float f118797O;

    /* renamed from: P */
    private float f118798P;

    /* renamed from: Q */
    private ColorStateList f118799Q;

    /* renamed from: R */
    private StaticLayout f118800R;

    /* renamed from: S */
    private float f118801S;

    /* renamed from: T */
    private float f118802T;

    /* renamed from: U */
    private float f118803U;

    /* renamed from: V */
    private CharSequence f118804V;

    /* renamed from: a */
    public float f118805a;

    /* renamed from: b */
    public final Rect f118806b;

    /* renamed from: c */
    public float f118807c = 15.0f;

    /* renamed from: d */
    public ColorStateList f118808d;

    /* renamed from: e */
    public Typeface f118809e;

    /* renamed from: f */
    public CharSequence f118810f;

    /* renamed from: g */
    public boolean f118811g;

    /* renamed from: h */
    public final TextPaint f118812h;

    /* renamed from: i */
    public TimeInterpolator f118813i;

    /* renamed from: j */
    public int f118814j = 1;

    /* renamed from: k */
    private final View f118815k;

    /* renamed from: l */
    private boolean f118816l;

    /* renamed from: m */
    private final Rect f118817m;

    /* renamed from: n */
    private final RectF f118818n;

    /* renamed from: o */
    private int f118819o = 16;

    /* renamed from: p */
    private int f118820p = 16;

    /* renamed from: q */
    private float f118821q = 15.0f;

    /* renamed from: r */
    private ColorStateList f118822r;

    /* renamed from: s */
    private float f118823s;

    /* renamed from: t */
    private float f118824t;

    /* renamed from: u */
    private float f118825u;

    /* renamed from: v */
    private float f118826v;

    /* renamed from: w */
    private float f118827w;

    /* renamed from: x */
    private float f118828x;

    /* renamed from: y */
    private Typeface f118829y;

    /* renamed from: z */
    private Typeface f118830z;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public bhje(View view) {
        this.f118815k = view;
        this.f118790H = new TextPaint(129);
        this.f118812h = new TextPaint(this.f118790H);
        this.f118806b = new Rect();
        this.f118817m = new Rect();
        this.f118818n = new RectF();
    }

    /* renamed from: a */
    private static float m100976a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return bhdl.m100675a(f, f2, f3);
    }

    /* renamed from: c */
    private final int m100981c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f118788F;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: d */
    private final void m100983d(float f) {
        float f2;
        boolean z;
        boolean z2;
        int i;
        StaticLayout staticLayout;
        TextDirectionHeuristic textDirectionHeuristic;
        boolean z3;
        boolean z4;
        if (this.f118810f != null) {
            float width = (float) this.f118806b.width();
            float width2 = (float) this.f118817m.width();
            if (m100979a(f, this.f118821q)) {
                f2 = this.f118821q;
                this.f118786D = 1.0f;
                Typeface typeface = this.f118830z;
                Typeface typeface2 = this.f118829y;
                if (typeface != typeface2) {
                    this.f118830z = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.f118807c;
                Typeface typeface3 = this.f118830z;
                Typeface typeface4 = this.f118809e;
                if (typeface3 != typeface4) {
                    this.f118830z = typeface4;
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!m100979a(f, f3)) {
                    this.f118786D = f / this.f118807c;
                } else {
                    this.f118786D = 1.0f;
                }
                float f4 = this.f118821q / this.f118807c;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                f2 = f3;
                z = z4;
            }
            if (width > 0.0f) {
                if (this.f118787E == f2) {
                    if (this.f118789G) {
                        z3 = true;
                    } else if (!z) {
                        z3 = false;
                    }
                    this.f118787E = f2;
                    this.f118789G = false;
                }
                z3 = true;
                this.f118787E = f2;
                this.f118789G = false;
            }
            if (this.f118785C == null || z) {
                this.f118790H.setTextSize(this.f118787E);
                this.f118790H.setTypeface(this.f118830z);
                TextPaint textPaint = this.f118790H;
                if (this.f118786D != 1.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                textPaint.setLinearText(z2);
                this.f118811g = mo63853a(this.f118810f);
                if (m100985g()) {
                    i = this.f118814j;
                } else {
                    i = 1;
                }
                boolean z5 = this.f118811g;
                try {
                    bhkc bhkc = new bhkc(this.f118810f, this.f118790H, (int) width);
                    bhkc.f118900i = TextUtils.TruncateAt.END;
                    bhkc.f118899h = z5;
                    bhkc.f118896e = Layout.Alignment.ALIGN_NORMAL;
                    bhkc.f118898g = false;
                    bhkc.f118897f = i;
                    if (bhkc.f118892a == null) {
                        bhkc.f118892a = "";
                    }
                    int max = Math.max(0, bhkc.f118894c);
                    CharSequence charSequence = bhkc.f118892a;
                    if (bhkc.f118897f == 1) {
                        charSequence = TextUtils.ellipsize(charSequence, bhkc.f118893b, (float) max, bhkc.f118900i);
                    }
                    bhkc.f118895d = Math.min(charSequence.length(), bhkc.f118895d);
                    int i2 = Build.VERSION.SDK_INT;
                    if (bhkc.f118899h) {
                        bhkc.f118896e = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                    StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, bhkc.f118895d, bhkc.f118893b, max);
                    obtain.setAlignment(bhkc.f118896e);
                    obtain.setIncludePad(bhkc.f118898g);
                    if (bhkc.f118899h) {
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    }
                    obtain.setTextDirection(textDirectionHeuristic);
                    TextUtils.TruncateAt truncateAt = bhkc.f118900i;
                    if (truncateAt != null) {
                        obtain.setEllipsize(truncateAt);
                    }
                    obtain.setMaxLines(bhkc.f118897f);
                    staticLayout = obtain.build();
                } catch (bhkb e) {
                    Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                    staticLayout = null;
                }
                C1244oj.m19766a(staticLayout);
                this.f118800R = staticLayout;
                this.f118785C = staticLayout.getText();
            }
        }
    }

    /* renamed from: f */
    private final void m100984f() {
        float f = this.f118805a;
        this.f118818n.left = m100976a((float) this.f118817m.left, (float) this.f118806b.left, f, this.f118813i);
        this.f118818n.top = m100976a(this.f118823s, this.f118824t, f, this.f118813i);
        this.f118818n.right = m100976a((float) this.f118817m.right, (float) this.f118806b.right, f, this.f118813i);
        this.f118818n.bottom = m100976a((float) this.f118817m.bottom, (float) this.f118806b.bottom, f, this.f118813i);
        this.f118827w = m100976a(this.f118825u, this.f118826v, f, this.f118813i);
        this.f118828x = m100976a(this.f118823s, this.f118824t, f, this.f118813i);
        m100982c(m100976a(this.f118807c, this.f118821q, f, this.f118791I));
        this.f118801S = 1.0f - m100976a(0.0f, 1.0f, 1.0f - f, bhdl.f118328b);
        C1280ps.m19915e(this.f118815k);
        this.f118802T = m100976a(1.0f, 0.0f, f, bhdl.f118328b);
        C1280ps.m19915e(this.f118815k);
        ColorStateList colorStateList = this.f118808d;
        ColorStateList colorStateList2 = this.f118822r;
        if (colorStateList != colorStateList2) {
            this.f118790H.setColor(m100977a(m100981c(colorStateList2), mo63864d(), f));
        } else {
            this.f118790H.setColor(mo63864d());
        }
        this.f118790H.setShadowLayer(m100976a(this.f118796N, this.f118792J, f, (TimeInterpolator) null), m100976a(this.f118797O, this.f118793K, f, (TimeInterpolator) null), m100976a(this.f118798P, this.f118794L, f, (TimeInterpolator) null), m100977a(m100981c(this.f118799Q), m100981c(this.f118795M), f));
        C1280ps.m19915e(this.f118815k);
    }

    /* renamed from: g */
    private final boolean m100985g() {
        return this.f118814j > 1 && !this.f118811g;
    }

    /* renamed from: b */
    public final float mo63855b() {
        m100978a(this.f118812h);
        return -this.f118812h.ascent();
    }

    /* renamed from: e */
    public final void mo63866e() {
        float f;
        float f2;
        float f3;
        float f4;
        StaticLayout staticLayout;
        if (this.f118815k.getHeight() > 0 && this.f118815k.getWidth() > 0) {
            float f5 = this.f118787E;
            m100983d(this.f118821q);
            CharSequence charSequence = this.f118785C;
            if (!(charSequence == null || (staticLayout = this.f118800R) == null)) {
                this.f118804V = TextUtils.ellipsize(charSequence, this.f118790H, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
            }
            CharSequence charSequence2 = this.f118804V;
            float f6 = 0.0f;
            if (charSequence2 != null) {
                f = this.f118790H.measureText(charSequence2, 0, charSequence2.length());
            } else {
                f = 0.0f;
            }
            int a = C1256ov.m19815a(this.f118820p, this.f118811g ? 1 : 0);
            StaticLayout staticLayout2 = this.f118800R;
            if (staticLayout2 != null) {
                f2 = (float) staticLayout2.getHeight();
            } else {
                f2 = 0.0f;
            }
            int i = a & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
            if (i == 48) {
                this.f118824t = ((float) this.f118806b.top) - this.f118790H.ascent();
            } else if (i != 80) {
                float descent = (this.f118790H.descent() - this.f118790H.ascent()) / 2.0f;
                this.f118824t = m100985g() ? ((float) this.f118806b.centerY()) - descent : (descent - this.f118790H.descent()) + ((float) this.f118806b.centerY());
            } else {
                this.f118824t = (float) this.f118806b.bottom;
            }
            int i2 = a & 8388615;
            if (i2 == 1) {
                this.f118826v = ((float) this.f118806b.centerX()) - (f / 2.0f);
            } else if (i2 != 5) {
                this.f118826v = (float) this.f118806b.left;
            } else {
                this.f118826v = ((float) this.f118806b.right) - f;
            }
            m100983d(this.f118807c);
            CharSequence charSequence3 = this.f118785C;
            if (charSequence3 != null) {
                f3 = this.f118790H.measureText(charSequence3, 0, charSequence3.length());
            } else {
                f3 = 0.0f;
            }
            StaticLayout staticLayout3 = this.f118800R;
            if (staticLayout3 != null && this.f118814j > 1 && !this.f118811g) {
                f3 = staticLayout3.getLineWidth(0);
            }
            StaticLayout staticLayout4 = this.f118800R;
            if (staticLayout4 != null) {
                f4 = staticLayout4.getLineLeft(0);
            } else {
                f4 = 0.0f;
            }
            this.f118803U = f4;
            int a2 = C1256ov.m19815a(this.f118819o, this.f118811g ? 1 : 0);
            int i3 = a2 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
            if (i3 == 48) {
                this.f118823s = ((float) this.f118817m.top) - this.f118790H.ascent();
            } else if (i3 != 80) {
                this.f118823s = m100985g() ? ((float) this.f118817m.centerY()) - (f2 / 2.0f) : (((this.f118790H.descent() - this.f118790H.ascent()) / 2.0f) - this.f118790H.descent()) + ((float) this.f118817m.centerY());
            } else {
                if (m100985g()) {
                    f6 = f2 - this.f118790H.descent();
                }
                this.f118823s = ((float) this.f118817m.bottom) - f6;
            }
            int i4 = a2 & 8388615;
            if (i4 == 1) {
                this.f118825u = ((float) this.f118817m.centerX()) - (f3 / 2.0f);
            } else if (i4 != 5) {
                this.f118825u = (float) this.f118817m.left;
            } else {
                this.f118825u = ((float) this.f118817m.right) - f3;
            }
            m100982c(f5);
            m100984f();
        }
    }

    /* renamed from: a */
    private static int m100977a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: c */
    private final void m100982c(float f) {
        m100983d(f);
        C1280ps.m19915e(this.f118815k);
    }

    /* renamed from: b */
    public final void mo63856b(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f118805a) {
            this.f118805a = f;
            m100984f();
        }
    }

    /* renamed from: a */
    private final void m100978a(TextPaint textPaint) {
        textPaint.setTextSize(this.f118821q);
        textPaint.setTypeface(this.f118829y);
    }

    /* renamed from: b */
    public final void mo63857b(int i) {
        if (this.f118820p != i) {
            this.f118820p = i;
            mo63866e();
        }
    }

    /* renamed from: a */
    private static boolean m100979a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: b */
    public final void mo63858b(int i, int i2, int i3, int i4) {
        if (!m100980a(this.f118806b, i, i2, i3, i4)) {
            this.f118806b.set(i, i2, i3, i4);
            this.f118789G = true;
            mo63862c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo63862c() {
        boolean z = false;
        if (this.f118806b.width() > 0 && this.f118806b.height() > 0 && this.f118817m.width() > 0 && this.f118817m.height() > 0) {
            z = true;
        }
        this.f118816l = z;
    }

    /* renamed from: a */
    private static boolean m100980a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: c */
    public final void mo63863c(int i) {
        bhlc bhlc = new bhlc(this.f118815k.getContext(), i);
        ColorStateList colorStateList = bhlc.f118934b;
        if (colorStateList != null) {
            this.f118808d = colorStateList;
        }
        float f = bhlc.f118933a;
        if (f != 0.0f) {
            this.f118821q = f;
        }
        ColorStateList colorStateList2 = bhlc.f118938f;
        if (colorStateList2 != null) {
            this.f118795M = colorStateList2;
        }
        this.f118793K = bhlc.f118939g;
        this.f118794L = bhlc.f118940h;
        this.f118792J = bhlc.f118941i;
        bhkw bhkw = this.f118784B;
        if (bhkw != null) {
            bhkw.mo63908a();
        }
        this.f118784B = new bhkw(new bhjc(this), bhlc.mo63909a());
        bhlc.mo63911a(this.f118815k.getContext(), this.f118784B);
        mo63866e();
    }

    /* renamed from: a */
    public final float mo63845a() {
        if (this.f118810f == null) {
            return 0.0f;
        }
        m100978a(this.f118812h);
        TextPaint textPaint = this.f118812h;
        CharSequence charSequence = this.f118810f;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: b */
    public final void mo63859b(ColorStateList colorStateList) {
        if (this.f118822r != colorStateList) {
            this.f118822r = colorStateList;
            mo63866e();
        }
    }

    /* renamed from: a */
    public final void mo63846a(float f) {
        if (this.f118807c != f) {
            this.f118807c = f;
            mo63866e();
        }
    }

    /* renamed from: b */
    public final void mo63860b(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f118810f, charSequence)) {
            this.f118810f = charSequence;
            this.f118785C = null;
            mo63866e();
        }
    }

    /* renamed from: a */
    public final void mo63847a(int i) {
        if (this.f118819o != i) {
            this.f118819o = i;
            mo63866e();
        }
    }

    /* renamed from: a */
    public final void mo63848a(int i, int i2, int i3, int i4) {
        if (!m100980a(this.f118817m, i, i2, i3, i4)) {
            this.f118817m.set(i, i2, i3, i4);
            this.f118789G = true;
            mo63862c();
        }
    }

    /* renamed from: b */
    public final boolean mo63861b(Typeface typeface) {
        bhkw bhkw = this.f118783A;
        if (bhkw != null) {
            bhkw.mo63908a();
        }
        if (this.f118809e == typeface) {
            return false;
        }
        this.f118809e = typeface;
        return true;
    }

    /* renamed from: a */
    public final void mo63849a(TimeInterpolator timeInterpolator) {
        this.f118791I = timeInterpolator;
        mo63866e();
    }

    /* renamed from: a */
    public final void mo63850a(ColorStateList colorStateList) {
        if (this.f118808d != colorStateList) {
            this.f118808d = colorStateList;
            mo63866e();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Canvas.drawText(java.lang.String, int, int, float, float, android.graphics.Paint):void}
     arg types: [java.lang.String, int, int, int, float, android.text.TextPaint]
     candidates:
      ClspMth{android.graphics.Canvas.drawText(java.lang.CharSequence, int, int, float, float, android.graphics.Paint):void}
      ClspMth{android.graphics.Canvas.drawText(char[], int, int, float, float, android.graphics.Paint):void}
      ClspMth{android.graphics.Canvas.drawText(java.lang.String, int, int, float, float, android.graphics.Paint):void} */
    /* renamed from: a */
    public final void mo63851a(Canvas canvas) {
        int save = canvas.save();
        if (this.f118785C != null && this.f118816l) {
            float f = this.f118827w;
            float lineLeft = this.f118800R.getLineLeft(0);
            float f2 = this.f118803U;
            float f3 = (f + lineLeft) - (f2 + f2);
            this.f118790H.setTextSize(this.f118787E);
            float f4 = this.f118827w;
            float f5 = this.f118828x;
            float lineAscent = (float) this.f118800R.getLineAscent(0);
            float f6 = this.f118786D;
            if (f6 != 1.0f) {
                canvas.scale(f6, f6, f4, f5);
            }
            if (!m100985g()) {
                canvas.translate(f4, f5 + lineAscent);
                this.f118800R.draw(canvas);
            } else {
                int alpha = this.f118790H.getAlpha();
                canvas.translate(f3, f5);
                float f7 = (float) alpha;
                this.f118790H.setAlpha((int) (this.f118802T * f7));
                this.f118800R.draw(canvas);
                canvas.translate(f4 - f3, 0.0f);
                this.f118790H.setAlpha((int) (this.f118801S * f7));
                CharSequence charSequence = this.f118804V;
                float f8 = -lineAscent;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f8 / this.f118786D, this.f118790H);
                String trim = this.f118804V.toString().trim();
                String substring = trim.endsWith("…") ? trim.substring(0, trim.length() - 1) : trim;
                this.f118790H.setAlpha(alpha);
                canvas.drawText(substring, 0, Math.min(this.f118800R.getLineEnd(0), substring.length()), 0.0f, f8 / this.f118786D, (Paint) this.f118790H);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: d */
    public final int mo63864d() {
        return m100981c(this.f118808d);
    }

    /* renamed from: d */
    public final void mo63865d(int i) {
        bhlc bhlc = new bhlc(this.f118815k.getContext(), i);
        ColorStateList colorStateList = bhlc.f118934b;
        if (colorStateList != null) {
            this.f118822r = colorStateList;
        }
        float f = bhlc.f118933a;
        if (f != 0.0f) {
            this.f118807c = f;
        }
        ColorStateList colorStateList2 = bhlc.f118938f;
        if (colorStateList2 != null) {
            this.f118799Q = colorStateList2;
        }
        this.f118797O = bhlc.f118939g;
        this.f118798P = bhlc.f118940h;
        this.f118796N = bhlc.f118941i;
        bhkw bhkw = this.f118783A;
        if (bhkw != null) {
            bhkw.mo63908a();
        }
        this.f118783A = new bhkw(new bhjd(this), bhlc.mo63909a());
        bhlc.mo63911a(this.f118815k.getContext(), this.f118783A);
        mo63866e();
    }

    /* renamed from: a */
    public final boolean mo63852a(Typeface typeface) {
        bhkw bhkw = this.f118784B;
        if (bhkw != null) {
            bhkw.mo63908a();
        }
        if (this.f118829y == typeface) {
            return false;
        }
        this.f118829y = typeface;
        return true;
    }

    /* renamed from: a */
    public final boolean mo63853a(CharSequence charSequence) {
        C1213nf nfVar;
        if (C1280ps.m19923h(this.f118815k) != 1) {
            nfVar = C1220nm.f26746c;
        } else {
            nfVar = C1220nm.f26747d;
        }
        return nfVar.mo15493a(charSequence, charSequence.length());
    }

    /* renamed from: a */
    public final boolean mo63854a(int[] iArr) {
        ColorStateList colorStateList;
        this.f118788F = iArr;
        ColorStateList colorStateList2 = this.f118808d;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.f118822r) == null || !colorStateList.isStateful())) {
            return false;
        }
        mo63866e();
        return true;
    }
}
