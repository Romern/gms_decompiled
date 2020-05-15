package p000;

/* renamed from: klt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class klt {

    /* renamed from: a */
    public final bnha f24435a = bnhe.m109414h();

    /* renamed from: b */
    private final bngs f24436b = bngx.m109377j();

    /* renamed from: c */
    private final bngs f24437c = bngx.m109377j();

    /* renamed from: d */
    private kjx f24438d;

    /* renamed from: a */
    public final klu mo14684a() {
        kjx kjx = this.f24438d;
        if (kjx != null) {
            return new klu(this.f24436b.mo67664a(), this.f24437c.mo67664a(), kjx, this.f24435a.mo67618b());
        }
        throw new IllegalStateException("setActivityComponentName() must be called before build().");
    }

    /* renamed from: b */
    public final void mo14687b(Iterable iterable) {
        this.f24436b.mo67666b(iterable);
    }

    /* renamed from: a */
    public final void mo14685a(Iterable iterable) {
        this.f24437c.mo67666b(iterable);
    }

    /* renamed from: a */
    public final void mo14686a(kjx kjx) {
        bmxy.m108581a(kjx);
        this.f24438d = kjx;
    }
}
