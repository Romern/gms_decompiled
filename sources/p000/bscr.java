package p000;

/* renamed from: bscr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bscr extends bsbq {

    /* renamed from: b */
    long f144107b = 0;

    /* renamed from: c */
    private final bsct f144108c;

    /* renamed from: d */
    private final long f144109d;

    public bscr(bsct bsct, long j) {
        this.f144108c = bsct;
        this.f144109d = j;
        this.f144002a = new bsct[]{bsct};
    }

    /* renamed from: a */
    public final bsbl mo70206a() {
        return this.f144108c.mo70206a();
    }

    /* renamed from: b */
    public final long mo70214b() {
        return this.f144108c.mo70214b();
    }

    /* renamed from: a */
    public final void mo70208a(long j, float f, float f2) {
        if (j > this.f144107b + this.f144109d) {
            this.f144108c.mo70216d();
        }
        this.f144108c.mo70208a(j, f, f2);
    }

    /* renamed from: a */
    public final void mo70209a(long j, bsbl bsbl) {
        if (j > this.f144107b + this.f144109d) {
            this.f144108c.mo70216d();
        }
        this.f144107b = j;
        this.f144108c.mo70209a(j, bsbl);
    }

    /* renamed from: a */
    public final void mo70212a(long j, bsde bsde) {
        if (j > this.f144107b + this.f144109d) {
            this.f144108c.mo70216d();
        }
        this.f144108c.mo70212a(j, bsde);
    }
}
