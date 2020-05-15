package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: cmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cmv implements Lock {
    public final void lock() {
    }

    public final void lockInterruptibly() {
    }

    public final Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }

    public final boolean tryLock() {
        return true;
    }

    public final boolean tryLock(long j, TimeUnit timeUnit) {
        return true;
    }

    public final void unlock() {
    }
}
