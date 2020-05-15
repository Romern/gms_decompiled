package p000;

import java.util.Random;

/* renamed from: bsfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsfm extends bsgc {

    /* renamed from: a */
    private static final double f144478a = Math.toRadians(10.0d);

    /* renamed from: b */
    private final Random f144479b;

    /* renamed from: e */
    private double f144480e;

    /* renamed from: f */
    private double f144481f;

    /* renamed from: g */
    private double f144482g;

    /* renamed from: h */
    private double f144483h;

    public bsfm(bsgh bsgh) {
        super(bsgh);
        this.f144479b = bsgh.mo70530b();
    }

    /* renamed from: a */
    public final void mo70511a() {
        boolean z;
        if (this.f144523d.f144497c == 8) {
            z = true;
        } else {
            z = false;
        }
        bxbm.m122543a(z, "Expected type# %s, but got type# %s.", 8, Integer.valueOf(this.f144523d.f144497c));
        bsfb bsfb = (bsfb) this.f144523d;
        this.f144480e = bsfb.f144430a.mo70516a(0);
        this.f144481f = bsfb.f144430a.mo70516a(1);
        this.f144482g = bsfb.f144430a.mo70516a(2);
        this.f144483h = Double.NaN;
        if (!Double.isNaN(bsfb.mo70516a(1))) {
            this.f144483h = bsfb.mo70516a(1);
        }
    }

    /* renamed from: b */
    public final void mo70513b() {
        this.f144483h = Double.NaN;
        this.f144482g = Double.NaN;
        this.f144480e = Double.NaN;
        this.f144481f = Double.NaN;
    }

    /* renamed from: a */
    public final void mo70512a(bsft bsft) {
        double d;
        bsft.f144500a = this.f144523d.f144498d;
        double a = this.f144522c.mo70526a() * this.f144482g;
        double nextDouble = this.f144479b.nextDouble() * 3.141592653589793d;
        if (Double.isNaN(this.f144483h)) {
            d = this.f144479b.nextDouble() * 6.283185307179586d;
        } else {
            d = this.f144483h + (this.f144479b.nextGaussian() * f144478a);
        }
        double[] dArr = bsft.f144501b;
        dArr[0] = this.f144480e + (Math.cos(nextDouble) * a);
        dArr[1] = this.f144481f + (Math.sin(nextDouble) * a);
        dArr[2] = d;
    }
}
