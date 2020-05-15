package p000;

/* renamed from: cawd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawd implements ciqq {

    /* renamed from: d */
    public static final /* synthetic */ int f176214d = 0;

    /* renamed from: a */
    public boolean f176215a;

    /* renamed from: b */
    public boolean f176216b;

    /* renamed from: c */
    final /* synthetic */ cawg f176217c;

    /* renamed from: e */
    private final cipu f176218e = new cipu();

    public cawd(cawg cawg) {
        this.f176217c = cawg;
    }

    /* renamed from: a */
    private final void m127371a(boolean z) {
        cawg cawg;
        long min;
        boolean z2;
        synchronized (this.f176217c) {
            this.f176217c.f176234i.mo86273c();
            while (true) {
                try {
                    cawg = this.f176217c;
                    if (cawg.f176227b <= 0 && !this.f176216b && !this.f176215a) {
                        if (cawg.f176235j != null) {
                            break;
                        }
                        cawg.mo75012h();
                    }
                } catch (Throwable th) {
                    this.f176217c.f176234i.mo75000b();
                    throw th;
                }
            }
            cawg.f176234i.mo75000b();
            this.f176217c.mo75011g();
            min = Math.min(this.f176217c.f176227b, this.f176218e.f191213b);
            this.f176217c.f176227b -= min;
        }
        this.f176217c.f176234i.mo86273c();
        try {
            cawg cawg2 = this.f176217c;
            cawc cawc = cawg2.f176229d;
            int i = cawg2.f176228c;
            if (!z || min != this.f176218e.f191213b) {
                z2 = false;
            } else {
                z2 = true;
            }
            cawc.mo74988a(i, z2, this.f176218e, min);
        } finally {
            this.f176217c.f176234i.mo75000b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r13.f176218e.f191213b > 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        m127371a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r0.f176229d.mo74988a(r0.f176228c, true, null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r1 = r13.f176217c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r13.f176215a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r13.f176217c.f176229d.mo74991b();
        r13.f176217c.mo75010f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0008, code lost:
        r0 = r13.f176217c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r0.f176232g.f176216b != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r13.f176218e.f191213b <= 0) goto L_0x0029;
     */
    public final void close() {
        synchronized (this.f176217c) {
            if (this.f176215a) {
            }
        }
    }

    /* renamed from: df */
    public final ciqt mo74932df() {
        return this.f176217c.f176234i;
    }

    public final void flush() {
        synchronized (this.f176217c) {
            this.f176217c.mo75011g();
        }
        while (this.f176218e.f191213b > 0) {
            m127371a(false);
            this.f176217c.f176229d.mo74991b();
        }
    }

    /* renamed from: a */
    public final void mo74930a(cipu cipu, long j) {
        this.f176218e.mo74930a(cipu, j);
        while (this.f176218e.f191213b >= 16384) {
            m127371a(false);
        }
    }
}
