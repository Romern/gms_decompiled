package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: my */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1205my implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f26706a;

    /* renamed from: b */
    final /* synthetic */ Callable f26707b;

    /* renamed from: c */
    final /* synthetic */ ReentrantLock f26708c;

    /* renamed from: d */
    final /* synthetic */ AtomicBoolean f26709d;

    /* renamed from: e */
    final /* synthetic */ Condition f26710e;

    public C1205my(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.f26706a = atomicReference;
        this.f26707b = callable;
        this.f26708c = reentrantLock;
        this.f26709d = atomicBoolean;
        this.f26710e = condition;
    }

    public final void run() {
        try {
            this.f26706a.set(((C1194mn) this.f26707b).call());
        } catch (Exception e) {
        }
        this.f26708c.lock();
        try {
            this.f26709d.set(false);
            this.f26710e.signal();
        } finally {
            this.f26708c.unlock();
        }
    }
}
