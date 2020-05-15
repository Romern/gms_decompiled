package p000;

import android.app.Application;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdhc implements bdgt {

    /* renamed from: a */
    public static final bnrt f105623a = bnrt.m110178a("bdhc");

    /* renamed from: b */
    static final AtomicInteger f105624b = new AtomicInteger();

    /* renamed from: c */
    public final Application f105625c;

    /* renamed from: d */
    public final cijl f105626d;

    /* renamed from: e */
    public final cijl f105627e;

    /* renamed from: f */
    public final cijl f105628f;

    /* renamed from: g */
    public final cijl f105629g;

    /* renamed from: h */
    public final cijl f105630h;

    /* renamed from: i */
    public final cijl f105631i;

    /* renamed from: j */
    public final bdic f105632j;

    /* renamed from: k */
    public final AtomicReference f105633k = new AtomicReference();

    /* renamed from: l */
    public final CountDownLatch f105634l;

    /* renamed from: m */
    public final cijl f105635m;

    public bdhc(Application application, cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, bdic bdic, cijl cijl6, bdgp bdgp, cijl cijl7) {
        new AtomicBoolean();
        this.f105634l = new CountDownLatch(1);
        int i = Build.VERSION.SDK_INT;
        bmxy.m108600b(true);
        this.f105625c = application;
        this.f105626d = cijl;
        this.f105627e = cijl2;
        this.f105628f = cijl3;
        this.f105629g = cijl4;
        this.f105630h = cijl5;
        this.f105632j = bdic;
        this.f105631i = cijl7;
        this.f105635m = cijl6;
        f105624b.incrementAndGet();
        this.f105633k.set(bdgp);
    }

    /* renamed from: a */
    static Runnable m90786a(Runnable runnable) {
        return new bdgw(new AtomicReference(runnable));
    }

    /* renamed from: f */
    static void m90787f() {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: b */
    public final void mo57999b() {
        ((bdgt) this.f105633k.getAndSet(new bdgh())).mo57999b();
        try {
            Application application = this.f105625c;
            synchronized (bdfd.class) {
                if (bdfd.f105427a != null) {
                    bdff bdff = bdfd.f105427a.f105428b;
                    application.unregisterActivityLifecycleCallbacks(bdff.f105440b);
                    application.unregisterComponentCallbacks(bdff.f105440b);
                    bdfd.f105427a = null;
                }
            }
        } catch (RuntimeException e) {
            bnrq bnrq = (bnrq) f105623a.mo68388c();
            bnrq.mo68437a(e);
            bnrq.mo68432a("bdhc", "b", 346, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Failed to shutdown app lifecycle monitor");
        }
    }

    /* renamed from: c */
    public final void mo58002c() {
        mo58032a().mo58002c();
    }

    /* renamed from: d */
    public final bdij mo58003d() {
        return mo58032a().mo58003d();
    }

    /* renamed from: e */
    public final void mo58004e() {
        mo58032a().mo58004e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bdgt mo58032a() {
        return (bdgt) this.f105633k.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo58033a(bdha bdha, bdhb bdhb) {
        CountDownLatch countDownLatch;
        try {
            bnrq bnrq = (bnrq) f105623a.mo68390d();
            bnrq.mo68432a("bdhc", "a", 270, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("background initialization");
            blkh.m107286a();
            bdif bdif = (bdif) this.f105628f.mo6445a();
            bdif.mo58068a(bdha);
            bdif.mo58068a(bdhb);
            Application application = this.f105625c;
            cijl cijl = this.f105629g;
            cijl.getClass();
            new bdgy(cijl);
            cijl cijl2 = this.f105626d;
            cijl2.getClass();
            bdif.mo58066a(application, new bdgz(cijl2));
            if (!bdif.f105691b) {
                this.f105629g.mo6445a();
                this.f105630h.mo6445a();
                if (bdif.f105691b) {
                    mo57999b();
                } else if (this.f105633k.get() != null) {
                    bdfi bdfi = (bdfi) this.f105631i.mo6445a();
                    if (!bdif.f105691b) {
                        bdgt bdgt = (bdgt) this.f105633k.get();
                        if (!(bdgt instanceof bdgp) || !this.f105633k.compareAndSet(bdgt, bdfi)) {
                            bdfi.mo57999b();
                        }
                        for (bdkj bdkj : (Set) this.f105635m.mo6445a()) {
                            bdif.mo58068a(bdkj);
                            bdkj.mo58086c();
                            if (bdkj instanceof bdhy) {
                                bdhy bdhy = (bdhy) bdkj;
                                synchronized (bdha) {
                                    if (!bdha.f105617b) {
                                        bdha.f105616a.add(bdhy);
                                    } else {
                                        bdhy.mo58063a();
                                    }
                                }
                            }
                        }
                        if (!bdif.f105691b) {
                            bdgp bdgp = (bdgp) bdgt;
                            bdgp.mo58023a(bdfi);
                            synchronized (bdgp.f105597b) {
                                bdgp.f105596a = bdfi;
                            }
                            bdgp.mo58023a(bdfi);
                        }
                        bdgt.mo57999b();
                    } else {
                        mo57999b();
                    }
                }
            } else {
                mo57999b();
            }
            countDownLatch = this.f105634l;
        } catch (RuntimeException e) {
            try {
                bnrq bnrq2 = (bnrq) f105623a.mo68388c();
                bnrq2.mo68437a(e);
                bnrq2.mo68432a("bdhc", "a", 273, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq2.mo68405a("Primes failed to initialize in the background");
                mo57999b();
                countDownLatch = this.f105634l;
            } catch (Throwable th) {
                this.f105634l.countDown();
                throw th;
            }
        }
        countDownLatch.countDown();
    }

    /* renamed from: a */
    public final void mo57993a(bdii bdii, cinu cinu, cimz cimz) {
        mo58032a().mo57993a(bdii, cinu, (cimz) null);
    }

    /* renamed from: a */
    public final void mo57994a(bdij bdij, String str, boolean z) {
        mo58032a().mo57994a(bdij, str, z);
    }

    /* renamed from: a */
    public final void mo57995a(bdil bdil, String str, long j, long j2, cimz cimz) {
        mo58032a().mo57995a(bdil, str, j, j2, cimz);
    }

    /* renamed from: a */
    public final void mo57996a(bdnd bdnd) {
        mo58032a().mo57996a(bdnd);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo58034a(Runnable runnable, ExecutorService executorService) {
        try {
            bdhp.m90826a(bqga.m112776a(runnable, executorService));
        } catch (RuntimeException e) {
            bnrq bnrq = (bnrq) f105623a.mo68388c();
            bnrq.mo68437a(e);
            bnrq.mo68432a("bdhc", "a", 235, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Primes failed to initialize");
            mo57999b();
        }
        if (this.f105632j.mo57982a() == null) {
            executorService.shutdown();
        }
    }

    /* renamed from: a */
    public final void mo57997a(String str) {
        mo58032a().mo57997a(str);
    }
}
