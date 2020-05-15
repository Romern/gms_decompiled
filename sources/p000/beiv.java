package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: beiv */
final /* synthetic */ class beiv implements bmxj {

    /* renamed from: a */
    private final AtomicBoolean f111608a;

    public beiv(AtomicBoolean atomicBoolean) {
        this.f111608a = atomicBoolean;
    }

    public final Object apply(Object obj) {
        AtomicBoolean atomicBoolean = this.f111608a;
        TimeoutException timeoutException = (TimeoutException) obj;
        TimeUnit timeUnit = beja.f111626a;
        atomicBoolean.set(false);
        return null;
    }
}
