package p000;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.support.wearable.complications.rendering.ComplicationStyle$Builder;
import android.text.TextPaint;

/* renamed from: afd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afd {

    /* renamed from: a */
    public final TextPaint f359a;

    /* renamed from: b */
    public final TextPaint f360b;

    /* renamed from: c */
    public final Paint f361c;

    /* renamed from: d */
    public final Paint f362d;

    /* renamed from: e */
    public final Paint f363e;

    /* renamed from: f */
    public final Paint f364f;

    /* renamed from: g */
    public final Paint f365g;

    /* renamed from: h */
    public final afg f366h;

    /* renamed from: i */
    public final boolean f367i;

    /* renamed from: j */
    public final boolean f368j;

    /* renamed from: k */
    public final boolean f369k;

    /* renamed from: l */
    public final ColorFilter f370l;

    public afd(afg afg, boolean z, boolean z2, boolean z3) {
        boolean z4;
        ColorFilter colorFilter;
        this.f366h = afg;
        this.f367i = z;
        this.f368j = z2;
        this.f369k = z3;
        if (!z) {
            z4 = true;
        } else {
            z4 = !z2;
        }
        if (z2) {
            ComplicationStyle$Builder complicationStyle$Builder = new ComplicationStyle$Builder(afg);
            if (afg.f404b != -16777216) {
                complicationStyle$Builder.f1388a = 0;
            }
            complicationStyle$Builder.f1390c = -1;
            complicationStyle$Builder.f1391d = -1;
            complicationStyle$Builder.f1397j = -1;
            int i = afg.f414l;
            if (!(i == -16777216 || i == 0)) {
                complicationStyle$Builder.f1398k = -1;
            }
            complicationStyle$Builder.f1404q = -1;
            if (afg.f422t != -16777216) {
                complicationStyle$Builder.f1405r = 0;
            }
            afg = complicationStyle$Builder.mo1810a();
        }
        TextPaint textPaint = new TextPaint();
        this.f359a = textPaint;
        textPaint.setColor(afg.f406d);
        this.f359a.setAntiAlias(z4);
        this.f359a.setTypeface(afg.f408f);
        this.f359a.setTextSize((float) afg.f410h);
        this.f359a.setAntiAlias(z4);
        if (z4) {
            colorFilter = new PorterDuffColorFilter(afg.f413k, PorterDuff.Mode.SRC_IN);
        } else {
            int i2 = afg.f413k;
            colorFilter = new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, (float) Color.red(i2), 0.0f, 0.0f, 0.0f, 0.0f, (float) Color.green(i2), 0.0f, 0.0f, 0.0f, 0.0f, (float) Color.blue(i2), 0.0f, 0.0f, 0.0f, 255.0f, -32385.0f}));
        }
        this.f370l = colorFilter;
        TextPaint textPaint2 = new TextPaint();
        this.f360b = textPaint2;
        textPaint2.setColor(afg.f407e);
        this.f360b.setAntiAlias(z4);
        this.f360b.setTypeface(afg.f409g);
        this.f360b.setTextSize((float) afg.f411i);
        this.f360b.setAntiAlias(z4);
        Paint paint = new Paint();
        this.f361c = paint;
        paint.setColor(afg.f421s);
        this.f361c.setStyle(Paint.Style.STROKE);
        this.f361c.setAntiAlias(z4);
        this.f361c.setStrokeWidth((float) afg.f420r);
        Paint paint2 = new Paint();
        this.f362d = paint2;
        paint2.setColor(afg.f422t);
        this.f362d.setStyle(Paint.Style.STROKE);
        this.f362d.setAntiAlias(z4);
        this.f362d.setStrokeWidth((float) afg.f420r);
        Paint paint3 = new Paint();
        this.f363e = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f363e.setColor(afg.f414l);
        if (afg.f415m == 2) {
            this.f363e.setPathEffect(new DashPathEffect(new float[]{(float) afg.f416n, (float) afg.f417o}, 0.0f));
        }
        if (afg.f415m == 0) {
            this.f363e.setAlpha(0);
        }
        this.f363e.setStrokeWidth((float) afg.f419q);
        this.f363e.setAntiAlias(z4);
        Paint paint4 = new Paint();
        this.f364f = paint4;
        paint4.setColor(afg.f404b);
        this.f364f.setAntiAlias(z4);
        Paint paint5 = new Paint();
        this.f365g = paint5;
        paint5.setColor(afg.f423u);
        this.f365g.setAntiAlias(z4);
    }

    /* renamed from: a */
    public final boolean mo561a() {
        return this.f367i && this.f369k;
    }
}
