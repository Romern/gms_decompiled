package p000;

import java.util.concurrent.Callable;

/* renamed from: aeaw */
final /* synthetic */ class aeaw implements Callable {

    /* renamed from: a */
    private final aebc f63018a;

    /* renamed from: b */
    private final aecc f63019b;

    public aeaw(aebc aebc, aecc aecc) {
        this.f63018a = aebc;
        this.f63019b = aecc;
    }

    public final Object call() {
        aebc aebc = this.f63018a;
        aecc aecc = this.f63019b;
        if (cdnj.m134210f()) {
            synchronized (aebc.f63042j) {
                aebc.f63042j.put(aecc.f63128a, Thread.currentThread());
            }
        }
        try {
            int a = aebc.f63045m.mo6269a(aecc);
            synchronized (aebc.f63042j) {
                aebc.f63042j.remove(aecc.f63128a);
            }
            return Integer.valueOf(a);
        } catch (Throwable th) {
            synchronized (aebc.f63042j) {
                aebc.f63042j.remove(aecc.f63128a);
                throw th;
            }
        }
    }
}
