package p000;

import java.util.concurrent.Executor;

/* renamed from: aere */
final /* synthetic */ class aere implements Runnable {

    /* renamed from: a */
    private final aerf f63656a;

    /* renamed from: b */
    private final aerh f63657b;

    /* renamed from: c */
    private final Executor f63658c;

    /* renamed from: d */
    private final Object f63659d;

    public aere(aerf aerf, aerh aerh, Executor executor, Object obj) {
        this.f63656a = aerf;
        this.f63657b = aerh;
        this.f63658c = executor;
        this.f63659d = obj;
    }

    public final void run() {
        aerf aerf = this.f63656a;
        aerh aerh = this.f63657b;
        Executor executor = this.f63658c;
        Object obj = this.f63659d;
        synchronized (aerf.f63660a) {
            if (aerf.f63660a.get(aerh) == executor) {
                aerh.mo34477a(obj);
            }
        }
    }
}
