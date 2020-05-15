package p000;

import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: beji */
final /* synthetic */ class beji implements Callable {

    /* renamed from: a */
    private final Closeable f111646a;

    /* renamed from: b */
    private final bqgg f111647b;

    public beji(Closeable closeable, bqgg bqgg) {
        this.f111646a = closeable;
        this.f111647b = bqgg;
    }

    public final Object call() {
        Closeable closeable = this.f111646a;
        bqgg bqgg = this.f111647b;
        closeable.close();
        return bqga.m112780a((Future) bqgg);
    }
}
