package p000;

/* renamed from: bfbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfbp {

    /* renamed from: a */
    public final bfat f113328a;

    /* renamed from: b */
    public float f113329b;

    /* renamed from: c */
    public float f113330c;

    /* renamed from: d */
    public float f113331d;

    /* renamed from: e */
    public float f113332e;

    /* renamed from: f */
    public int f113333f = 0;

    /* renamed from: g */
    public final float f113334g;

    public bfbp(int i, int i2, float f, float f2) {
        bmxy.m108589a(!Float.isNaN(f2), "Inter-Signal CN0 Bias (ISCB) should not be NaN.");
        this.f113328a = new bfat(i, i2, bfav.m96291a(i, (double) f));
        this.f113329b = f;
        this.f113334g = f2;
    }

    /* renamed from: a */
    public final int mo61365a() {
        return this.f113328a.f113259a.f113257a;
    }

    /* renamed from: b */
    public final int mo61366b() {
        return this.f113328a.f113259a.f113258b;
    }

    /* renamed from: c */
    public final boolean mo61367c() {
        return mo61368d() && this.f113330c > 0.0f;
    }

    /* renamed from: d */
    public final boolean mo61368d() {
        return this.f113331d > 10.0f;
    }
}
