package p000;

import java.util.concurrent.ExecutorService;

/* renamed from: bdgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdgs {

    /* renamed from: b */
    public static final /* synthetic */ int f105600b = 0;

    /* renamed from: c */
    private static final bnrt f105601c = bnrt.m110178a("bdgs");

    /* renamed from: d */
    private static final bdgs f105602d = new bdgs(new bdgh());

    /* renamed from: e */
    private static volatile boolean f105603e = true;

    /* renamed from: f */
    private static volatile bdgs f105604f = f105602d;

    /* renamed from: a */
    public final bdgt f105605a;

    public bdgs(bdgt bdgt) {
        bmxy.m108581a(bdgt);
        this.f105605a = bdgt;
    }

    /* renamed from: a */
    public static bdgs m90764a() {
        if (f105604f == f105602d && f105603e) {
            f105603e = false;
            bnrq bnrq = (bnrq) f105601c.mo68388c();
            bnrq.mo68432a("bdgs", "a", 126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return f105604f;
    }

    /* renamed from: b */
    public final bdij mo58027b() {
        return this.f105605a.mo58003d();
    }

    /* renamed from: a */
    public static synchronized void m90765a(bdgr bdgr) {
        synchronized (bdgs.class) {
            if (f105604f == f105602d) {
                cijl cijl = ((bdfl) bdgr).f105506a;
                bdhc.m90787f();
                bdhc b = ((bdhd) cijl).mo6445a();
                bdfd.m90662a(b.f105625c);
                Runnable a = bdhc.m90786a(bljx.m107269a(new bdgx(b, new bdha(bdfd.m90662a(b.f105625c)), new bdhb(bdfd.m90662a(b.f105625c), b.f105626d))));
                b.f105632j.mo57990h();
                Runnable a2 = bdhc.m90786a(new bdgv(b, a, (ExecutorService) b.f105627e.mo6445a()));
                new bdgu(b);
                b.f105632j.mo57990h();
                a2.run();
                cazf.m127593a(b, "Cannot return null from a non-@Nullable @Provides method");
                bdgs bdgs = new bdgs(b);
                cazf.m127593a(bdgs, "Cannot return null from a non-@Nullable @Provides method");
                f105604f = bdgs;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdgt.a(bdij, java.lang.String, boolean):void
     arg types: [bdij, java.lang.String, int]
     candidates:
      bdgt.a(bdii, cinu, cimz):void
      bdgt.a(bdij, java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo58024a(bdij bdij, bdgg bdgg) {
        this.f105605a.mo57994a(bdij, bdgg.f105583a, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdgt.a(bdij, java.lang.String, boolean):void
     arg types: [bdij, java.lang.String, int]
     candidates:
      bdgt.a(bdii, cinu, cimz):void
      bdgt.a(bdij, java.lang.String, boolean):void */
    @Deprecated
    /* renamed from: a */
    public final void mo58025a(bdij bdij, String str) {
        this.f105605a.mo57994a(bdij, str, false);
    }

    /* renamed from: a */
    public final void mo58026a(bdnd bdnd) {
        this.f105605a.mo57996a(bdnd);
    }
}
