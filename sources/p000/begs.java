package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;

/* renamed from: begs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class begs {

    /* renamed from: a */
    private final ConcurrentMap f111549a;

    @Deprecated
    public begs() {
        this(new ConcurrentHashMap());
    }

    /* renamed from: a */
    public final Semaphore mo60704a(String str) {
        Semaphore semaphore = (Semaphore) this.f111549a.get(str);
        if (semaphore != null) {
            return semaphore;
        }
        this.f111549a.putIfAbsent(str, new Semaphore(1));
        return (Semaphore) this.f111549a.get(str);
    }

    /* renamed from: a */
    public final boolean mo60705a() {
        return this.f111549a != null;
    }

    public begs(ConcurrentMap concurrentMap) {
        this.f111549a = concurrentMap;
    }
}
