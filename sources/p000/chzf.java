package p000;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: chzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class chzf implements chxs {

    /* renamed from: a */
    private volatile boolean f189568a;

    /* renamed from: b */
    private chxu f189569b;

    /* renamed from: c */
    private chuv f189570c;

    /* renamed from: d */
    public chxs f189571d;

    /* renamed from: e */
    private List f189572e = new ArrayList();

    /* renamed from: f */
    private chze f189573f;

    /* renamed from: g */
    private long f189574g;

    /* renamed from: h */
    private long f189575h;

    /* renamed from: a */
    private final void m149820a(Runnable runnable) {
        synchronized (this) {
            if (!this.f189568a) {
                this.f189572e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r8.f189572e = null;
        r8.f189568a = true;
        r3 = r8.f189573f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r3 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r4 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r3.f189567c.isEmpty() != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r5 = r3.f189567c;
        r3.f189567c = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        r4 = r5.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (r6 >= r4) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        ((java.lang.Runnable) r5.get(r6)).run();
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        r5.clear();
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r3.f189567c = null;
        r3.f189566b = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r0 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r2 >= r0) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        ((java.lang.Runnable) r1.get(r2)).run();
        r2 = r2 + 1;
     */
    /* renamed from: b */
    private final void m149821b() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                int i = 0;
                if (this.f189572e.isEmpty()) {
                    break;
                }
                list = this.f189572e;
                this.f189572e = arrayList;
            }
            list.clear();
            arrayList = list;
        }
    }

    /* renamed from: a */
    public final chqh mo85735a() {
        throw null;
    }

    /* renamed from: c */
    public final void mo85765c(int i) {
        if (!this.f189568a) {
            m149820a(new chyo(this, i));
        } else {
            this.f189571d.mo85765c(i);
        }
    }

    /* renamed from: f */
    public final void mo85767f() {
        m149820a(new chyy(this));
    }

    /* renamed from: g */
    public final void mo85782g() {
        if (!this.f189568a) {
            m149820a(new chyw(this));
        } else {
            this.f189571d.mo85782g();
        }
    }

    /* renamed from: a */
    public final void mo85757a(int i) {
        if (!this.f189568a) {
            m149820a(new chys(this, i));
        } else {
            this.f189571d.mo85757a(i);
        }
    }

    /* renamed from: a */
    public final void mo85779a(chre chre) {
        bmxy.m108582a(chre, "compressor");
        m149820a(new chyp(this, chre));
    }

    /* renamed from: a */
    public final void mo85758a(chrm chrm) {
        m149820a(new chyt(this, chrm));
    }

    /* renamed from: a */
    public final void mo85759a(chrp chrp) {
        bmxy.m108582a(chrp, "decompressorRegistry");
        m149820a(new chyq(this, chrp));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85839a(chxs chxs) {
        synchronized (this) {
            if (this.f189571d == null) {
                bmxy.m108582a(chxs, "stream");
                m149822b(chxs);
                m149821b();
            }
        }
    }

    /* renamed from: a */
    public final void mo85760a(chxu chxu) {
        boolean z;
        chuv chuv;
        boolean z2;
        if (this.f189569b == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "already started");
        synchronized (this) {
            bmxy.m108582a(chxu, "listener");
            this.f189569b = chxu;
            chuv = this.f189570c;
            z2 = this.f189568a;
            if (!z2) {
                chze chze = new chze(chxu);
                this.f189573f = chze;
                chxu = chze;
            }
            this.f189574g = System.nanoTime();
        }
        if (chuv != null) {
            chxu.mo85798b(chuv, new chtr());
        } else if (!z2) {
            m149820a(new chyu(this, chxu));
        } else {
            this.f189571d.mo85760a(chxu);
        }
    }

    /* renamed from: b */
    private final void m149822b(chxs chxs) {
        boolean z;
        chxs chxs2 = this.f189571d;
        if (chxs2 == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108605b(z, "realStream already set to %s", chxs2);
        this.f189571d = chxs;
        this.f189575h = System.nanoTime();
    }

    /* renamed from: b */
    public final void mo85763b(int i) {
        if (!this.f189568a) {
            m149820a(new chyr(this, i));
        } else {
            this.f189571d.mo85763b(i);
        }
    }

    /* renamed from: b */
    public void mo85764b(chuv chuv) {
        boolean z;
        chxu chxu;
        bmxy.m108582a(chuv, "reason");
        synchronized (this) {
            if (this.f189571d == null) {
                m149822b(cidl.f189922a);
                chxu = this.f189569b;
                this.f189570c = chuv;
                z = false;
            } else {
                z = true;
                chxu = null;
            }
        }
        if (z) {
            m149820a(new chyx(this, chuv));
            return;
        }
        if (chxu != null) {
            chxu.mo85798b(chuv, new chtr());
        }
        m149821b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo85761a(ciao ciao) {
        synchronized (this) {
            if (this.f189569b == null) {
                return;
            }
            if (this.f189571d == null) {
                ciao.mo85876a("buffered_nanos", Long.valueOf(System.nanoTime() - this.f189574g));
                ciao.mo85875a("waiting_for_connection");
            } else {
                ciao.mo85876a("buffered_nanos", Long.valueOf(this.f189575h - this.f189574g));
                this.f189571d.mo85761a(ciao);
            }
        }
    }

    /* renamed from: a */
    public final void mo85780a(InputStream inputStream) {
        bmxy.m108582a(inputStream, "message");
        if (this.f189568a) {
            this.f189571d.mo85780a(inputStream);
        } else {
            m149820a(new chyv(this, inputStream));
        }
    }
}
