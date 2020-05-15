package p000;

import java.io.Closeable;

/* renamed from: behn */
final /* synthetic */ class behn implements Closeable {

    /* renamed from: a */
    private final Closeable f111565a;

    /* renamed from: b */
    private final Closeable f111566b;

    /* renamed from: c */
    private final Closeable f111567c;

    public behn(Closeable closeable, Closeable closeable2, Closeable closeable3) {
        this.f111565a = closeable;
        this.f111566b = closeable2;
        this.f111567c = closeable3;
    }

    public final void close() {
        Closeable closeable = this.f111565a;
        Closeable closeable2 = this.f111566b;
        Closeable closeable3 = this.f111567c;
        if (closeable3 != null) {
            try {
                closeable3.close();
            } catch (Throwable th) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th2) {
                        bqye.m113761a(th, th2);
                    }
                }
                throw th;
            }
        }
        if (closeable2 != null) {
            closeable2.close();
        }
        if (closeable != null) {
            closeable.close();
            return;
        }
        return;
        throw th;
    }
}
