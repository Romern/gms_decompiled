package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;

/* renamed from: bqeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqeq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Closeable f140553a;

    public bqeq(Closeable closeable) {
        this.f140553a = closeable;
    }

    public final void run() {
        try {
            this.f140553a.close();
        } catch (IOException | RuntimeException e) {
            bqeu.f140563a.logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture$9", "run", "thrown by Closeable.close()", e);
        }
    }
}
