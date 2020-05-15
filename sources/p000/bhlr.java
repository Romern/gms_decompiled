package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.BitSet;

/* renamed from: bhlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhlr extends Drawable implements bhmg {

    /* renamed from: a */
    private static final Paint f118990a = new Paint(1);

    /* renamed from: b */
    private final Matrix f118991b;

    /* renamed from: c */
    private final Path f118992c;

    /* renamed from: d */
    private final Path f118993d;

    /* renamed from: e */
    private final RectF f118994e;

    /* renamed from: f */
    private final RectF f118995f;

    /* renamed from: g */
    private final Region f118996g;

    /* renamed from: h */
    private final Region f118997h;

    /* renamed from: i */
    private bhlx f118998i;

    /* renamed from: j */
    private final Paint f118999j;

    /* renamed from: k */
    private final Paint f119000k;

    /* renamed from: l */
    private final bhlh f119001l;

    /* renamed from: m */
    private final bhlz f119002m;

    /* renamed from: n */
    private PorterDuffColorFilter f119003n;

    /* renamed from: o */
    private PorterDuffColorFilter f119004o;

    /* renamed from: p */
    private final RectF f119005p;

    /* renamed from: q */
    private final bhlo f119006q;

    /* renamed from: s */
    public bhlq f119007s;

    /* renamed from: t */
    public final bhme[] f119008t;

    /* renamed from: u */
    public final bhme[] f119009u;

    /* renamed from: v */
    public final BitSet f119010v;

    /* renamed from: w */
    public boolean f119011w;

    /* renamed from: x */
    public boolean f119012x;

    static {
        bhlr.class.getSimpleName();
    }

    public bhlr() {
        this(new bhlx());
    }

    /* renamed from: a */
    private final int mo63697a(int i) {
        float l = mo63959l();
        bhlq bhlq = this.f119007s;
        float f = l + bhlq.f118981n;
        bhid bhid = bhlq.f118969b;
        return bhid != null ? bhid.mo63792a(i, f) : i;
    }

    /* renamed from: a */
    private static int m101105a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: b */
    private final void m101110b(RectF rectF, Path path) {
        mo63944a(rectF, path);
        if (this.f119007s.f118977j != 1.0f) {
            this.f118991b.reset();
            Matrix matrix = this.f118991b;
            float f = this.f119007s.f118977j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f118991b);
        }
        path.computeBounds(this.f119005p, true);
    }

    /* renamed from: c */
    private final float mo63611c() {
        if (mo63696a()) {
            return this.f119000k.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: d */
    private final RectF mo63709d() {
        this.f118995f.set(mo63957j());
        float c = mo63611c();
        this.f118995f.inset(c, c);
        return this.f118995f;
    }

    public void draw(Canvas canvas) {
        this.f118999j.setColorFilter(this.f119003n);
        int alpha = this.f118999j.getAlpha();
        this.f118999j.setAlpha(m101105a(alpha, this.f119007s.f118980m));
        this.f119000k.setColorFilter(this.f119004o);
        this.f119000k.setStrokeWidth(this.f119007s.f118979l);
        int alpha2 = this.f119000k.getAlpha();
        this.f119000k.setAlpha(m101105a(alpha2, this.f119007s.f118980m));
        if (this.f119011w) {
            float c = mo63611c();
            bhlx h = mo63954h();
            bhlp bhlp = new bhlp(-c);
            bhlw b = h.mo63980b();
            b.f119021e = bhlp.mo63936a(h.f119034f);
            b.f119022f = bhlp.mo63936a(h.f119035g);
            b.f119024h = bhlp.mo63936a(h.f119037i);
            b.f119023g = bhlp.mo63936a(h.f119036h);
            bhlx a = b.mo63972a();
            this.f118998i = a;
            this.f119002m.mo63981a(a, this.f119007s.f118978k, mo63709d(), this.f118993d);
            m101110b(mo63957j(), this.f118992c);
            this.f119011w = false;
        }
        bhlq bhlq = this.f119007s;
        int i = bhlq.f118984q;
        if (bhlq.f118985r > 0) {
            int i2 = Build.VERSION.SDK_INT;
            if (!mo63967r() && !this.f118992c.isConvex()) {
                int i3 = Build.VERSION.SDK_INT;
            }
        }
        if (this.f119007s.f118989v == Paint.Style.FILL_AND_STROKE || this.f119007s.f118989v == Paint.Style.FILL) {
            mo63943a(canvas, this.f118999j, this.f118992c, this.f119007s.f118968a, mo63957j());
        }
        if (mo63696a()) {
            mo63943a(canvas, this.f119000k, this.f118993d, this.f118998i, mo63709d());
        }
        this.f118999j.setAlpha(alpha);
        this.f119000k.setAlpha(alpha2);
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f119007s;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        int i = this.f119007s.f118984q;
        if (mo63967r()) {
            outline.setRoundRect(getBounds(), mo63962n() * this.f119007s.f118978k);
            return;
        }
        m101110b(mo63957j(), this.f118992c);
        if (!this.f118992c.isConvex()) {
            int i2 = Build.VERSION.SDK_INT;
        }
        outline.setConvexPath(this.f118992c);
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f119007s.f118976i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        this.f118996g.set(getBounds());
        m101110b(mo63957j(), this.f118992c);
        this.f118997h.setPath(this.f118992c, this.f118996g);
        this.f118996g.op(this.f118997h, Region.Op.DIFFERENCE);
        return this.f118996g;
    }

    /* renamed from: h */
    public final bhlx mo63954h() {
        return this.f119007s.f118968a;
    }

    /* renamed from: i */
    public final ColorStateList mo63955i() {
        return this.f119007s.f118971d;
    }

    public final void invalidateSelf() {
        this.f119011w = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (super.isStateful() || ((colorStateList = this.f119007s.f118974g) != null && colorStateList.isStateful())) {
            return true;
        }
        bhlq bhlq = this.f119007s;
        ColorStateList colorStateList2 = bhlq.f118973f;
        ColorStateList colorStateList3 = bhlq.f118972e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f119007s.f118971d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final RectF mo63957j() {
        this.f118994e.set(getBounds());
        return this.f118994e;
    }

    /* renamed from: k */
    public final float mo63958k() {
        return this.f119007s.f118982o;
    }

    /* renamed from: l */
    public final float mo63959l() {
        float k = mo63958k();
        float f = this.f119007s.f118983p;
        return k + 0.0f;
    }

    /* renamed from: m */
    public final void mo63960m() {
        float l = mo63959l();
        this.f119007s.f118985r = (int) Math.ceil((double) (0.75f * l));
        this.f119007s.f118986s = (int) Math.ceil((double) (l * 0.25f));
        mo63707b();
        super.invalidateSelf();
    }

    public final Drawable mutate() {
        this.f119007s = new bhlq(this.f119007s);
        return this;
    }

    /* renamed from: n */
    public final float mo63962n() {
        return this.f119007s.f118968a.f119034f.mo63930a(mo63957j());
    }

    /* renamed from: o */
    public final float mo63963o() {
        return this.f119007s.f118968a.f119035g.mo63930a(mo63957j());
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f119011w = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean a = mo63703a(iArr);
        boolean b = mo63707b();
        boolean z = true;
        if (!a && !b) {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public final float mo63965p() {
        return this.f119007s.f118968a.f119037i.mo63930a(mo63957j());
    }

    /* renamed from: q */
    public final float mo63966q() {
        return this.f119007s.f118968a.f119036h.mo63930a(mo63957j());
    }

    /* renamed from: r */
    public final boolean mo63967r() {
        return this.f119007s.f118968a.mo63979a(mo63957j());
    }

    /* renamed from: s */
    public final void mo63968s() {
        this.f119001l.mo63929a(-12303292);
        this.f119007s.f118988u = false;
        super.invalidateSelf();
    }

    public void setAlpha(int i) {
        bhlq bhlq = this.f119007s;
        if (bhlq.f118980m != i) {
            bhlq.f118980m = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f119007s.f118970c = colorFilter;
        super.invalidateSelf();
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f119007s.f118974g = colorStateList;
        mo63707b();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        bhlq bhlq = this.f119007s;
        if (bhlq.f118975h != mode) {
            bhlq.f118975h = mode;
            mo63707b();
            super.invalidateSelf();
        }
    }

    public bhlr(Context context, AttributeSet attributeSet, int i, int i2) {
        this(bhlx.m101158a(context, attributeSet, i, i2).mo63972a());
    }

    /* renamed from: c */
    public final void mo63947c(float f) {
        bhlq bhlq = this.f119007s;
        if (bhlq.f118978k != f) {
            bhlq.f118978k = f;
            this.f119011w = true;
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public final void mo63949d(float f) {
        bhlq bhlq = this.f119007s;
        if (bhlq.f118982o != f) {
            bhlq.f118982o = f;
            mo63960m();
        }
    }

    public bhlr(bhlq bhlq) {
        this.f119008t = new bhme[4];
        this.f119009u = new bhme[4];
        this.f119010v = new BitSet(8);
        this.f118991b = new Matrix();
        this.f118992c = new Path();
        this.f118993d = new Path();
        this.f118994e = new RectF();
        this.f118995f = new RectF();
        this.f118996g = new Region();
        this.f118997h = new Region();
        this.f118999j = new Paint(1);
        this.f119000k = new Paint(1);
        this.f119001l = new bhlh();
        this.f119002m = new bhlz();
        this.f119005p = new RectF();
        this.f119012x = true;
        this.f119007s = bhlq;
        this.f119000k.setStyle(Paint.Style.STROKE);
        this.f118999j.setStyle(Paint.Style.FILL);
        f118990a.setColor(-1);
        f118990a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        mo63707b();
        mo63703a(getState());
        this.f119006q = new bhlo(this);
    }

    /* renamed from: b */
    private final boolean mo63707b() {
        PorterDuffColorFilter porterDuffColorFilter = this.f119003n;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f119004o;
        bhlq bhlq = this.f119007s;
        this.f119003n = m101106a(bhlq.f118974g, bhlq.f118975h, this.f118999j, true);
        bhlq bhlq2 = this.f119007s;
        ColorStateList colorStateList = bhlq2.f118973f;
        this.f119004o = m101106a(null, bhlq2.f118975h, this.f119000k, false);
        boolean z = this.f119007s.f118988u;
        if (!C1239oe.m19757a(porterDuffColorFilter, this.f119003n) || !C1239oe.m19757a(porterDuffColorFilter2, this.f119004o)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo63948c(ColorStateList colorStateList) {
        bhlq bhlq = this.f119007s;
        if (bhlq.f118971d != colorStateList) {
            bhlq.f118971d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: d */
    public final void mo63950d(ColorStateList colorStateList) {
        bhlq bhlq = this.f119007s;
        if (bhlq.f118972e != colorStateList) {
            bhlq.f118972e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: a */
    private final PorterDuffColorFilter m101106a(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int a;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = mo63697a(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        } else if (!z || (a = mo63697a((color = paint.getColor()))) == color) {
            return null;
        } else {
            return new PorterDuffColorFilter(a, PorterDuff.Mode.SRC_IN);
        }
    }

    /* renamed from: b */
    public final void mo63945b(float f) {
        mo63916a(this.f119007s.f118968a.mo63978a(f));
    }

    /* renamed from: b */
    public final void mo63946b(int i) {
        bhlq bhlq = this.f119007s;
        if (bhlq.f118987t != i) {
            bhlq.f118987t = i;
            super.invalidateSelf();
        }
    }

    /* renamed from: a */
    public static bhlr m101107a(Context context, float f) {
        int a = bhgk.m100861a(context, bhlr.class.getSimpleName());
        bhlr bhlr = new bhlr();
        bhlr.mo63942a(context);
        bhlr.mo63948c(ColorStateList.valueOf(a));
        bhlr.mo63949d(f);
        return bhlr;
    }

    public bhlr(bhlx bhlx) {
        this(new bhlq(bhlx));
    }

    /* renamed from: a */
    private final boolean mo63696a() {
        return (this.f119007s.f118989v == Paint.Style.FILL_AND_STROKE || this.f119007s.f118989v == Paint.Style.STROKE) && this.f119000k.getStrokeWidth() > 0.0f;
    }

    /* renamed from: a */
    private final boolean mo63703a(int[] iArr) {
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        boolean z = false;
        if (!(this.f119007s.f118971d == null || color2 == (colorForState2 = this.f119007s.f118971d.getColorForState(iArr, (color2 = this.f118999j.getColor()))))) {
            this.f118999j.setColor(colorForState2);
            z = true;
        }
        if (this.f119007s.f118972e == null || color == (colorForState = this.f119007s.f118972e.getColorForState(iArr, (color = this.f119000k.getColor())))) {
            return z;
        }
        this.f119000k.setColor(colorForState);
        return true;
    }

    /* renamed from: a */
    public final void mo63939a(float f) {
        this.f119007s.f118979l = f;
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo63940a(float f, int i) {
        mo63939a(f);
        mo63950d(ColorStateList.valueOf(i));
    }

    /* renamed from: a */
    public final void mo63941a(float f, ColorStateList colorStateList) {
        mo63939a(f);
        mo63950d(colorStateList);
    }

    /* renamed from: a */
    public final void mo63942a(Context context) {
        this.f119007s.f118969b = new bhid(context);
        mo63960m();
    }

    /* renamed from: a */
    public final void mo63943a(Canvas canvas, Paint paint, Path path, bhlx bhlx, RectF rectF) {
        if (bhlx.mo63979a(rectF)) {
            float a = bhlx.f119035g.mo63930a(rectF) * this.f119007s.f118978k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63944a(RectF rectF, Path path) {
        bhlz bhlz = this.f119002m;
        bhlq bhlq = this.f119007s;
        bhlz.mo63982a(bhlq.f118968a, bhlq.f118978k, rectF, this.f119006q, path);
    }

    /* renamed from: a */
    public final void mo63916a(bhlx bhlx) {
        this.f119007s.f118968a = bhlx;
        invalidateSelf();
    }
}
