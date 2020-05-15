package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: ahhe */
final /* synthetic */ class ahhe implements Callable {

    /* renamed from: a */
    private final bqgg f67207a;

    /* renamed from: b */
    private final long f67208b;

    public ahhe(bqgg bqgg, long j) {
        this.f67207a = bqgg;
        this.f67208b = j;
    }

    public final Object call() {
        return this.f67207a.get(this.f67208b, TimeUnit.MILLISECONDS);
    }
}
