package p000;

import java.util.concurrent.Callable;

/* renamed from: beem */
final /* synthetic */ class beem implements Callable {

    /* renamed from: a */
    private final beeq f111427a;

    public beem(beeq beeq) {
        this.f111427a = beeq;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return null;
     */
    public final Object call() {
        beeq beeq = this.f111427a;
        synchronized (beeq) {
            if (beeq.f111442g == null) {
                return null;
            }
            beeq.mo60625e();
            if (beeq.mo60622c()) {
                beeq.mo60620b();
                beeq.f111444i = 0;
            }
        }
    }
}
