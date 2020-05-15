package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: bsgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsgr extends bsgi {

    /* renamed from: b */
    public final double f144541b;

    /* renamed from: c */
    private final double f144542c;

    /* renamed from: d */
    private final boolean f144543d;

    /* renamed from: e */
    private final double f144544e;

    /* renamed from: f */
    private double f144545f;

    /* renamed from: g */
    private boolean f144546g;

    public bsgr(double d, double d2, boolean z) {
        this.f144544e = d;
        this.f144541b = d2;
        this.f144542c = bsgl.m115742a(d2, 1.0d);
        this.f144543d = z;
    }

    /* renamed from: a */
    public final double mo70531a(bsft bsft) {
        if (!this.f144546g) {
            return 1.0d;
        }
        double a = bsgo.m115750a(bsft.f144501b, this.f144528a);
        if (!this.f144543d) {
            return bsgl.m115742a(a, this.f144545f);
        }
        double d = this.f144541b;
        double d2 = this.f144545f;
        return a < d * d2 ? bsgl.m115742a(a, d2) : this.f144542c;
    }

    /* renamed from: a */
    public final void mo70532a() {
        boolean z;
        int i = this.f144528a.f144497c;
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = i == 2;
        }
        bxbm.m122543a(z, "Expected GNSS (type# = %s), WIFI (type# = %s) or debug (type# >= %s), but got type# %s.", 1, 2, Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR), Integer.valueOf(this.f144528a.f144497c));
        double a = this.f144528a.mo70516a(2) * this.f144544e;
        this.f144545f = a;
        if (a > 0.1d) {
            z2 = true;
        }
        this.f144546g = z2;
    }
}
