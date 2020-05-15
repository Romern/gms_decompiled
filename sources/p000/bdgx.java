package p000;

import android.app.Application;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: bdgx */
final /* synthetic */ class bdgx implements Runnable {

    /* renamed from: a */
    private final bdhc f105611a;

    /* renamed from: b */
    private final bdha f105612b;

    /* renamed from: c */
    private final bdhb f105613c;

    public bdgx(bdhc bdhc, bdha bdha, bdhb bdhb) {
        this.f105611a = bdhc;
        this.f105612b = bdha;
        this.f105613c = bdhb;
    }

    public final void run() {
        CountDownLatch countDownLatch;
        bdhc bdhc = this.f105611a;
        bdha bdha = this.f105612b;
        bdhb bdhb = this.f105613c;
        try {
            bnrq bnrq = (bnrq) bdhc.f105623a.mo68390d();
            bnrq.mo68432a("bdhc", "a", 270, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("background initialization");
            blkh.m107286a();
            bdif bdif = (bdif) bdhc.f105628f.mo6445a();
            bdif.mo58068a(bdha);
            bdif.mo58068a(bdhb);
            Application application = bdhc.f105625c;
            cijl cijl = bdhc.f105629g;
            cijl.getClass();
            new bdgy(cijl);
            cijl cijl2 = bdhc.f105626d;
            cijl2.getClass();
            bdif.mo58066a(application, new bdgz(cijl2));
            if (!bdif.f105691b) {
                bdhc.f105629g.mo6445a();
                bdhc.f105630h.mo6445a();
                if (bdif.f105691b) {
                    bdhc.mo57999b();
                } else if (bdhc.f105633k.get() != null) {
                    bdfi bdfi = (bdfi) bdhc.f105631i.mo6445a();
                    if (!bdif.f105691b) {
                        bdgt bdgt = (bdgt) bdhc.f105633k.get();
                        if (!(bdgt instanceof bdgp) || !bdhc.f105633k.compareAndSet(bdgt, bdfi)) {
                            bdfi.mo57999b();
                        }
                        for (bdkj bdkj : (Set) bdhc.f105635m.mo6445a()) {
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
                        bdhc.mo57999b();
                    }
                }
            } else {
                bdhc.mo57999b();
            }
            countDownLatch = bdhc.f105634l;
        } catch (RuntimeException e) {
            try {
                bnrq bnrq2 = (bnrq) bdhc.f105623a.mo68388c();
                bnrq2.mo68437a(e);
                bnrq2.mo68432a("bdhc", "a", 273, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq2.mo68405a("Primes failed to initialize in the background");
                bdhc.mo57999b();
                countDownLatch = bdhc.f105634l;
            } catch (Throwable th) {
                bdhc.f105634l.countDown();
                throw th;
            }
        }
        countDownLatch.countDown();
    }
}
