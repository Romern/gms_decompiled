package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: beo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class beo {

    /* renamed from: a */
    private final axw f3102a;

    /* renamed from: b */
    public final Object f3103b;

    /* renamed from: c */
    public Object f3104c;

    /* renamed from: d */
    public final Interpolator f3105d;

    /* renamed from: e */
    public final float f3106e;

    /* renamed from: f */
    public Float f3107f;

    /* renamed from: g */
    public float f3108g;

    /* renamed from: h */
    public float f3109h;

    /* renamed from: i */
    public int f3110i;

    /* renamed from: j */
    public int f3111j;

    /* renamed from: k */
    public PointF f3112k;

    /* renamed from: l */
    public PointF f3113l;

    /* renamed from: m */
    private float f3114m;

    /* renamed from: n */
    private float f3115n;

    public beo(axw axw, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.f3108g = -3987645.8f;
        this.f3109h = -3987645.8f;
        this.f3110i = 784923401;
        this.f3111j = 784923401;
        this.f3114m = Float.MIN_VALUE;
        this.f3115n = Float.MIN_VALUE;
        this.f3112k = null;
        this.f3113l = null;
        this.f3102a = axw;
        this.f3103b = obj;
        this.f3104c = obj2;
        this.f3105d = interpolator;
        this.f3106e = f;
        this.f3107f = f2;
    }

    /* renamed from: a */
    public final boolean mo3068a(float f) {
        return f >= mo3069b() && f < mo3070c();
    }

    /* renamed from: b */
    public final float mo3069b() {
        axw axw = this.f3102a;
        if (axw == null) {
            return 0.0f;
        }
        float f = this.f3114m;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float b = (this.f3106e - axw.f2514h) / axw.mo2860b();
        this.f3114m = b;
        return b;
    }

    /* renamed from: c */
    public final float mo3070c() {
        float f = 1.0f;
        if (this.f3102a == null) {
            return 1.0f;
        }
        float f2 = this.f3115n;
        if (f2 != Float.MIN_VALUE) {
            return f2;
        }
        if (this.f3107f != null) {
            f = ((this.f3107f.floatValue() - this.f3106e) / this.f3102a.mo2860b()) + mo3069b();
        }
        this.f3115n = f;
        return f;
    }

    /* renamed from: d */
    public final boolean mo3071d() {
        return this.f3105d == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f3103b + ", endValue=" + this.f3104c + ", startFrame=" + this.f3106e + ", endFrame=" + this.f3107f + ", interpolator=" + this.f3105d + '}';
    }

    public beo(Object obj) {
        this.f3108g = -3987645.8f;
        this.f3109h = -3987645.8f;
        this.f3110i = 784923401;
        this.f3111j = 784923401;
        this.f3114m = Float.MIN_VALUE;
        this.f3115n = Float.MIN_VALUE;
        this.f3112k = null;
        this.f3113l = null;
        this.f3102a = null;
        this.f3103b = obj;
        this.f3104c = obj;
        this.f3105d = null;
        this.f3106e = Float.MIN_VALUE;
        this.f3107f = Float.valueOf(Float.MAX_VALUE);
    }
}
