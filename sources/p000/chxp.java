package p000;

/* renamed from: chxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chxp implements chxu {

    /* renamed from: a */
    public final chqr f189469a;

    /* renamed from: b */
    public boolean f189470b;

    /* renamed from: c */
    final /* synthetic */ chxr f189471c;

    public chxp(chxr chxr, chqr chqr) {
        this.f189471c = chxr;
        bmxy.m108582a(chqr, "observer");
        this.f189469a = chqr;
    }

    /* renamed from: a */
    public final void mo85793a() {
        chtu chtu = this.f189471c.f189476b.f189149a;
        if (chtu != chtu.UNARY && chtu != chtu.SERVER_STREAMING) {
            int i = ciix.f190424a;
            this.f189471c.f189477c.execute(new chxo(this));
        }
    }

    /* renamed from: b */
    public final void mo85798b(chuv chuv, chtr chtr) {
        mo85796a(chuv, chxt.PROCESSED, chtr);
    }

    /* renamed from: a */
    public final void mo85794a(chtr chtr) {
        int i = ciix.f190424a;
        this.f189471c.f189477c.execute(new chxl(this, chtr));
    }

    /* renamed from: a */
    public final void mo85795a(chuv chuv, chtr chtr) {
        this.f189470b = true;
        this.f189471c.f189481g = true;
        try {
            this.f189471c.mo85800a(this.f189469a, chuv, chtr);
        } finally {
            this.f189471c.mo85799a();
            this.f189471c.f189478d.mo85787a(chuv.mo85689a());
        }
    }

    /* renamed from: a */
    public final void mo85796a(chuv chuv, chxt chxt, chtr chtr) {
        int i = ciix.f190424a;
        chrm c = this.f189471c.mo85802c();
        if (chuv.f189233s == chus.CANCELLED) {
            if (c != null) {
                if (c.mo85570a()) {
                    ciao ciao = new ciao();
                    this.f189471c.f189480f.mo85761a(ciao);
                    chuv chuv2 = chuv.f189219f;
                    String valueOf = String.valueOf(ciao);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("ClientCall was cancelled at or after deadline. ");
                    sb.append(valueOf);
                    chuv = chuv2.mo85690b(sb.toString());
                    chtr = new chtr();
                }
            }
        }
        this.f189471c.f189477c.execute(new chxn(this, chuv, chtr));
    }

    /* renamed from: a */
    public final void mo85797a(cidd cidd) {
        int i = ciix.f190424a;
        this.f189471c.f189477c.execute(new chxm(this, cidd));
    }
}
