package p000;

import java.util.concurrent.Executor;

/* renamed from: bhbo */
final /* synthetic */ class bhbo implements Runnable {

    /* renamed from: a */
    private final bhbr f118265a;

    /* renamed from: b */
    private final bhbp f118266b;

    /* renamed from: c */
    private final Executor f118267c;

    /* renamed from: d */
    private final bfkr f118268d;

    public bhbo(bhbr bhbr, bhbp bhbp, Executor executor, bfkr bfkr) {
        this.f118265a = bhbr;
        this.f118266b = bhbp;
        this.f118267c = executor;
        this.f118268d = bfkr;
    }

    public final void run() {
        Executor executor;
        bhbr bhbr = this.f118265a;
        bhbp bhbp = this.f118266b;
        Executor executor2 = this.f118267c;
        bfkr bfkr = this.f118268d;
        synchronized (bhbr.f118272b) {
            executor = (Executor) bhbr.f118272b.get(bhbp);
        }
        if (executor == executor2) {
            bhbp.mo61257a(bfkr);
        }
    }
}
