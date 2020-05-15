package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: bdhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdhx implements bqgk {

    /* renamed from: a */
    public final bdhl f105679a;

    /* renamed from: b */
    private final bqgk f105680b;

    public bdhx(bqgk bqgk, bdhl bdhl) {
        bmxy.m108581a(bqgk);
        this.f105680b = bqgk;
        bmxy.m108581a(bdhl);
        this.f105679a = bdhl;
    }

    /* renamed from: a */
    private final List m90830a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m90831a((Callable) it.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    private final Runnable m90832b(Runnable runnable) {
        return new bdhv(this, runnable);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f105680b.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f105680b.execute(m90832b(runnable));
    }

    public final List invokeAll(Collection collection) {
        return this.f105680b.invokeAll(m90830a(collection));
    }

    public final Object invokeAny(Collection collection) {
        return this.f105680b.invokeAny(m90830a(collection));
    }

    public final boolean isShutdown() {
        return this.f105680b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f105680b.isTerminated();
    }

    public final void shutdown() {
        this.f105680b.shutdown();
    }

    public final List shutdownNow() {
        return this.f105680b.shutdownNow();
    }

    /* renamed from: a */
    private final Callable m90831a(Callable callable) {
        return new bdhw(this, callable);
    }

    /* renamed from: b */
    public final bqgg submit(Callable callable) {
        return this.f105680b.mo25819b(m90831a(callable));
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f105680b.invokeAll(m90830a(collection), j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f105680b.invokeAny(m90830a(collection), j, timeUnit);
    }

    /* renamed from: a */
    public final bqgg submit(Runnable runnable) {
        return this.f105680b.mo25812a(m90832b(runnable));
    }

    /* renamed from: b */
    public final bqgi scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f105680b.mo25820b(m90832b(runnable), j, j2, timeUnit);
    }

    /* renamed from: a */
    public final bqgg submit(Runnable runnable, Object obj) {
        return this.f105680b.mo25813a(m90832b(runnable), obj);
    }

    /* renamed from: a */
    public final bqgi scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f105680b.mo25769a(m90832b(runnable), j, j2, timeUnit);
    }

    /* renamed from: a */
    public final bqgi schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f105680b.mo25814a(m90832b(runnable), j, timeUnit);
    }

    /* renamed from: a */
    public final bqgi schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.f105680b.mo25815a(m90831a(callable), j, timeUnit);
    }
}
