package p000;

/* renamed from: bljb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bljb implements Runnable, blji {

    /* renamed from: a */
    private bljg f126658a;

    /* renamed from: b */
    private bljg f126659b;

    /* renamed from: c */
    private final boolean f126660c = beel.m91854a();

    /* renamed from: d */
    private boolean f126661d;

    /* renamed from: e */
    private boolean f126662e;

    public bljb(bljg bljg) {
        this.f126658a = bljg;
        this.f126659b = bljg;
    }

    /* renamed from: a */
    private final void m107231a() {
        boolean z = true;
        this.f126661d = true;
        bljg bljg = this.f126658a;
        if (!this.f126660c || this.f126662e || !beel.m91854a()) {
            z = false;
        }
        bljg.mo66582a(z);
        this.f126658a = null;
    }

    public final void close() {
        bljg bljg = this.f126659b;
        this.f126659b = null;
        try {
            if (!this.f126662e) {
                if (!this.f126661d) {
                    m107231a();
                } else {
                    throw new IllegalStateException("Span was already closed!");
                }
            }
        } finally {
            blkh.m107288a(bljg);
        }
    }

    public final void run() {
        if (!this.f126661d && this.f126662e) {
            m107231a();
        } else {
            beel.m91852a(blja.f126657a);
        }
    }

    /* renamed from: a */
    public final void mo66586a(bqgg bqgg) {
        if (this.f126661d) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        } else if (!this.f126662e) {
            this.f126662e = true;
            bqgg.mo741a(this, bqfb.INSTANCE);
        } else {
            throw new IllegalStateException("Signal is already attached to future");
        }
    }
}
