package p000;

/* renamed from: cidk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cidk extends chqi {

    /* renamed from: a */
    public final chxv f189913a;

    /* renamed from: b */
    public final chtv f189914b;

    /* renamed from: c */
    public final chtr f189915c;

    /* renamed from: d */
    public final chqo f189916d;

    /* renamed from: e */
    public final chrk f189917e;

    /* renamed from: f */
    public final Object f189918f = new Object();

    /* renamed from: g */
    public chxs f189919g;

    /* renamed from: h */
    public boolean f189920h;

    /* renamed from: i */
    chzf f189921i;

    public cidk(chxv chxv, chtv chtv, chtr chtr, chqo chqo) {
        this.f189913a = chxv;
        this.f189914b = chtv;
        this.f189915c = chtr;
        this.f189916d = chqo;
        this.f189917e = chrk.m149453a();
    }

    /* renamed from: a */
    public final void mo85539a(chuv chuv) {
        bmxy.m108589a(!chuv.mo85689a(), "Cannot fail with OK status");
        bmxy.m108601b(!this.f189920h, "apply() or fail() already called");
        mo85990a(new chzr(chuv));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r3.f189921i == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        p000.bmxy.m108601b(r1, "delayedStream is null");
        r3.f189921i.mo85839a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo85990a(chxs chxs) {
        boolean z = true;
        bmxy.m108601b(!this.f189920h, "already finalized");
        this.f189920h = true;
        synchronized (this.f189918f) {
            if (this.f189919g == null) {
                this.f189919g = chxs;
            }
        }
    }
}
