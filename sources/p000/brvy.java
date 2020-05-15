package p000;

/* renamed from: brvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brvy extends chul {

    /* renamed from: a */
    final /* synthetic */ brvz f143493a;

    /* renamed from: b */
    private chtr f143494b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public brvy(brvz brvz, chqr chqr) {
        super(chqr);
        this.f143493a = brvz;
    }

    /* renamed from: a */
    public final void mo25569a(chtr chtr) {
        this.f143494b = chtr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: chqo.a(chqn, java.lang.Object):chqo
     arg types: [chqn, boolean]
     candidates:
      chqo.a(long, java.util.concurrent.TimeUnit):chqo
      chqo.a(chqn, java.lang.Object):chqo */
    /* renamed from: a */
    public final void mo25570a(chuv chuv, chtr chtr) {
        chus chus = chuv.f189233s;
        if (!chus.equals(chus.UNAUTHENTICATED) && !chus.equals(chus.PERMISSION_DENIED)) {
            chtr chtr2 = this.f143494b;
            if (chtr2 != null) {
                this.f189187j.mo25569a(chtr2);
                this.f143494b = null;
            }
            this.f189187j.mo25570a(chuv, chtr);
            return;
        }
        brvz brvz = this.f143493a;
        synchronized (brvz.f143495a) {
            brvz.f143497c = brvz.f143498d.mo70053a(brvz.f143499e, brvz.f143500f.mo85545a(brvs.f143476a, (Object) true));
            for (Runnable runnable : brvz.f143496b) {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    public final void mo25571a(Object obj) {
        chtr chtr = this.f143494b;
        if (chtr != null) {
            this.f189187j.mo25569a(chtr);
            this.f143494b = null;
        }
        this.f189187j.mo25571a(obj);
    }
}
