package p000;

/* renamed from: mkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mkk extends soa {

    /* renamed from: a */
    private static final lvn f33898a = new lvn("UsbSenderThread");

    /* renamed from: b */
    private final mkt f33899b;

    /* renamed from: c */
    private final mkj f33900c;

    public mkk(mkt mkt, mkj mkj) {
        super(9);
        this.f33899b = mkt;
        this.f33900c = mkj;
    }

    public final void run() {
        mkt mkt;
        mkj mkj;
        try {
            mkj = this.f33900c;
            while (mkj.f33891c.get()) {
                mkh mkh = (mkh) mkj.f33890b.take();
                mkj.mo20125a(mkh);
                while (true) {
                    if (mkj.f33891c.get()) {
                        if (!mkj.mo20129d(mkh)) {
                            break;
                        }
                    } else {
                        mkj.mo20128c(mkh);
                        break;
                    }
                }
            }
            mkh mkh2 = (mkh) mkj.f33892d.getAndSet(null);
            if (mkh2 != null) {
                mkj.mo20125a(mkh2);
                do {
                } while (mkj.mo20129d(mkh2));
            }
            mkj.mo20126b();
            mkj.f33893e.shutdownNow();
            mkt = this.f33899b;
        } catch (InterruptedException e) {
            try {
                f33898a.mo25414c("Caught interrupt exception; shutting down.", new Object[0]);
                Thread.currentThread().interrupt();
                mkt = this.f33899b;
            } catch (Throwable th) {
                this.f33899b.mo20137f();
                throw th;
            }
        } catch (Throwable th2) {
            mkj.f33893e.shutdownNow();
            throw th2;
        }
        mkt.mo20137f();
    }
}
