package p000;

/* renamed from: kjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kjq {

    /* renamed from: a */
    private kck f24270a;

    /* renamed from: b */
    private kjx f24271b;

    /* renamed from: c */
    private final bngs f24272c = bngx.m109377j();

    /* renamed from: a */
    public final kjr mo14540a() {
        kck kck = this.f24270a;
        if (kck != null) {
            kjx kjx = this.f24271b;
            if (kjx != null) {
                return new kjr(kck, kjx, this.f24272c.mo67664a());
            }
            throw new IllegalStateException("setActivityComponentName() must be called before build().");
        }
        throw new IllegalStateException("setApplicationDomain() must be called before build().");
    }

    /* renamed from: a */
    public final void mo14541a(Iterable iterable) {
        this.f24272c.mo67666b(iterable);
    }

    /* renamed from: a */
    public final void mo14542a(kck kck) {
        bmxy.m108581a(kck);
        this.f24270a = kck;
    }

    /* renamed from: a */
    public final void mo14543a(kjx kjx) {
        bmxy.m108581a(kjx);
        this.f24271b = kjx;
    }
}
