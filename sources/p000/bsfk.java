package p000;

import java.util.Random;

/* renamed from: bsfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsfk extends bsgc {

    /* renamed from: a */
    private final Random f144475a;

    /* renamed from: b */
    private final double f144476b;

    /* renamed from: e */
    private final double f144477e = bsgl.m115743a(0.5d, 0.0d, 1.0d);

    public bsfk(bsgh bsgh, double d) {
        super(bsgh);
        this.f144475a = bsgh.mo70530b();
        this.f144476b = d;
    }

    /* renamed from: a */
    public final void mo70511a() {
        boolean z;
        if (this.f144523d.f144497c == 7) {
            z = true;
        } else {
            z = false;
        }
        bxbm.m122543a(z, "Expected type# %s, but got type# %s.", 7, Integer.valueOf(this.f144523d.f144497c));
    }

    /* renamed from: a */
    public final void mo70512a(bsft bsft) {
        double d;
        if (this.f144475a.nextDouble() < this.f144477e) {
            d = this.f144523d.mo70516a(0);
        } else {
            d = 0.0d;
        }
        bsft.f144500a = this.f144523d.f144498d;
        double[] dArr = bsft.f144501b;
        dArr[2] = (dArr[2] - d) + (this.f144522c.mo70526a() * this.f144476b);
    }
}
