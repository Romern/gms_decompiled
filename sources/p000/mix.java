package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* renamed from: mix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mix implements Runnable {

    /* renamed from: c */
    private static final lvn f33803c = new lvn("ConduitRunnable");

    /* renamed from: a */
    public final mjj f33804a;

    /* renamed from: b */
    public final mht f33805b;

    /* renamed from: d */
    private final InputStream f33806d;

    /* renamed from: e */
    private final ExecutorService f33807e;

    /* renamed from: f */
    private final byte[] f33808f = new byte[8192];

    public mix(mjj mjj, ExecutorService executorService, mht mht, InputStream inputStream) {
        this.f33804a = mjj;
        this.f33807e = executorService;
        this.f33805b = mht;
        this.f33806d = inputStream;
    }

    public final void run() {
        InputStream inputStream;
        do {
            try {
                int read = this.f33806d.read(this.f33808f, 0, 8192);
                if (read == -1) {
                    break;
                }
                this.f33807e.execute(new miv(this, Arrays.copyOf(this.f33808f, read)));
            } catch (IOException e) {
                if (!Thread.currentThread().isInterrupted()) {
                    f33803c.mo25418e("IoException in ConduitRunnable (Expected when the other side closes first): %s", e.getMessage());
                    f33803c.mo25408a("IoException in ConduitRunnable", e, new Object[0]);
                    this.f33807e.execute(new miw(this, e));
                    inputStream = this.f33806d;
                } else {
                    f33803c.logVerbose("Interrupted, shutting down", new Object[0]);
                    inputStream = this.f33806d;
                }
            } catch (Throwable th) {
                srz.m36171a((Closeable) this.f33806d);
                throw th;
            }
        } while (!Thread.currentThread().isInterrupted());
        inputStream = this.f33806d;
        srz.m36171a((Closeable) inputStream);
    }
}
