package p000;

/* renamed from: cict */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cict extends chwt {

    /* renamed from: a */
    final chsl f189784a;

    /* renamed from: b */
    final chse f189785b;

    /* renamed from: c */
    final chxg f189786c;

    /* renamed from: d */
    final chxh f189787d;

    /* renamed from: e */
    cibi f189788e;

    /* renamed from: f */
    boolean f189789f;

    /* renamed from: g */
    boolean f189790g;

    /* renamed from: h */
    chvb f189791h;

    /* renamed from: i */
    final /* synthetic */ cicv f189792i;

    public cict(cicv cicv, chsl chsl, cick cick) {
        this.f189792i = cicv;
        bmxy.m108582a(chsl, "args");
        this.f189784a = chsl;
        bmxy.m108582a(cick, "helper");
        this.f189785b = chse.m149480a("Subchannel", cicv.mo70054a());
        chse chse = this.f189785b;
        long a = cicv.f189836k.mo86026a();
        String valueOf = String.valueOf(chsl.f189097a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("Subchannel for ");
        sb.append(valueOf);
        this.f189787d = new chxh(chse, a, sb.toString());
        this.f189786c = new chxg(this.f189787d, cicv.f189836k);
    }

    /* renamed from: a */
    public final void mo85607a() {
        this.f189792i.mo85954a("Subchannel.shutdown()");
        this.f189792i.f189837l.execute(new cics(this));
    }

    /* renamed from: b */
    public final void mo85608b() {
        this.f189792i.mo85954a("Subchannel.requestConnection()");
        bmxy.m108601b(this.f189789f, "not started");
        this.f189788e.mo85895a();
    }

    public final String toString() {
        return this.f189785b.toString();
    }
}
