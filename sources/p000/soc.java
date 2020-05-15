package p000;

import com.google.android.gms.common.threads.internal.GlobalExecutorsImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: soc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class soc extends ThreadPoolExecutor implements bqgj {

    /* renamed from: a */
    public final Executor f44843a;

    /* renamed from: b */
    public final Set f44844b = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: c */
    public final BlockingQueue f44845c = getQueue();

    /* renamed from: d */
    public final ReentrantLock f44846d;

    /* renamed from: e */
    public final Condition f44847e;

    /* renamed from: f */
    public int f44848f;

    /* renamed from: g */
    public final AtomicInteger f44849g;

    /* renamed from: h */
    public int f44850h;

    /* renamed from: i */
    public boolean f44851i;

    /* renamed from: j */
    private int f44852j;

    /* renamed from: k */
    private boolean f44853k;

    public soc(int i, int i2) {
        super(i, i, 0, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f44846d = reentrantLock;
        this.f44847e = reentrantLock.newCondition();
        this.f44848f = 0;
        this.f44852j = 0;
        this.f44849g = new AtomicInteger();
        this.f44850h = 0;
        this.f44843a = GlobalExecutorsImpl.getPool(i2);
    }

    /* renamed from: a */
    protected static final sog m35730a(Callable callable) {
        return new sog(callable, snc.m35689a());
    }

    /* renamed from: c */
    private final void m35734c(Runnable runnable) {
        getRejectedExecutionHandler().rejectedExecution(runnable, this);
    }

    public final void allowCoreThreadTimeOut(boolean z) {
        throw new UnsupportedOperationException();
    }

    public final boolean allowsCoreThreadTimeOut() {
        Executor executor = this.f44843a;
        if (executor instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) executor).allowsCoreThreadTimeOut();
        }
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: finally extract failed */
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        this.f44846d.lock();
        while (true) {
            try {
                if (this.f44853k) {
                    if (this.f44848f == 0) {
                        this.f44846d.unlock();
                        return true;
                    }
                }
                if (nanos > 0) {
                    nanos = this.f44847e.awaitNanos(nanos);
                } else {
                    this.f44846d.unlock();
                    return false;
                }
            } catch (Throwable th) {
                this.f44846d.unlock();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final bqgg submit(Callable callable) {
        return (bqgg) super.submit(callable);
    }

    public final void execute(Runnable runnable) {
        sdo.m34959a(runnable);
        m35731a(runnable, !(runnable instanceof snb) ? snc.m35689a() : null);
    }

    public final int getActiveCount() {
        this.f44846d.lock();
        try {
            return this.f44844b.size();
        } finally {
            this.f44846d.unlock();
        }
    }

    public final long getCompletedTaskCount() {
        return (long) this.f44849g.get();
    }

    public final long getKeepAliveTime(TimeUnit timeUnit) {
        Executor executor = this.f44843a;
        if (executor instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) executor).getKeepAliveTime(timeUnit);
        }
        throw new UnsupportedOperationException();
    }

    public final int getLargestPoolSize() {
        this.f44846d.lock();
        try {
            return this.f44850h;
        } finally {
            this.f44846d.unlock();
        }
    }

    public final int getPoolSize() {
        return getActiveCount();
    }

    /* JADX INFO: finally extract failed */
    public final long getTaskCount() {
        this.f44846d.lock();
        try {
            int i = this.f44852j;
            this.f44846d.unlock();
            return (long) i;
        } catch (Throwable th) {
            this.f44846d.unlock();
            throw th;
        }
    }

    public final ThreadFactory getThreadFactory() {
        Executor executor = this.f44843a;
        if (executor instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) executor).getThreadFactory();
        }
        throw new UnsupportedOperationException();
    }

    public final boolean isShutdown() {
        this.f44846d.lock();
        try {
            return this.f44853k;
        } finally {
            this.f44846d.unlock();
        }
    }

    public final boolean isTerminated() {
        this.f44846d.lock();
        try {
            boolean z = false;
            if (this.f44853k && this.f44848f == 0) {
                z = true;
            }
            return z;
        } finally {
            this.f44846d.unlock();
        }
    }

    public final boolean isTerminating() {
        this.f44846d.lock();
        try {
            boolean z = false;
            if (this.f44853k && this.f44848f != 0) {
                z = true;
            }
            return z;
        } finally {
            this.f44846d.unlock();
        }
    }

    public final int prestartAllCoreThreads() {
        int i = 0;
        while (prestartCoreThread()) {
            i++;
        }
        return i;
    }

    public final boolean prestartCoreThread() {
        ReentrantLock reentrantLock;
        this.f44846d.lock();
        try {
            if (this.f44848f >= getCorePoolSize()) {
                reentrantLock = this.f44846d;
            } else if (!this.f44845c.isEmpty()) {
                this.f44848f++;
                this.f44843a.execute(new sob(this, (Runnable) this.f44845c.poll(), null));
                return true;
            } else {
                reentrantLock = this.f44846d;
            }
            reentrantLock.unlock();
            return false;
        } finally {
            this.f44846d.unlock();
        }
    }

    public final boolean remove(Runnable runnable) {
        return this.f44845c.remove(runnable) || this.f44845c.remove(new smz(runnable, null));
    }

    public final void setCorePoolSize(int i) {
        throw new UnsupportedOperationException();
    }

    public final void setKeepAliveTime(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void setThreadFactory(ThreadFactory threadFactory) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: finally extract failed */
    public final void shutdown() {
        this.f44846d.lock();
        try {
            this.f44853k = true;
            this.f44846d.unlock();
            terminated();
        } catch (Throwable th) {
            this.f44846d.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final List shutdownNow() {
        this.f44846d.lock();
        try {
            this.f44853k = true;
            this.f44851i = true;
            ArrayList arrayList = new ArrayList(this.f44845c.size());
            this.f44845c.drainTo(arrayList);
            for (Thread thread : this.f44844b) {
                thread.interrupt();
            }
            this.f44846d.unlock();
            terminated();
            return arrayList;
        } catch (Throwable th) {
            this.f44846d.unlock();
            throw th;
        }
    }

    public final String toString() {
        String str;
        long taskCount = getTaskCount();
        long completedTaskCount = getCompletedTaskCount();
        int activeCount = getActiveCount();
        int largestPoolSize = getLargestPoolSize();
        int maximumPoolSize = getMaximumPoolSize();
        if (!isShutdown()) {
            str = " !";
        } else {
            str = " ";
        }
        String str2 = !isTerminated() ? "!" : "";
        StringBuilder sb = new StringBuilder(str.length() + 243 + str2.length());
        sb.append("PooledThreadPoolExecutor[getTaskCount() = ");
        sb.append(taskCount);
        sb.append(", getCompletedTaskCount() = ");
        sb.append(completedTaskCount);
        sb.append(", getActiveCount() = ");
        sb.append(activeCount);
        sb.append(", getLargestPoolSize() = ");
        sb.append(largestPoolSize);
        sb.append(", getMaximumPoolSize() = ");
        sb.append(maximumPoolSize);
        sb.append(str);
        sb.append("isShutDown(), ");
        sb.append(str2);
        sb.append("isTerminated()]");
        return sb.toString();
    }

    /* renamed from: a */
    private final void m35731a(Runnable runnable, bliy bliy) {
        ReentrantLock reentrantLock;
        Runnable runnable2;
        this.f44846d.lock();
        try {
            if (!this.f44853k) {
                this.f44852j++;
                int maximumPoolSize = getMaximumPoolSize();
                int i = this.f44848f;
                if (i < maximumPoolSize) {
                    this.f44848f = i + 1;
                    this.f44843a.execute(new sob(this, runnable, bliy));
                    reentrantLock = this.f44846d;
                } else {
                    BlockingQueue blockingQueue = this.f44845c;
                    if (bliy != null) {
                        runnable2 = new smz(runnable, bliy);
                    } else {
                        runnable2 = runnable;
                    }
                    if (!blockingQueue.offer(runnable2)) {
                        this.f44852j--;
                        m35734c(runnable);
                        reentrantLock = this.f44846d;
                    } else {
                        reentrantLock = this.f44846d;
                    }
                }
            } else {
                m35734c(runnable);
                reentrantLock = this.f44846d;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.f44846d.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo25848b(Runnable runnable) {
        m35731a(runnable, (bliy) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return m35730a(Executors.callable(runnable, obj));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Callable callable) {
        return m35730a(callable);
    }

    public soc(int i, BlockingQueue blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
        super(1, 1, 0, TimeUnit.NANOSECONDS, blockingQueue, rejectedExecutionHandler);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f44846d = reentrantLock;
        this.f44847e = reentrantLock.newCondition();
        this.f44848f = 0;
        this.f44852j = 0;
        this.f44849g = new AtomicInteger();
        this.f44850h = 0;
        this.f44843a = GlobalExecutorsImpl.getPool(i);
    }

    /* renamed from: a */
    public final bqgg submit(Runnable runnable) {
        return (bqgg) super.submit(runnable);
    }

    /* renamed from: a */
    public final bqgg submit(Runnable runnable, Object obj) {
        return (bqgg) super.submit(runnable, obj);
    }
}
