package p000;

/* renamed from: cibg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cibg implements cida {

    /* renamed from: a */
    final chyc f189706a;

    /* renamed from: b */
    boolean f189707b = false;

    /* renamed from: c */
    final /* synthetic */ cibi f189708c;

    public cibg(cibi cibi, chyc chyc) {
        this.f189708c = cibi;
        this.f189706a = chyc;
    }

    /* renamed from: a */
    public final void mo85891a() {
        this.f189708c.f189713d.mo85552a(2, "READY");
        this.f189708c.f189714e.execute(new cibd(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cibi.a(chyc, boolean):void
     arg types: [chyc, int]
     candidates:
      cibi.a(java.util.List, java.lang.String):void
      cibi.a(chyc, boolean):void */
    /* renamed from: b */
    public final void mo85894b() {
        bmxy.m108601b(this.f189707b, "transportShutdown() must be called before transportTerminated().");
        this.f189708c.f189713d.mo85553a(2, "{0} Terminated", this.f189706a.mo85595b());
        chsc chsc = this.f189708c.f189712c;
        chsc.m149478b(chsc.f189085e, this.f189706a);
        this.f189708c.mo85899a(this.f189706a, false);
        this.f189708c.f189714e.execute(new cibf(this));
    }

    /* renamed from: a */
    public final void mo85892a(chuv chuv) {
        this.f189708c.f189713d.mo85553a(2, "{0} SHUTDOWN with {1}", this.f189706a.mo85595b(), cibi.m149957b(chuv));
        this.f189707b = true;
        this.f189708c.f189714e.execute(new cibe(this, chuv));
    }

    /* renamed from: a */
    public final void mo85893a(boolean z) {
        this.f189708c.mo85899a(this.f189706a, z);
    }
}
