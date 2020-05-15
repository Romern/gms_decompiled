package p000;

/* renamed from: sob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sob implements Runnable {

    /* renamed from: a */
    final /* synthetic */ soc f44839a;

    /* renamed from: b */
    private Runnable f44840b;

    /* renamed from: c */
    private Thread f44841c = null;

    /* renamed from: d */
    private bliy f44842d;

    public sob(soc soc, Runnable runnable, bliy bliy) {
        this.f44839a = soc;
        this.f44840b = runnable;
        this.f44842d = bliy;
    }

    /* renamed from: a */
    private final Runnable m35726a(Runnable runnable) {
        if (runnable instanceof snb) {
            snb snb = (snb) runnable;
            this.f44842d = snc.m35690a(snb.mo25764a(), this.f44842d);
            return snb.mo25765b();
        }
        m35727a();
        return runnable;
    }

    /* renamed from: b */
    private final void m35728b() {
        this.f44839a.f44846d.lock();
        try {
            this.f44839a.f44844b.remove(this.f44841c);
            Runnable runnable = (Runnable) this.f44839a.f44845c.poll();
            if (runnable != null) {
                soc soc = this.f44839a;
                soc.f44843a.execute(new sob(soc, runnable, null));
            } else {
                soc soc2 = this.f44839a;
                int i = soc2.f44848f - 1;
                soc2.f44848f = i;
                if (i == 0) {
                    soc2.f44847e.signalAll();
                }
            }
        } finally {
            this.f44839a.f44846d.unlock();
        }
    }

    public final void run() {
        bliy bliy = this.f44842d;
        if (bliy == null) {
            this.f44840b = m35726a(this.f44840b);
        } else {
            blkh.m107287a(bliy, blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        }
        try {
            this.f44841c = Thread.currentThread();
            this.f44839a.f44846d.lock();
            soc soc = this.f44839a;
            if (soc.f44851i) {
                this.f44840b = null;
            }
            soc.f44844b.add(this.f44841c);
            soc soc2 = this.f44839a;
            soc2.f44850h = Math.max(soc2.f44850h, soc2.f44844b.size());
            this.f44839a.f44846d.unlock();
            Runnable runnable = this.f44840b;
            if (runnable != null) {
                m35729b(runnable);
                this.f44840b = null;
            }
            while (true) {
                Runnable runnable2 = (Runnable) this.f44839a.f44845c.poll();
                if (runnable2 != null) {
                    m35729b(m35726a(runnable2));
                } else {
                    m35728b();
                    m35727a();
                    return;
                }
            }
        } catch (Throwable th) {
            m35727a();
            throw th;
        }
    }

    /* renamed from: a */
    private final void m35727a() {
        snc.m35692a(this.f44842d);
        this.f44842d = null;
    }

    /* renamed from: b */
    private final void m35729b(Runnable runnable) {
        if (Thread.interrupted()) {
            this.f44839a.f44846d.lock();
            try {
                soc soc = this.f44839a;
                boolean z = soc.f44851i;
                soc.f44846d.unlock();
                if (z) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th) {
                this.f44839a.f44846d.unlock();
                throw th;
            }
        }
        try {
            this.f44839a.beforeExecute(this.f44841c, runnable);
            Throwable th2 = null;
            try {
                runnable.run();
                this.f44839a.afterExecute(runnable, (Throwable) null);
                return;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
            }
            this.f44839a.afterExecute(runnable, th2);
            throw th;
        } finally {
            this.f44839a.f44849g.incrementAndGet();
        }
    }
}
