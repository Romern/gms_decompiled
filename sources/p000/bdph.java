package p000;

/* renamed from: bdph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdph extends bdpc implements bdkj {

    /* renamed from: a */
    public final bdpq f106207a;

    /* renamed from: b */
    private final bdpc f106208b;

    public bdph(bdpe bdpe, bdpq bdpq) {
        this.f106208b = bdpe;
        this.f106207a = bdpq;
    }

    /* renamed from: a */
    public final synchronized bdij mo58260a() {
        bdij a;
        a = this.f106208b.mo58260a();
        if (!bdij.m90860a(a) && this.f106207a.mo58280a("")) {
            bdik.m90868d(a);
        }
        return a;
    }

    /* renamed from: b */
    public final void mo58031b() {
        this.f106207a.mo58277a();
    }

    /* renamed from: c */
    public final void mo58086c() {
    }

    /* renamed from: a */
    public final synchronized bqgg mo58261a(bdij bdij, String str, boolean z) {
        bqgg a;
        a = this.f106208b.mo58261a(bdij, str, z);
        a.mo741a(new bdpg(this, bdij, str), bqfb.INSTANCE);
        return a;
    }

    /* renamed from: a */
    public final bqgg mo58262a(String str, boolean z, long j, long j2, cimz cimz) {
        return this.f106208b.mo58262a(str, true, j, j2, cimz);
    }
}
