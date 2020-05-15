package p000;

/* renamed from: biw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum biw {
    OPERATION;
    

    /* renamed from: b */
    public bii f3341b;

    /* renamed from: c */
    public String f3342c;

    /* renamed from: d */
    public long f3343d;

    /* renamed from: e */
    private long f3344e;

    /* renamed from: a */
    public final void mo3170a() {
        if (this.f3341b != null) {
            this.f3341b = null;
            this.f3342c = null;
            this.f3344e = 0;
            this.f3343d = 0;
        }
    }

    /* renamed from: a */
    public final void mo3171a(bii bii) {
        if (this.f3341b != null) {
            long currentTimeMillis = System.currentTimeMillis();
            bix a = biy.m3166a();
            if (currentTimeMillis - this.f3344e > this.f3341b.f3315j) {
                this.f3344e = currentTimeMillis;
                this.f3341b = bii;
                a.mo3190h();
                return;
            }
            a.f3347c[34] = 92;
            throw new bic(bib.f3276f);
        }
        this.f3344e = System.currentTimeMillis();
        this.f3341b = bii;
    }
}
