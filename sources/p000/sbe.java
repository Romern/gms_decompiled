package p000;

/* renamed from: sbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sbe {

    /* renamed from: a */
    private final String f43989a;

    /* renamed from: b */
    private final rfz f43990b;

    /* renamed from: c */
    private Boolean f43991c;

    public sbe(String str) {
        rfz a = rfz.m33557a(rpr.m34216b());
        this.f43989a = str;
        this.f43990b = a;
    }

    /* renamed from: a */
    public final boolean mo25331a() {
        if (this.f43991c == null) {
            this.f43991c = Boolean.valueOf(this.f43990b.mo24610b(this.f43989a));
        }
        return this.f43991c.booleanValue();
    }

    /* renamed from: b */
    public final void mo25332b() {
        if (!mo25331a()) {
            throw new SecurityException(String.valueOf(this.f43989a).concat(" is not authorized"));
        }
    }
}
