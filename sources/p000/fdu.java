package p000;

/* renamed from: fdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fdu {

    /* renamed from: a */
    public final feh f16344a;

    /* renamed from: b */
    public final fcg f16345b;

    /* renamed from: c */
    public final feo f16346c;

    /* renamed from: d */
    public final fdn f16347d;

    /* renamed from: e */
    public final C0036av f16348e = new C0036av();

    /* renamed from: f */
    public final C0034at f16349f;

    public fdu(fcg fcg, feh feh, feo feo, fdb fdb, fdn fdn) {
        this.f16345b = fcg;
        this.f16344a = feh;
        this.f16346c = feo;
        this.f16347d = fdn;
        this.f16349f = fdn.f16324b;
        if (feo.mo10756b().f147589b == 1 || feo.mo10756b().f147589b == 11100) {
            this.f16348e.mo2450b(fdt.PENDING);
            this.f16348e.mo2667a(this.f16349f, new fdq(this));
            epl.m10910a(this.f16348e, fdb.f16305b, new fdr(this));
            epl.m10910a(this.f16348e, fdb.f16306c, new fds(this));
            return;
        }
        this.f16348e.mo2450b(fdt.NAVIGATION);
    }
}
