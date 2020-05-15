package p000;

/* renamed from: bsfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsfn extends bsgc {

    /* renamed from: a */
    private final double f144484a;

    /* renamed from: b */
    private final double f144485b;

    public bsfn(bsgh bsgh, double d, double d2) {
        super(bsgh);
        this.f144484a = bsgl.m115743a(d, 0.2d, 2.0d);
        this.f144485b = bsgl.m115743a(d2, 0.0d, 2.0d);
    }

    /* renamed from: a */
    public final void mo70511a() {
        boolean z;
        if (this.f144523d.f144497c == 4) {
            z = true;
        } else {
            z = false;
        }
        bxbm.m122543a(z, "Expected type# %s, but got type# %s.", 4, Integer.valueOf(this.f144523d.f144497c));
    }

    /* renamed from: a */
    public final void mo70512a(bsft bsft) {
        double[] dArr = bsft.f144501b;
        bsft.f144500a = this.f144523d.f144498d;
        double d = dArr[2];
        double a = (this.f144484a * 0.74d) + (this.f144522c.mo70526a() * this.f144485b);
        dArr[0] = dArr[0] + (Math.cos(d) * a);
        dArr[1] = dArr[1] + (a * Math.sin(d));
    }
}
