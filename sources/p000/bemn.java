package p000;

import java.io.Closeable;

/* renamed from: bemn */
final /* synthetic */ class bemn implements Closeable {

    /* renamed from: a */
    private final bend f111835a;

    public bemn(bend bend) {
        this.f111835a = bend;
    }

    public final void close() {
        boolean z;
        bend bend = this.f111835a;
        synchronized (bend.f111857k) {
            int i = bend.f111860n;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108602b(z, "Refcount went negative!", i);
            bend.f111860n--;
            bend.mo60808b();
        }
    }
}
