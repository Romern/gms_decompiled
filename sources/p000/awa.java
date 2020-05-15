package p000;

import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: awa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awa {

    /* renamed from: a */
    public final float f2403a;

    /* renamed from: b */
    public final float f2404b;

    /* renamed from: c */
    public float f2405c;

    /* renamed from: d */
    private final int[] f2406d = {-16777216, 0};

    /* renamed from: e */
    private final float[] f2407e = {0.6f, 1.0f};

    /* renamed from: f */
    private final RectF f2408f = new RectF();

    /* renamed from: g */
    private final Paint f2409g;

    /* renamed from: h */
    private float f2410h;

    /* renamed from: i */
    private final float f2411i;

    public awa(float f, float f2, float f3) {
        Paint paint = new Paint();
        this.f2409g = paint;
        this.f2403a = f;
        this.f2404b = 0.0f;
        this.f2405c = f2;
        this.f2411i = f3;
        this.f2410h = f2 + f3 + (f * 0.0f);
        paint.setColor(-16777216);
        this.f2409g.setStyle(Paint.Style.FILL);
        this.f2409g.setAntiAlias(true);
        mo2736a();
    }

    /* renamed from: a */
    public final void mo2736a() {
        float f = this.f2405c + this.f2411i + (this.f2403a * 0.0f);
        this.f2410h = f;
        if (f > 0.0f) {
            this.f2409g.setShader(new RadialGradient(this.f2408f.centerX(), this.f2408f.centerY(), this.f2410h, this.f2406d, this.f2407e, Shader.TileMode.MIRROR));
        }
    }

    /* renamed from: a */
    public final void mo2737a(int i, int i2, int i3, int i4) {
        this.f2408f.set((float) i, (float) i2, (float) i3, (float) i4);
        mo2736a();
    }
}
