package p000;

/* renamed from: chra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chra {

    /* renamed from: a */
    public final chqo f189022a;

    /* renamed from: b */
    private final chqh f189023b;

    public chra(chqh chqh, chqo chqo) {
        bmxy.m108582a(chqh, "transportAttrs");
        this.f189023b = chqh;
        bmxy.m108582a(chqo, "callOptions");
        this.f189022a = chqo;
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("transportAttrs", this.f189023b);
        a.mo66885a("callOptions", this.f189022a);
        return a.toString();
    }
}
