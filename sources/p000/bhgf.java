package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: bhgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhgf extends bhlr implements Drawable.Callback, bhke {

    /* renamed from: y */
    private static final int[] f118534y = {16842910};

    /* renamed from: z */
    private static final ShapeDrawable f118535z = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    private ColorStateList f118536A;

    /* renamed from: B */
    private ColorStateList f118537B;

    /* renamed from: C */
    private float f118538C = -1.0f;

    /* renamed from: D */
    private ColorStateList f118539D;

    /* renamed from: E */
    private float f118540E;

    /* renamed from: F */
    private boolean f118541F;

    /* renamed from: G */
    private Drawable f118542G;

    /* renamed from: H */
    private ColorStateList f118543H;

    /* renamed from: I */
    private float f118544I;

    /* renamed from: J */
    private boolean f118545J;

    /* renamed from: K */
    private Drawable f118546K;

    /* renamed from: L */
    private ColorStateList f118547L;

    /* renamed from: M */
    private boolean f118548M;

    /* renamed from: N */
    private Drawable f118549N;

    /* renamed from: O */
    private ColorStateList f118550O;

    /* renamed from: P */
    private float f118551P;

    /* renamed from: Q */
    private float f118552Q;

    /* renamed from: R */
    private final Paint f118553R = new Paint(1);

    /* renamed from: S */
    private final Paint.FontMetrics f118554S = new Paint.FontMetrics();

    /* renamed from: T */
    private final RectF f118555T = new RectF();

    /* renamed from: U */
    private final PointF f118556U = new PointF();

    /* renamed from: V */
    private final Path f118557V = new Path();

    /* renamed from: W */
    private int f118558W;

    /* renamed from: X */
    private int f118559X;

    /* renamed from: Y */
    private int f118560Y;

    /* renamed from: Z */
    private int f118561Z;

    /* renamed from: a */
    public float f118562a;

    /* renamed from: aa */
    private int f118563aa;

    /* renamed from: ab */
    private int f118564ab;

    /* renamed from: ac */
    private boolean f118565ac;

    /* renamed from: ad */
    private int f118566ad;

    /* renamed from: ae */
    private int f118567ae = 255;

    /* renamed from: af */
    private ColorFilter f118568af;

    /* renamed from: ag */
    private PorterDuffColorFilter f118569ag;

    /* renamed from: ah */
    private ColorStateList f118570ah;

    /* renamed from: ai */
    private PorterDuff.Mode f118571ai = PorterDuff.Mode.SRC_IN;

    /* renamed from: aj */
    private int[] f118572aj;

    /* renamed from: ak */
    private boolean f118573ak;

    /* renamed from: al */
    private ColorStateList f118574al;

    /* renamed from: am */
    private WeakReference f118575am = new WeakReference(null);

    /* renamed from: an */
    private boolean f118576an;

    /* renamed from: b */
    public ColorStateList f118577b;

    /* renamed from: c */
    public CharSequence f118578c;

    /* renamed from: d */
    public boolean f118579d;

    /* renamed from: e */
    public Drawable f118580e;

    /* renamed from: f */
    public float f118581f;

    /* renamed from: g */
    public boolean f118582g;

    /* renamed from: h */
    public float f118583h;

    /* renamed from: i */
    public float f118584i;

    /* renamed from: j */
    public float f118585j;

    /* renamed from: k */
    public float f118586k;

    /* renamed from: l */
    public float f118587l;

    /* renamed from: m */
    public float f118588m;

    /* renamed from: n */
    public final Context f118589n;

    /* renamed from: o */
    public final bhkf f118590o;

    /* renamed from: p */
    public TextUtils.TruncateAt f118591p;

    /* renamed from: q */
    public boolean f118592q;

    /* renamed from: r */
    public int f118593r;

    private bhgf(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo63942a(context);
        this.f118589n = context;
        bhkf bhkf = new bhkf(this);
        this.f118590o = bhkf;
        this.f118578c = "";
        bhkf.f118902a.density = context.getResources().getDisplayMetrics().density;
        setState(f118534y);
        mo63703a(f118534y);
        this.f118592q = true;
        if (bhlg.f118948a) {
            f118535z.setTint(-1);
        }
    }

    /* renamed from: a */
    public static bhgf m100827a(Context context, AttributeSet attributeSet, int i, int i2) {
        bhlc bhlc;
        ColorStateList a;
        int resourceId;
        bhgf bhgf = new bhgf(context, attributeSet, i, i2);
        TypedArray a2 = bhki.m101052a(bhgf.f118589n, attributeSet, bhgj.f118597a, i, i2, new int[0]);
        bhgf.f118576an = a2.hasValue(36);
        ColorStateList a3 = bhky.m101077a(bhgf.f118589n, a2, 23);
        if (bhgf.f118536A != a3) {
            bhgf.f118536A = a3;
            bhgf.onStateChange(bhgf.getState());
        }
        bhgf.mo63698a(bhky.m101077a(bhgf.f118589n, a2, 10));
        float dimension = a2.getDimension(18, 0.0f);
        if (bhgf.f118562a != dimension) {
            bhgf.f118562a = dimension;
            bhgf.invalidateSelf();
            bhgf.mo63696a();
        }
        if (a2.hasValue(11)) {
            float dimension2 = a2.getDimension(11, 0.0f);
            if (bhgf.f118538C != dimension2) {
                bhgf.f118538C = dimension2;
                bhgf.mo63916a(bhgf.mo63954h().mo63978a(dimension2));
            }
        }
        ColorStateList a4 = bhky.m101077a(bhgf.f118589n, a2, 21);
        if (bhgf.f118539D != a4) {
            bhgf.f118539D = a4;
            if (bhgf.f118576an) {
                bhgf.mo63950d(a4);
            }
            bhgf.onStateChange(bhgf.getState());
        }
        float dimension3 = a2.getDimension(22, 0.0f);
        if (bhgf.f118540E != dimension3) {
            bhgf.f118540E = dimension3;
            bhgf.f118553R.setStrokeWidth(dimension3);
            if (bhgf.f118576an) {
                super.mo63939a(dimension3);
            }
            bhgf.invalidateSelf();
        }
        ColorStateList a5 = bhky.m101077a(bhgf.f118589n, a2, 35);
        if (bhgf.f118577b != a5) {
            bhgf.f118577b = a5;
            bhgf.m100838x();
            bhgf.onStateChange(bhgf.getState());
        }
        bhgf.mo63701a(a2.getText(4));
        Context context2 = bhgf.f118589n;
        Drawable drawable = null;
        if (!a2.hasValue(0) || (resourceId = a2.getResourceId(0, 0)) == 0) {
            bhlc = null;
        } else {
            bhlc = new bhlc(context2, resourceId);
        }
        bhgf.mo63700a(bhlc);
        int i3 = a2.getInt(2, 0);
        if (i3 == 1) {
            bhgf.f118591p = TextUtils.TruncateAt.START;
        } else if (i3 == 2) {
            bhgf.f118591p = TextUtils.TruncateAt.MIDDLE;
        } else if (i3 == 3) {
            bhgf.f118591p = TextUtils.TruncateAt.END;
        }
        bhgf.mo63706b(a2.getBoolean(17, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            bhgf.mo63706b(a2.getBoolean(14, false));
        }
        bhgf.mo63705b(bhky.m101078b(bhgf.f118589n, a2, 13));
        if (a2.hasValue(16)) {
            bhgf.mo63704b(bhky.m101077a(bhgf.f118589n, a2, 16));
        }
        float dimension4 = a2.getDimension(15, 0.0f);
        if (bhgf.f118544I != dimension4) {
            float d = bhgf.mo63709d();
            bhgf.f118544I = dimension4;
            float d2 = bhgf.mo63709d();
            bhgf.invalidateSelf();
            if (d != d2) {
                bhgf.mo63696a();
            }
        }
        bhgf.mo63708c(a2.getBoolean(30, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            bhgf.mo63708c(a2.getBoolean(25, false));
        }
        Drawable b = bhky.m101078b(bhgf.f118589n, a2, 24);
        Drawable g = bhgf.mo63715g();
        if (g != b) {
            float e = bhgf.mo63712e();
            if (b != null) {
                int i4 = Build.VERSION.SDK_INT;
                drawable = b.mutate();
            }
            bhgf.f118580e = drawable;
            if (bhlg.f118948a) {
                bhgf.f118546K = new RippleDrawable(bhlg.m101096b(bhgf.f118577b), bhgf.f118580e, f118535z);
            }
            float e2 = bhgf.mo63712e();
            m100832d(g);
            if (bhgf.mo63707b()) {
                bhgf.m100831c(bhgf.f118580e);
            }
            bhgf.invalidateSelf();
            if (e != e2) {
                bhgf.mo63696a();
            }
        }
        ColorStateList a6 = bhky.m101077a(bhgf.f118589n, a2, 29);
        if (bhgf.f118547L != a6) {
            bhgf.f118547L = a6;
            if (bhgf.mo63707b()) {
                C1173lt.m19601a(bhgf.f118580e, a6);
            }
            bhgf.onStateChange(bhgf.getState());
        }
        float dimension5 = a2.getDimension(27, 0.0f);
        if (bhgf.f118581f != dimension5) {
            bhgf.f118581f = dimension5;
            bhgf.invalidateSelf();
            if (bhgf.mo63707b()) {
                bhgf.mo63696a();
            }
        }
        bhgf.mo63710d(a2.getBoolean(5, false));
        bhgf.mo63713e(a2.getBoolean(9, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            bhgf.mo63713e(a2.getBoolean(7, false));
        }
        Drawable b2 = bhky.m101078b(bhgf.f118589n, a2, 6);
        if (bhgf.f118549N != b2) {
            float d3 = bhgf.mo63709d();
            bhgf.f118549N = b2;
            float d4 = bhgf.mo63709d();
            m100832d(bhgf.f118549N);
            bhgf.m100831c(bhgf.f118549N);
            bhgf.invalidateSelf();
            if (d3 != d4) {
                bhgf.mo63696a();
            }
        }
        if (a2.hasValue(8) && bhgf.f118550O != (a = bhky.m101077a(bhgf.f118589n, a2, 8))) {
            bhgf.f118550O = a;
            if (bhgf.m100836v()) {
                C1173lt.m19601a(bhgf.f118549N, a);
            }
            bhgf.onStateChange(bhgf.getState());
        }
        bhdp.m100680a(bhgf.f118589n, a2, 38);
        bhdp.m100680a(bhgf.f118589n, a2, 32);
        float dimension6 = a2.getDimension(20, 0.0f);
        if (bhgf.f118583h != dimension6) {
            bhgf.f118583h = dimension6;
            bhgf.invalidateSelf();
            bhgf.mo63696a();
        }
        float dimension7 = a2.getDimension(34, 0.0f);
        if (bhgf.f118551P != dimension7) {
            float d5 = bhgf.mo63709d();
            bhgf.f118551P = dimension7;
            float d6 = bhgf.mo63709d();
            bhgf.invalidateSelf();
            if (d5 != d6) {
                bhgf.mo63696a();
            }
        }
        float dimension8 = a2.getDimension(33, 0.0f);
        if (bhgf.f118552Q != dimension8) {
            float d7 = bhgf.mo63709d();
            bhgf.f118552Q = dimension8;
            float d8 = bhgf.mo63709d();
            bhgf.invalidateSelf();
            if (d7 != d8) {
                bhgf.mo63696a();
            }
        }
        float dimension9 = a2.getDimension(40, 0.0f);
        if (bhgf.f118584i != dimension9) {
            bhgf.f118584i = dimension9;
            bhgf.invalidateSelf();
            bhgf.mo63696a();
        }
        float dimension10 = a2.getDimension(39, 0.0f);
        if (bhgf.f118585j != dimension10) {
            bhgf.f118585j = dimension10;
            bhgf.invalidateSelf();
            bhgf.mo63696a();
        }
        float dimension11 = a2.getDimension(28, 0.0f);
        if (bhgf.f118586k != dimension11) {
            bhgf.f118586k = dimension11;
            bhgf.invalidateSelf();
            if (bhgf.mo63707b()) {
                bhgf.mo63696a();
            }
        }
        float dimension12 = a2.getDimension(26, 0.0f);
        if (bhgf.f118587l != dimension12) {
            bhgf.f118587l = dimension12;
            bhgf.invalidateSelf();
            if (bhgf.mo63707b()) {
                bhgf.mo63696a();
            }
        }
        float dimension13 = a2.getDimension(12, 0.0f);
        if (bhgf.f118588m != dimension13) {
            bhgf.f118588m = dimension13;
            bhgf.invalidateSelf();
            bhgf.mo63696a();
        }
        bhgf.f118593r = a2.getDimensionPixelSize(3, Integer.MAX_VALUE);
        a2.recycle();
        return bhgf;
    }

    /* renamed from: c */
    private final void m100831c(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C1173lt.m19608b(drawable, C1173lt.m19613g(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f118580e) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f118572aj);
                }
                C1173lt.m19601a(drawable, this.f118547L);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f118542G;
            if (drawable == drawable2 && this.f118545J) {
                C1173lt.m19601a(drawable2, this.f118543H);
            }
        }
    }

    /* renamed from: d */
    private static final void m100832d(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: e */
    private static boolean m100833e(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: t */
    private final boolean m100834t() {
        return this.f118541F && this.f118542G != null;
    }

    /* renamed from: u */
    private final boolean m100835u() {
        return this.f118548M && this.f118549N != null && this.f118565ac;
    }

    /* renamed from: v */
    private final boolean m100836v() {
        return this.f118548M && this.f118549N != null && this.f118582g;
    }

    /* renamed from: w */
    private final ColorFilter m100837w() {
        ColorFilter colorFilter = this.f118568af;
        return colorFilter == null ? this.f118569ag : colorFilter;
    }

    /* renamed from: x */
    private final void m100838x() {
        this.f118574al = this.f118573ak ? bhlg.m101096b(this.f118577b) : null;
    }

    /* renamed from: b */
    public final void mo63704b(ColorStateList colorStateList) {
        this.f118545J = true;
        if (this.f118543H != colorStateList) {
            this.f118543H = colorStateList;
            if (m100834t()) {
                C1173lt.m19601a(this.f118542G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: b */
    public final boolean mo63707b() {
        return this.f118579d && this.f118580e != null;
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        CharSequence charSequence;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.f118567ae) != 0) {
            if (i < 255) {
                int i7 = bounds.left;
                int i8 = bounds.top;
                int i9 = bounds.right;
                int i10 = bounds.bottom;
                int i11 = this.f118567ae;
                int i12 = Build.VERSION.SDK_INT;
                i2 = canvas.saveLayerAlpha((float) i7, (float) i8, (float) i9, (float) i10, i11);
            } else {
                i2 = 0;
            }
            if (!this.f118576an) {
                this.f118553R.setColor(this.f118558W);
                this.f118553R.setStyle(Paint.Style.FILL);
                this.f118555T.set(bounds);
                canvas2.drawRoundRect(this.f118555T, mo63714f(), mo63714f(), this.f118553R);
            }
            if (!this.f118576an) {
                this.f118553R.setColor(this.f118559X);
                this.f118553R.setStyle(Paint.Style.FILL);
                this.f118553R.setColorFilter(m100837w());
                this.f118555T.set(bounds);
                canvas2.drawRoundRect(this.f118555T, mo63714f(), mo63714f(), this.f118553R);
            }
            if (this.f118576an) {
                super.draw(canvas);
            }
            if (this.f118540E > 0.0f && !this.f118576an) {
                this.f118553R.setColor(this.f118561Z);
                this.f118553R.setStyle(Paint.Style.STROKE);
                if (!this.f118576an) {
                    this.f118553R.setColorFilter(m100837w());
                }
                this.f118555T.set(((float) bounds.left) + (this.f118540E / 2.0f), ((float) bounds.top) + (this.f118540E / 2.0f), ((float) bounds.right) - (this.f118540E / 2.0f), ((float) bounds.bottom) - (this.f118540E / 2.0f));
                float f = this.f118538C - (this.f118540E / 2.0f);
                canvas2.drawRoundRect(this.f118555T, f, f, this.f118553R);
            }
            this.f118553R.setColor(this.f118563aa);
            this.f118553R.setStyle(Paint.Style.FILL);
            this.f118555T.set(bounds);
            if (!this.f118576an) {
                canvas2.drawRoundRect(this.f118555T, mo63714f(), mo63714f(), this.f118553R);
            } else {
                mo63944a(new RectF(bounds), this.f118557V);
                super.mo63943a(canvas, this.f118553R, this.f118557V, this.f119007s.f118968a, mo63957j());
            }
            if (m100834t()) {
                m100828a(bounds, this.f118555T);
                float f2 = this.f118555T.left;
                float f3 = this.f118555T.top;
                canvas2.translate(f2, f3);
                this.f118542G.setBounds(0, 0, (int) this.f118555T.width(), (int) this.f118555T.height());
                this.f118542G.draw(canvas2);
                canvas2.translate(-f2, -f3);
            }
            if (m100835u()) {
                m100828a(bounds, this.f118555T);
                float f4 = this.f118555T.left;
                float f5 = this.f118555T.top;
                canvas2.translate(f4, f5);
                this.f118549N.setBounds(0, 0, (int) this.f118555T.width(), (int) this.f118555T.height());
                this.f118549N.draw(canvas2);
                canvas2.translate(-f4, -f5);
            }
            if (!this.f118592q || this.f118578c == null) {
                i3 = i2;
                i5 = 0;
                i4 = 255;
            } else {
                PointF pointF = this.f118556U;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.f118578c != null) {
                    float d = this.f118583h + mo63709d() + this.f118584i;
                    if (C1173lt.m19613g(this) == 0) {
                        pointF.x = ((float) bounds.left) + d;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - d;
                        align = Paint.Align.RIGHT;
                    }
                    int centerY = bounds.centerY();
                    this.f118590o.f118902a.getFontMetrics(this.f118554S);
                    pointF.y = ((float) centerY) - ((this.f118554S.descent + this.f118554S.ascent) / 2.0f);
                }
                RectF rectF = this.f118555T;
                rectF.setEmpty();
                if (this.f118578c != null) {
                    float d2 = this.f118583h + mo63709d() + this.f118584i;
                    float e = this.f118588m + mo63712e() + this.f118585j;
                    if (C1173lt.m19613g(this) == 0) {
                        rectF.left = ((float) bounds.left) + d2;
                        rectF.right = ((float) bounds.right) - e;
                    } else {
                        rectF.left = ((float) bounds.left) + e;
                        rectF.right = ((float) bounds.right) - d2;
                    }
                    rectF.top = (float) bounds.top;
                    rectF.bottom = (float) bounds.bottom;
                }
                bhkf bhkf = this.f118590o;
                if (bhkf.f118905d != null) {
                    bhkf.f118902a.drawableState = getState();
                    bhkf bhkf2 = this.f118590o;
                    bhkf2.f118905d.mo63910a(this.f118589n, bhkf2.f118902a, bhkf2.f118903b);
                }
                this.f118590o.f118902a.setTextAlign(align);
                int round = Math.round(this.f118590o.mo63895a(this.f118578c.toString()));
                int round2 = Math.round(this.f118555T.width());
                if (round > round2) {
                    i6 = canvas.save();
                    canvas2.clipRect(this.f118555T);
                } else {
                    i6 = 0;
                }
                CharSequence charSequence2 = this.f118578c;
                if (round > round2 && this.f118591p != null) {
                    charSequence = TextUtils.ellipsize(charSequence2, this.f118590o.f118902a, this.f118555T.width(), this.f118591p);
                } else {
                    charSequence = charSequence2;
                }
                i3 = i2;
                i5 = 0;
                i4 = 255;
                canvas.drawText(charSequence, 0, charSequence.length(), this.f118556U.x, this.f118556U.y, this.f118590o.f118902a);
                if (round > round2) {
                    canvas2.restoreToCount(i6);
                }
            }
            if (mo63707b()) {
                RectF rectF2 = this.f118555T;
                rectF2.setEmpty();
                if (mo63707b()) {
                    float f6 = this.f118588m + this.f118587l;
                    if (C1173lt.m19613g(this) == 0) {
                        rectF2.right = ((float) bounds.right) - f6;
                        rectF2.left = rectF2.right - this.f118581f;
                    } else {
                        rectF2.left = ((float) bounds.left) + f6;
                        rectF2.right = rectF2.left + this.f118581f;
                    }
                    rectF2.top = bounds.exactCenterY() - (this.f118581f / 2.0f);
                    rectF2.bottom = rectF2.top + this.f118581f;
                }
                float f7 = this.f118555T.left;
                float f8 = this.f118555T.top;
                canvas2.translate(f7, f8);
                this.f118580e.setBounds(i5, i5, (int) this.f118555T.width(), (int) this.f118555T.height());
                if (bhlg.f118948a) {
                    this.f118546K.setBounds(this.f118580e.getBounds());
                    this.f118546K.jumpToCurrentState();
                    this.f118546K.draw(canvas2);
                } else {
                    this.f118580e.draw(canvas2);
                }
                canvas2.translate(-f7, -f8);
            }
            if (this.f118567ae < i4) {
                canvas2.restoreToCount(i3);
            }
        }
    }

    /* renamed from: f */
    public final float mo63714f() {
        return !this.f118576an ? this.f118538C : mo63962n();
    }

    /* renamed from: g */
    public final Drawable mo63715g() {
        Drawable drawable = this.f118580e;
        if (drawable != null) {
            return C1173lt.m19612f(drawable);
        }
        return null;
    }

    public final int getAlpha() {
        return this.f118567ae;
    }

    public final ColorFilter getColorFilter() {
        return this.f118568af;
    }

    public final int getIntrinsicHeight() {
        return (int) this.f118562a;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.f118583h + mo63709d() + this.f118584i + this.f118590o.mo63895a(this.f118578c.toString()) + this.f118585j + mo63712e() + this.f118588m), this.f118593r);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        if (!this.f118576an) {
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                outline.setRoundRect(bounds, this.f118538C);
            } else {
                outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f118538C);
            }
            outline.setAlpha(((float) this.f118567ae) / 255.0f);
            return;
        }
        super.getOutline(outline);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m100833e(this.f118536A) || m100833e(this.f118537B) || m100833e(this.f118539D)) {
            return true;
        }
        if (this.f118573ak && m100833e(this.f118574al)) {
            return true;
        }
        bhlc bhlc = this.f118590o.f118905d;
        return !(bhlc == null || (colorStateList = bhlc.f118934b) == null || !colorStateList.isStateful()) || m100836v() || m100829a(this.f118542G) || m100829a(this.f118549N) || m100833e(this.f118570ah);
    }

    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m100834t()) {
            onLayoutDirectionChanged |= C1173lt.m19608b(this.f118542G, i);
        }
        if (m100835u()) {
            onLayoutDirectionChanged |= C1173lt.m19608b(this.f118549N, i);
        }
        if (mo63707b()) {
            onLayoutDirectionChanged |= C1173lt.m19608b(this.f118580e, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m100834t()) {
            onLevelChange |= this.f118542G.setLevel(i);
        }
        if (m100835u()) {
            onLevelChange |= this.f118549N.setLevel(i);
        }
        if (mo63707b()) {
            onLevelChange |= this.f118580e.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.f118576an) {
            super.onStateChange(iArr);
        }
        return m100830a(iArr, this.f118572aj);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.f118567ae != i) {
            this.f118567ae = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f118568af != colorFilter) {
            this.f118568af = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.f118570ah != colorStateList) {
            this.f118570ah = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f118571ai != mode) {
            this.f118571ai = mode;
            this.f118569ag = bhic.m100928a(this, this.f118570ah, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m100834t()) {
            visible |= this.f118542G.setVisible(z, z2);
        }
        if (m100835u()) {
            visible |= this.f118549N.setVisible(z, z2);
        }
        if (mo63707b()) {
            visible |= this.f118580e.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: d */
    public final float mo63709d() {
        if (!m100834t() && !m100835u()) {
            return 0.0f;
        }
        return this.f118551P + this.f118544I + this.f118552Q;
    }

    /* renamed from: e */
    public final float mo63712e() {
        if (mo63707b()) {
            return this.f118586k + this.f118581f + this.f118587l;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void mo63705b(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f118542G;
        Drawable drawable4 = null;
        if (drawable3 != null) {
            drawable2 = C1173lt.m19612f(drawable3);
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float d = mo63709d();
            if (drawable != null) {
                int i = Build.VERSION.SDK_INT;
                drawable4 = drawable.mutate();
            }
            this.f118542G = drawable4;
            float d2 = mo63709d();
            m100832d(drawable2);
            if (m100834t()) {
                m100831c(this.f118542G);
            }
            invalidateSelf();
            if (d != d2) {
                mo63696a();
            }
        }
    }

    /* renamed from: d */
    public final void mo63710d(boolean z) {
        if (this.f118582g != z) {
            this.f118582g = z;
            float d = mo63709d();
            if (!z && this.f118565ac) {
                this.f118565ac = false;
            }
            float d2 = mo63709d();
            invalidateSelf();
            if (d != d2) {
                mo63696a();
            }
        }
    }

    /* renamed from: e */
    public final void mo63713e(boolean z) {
        if (this.f118548M != z) {
            boolean u = m100835u();
            this.f118548M = z;
            boolean u2 = m100835u();
            if (u != u2) {
                if (!u2) {
                    m100832d(this.f118549N);
                } else {
                    m100831c(this.f118549N);
                }
                invalidateSelf();
                mo63696a();
            }
        }
    }

    /* renamed from: c */
    public final void mo63611c() {
        mo63696a();
        invalidateSelf();
    }

    /* renamed from: c */
    public final void mo63708c(boolean z) {
        if (this.f118579d != z) {
            boolean b = mo63707b();
            this.f118579d = z;
            boolean b2 = mo63707b();
            if (b != b2) {
                if (!b2) {
                    m100832d(this.f118580e);
                } else {
                    m100831c(this.f118580e);
                }
                invalidateSelf();
                mo63696a();
            }
        }
    }

    /* renamed from: b */
    public final void mo63706b(boolean z) {
        if (this.f118541F != z) {
            boolean t = m100834t();
            this.f118541F = z;
            boolean t2 = m100834t();
            if (t != t2) {
                if (!t2) {
                    m100832d(this.f118542G);
                } else {
                    m100831c(this.f118542G);
                }
                invalidateSelf();
                mo63696a();
            }
        }
    }

    /* renamed from: a */
    private final void m100828a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m100834t() || m100835u()) {
            float f = this.f118583h + this.f118551P;
            if (C1173lt.m19613g(this) == 0) {
                rectF.left = ((float) rect.left) + f;
                rectF.right = rectF.left + this.f118544I;
            } else {
                rectF.right = ((float) rect.right) - f;
                rectF.left = rectF.right - this.f118544I;
            }
            rectF.top = rect.exactCenterY() - (this.f118544I / 2.0f);
            rectF.bottom = rectF.top + this.f118544I;
        }
    }

    /* renamed from: a */
    public static boolean m100829a(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x014c  */
    /* renamed from: a */
    private final boolean m100830a(int[] iArr, int[] iArr2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        int i6;
        ColorStateList colorStateList2;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList3 = this.f118536A;
        if (colorStateList3 != null) {
            i = colorStateList3.getColorForState(iArr, this.f118558W);
        } else {
            i = 0;
        }
        boolean z5 = true;
        if (this.f118558W != i) {
            this.f118558W = i;
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f118537B;
        if (colorStateList4 != null) {
            i2 = colorStateList4.getColorForState(iArr, this.f118559X);
        } else {
            i2 = 0;
        }
        if (this.f118559X != i2) {
            this.f118559X = i2;
            onStateChange = true;
        }
        int a = C1165lm.m19351a(i2, i);
        if (this.f118560Y != a) {
            z = true;
        } else {
            z = false;
        }
        if (mo63955i() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            this.f118560Y = a;
            mo63948c(ColorStateList.valueOf(a));
            onStateChange = true;
        }
        ColorStateList colorStateList5 = this.f118539D;
        if (colorStateList5 != null) {
            i3 = colorStateList5.getColorForState(iArr, this.f118561Z);
        } else {
            i3 = 0;
        }
        if (this.f118561Z != i3) {
            this.f118561Z = i3;
            onStateChange = true;
        }
        if (this.f118574al == null || !bhlg.m101095a(iArr)) {
            i4 = 0;
        } else {
            i4 = this.f118574al.getColorForState(iArr, this.f118563aa);
        }
        if (this.f118563aa != i4) {
            this.f118563aa = i4;
            if (this.f118573ak) {
                onStateChange = true;
            }
        }
        bhlc bhlc = this.f118590o.f118905d;
        if (bhlc == null || (colorStateList2 = bhlc.f118934b) == null) {
            i5 = 0;
        } else {
            i5 = colorStateList2.getColorForState(iArr, this.f118564ab);
        }
        if (this.f118564ab != i5) {
            this.f118564ab = i5;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                } else if (state[i7] != 16842912) {
                    i7++;
                } else if (this.f118582g) {
                    z3 = true;
                }
            }
            if (this.f118565ac != z3) {
                z4 = false;
            } else {
                if (this.f118549N != null) {
                    float d = mo63709d();
                    this.f118565ac = z3;
                    if (d != mo63709d()) {
                        onStateChange = true;
                        z4 = true;
                    } else {
                        onStateChange = true;
                    }
                }
                z4 = false;
            }
            colorStateList = this.f118570ah;
            if (colorStateList == null) {
                i6 = colorStateList.getColorForState(iArr, this.f118566ad);
            } else {
                i6 = 0;
            }
            if (this.f118566ad == i6) {
                this.f118566ad = i6;
                this.f118569ag = bhic.m100928a(this, this.f118570ah, this.f118571ai);
            } else {
                z5 = onStateChange;
            }
            if (m100829a(this.f118542G)) {
                z5 |= this.f118542G.setState(iArr);
            }
            if (m100829a(this.f118549N)) {
                z5 |= this.f118549N.setState(iArr);
            }
            if (m100829a(this.f118580e)) {
                int length2 = iArr.length;
                int length3 = iArr2.length;
                int[] iArr3 = new int[(length2 + length3)];
                System.arraycopy(iArr, 0, iArr3, 0, length2);
                System.arraycopy(iArr2, 0, iArr3, length2, length3);
                z5 |= this.f118580e.setState(iArr3);
            }
            if (bhlg.f118948a && m100829a(this.f118546K)) {
                z5 |= this.f118546K.setState(iArr2);
            }
            if (z5) {
                invalidateSelf();
            }
            if (z4) {
                mo63696a();
            }
            return z5;
        }
        z3 = false;
        if (this.f118565ac != z3) {
        }
        colorStateList = this.f118570ah;
        if (colorStateList == null) {
        }
        if (this.f118566ad == i6) {
        }
        if (m100829a(this.f118542G)) {
        }
        if (m100829a(this.f118549N)) {
        }
        if (m100829a(this.f118580e)) {
        }
        z5 |= this.f118546K.setState(iArr2);
        if (z5) {
        }
        if (z4) {
        }
        return z5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63696a() {
        bhge bhge = (bhge) this.f118575am.get();
        if (bhge != null) {
            bhge.mo63695b();
        }
    }

    /* renamed from: a */
    public final void mo63697a(int i) {
        mo63700a(new bhlc(this.f118589n, i));
    }

    /* renamed from: a */
    public final void mo63698a(ColorStateList colorStateList) {
        if (this.f118537B != colorStateList) {
            this.f118537B = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: a */
    public final void mo63699a(bhge bhge) {
        this.f118575am = new WeakReference(bhge);
    }

    /* renamed from: a */
    public final void mo63700a(bhlc bhlc) {
        this.f118590o.mo63897a(bhlc, this.f118589n);
    }

    /* renamed from: a */
    public final void mo63701a(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f118578c, charSequence)) {
            this.f118578c = charSequence;
            this.f118590o.mo63896a();
            invalidateSelf();
            mo63696a();
        }
    }

    /* renamed from: a */
    public final void mo63702a(boolean z) {
        if (this.f118573ak != z) {
            this.f118573ak = z;
            m100838x();
            onStateChange(getState());
        }
    }

    /* renamed from: a */
    public final boolean mo63703a(int[] iArr) {
        if (Arrays.equals(this.f118572aj, iArr)) {
            return false;
        }
        this.f118572aj = iArr;
        if (mo63707b()) {
            return m100830a(getState(), iArr);
        }
        return false;
    }
}
