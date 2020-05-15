package p000;

import android.content.Context;
import android.os.Looper;
import com.felicanetworks.mfc.Felica;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

/* renamed from: bfhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfhg extends Thread {

    /* renamed from: a */
    public volatile bfew f113886a;

    /* renamed from: b */
    public volatile bsax f113887b;

    /* renamed from: c */
    public bffs f113888c;

    /* renamed from: d */
    public bfgg f113889d;

    /* renamed from: e */
    public final bhdb f113890e;

    /* renamed from: f */
    public final Object f113891f = new Object();

    /* renamed from: g */
    public volatile boolean f113892g = false;

    /* renamed from: h */
    private volatile Context f113893h;

    /* renamed from: i */
    private volatile bfek f113894i;

    /* renamed from: j */
    private volatile bfge f113895j;

    /* renamed from: k */
    private final Integer f113896k;

    /* renamed from: l */
    private final bfko f113897l;

    /* renamed from: m */
    private final bgnx f113898m;

    /* renamed from: n */
    private final bsax f113899n;

    /* renamed from: o */
    private final bgns f113900o;

    /* renamed from: p */
    private final CountDownLatch f113901p;

    public bfhg(bgns bgns, Context context, bfek bfek, CountDownLatch countDownLatch, bfko bfko, bgnx bgnx, bsax bsax, Integer num, bfew bfew, bhdb bhdb) {
        new bfhe(this);
        setName("SignalCollector.ScannerThread");
        setPriority(4);
        this.f113894i = bfek;
        this.f113893h = context;
        this.f113886a = bfew;
        this.f113896k = num;
        this.f113890e = bhdb;
        this.f113901p = countDownLatch;
        this.f113899n = bsax;
        this.f113897l = bfko;
        this.f113898m = bgnx;
        this.f113900o = bgns;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0270, code lost:
        if (r7.mo61539c().contains(p000.bfgt.f113814d) == false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x03b7, code lost:
        if (r4 != false) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x03b9, code lost:
        r0 = "RealCollector: Nothing to scan.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x03be, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x03c6, code lost:
        r0 = e;
     */
    public final void run() {
        boolean z;
        bgnx bgnx;
        bfew bfew;
        boolean z2;
        bfev bfev;
        bhdb bhdb;
        bfho bfho;
        bfew bfew2;
        bfga bfga;
        bsax bsax;
        Integer num;
        this.f113900o.mo62923b(bgnq.COLLECTIONLIB_SIG_COLLECTOR, 600000, this.f113894i.mo61537a());
        try {
            Looper.prepare();
            bfhf bfhf = new bfhf(this);
            try {
                this.f113894i = this.f113894i.mo61549m();
                synchronized (this.f113891f) {
                    try {
                        bfgg bfgg = new bfgg(this.f113900o, bfhf, this.f113890e);
                        this.f113889d = bfgg;
                        Context context = this.f113893h;
                        bfek bfek = this.f113894i;
                        bfko bfko = this.f113897l;
                        bgnx bgnx2 = this.f113898m;
                        Integer num2 = this.f113896k;
                        bsax bsax2 = this.f113899n;
                        bfew bfew3 = this.f113886a;
                        bfgg.f113753i = bfek;
                        bgmj a = bfek.mo61537a();
                        if (bfek.mo61555s() != 4) {
                            ArrayList arrayList = new ArrayList();
                            int s = bfek.mo61555s();
                            int i = s - 1;
                            if (s != 0) {
                                if (i == 1) {
                                    bfew2 = bfew3;
                                    bsax = bsax2;
                                    num = num2;
                                    bgnx = bgnx2;
                                    bfga = new bffw(bfgg.f113752h, bfek.mo61540d(), bfek.mo61546j(), bfew2, bfgg.f113749e, new bfhd(bfek.mo61551o()), a);
                                } else if (i == 2) {
                                    bfew2 = bfew3;
                                    bsax = bsax2;
                                    num = num2;
                                    bgnx = bgnx2;
                                    bfga = new bfgm(context, bfgg.f113752h, 3, new bfhd(bfek.mo61551o()), null, bfek.mo61540d(), bfek.mo61546j(), bfew2, bfgm.m96657b(), bfgg.f113749e, a);
                                } else if (i == 4) {
                                    arrayList.add(new bffw(bfgg.f113752h, bfek.mo61540d(), bfek.mo61546j(), bfew3, bfgg.f113749e, new bfhd(bfek.mo61551o()), a));
                                    arrayList.add(new bfga(bfew3, bfgg.f113749e));
                                    bfga = new bfex(bfew3, bfgg.f113749e, arrayList);
                                    bfew2 = bfew3;
                                    bsax = bsax2;
                                    num = num2;
                                    bgnx = bgnx2;
                                } else if (i != 5) {
                                    bfga = new bfga(bfew3, bfgg.f113749e);
                                    bfew2 = bfew3;
                                    bsax = bsax2;
                                    num = num2;
                                    bgnx = bgnx2;
                                } else {
                                    arrayList.add(new bffw(bfgg.f113752h, bfek.mo61540d(), bfek.mo61546j(), bfew3, bfgg.f113749e, new bfhd(bfek.mo61551o()), a));
                                    arrayList.add(new bfga(bfew3, bfgg.f113749e, false));
                                    bfga = new bfex(bfew3, bfgg.f113749e, arrayList);
                                    bfew2 = bfew3;
                                    bsax = bsax2;
                                    num = num2;
                                    bgnx = bgnx2;
                                }
                                bfgg.f113747c = new bffj(bfga, context.getPackageName(), bfek.mo61538b(), num, bsax, new bgof());
                                bfew = bfew2;
                            } else {
                                throw null;
                            }
                        } else {
                            bgnx = bgnx2;
                            bfew = bfew3;
                            bfgg.f113747c = new bfgv(bfew);
                        }
                        bfgg.f113748d = new bfev(bfgg.f113747c, bfgg.f113745a);
                        if (!bfek.mo61552p()) {
                            bgns bgns = bfgg.f113752h;
                            Set c = bfek.mo61539c();
                            Map n = bfek.mo61550n();
                            boolean h = bfek.mo61544h();
                            long g = bfek.mo61543g();
                            bfgy i2 = bfek.mo61545i();
                            long e = bfek.mo61541e();
                            long f = bfek.mo61542f();
                            boolean k = bfek.mo61547k();
                            bfev bfev2 = bfgg.f113748d;
                            boolean l = bfek.mo61548l();
                            bhdb bhdb2 = bfgg.f113749e;
                            bfev bfev3 = bfev2;
                            if (bfek.mo61555s() == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int r = bfek.mo61554r();
                            int q = bfek.mo61553q();
                            if (h) {
                                bhdb = bhdb2;
                                bfev = bfev3;
                                bfho = new bfho(bgns, bfeb.m96484a(context, bgns, bhdb2), g, bhdb2, z2, null, false);
                            } else {
                                bhdb = bhdb2;
                                bfev = bfev3;
                                bfho = null;
                            }
                            bfgg.f113746b = new bfey(context, c, n, bfho, i2, bfko, bgnx, e, f, k, bfev, l, bfew, bhdb, a, r, q);
                        } else {
                            bfgg.f113751g = bfeb.m96484a(context, bfgg.f113752h, bfgg.f113749e);
                            String valueOf = String.valueOf(UUID.randomUUID());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
                            sb.append("RealCollector");
                            sb.append(valueOf);
                            bfgg.f113750f = sb.toString();
                            if (bfek.mo61539c().size() != 1) {
                            }
                            if (bfek.mo61539c().size() == 2) {
                                if (bfek.mo61539c().contains(bfgt.f113814d) && bfek.mo61539c().contains(bfgt.f113824n)) {
                                    bfgg.f113746b = new bfey(context, bfek.mo61539c(), bfek.mo61550n(), new bfho(bfgg.f113752h, bfgg.f113751g, 60000, bfgg.f113749e, false, a, true), null, bfko, bgnx, bfek.mo61541e(), bfek.mo61542f(), false, bfgg.f113748d, bfek.mo61548l(), bfew, bfgg.f113749e, a, bfek.mo61554r(), bfek.mo61553q());
                                    for (bfgt bfgt : bfek.mo61539c()) {
                                        bfgg.f113751g.mo61524a(bfgg.f113750f, bfgt, bfek.mo61536a(bfgt), Felica.MAX_TIMEOUT);
                                    }
                                }
                            }
                            String valueOf2 = String.valueOf(bfek.mo61539c());
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 58);
                            sb2.append("This type of sensor batching is not supported. Sensor Type");
                            sb2.append(valueOf2);
                            sb2.toString();
                            z = false;
                        }
                        new Object[1][0] = bfek;
                        if (bfgg.f113746b.f113610a.size() <= 0) {
                            z = false;
                        } else if (bfek.mo61544h()) {
                            bfey bfey = bfgg.f113746b;
                            bfey.mo61670a(new bffz(bfey, bfgg.f113748d), null);
                            z = true;
                        } else if (bfek.mo61545i() != null) {
                            if (bfek.mo61545i().f113855e == 0) {
                                bfey bfey2 = bfgg.f113746b;
                                bfey2.mo61670a(new bfff(bfey2, bfgg.f113748d, bfek.mo61545i()), null);
                                z = true;
                            } else {
                                bfey bfey3 = bfgg.f113746b;
                                bfey3.mo61670a(new bfhc(bfey3, bfgg.f113748d, bfek.mo61545i()), null);
                                z = true;
                            }
                        } else if (bfek.mo61543g() != 0) {
                            bfey bfey4 = bfgg.f113746b;
                            bfey4.mo61670a(new bfhx(bfey4, bfgg.f113748d, bfek.mo61543g()), null);
                            z = true;
                        } else {
                            bfgg.f113746b.mo61671a((bfgr) null);
                            z = true;
                        }
                        try {
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z = false;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                z = false;
                String str = String.format("Failed normalize configuration: %s", e.getMessage());
                if (!z && this.f113886a != null) {
                    this.f113886a.mo60954a(str);
                }
                this.f113901p.countDown();
                if (z) {
                    Looper.loop();
                }
                String.valueOf(getName()).concat(" is quitting.");
                if (this.f113900o.mo62924b(bgnq.COLLECTIONLIB_SIG_COLLECTOR)) {
                    this.f113900o.mo62925c(bgnq.COLLECTIONLIB_SIG_COLLECTOR);
                }
                synchronized (this.f113891f) {
                    this.f113893h = null;
                    this.f113894i = null;
                    this.f113889d = null;
                }
            }
        } catch (Throwable th4) {
            if (this.f113900o.mo62924b(bgnq.COLLECTIONLIB_SIG_COLLECTOR)) {
                this.f113900o.mo62925c(bgnq.COLLECTIONLIB_SIG_COLLECTOR);
            }
            synchronized (this.f113891f) {
                this.f113893h = null;
                this.f113894i = null;
                this.f113889d = null;
                throw th4;
            }
        }
    }
}
