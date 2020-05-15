package p000;

import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: afv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afv {

    /* renamed from: a */
    public final float f472a;

    /* renamed from: b */
    public final float f473b;

    /* renamed from: c */
    public float f474c;

    /* renamed from: d */
    private final int[] f475d = {-16777216, 0};

    /* renamed from: e */
    private final float[] f476e = {0.6f, 1.0f};

    /* renamed from: f */
    private final RectF f477f = new RectF();

    /* renamed from: g */
    private final Paint f478g;

    /* renamed from: h */
    private float f479h;

    /* renamed from: i */
    private final float f480i;

    public afv(float f, float f2, float f3) {
        Paint paint = new Paint();
        this.f478g = paint;
        this.f472a = f;
        this.f473b = 0.0f;
        this.f474c = f2;
        this.f480i = f3;
        this.f479h = f2 + f3 + (f * 0.0f);
        paint.setColor(-16777216);
        this.f478g.setStyle(Paint.Style.FILL);
        this.f478g.setAntiAlias(true);
        mo621a();
    }

    /* renamed from: a */
    public final void mo621a() {
        float f = this.f474c + this.f480i + (this.f472a * 0.0f);
        this.f479h = f;
        if (f > 0.0f) {
            this.f478g.setShader(new RadialGradient(this.f477f.centerX(), this.f477f.centerY(), this.f479h, this.f475d, this.f476e, Shader.TileMode.MIRROR));
        }
    }

    /* renamed from: a */
    public final void mo622a(int i, int i2, int i3, int i4) {
        this.f477f.set((float) i, (float) i2, (float) i3, (float) i4);
        mo621a();
    }
}
