package p000;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: baqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baqq implements Closeable {

    /* renamed from: a */
    private final bobb f101565a = bobb.m111033a();

    /* renamed from: b */
    private boolean f101566b = false;

    /* renamed from: a */
    public final RuntimeException mo55887a(Throwable th, Class cls) {
        synchronized (this.f101565a) {
            bobb bobb = this.f101565a;
            bmxy.m108581a(th);
            bobb.f132487b = th;
            bmzo.m108690b(th, IOException.class);
            bmzo.m108690b(th, cls);
            throw new RuntimeException(th);
        }
    }

    public final void close() {
        synchronized (this.f101565a) {
            this.f101565a.close();
            this.f101566b = true;
        }
    }

    /* renamed from: a */
    public final void mo55888a(Closeable closeable) {
        bmxy.m108582a(closeable, "Can't register null resource to AsyncCloser!");
        synchronized (this.f101565a) {
            if (!this.f101566b) {
                this.f101565a.mo68842a(closeable);
            } else {
                try {
                    closeable.close();
                    e = null;
                } catch (IOException e) {
                    e = e;
                }
                throw new IOException("Can't register Closeable to already closed AsyncCloser!", e);
            }
        }
    }
}
