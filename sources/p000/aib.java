package p000;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aib implements bqgg {

    /* renamed from: a */
    static final boolean f581a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: b */
    static final ahs f582b;

    /* renamed from: c */
    private static final Logger f583c = Logger.getLogger(aib.class.getName());

    /* renamed from: d */
    private static final Object f584d = new Object();
    volatile ahw listeners;
    volatile Object value;
    volatile aia waiters;

    static {
        ahs ahs;
        try {
            ahs = new ahx(AtomicReferenceFieldUpdater.newUpdater(aia.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(aia.class, aia.class, "next"), AtomicReferenceFieldUpdater.newUpdater(aib.class, aia.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(aib.class, ahw.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(aib.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            ahs = new ahz();
        }
        f582b = ahs;
        if (th != null) {
            f583c.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    protected aib() {
    }

    /* renamed from: a */
    static Object m788a(bqgg bqgg) {
        if (bqgg instanceof aib) {
            Object obj = ((aib) bqgg).value;
            if (!(obj instanceof aht)) {
                return obj;
            }
            aht aht = (aht) obj;
            if (!aht.f566c) {
                return obj;
            }
            Throwable th = aht.f567d;
            return th != null ? new aht(false, th) : aht.f565b;
        }
        boolean isCancelled = bqgg.isCancelled();
        if ((!f581a) && isCancelled) {
            return aht.f565b;
        }
        try {
            Object a = m789a((Future) bqgg);
            return a == null ? f584d : a;
        } catch (ExecutionException e) {
            return new ahv(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new aht(false, e2);
            }
            return new ahv(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bqgg, e2));
        } catch (Throwable th2) {
            return new ahv(th2);
        }
    }

    /* renamed from: b */
    static void m793b(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    /* renamed from: c */
    private final String m795c(Object obj) {
        return obj != this ? String.valueOf(obj) : "this future";
    }

    /* renamed from: d */
    private static final Object m796d(Object obj) {
        if (obj instanceof aht) {
            Throwable th = ((aht) obj).f567d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof ahv) {
            throw new ExecutionException(((ahv) obj).f569b);
        } else if (obj == f584d) {
            return null;
        } else {
            return obj;
        }
    }

    public final boolean cancel(boolean z) {
        boolean z2;
        aht aht;
        Object obj = this.value;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !(obj instanceof ahy)) {
            return false;
        }
        if (f581a) {
            aht = new aht(z, new CancellationException("Future.cancel() was called."));
        } else {
            aht = !z ? aht.f565b : aht.f564a;
        }
        boolean z3 = false;
        aib aib = this;
        while (true) {
            if (f582b.mo736a(aib, obj, aht)) {
                m791a(aib);
                if (!(obj instanceof ahy)) {
                    break;
                }
                bqgg bqgg = ((ahy) obj).f579b;
                if (!(bqgg instanceof aib)) {
                    bqgg.cancel(z);
                    break;
                }
                aib = (aib) bqgg;
                obj = aib.value;
                if (!(obj == null) && !(obj instanceof ahy)) {
                    return true;
                }
                z3 = true;
            } else {
                obj = aib.value;
                if (!(obj instanceof ahy)) {
                    return z3;
                }
            }
        }
        return true;
    }

    public final Object get() {
        Object obj;
        boolean z;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof ahy))) {
                return m796d(obj2);
            }
            aia aia = this.waiters;
            if (aia != aia.f580a) {
                aia aia2 = new aia();
                do {
                    aia2.mo739a(aia);
                    if (f582b.mo735a(this, aia, aia2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                                if (obj != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                m790a(aia2);
                                throw new InterruptedException();
                            }
                        } while (!(z & (!(obj instanceof ahy))));
                        return m796d(obj);
                    }
                    aia = this.waiters;
                } while (aia != aia.f580a);
            }
            return m796d(this.value);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.value instanceof aht;
    }

    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof ahy)) & (obj != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m792a(sb);
        } else {
            try {
                str = mo740a();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m792a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.log(java.util.logging.Level, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.RuntimeException]
     candidates:
      ClspMth{java.util.logging.Logger.log(java.util.logging.Level, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.log(java.util.logging.Level, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.log(java.util.logging.Level, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.log(java.util.logging.Level, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: b */
    private static void m794b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f583c;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: a */
    static Object m789a(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z2 = true;
            if ((obj != null) && (!(obj instanceof ahy))) {
                return m796d(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                aia aia = this.waiters;
                if (aia != aia.f580a) {
                    aia aia2 = new aia();
                    do {
                        aia2.mo739a(aia);
                        if (!f582b.mo735a(this, aia, aia2)) {
                            aia = this.waiters;
                        } else {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof ahy))) {
                                        return m796d(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m790a(aia2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m790a(aia2);
                        }
                    } while (aia != aia.f580a);
                }
                return m796d(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if (obj3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (!(obj3 instanceof ahy))) {
                    return m796d(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aib = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z2 = false;
                }
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z2) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z2) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aib);
        }
        throw new InterruptedException();
    }

    /* renamed from: a */
    private final void m790a(aia aia) {
        aia.thread = null;
        while (true) {
            aia aia2 = this.waiters;
            if (aia2 != aia.f580a) {
                aia aia3 = null;
                while (aia2 != null) {
                    aia aia4 = aia2.next;
                    if (aia2.thread != null) {
                        aia3 = aia2;
                    } else if (aia3 != null) {
                        aia3.next = aia4;
                        if (aia3.thread == null) {
                        }
                    } else if (!f582b.mo735a(this, aia2, aia4)) {
                    }
                    aia2 = aia4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: a */
    static void m791a(aib aib) {
        ahw ahw;
        ahw ahw2 = null;
        while (true) {
            aia aia = aib.waiters;
            if (f582b.mo735a(aib, aia, aia.f580a)) {
                while (aia != null) {
                    Thread thread = aia.thread;
                    if (thread != null) {
                        aia.thread = null;
                        LockSupport.unpark(thread);
                    }
                    aia = aia.next;
                }
                do {
                    ahw = aib.listeners;
                } while (!f582b.mo734a(aib, ahw, ahw.f570a));
                ahw ahw3 = ahw2;
                ahw ahw4 = ahw;
                while (ahw4 != null) {
                    ahw ahw5 = ahw4.next;
                    ahw4.next = ahw3;
                    ahw3 = ahw4;
                    ahw4 = ahw5;
                }
                while (ahw3 != null) {
                    ahw2 = ahw3.next;
                    Runnable runnable = ahw3.f571b;
                    if (runnable instanceof ahy) {
                        ahy ahy = (ahy) runnable;
                        aib = ahy.f578a;
                        if (aib.value == ahy) {
                            if (f582b.mo736a(aib, ahy, m788a(ahy.f579b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m794b(runnable, ahw3.f572c);
                    }
                    ahw3 = ahw2;
                }
                return;
            }
        }
    }

    /* renamed from: a */
    private final void m792a(StringBuilder sb) {
        try {
            Object a = m789a((Future) this);
            sb.append("SUCCESS, result=[");
            sb.append(m795c(a));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException e2) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo740a() {
        Object obj = this.value;
        if (obj instanceof ahy) {
            return "setFuture=[" + m795c(((ahy) obj).f579b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* renamed from: a */
    public final void mo741a(Runnable runnable, Executor executor) {
        m793b(runnable);
        m793b(executor);
        ahw ahw = this.listeners;
        if (ahw != ahw.f570a) {
            ahw ahw2 = new ahw(runnable, executor);
            do {
                ahw2.next = ahw;
                if (!f582b.mo734a(this, ahw, ahw2)) {
                    ahw = this.listeners;
                } else {
                    return;
                }
            } while (ahw != ahw.f570a);
        }
        m794b(runnable, executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo742a(Object obj) {
        if (obj == null) {
            obj = f584d;
        }
        if (!f582b.mo736a(this, (Object) null, obj)) {
            return false;
        }
        m791a(this);
        return true;
    }
}
