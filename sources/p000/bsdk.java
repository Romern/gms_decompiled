package p000;

import com.google.location.bluemoon.inertialanchor.Pose;

/* renamed from: bsdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsdk extends bsdi implements btvl {

    /* renamed from: e */
    private static final long f144176e = bsgk.m115738a(0.1d);

    /* renamed from: c */
    public double f144177c = Double.NEGATIVE_INFINITY;

    /* renamed from: d */
    public double f144178d = 0.0d;

    public bsdk(bsfy bsfy) {
        super(bsfy);
    }

    /* renamed from: a */
    public final void mo62281a(float f) {
    }

    /* renamed from: a */
    public final void mo62285a(Pose pose) {
    }

    /* renamed from: b */
    public final void mo70270b(int i, long j) {
        if (i == this.f144170b) {
            mo70266a(new bsfs(bsgk.m115737a(j)));
        }
    }

    /* renamed from: d */
    public final void mo62286d() {
    }

    /* renamed from: a */
    public final void mo62282a(float f, float f2, long j) {
        double d = this.f144177c;
        double d2 = this.f144178d;
        double d3 = (double) f;
        Double.isNaN(d3);
        double d4 = d2 + d3;
        this.f144178d = d4;
        double d5 = (double) j;
        Double.isNaN(d5);
        if (d5 - d >= ((double) f144176e)) {
            mo70269a(1, j, (double) f2, d4);
            this.f144178d = 0.0d;
            this.f144177c = d5;
        }
    }

    /* renamed from: a */
    public final void mo70268a(int i, long j, double d) {
        if (i == this.f144170b) {
            mo70266a(new bsfs(bsgk.m115737a(j), d));
        }
    }

    /* renamed from: a */
    public final void mo70269a(int i, long j, double d, double d2) {
        if (i == this.f144170b) {
            mo70266a(new bsfs(bsgk.m115737a(j), d, d2));
        }
    }

    /* renamed from: a */
    public final void mo62283a(long j) {
        mo70270b(1, j);
    }

    /* renamed from: a */
    public final void mo62284a(long j, float f) {
        mo70268a(1, j, (double) f);
    }
}
