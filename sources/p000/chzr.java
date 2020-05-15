package p000;

/* renamed from: chzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chzr extends cidl {

    /* renamed from: b */
    private boolean f189617b;

    /* renamed from: c */
    private final chuv f189618c;

    /* renamed from: d */
    private final chxt f189619d;

    public chzr(chuv chuv) {
        this(chuv, chxt.PROCESSED);
    }

    /* renamed from: a */
    public final void mo85760a(chxu chxu) {
        bmxy.m108601b(!this.f189617b, "already started");
        this.f189617b = true;
        chxu.mo85796a(this.f189618c, this.f189619d, new chtr());
    }

    public chzr(chuv chuv, chxt chxt) {
        bmxy.m108589a(!chuv.mo85689a(), "error must not be OK");
        this.f189618c = chuv;
        this.f189619d = chxt;
    }

    /* renamed from: a */
    public final void mo85761a(ciao ciao) {
        ciao.mo85876a("error", this.f189618c);
        ciao.mo85876a("progress", this.f189619d);
    }
}
