package p000;

/* renamed from: kjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kjk {

    /* renamed from: d */
    private static final bnic f24251d = bnic.m109489a(kpb.UNKNOWN_DATA_TYPE);

    /* renamed from: a */
    public bnia f24252a = bnic.m109500j();

    /* renamed from: b */
    public bnha f24253b = bnhe.m109414h();

    /* renamed from: c */
    public int f24254c = 0;

    /* renamed from: e */
    private final kom f24255e;

    /* renamed from: f */
    private lbc f24256f = lbc.UNKNOWN_DETECTION_METHOD;

    public kjk(kom kom) {
        this.f24255e = kom;
    }

    /* renamed from: a */
    public final kjl mo14524a() {
        bnic bnic;
        kom kom = this.f24255e;
        if (kom != null) {
            bnic a = this.f24252a.mo67751a();
            if (!a.isEmpty()) {
                bnic = a;
            } else {
                bnic = f24251d;
            }
            return new kji(kom, bnic, this.f24256f, this.f24254c, this.f24253b.mo67618b());
        }
        throw new IllegalStateException("setViewNode() must be called before build().");
    }

    /* renamed from: b */
    public final void mo14527b(Iterable iterable) {
        bnia j = bnic.m109500j();
        j.mo67752b(iterable);
        this.f24252a = j;
    }

    /* renamed from: a */
    public final void mo14525a(Iterable iterable) {
        this.f24252a.mo67752b(iterable);
    }

    /* renamed from: a */
    public final void mo14526a(lbc lbc) {
        bmxy.m108581a(lbc);
        this.f24256f = lbc;
    }
}
