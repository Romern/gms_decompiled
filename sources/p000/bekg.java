package p000;

import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: bekg */
final /* synthetic */ class bekg implements Callable {

    /* renamed from: a */
    private final Closeable f111702a;

    /* renamed from: b */
    private final bqgg f111703b;

    public bekg(Closeable closeable, bqgg bqgg) {
        this.f111702a = closeable;
        this.f111703b = bqgg;
    }

    public final Object call() {
        Closeable closeable = this.f111702a;
        bqgg bqgg = this.f111703b;
        closeable.close();
        return bqga.m112780a((Future) bqgg);
    }
}
