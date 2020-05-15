package p000;

/* renamed from: bgpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgpg extends bgtb {

    /* renamed from: a */
    public final bmzi f117193a;

    /* renamed from: b */
    public long f117194b;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public bgpg(bmzi bmzi, bgsq bgsq) {
        super(bgsq);
        this.f117193a = bmzi;
    }

    /* renamed from: a */
    public final int mo63067a() {
        return !mo63070d() ? 3 : 2;
    }

    /* renamed from: b */
    public final void mo63068b() {
    }

    /* renamed from: c */
    public final void mo63069c() {
    }

    /* renamed from: d */
    public final boolean mo63070d() {
        return this.f117194b > ((Long) this.f117193a.mo6606a()).longValue() + 10000;
    }
}
