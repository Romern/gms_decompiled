package p000;

import android.os.Looper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: snj */
final /* synthetic */ class snj implements Runnable {

    /* renamed from: a */
    private final bqgg f44796a;

    public snj(bqgg bqgg) {
        this.f44796a = bqgg;
    }

    public final void run() {
        bqgg bqgg = this.f44796a;
        if (!bqgg.isCancelled()) {
            try {
                bqga.m112780a((Future) bqgg);
            } catch (ExecutionException e) {
                new adzt(Looper.getMainLooper()).post(new snk(e, Thread.currentThread().getName()));
            }
        }
    }
}
