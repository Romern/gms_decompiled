package p000;

/* renamed from: bsfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsfl extends bsgd {
    /* renamed from: a */
    public final void mo70511a() {
        boolean z;
        if (this.f144523d.f144497c == 6) {
            z = true;
        } else {
            z = false;
        }
        bxbm.m122543a(z, "Expected type# %s, but got type# %s.", 6, Integer.valueOf(this.f144523d.f144497c));
    }

    /* renamed from: a */
    public final void mo70512a(bsft bsft) {
        bsfs bsfs = this.f144523d;
        bsft.f144500a = bsfs.f144498d;
        double[] dArr = bsft.f144501b;
        dArr[2] = dArr[2] + bsfs.mo70516a(1);
    }
}
