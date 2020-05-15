package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: bhih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhih extends Drawable {

    /* renamed from: a */
    public final Paint f118707a;

    /* renamed from: b */
    float f118708b;

    /* renamed from: c */
    public int f118709c;

    /* renamed from: d */
    public int f118710d;

    /* renamed from: e */
    public int f118711e;

    /* renamed from: f */
    public int f118712f;

    /* renamed from: g */
    public boolean f118713g = true;

    /* renamed from: h */
    public bhlx f118714h;

    /* renamed from: i */
    private final bhlz f118715i = new bhlz();

    /* renamed from: j */
    private final Path f118716j = new Path();

    /* renamed from: k */
    private final Rect f118717k = new Rect();

    /* renamed from: l */
    private final RectF f118718l = new RectF();

    /* renamed from: m */
    private final RectF f118719m = new RectF();

    /* renamed from: n */
    private final bhig f118720n = new bhig(this);

    /* renamed from: o */
    private int f118721o;

    /* renamed from: p */
    private ColorStateList f118722p;

    public bhih(bhlx bhlx) {
        this.f118714h = bhlx;
        Paint paint = new Paint(1);
        this.f118707a = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final RectF mo63795a() {
        this.f118719m.set(getBounds());
        return this.f118719m;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int[], float[], android.graphics.Shader$TileMode):void}
     arg types: [int, float, int, float, int[], float[], android.graphics.Shader$TileMode]
     candidates:
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, long, long, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, long[], float[], android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int, int, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int[], float[], android.graphics.Shader$TileMode):void} */
    public final void draw(Canvas canvas) {
        if (this.f118713g) {
            Paint paint = this.f118707a;
            Rect rect = this.f118717k;
            copyBounds(rect);
            float height = this.f118708b / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C1165lm.m19351a(this.f118709c, this.f118721o), C1165lm.m19351a(this.f118710d, this.f118721o), C1165lm.m19351a(C1165lm.m19355b(this.f118710d, 0), this.f118721o), C1165lm.m19351a(C1165lm.m19355b(this.f118712f, 0), this.f118721o), C1165lm.m19351a(this.f118712f, this.f118721o), C1165lm.m19351a(this.f118711e, this.f118721o)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f118713g = false;
        }
        float strokeWidth = this.f118707a.getStrokeWidth() / 2.0f;
        copyBounds(this.f118717k);
        this.f118718l.set(this.f118717k);
        float min = Math.min(this.f118714h.f119034f.mo63930a(mo63795a()), this.f118718l.width() / 2.0f);
        if (this.f118714h.mo63979a(mo63795a())) {
            this.f118718l.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f118718l, min, min, this.f118707a);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f118720n;
    }

    public final int getOpacity() {
        return this.f118708b > 0.0f ? -3 : -2;
    }

    public final void getOutline(Outline outline) {
        if (this.f118714h.mo63979a(mo63795a())) {
            outline.setRoundRect(getBounds(), this.f118714h.f119034f.mo63930a(mo63795a()));
            return;
        }
        copyBounds(this.f118717k);
        this.f118718l.set(this.f118717k);
        this.f118715i.mo63981a(this.f118714h, 1.0f, this.f118718l, this.f118716j);
        if (this.f118716j.isConvex()) {
            outline.setConvexPath(this.f118716j);
        }
    }

    public final boolean getPadding(Rect rect) {
        if (!this.f118714h.mo63979a(mo63795a())) {
            return true;
        }
        int round = Math.round(this.f118708b);
        rect.set(round, round, round, round);
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f118722p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f118713g = true;
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f118722p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f118721o)) == this.f118721o)) {
            this.f118713g = true;
            this.f118721o = colorForState;
        }
        if (this.f118713g) {
            invalidateSelf();
        }
        return this.f118713g;
    }

    public final void setAlpha(int i) {
        this.f118707a.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f118707a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo63796a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f118721o = colorStateList.getColorForState(getState(), this.f118721o);
        }
        this.f118722p = colorStateList;
        this.f118713g = true;
        invalidateSelf();
    }
}
