package p000;

/* renamed from: bsfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsfr {

    /* renamed from: a */
    private final double[] f144495a;

    /* renamed from: b */
    private final int f144496b;

    public bsfr(int i) {
        this.f144496b = i;
        this.f144495a = new double[i];
    }

    /* renamed from: a */
    public final void mo70514a(int i, double d) {
        bxbm.m122544b(i < this.f144496b);
        bxbm.m122544b(true);
        this.f144495a[i] = d;
    }

    /* renamed from: a */
    public final double[] mo70515a() {
        return (double[]) this.f144495a.clone();
    }
}
