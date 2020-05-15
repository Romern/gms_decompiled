package p000;

/* renamed from: caxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class caxi implements ciqq {

    /* renamed from: a */
    final /* synthetic */ caxn f176310a;

    /* renamed from: b */
    private final ciqb f176311b = new ciqb(this.f176310a.f176327c.mo74932df());

    /* renamed from: c */
    private boolean f176312c;

    public caxi(caxn caxn) {
        this.f176310a = caxn;
    }

    /* renamed from: a */
    public final void mo74930a(cipu cipu, long j) {
        if (this.f176312c) {
            throw new IllegalStateException("closed");
        } else if (j != 0) {
            ciqk ciqk = (ciqk) this.f176310a.f176327c;
            if (!ciqk.f191245c) {
                ciqk.f191243a.mo86323j(j);
                ciqk.mo86330p();
                this.f176310a.f176327c.mo86293b("\r\n");
                this.f176310a.f176327c.mo74930a(cipu, j);
                this.f176310a.f176327c.mo86293b("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    public final synchronized void close() {
        if (!this.f176312c) {
            this.f176312c = true;
            this.f176310a.f176327c.mo86293b("0\r\n\r\n");
            caxn.m127472a(this.f176311b);
            this.f176310a.f176328d = 3;
        }
    }

    /* renamed from: df */
    public final ciqt mo74932df() {
        return this.f176311b;
    }

    public final synchronized void flush() {
        if (!this.f176312c) {
            this.f176310a.f176327c.flush();
        }
    }
}
