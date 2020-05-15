package p000;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bqdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bqdt extends bqhj implements bqgg {

    /* renamed from: a */
    private static final Logger f140523a = Logger.getLogger(bqdt.class.getName());

    /* renamed from: b */
    private static final Object f140524b = new Object();

    /* renamed from: j */
    public static final boolean f140525j;

    /* renamed from: k */
    public static final bqdg f140526k;
    public volatile bqdk listeners;
    public volatile Object value;
    public volatile bqds waiters;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        bqdg bqdg;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException e) {
            z = false;
        }
        f140525j = z;
        try {
            bqdg = new bqdr();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            th2 = th;
            bqdg = new bqdn();
        }
        f140526k = bqdg;
        if (th != null) {
            f140523a.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            f140523a.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected bqdt() {
    }

    /* renamed from: a */
    public static Object m112647a(bqgg bqgg) {
        Throwable f;
        if (bqgg instanceof bqdo) {
            Object obj = ((bqdt) bqgg).value;
            if (!(obj instanceof bqdh)) {
                return obj;
            }
            bqdh bqdh = (bqdh) obj;
            if (!bqdh.f140502c) {
                return obj;
            }
            Throwable th = bqdh.f140503d;
            return th != null ? new bqdh(false, th) : bqdh.f140501b;
        } else if ((bqgg instanceof bqhj) && (f = ((bqhj) bqgg).mo69141f()) != null) {
            return new bqdj(f);
        } else {
            boolean isCancelled = bqgg.isCancelled();
            if ((!f140525j) && isCancelled) {
                return bqdh.f140501b;
            }
            try {
                Object b = m112653b((Future) bqgg);
                if (!isCancelled) {
                    return b == null ? f140524b : b;
                }
                String valueOf = String.valueOf(bqgg);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new bqdh(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e) {
                if (!isCancelled) {
                    return new bqdj(e.getCause());
                }
                String valueOf2 = String.valueOf(bqgg);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf2);
                return new bqdh(false, new IllegalArgumentException(sb2.toString(), e));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new bqdh(false, e2);
                }
                String valueOf3 = String.valueOf(bqgg);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf3);
                return new bqdj(new IllegalArgumentException(sb3.toString(), e2));
            } catch (Throwable th2) {
                return new bqdj(th2);
            }
        }
    }

    /* renamed from: b */
    private static Object m112653b(Future future) {
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

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public void mo19850bc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: bi */
    public String mo60815bi() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public boolean cancel(boolean z) {
        boolean z2;
        bqdh bqdh;
        Object obj = this.value;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !(obj instanceof bqdm)) {
            return false;
        }
        if (f140525j) {
            bqdh = new bqdh(z, new CancellationException("Future.cancel() was called."));
        } else {
            bqdh = !z ? bqdh.f140501b : bqdh.f140500a;
        }
        boolean z3 = false;
        bqdt bqdt = this;
        while (true) {
            if (f140526k.mo69130a(bqdt, obj, bqdh)) {
                if (z) {
                    bqdt.mo69139d();
                }
                m112650a(bqdt);
                if (!(obj instanceof bqdm)) {
                    break;
                }
                bqgg bqgg = ((bqdm) obj).f140515b;
                if (!(bqgg instanceof bqdo)) {
                    bqgg.cancel(z);
                    break;
                }
                bqdt = (bqdt) bqgg;
                obj = bqdt.value;
                if (!(obj == null) && !(obj instanceof bqdm)) {
                    return true;
                }
                z3 = true;
            } else {
                obj = bqdt.value;
                if (!(obj instanceof bqdm)) {
                    return z3;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo69139d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo69140e() {
        Object obj = this.value;
        return (obj instanceof bqdh) && ((bqdh) obj).f140502c;
    }

    /* renamed from: f */
    public final Throwable mo69141f() {
        if (!(this instanceof bqdo)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof bqdj) {
            return ((bqdj) obj).f140505b;
        }
        return null;
    }

    public Object get() {
        Object obj;
        boolean z;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof bqdm))) {
                return mo69124a(obj2);
            }
            bqds bqds = this.waiters;
            if (bqds != bqds.f140522a) {
                bqds bqds2 = new bqds();
                do {
                    bqds2.mo69134a(bqds);
                    if (f140526k.mo69129a(this, bqds, bqds2)) {
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
                                m112649a(bqds2);
                                throw new InterruptedException();
                            }
                        } while (!(z & (!(obj instanceof bqdm))));
                        return mo69124a(obj);
                    }
                    bqds = this.waiters;
                } while (bqds != bqds.f140522a);
            }
            return mo69124a(this.value);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.value instanceof bqdh;
    }

    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof bqdm)) & (obj != null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m112655b(sb);
        } else {
            m112651a(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.RuntimeException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: b */
    private static void m112654b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f140523a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e);
        }
    }

    /* renamed from: b */
    private final void m112655b(StringBuilder sb) {
        try {
            Object b = m112653b((Future) this);
            sb.append("SUCCESS, result=[");
            m112652a(sb, b);
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

    /* renamed from: b */
    public final void mo69137b(bqgg bqgg) {
        bqdm bqdm;
        bqdj bqdj;
        bmxy.m108581a(bqgg);
        Object obj = this.value;
        if (obj == null) {
            if (bqgg.isDone()) {
                if (f140526k.mo69130a(this, (Object) null, m112647a(bqgg))) {
                    m112650a(this);
                    return;
                }
                return;
            }
            bqdm = new bqdm(this, bqgg);
            if (!f140526k.mo69130a(this, (Object) null, bqdm)) {
                obj = this.value;
            } else {
                try {
                    bqgg.mo741a(bqdm, bqfb.INSTANCE);
                    return;
                } catch (Throwable th) {
                    bqdj = bqdj.f140504a;
                }
            }
        }
        if (obj instanceof bqdh) {
            bqgg.cancel(((bqdh) obj).f140502c);
            return;
        }
        return;
        f140526k.mo69130a(this, bqdm, bqdj);
    }

    public Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z2 = true;
            if ((obj != null) && (!(obj instanceof bqdm))) {
                return mo69124a(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                bqds bqds = this.waiters;
                if (bqds != bqds.f140522a) {
                    bqds bqds2 = new bqds();
                    do {
                        bqds2.mo69134a(bqds);
                        if (!f140526k.mo69129a(this, bqds, bqds2)) {
                            bqds = this.waiters;
                        } else {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof bqdm))) {
                                        return mo69124a(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m112649a(bqds2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m112649a(bqds2);
                        }
                    } while (bqds != bqds.f140522a);
                }
                return mo69124a(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if (obj3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (!(obj3 instanceof bqdm))) {
                    return mo69124a(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String bqdt = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z2 = false;
                }
                if (convert > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z2) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z2) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(bqdt).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(bqdt);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    /* renamed from: a */
    private static final Object mo69124a(Object obj) {
        if (obj instanceof bqdh) {
            Throwable th = ((bqdh) obj).f140503d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof bqdj) {
            throw new ExecutionException(((bqdj) obj).f140505b);
        } else if (obj == f140524b) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: b */
    public final boolean mo69138b(Object obj) {
        if (obj == null) {
            obj = f140524b;
        }
        if (!f140526k.mo69130a(this, (Object) null, obj)) {
            return false;
        }
        m112650a(this);
        return true;
    }

    /* renamed from: a */
    private final void m112649a(bqds bqds) {
        bqds.thread = null;
        while (true) {
            bqds bqds2 = this.waiters;
            if (bqds2 != bqds.f140522a) {
                bqds bqds3 = null;
                while (bqds2 != null) {
                    bqds bqds4 = bqds2.next;
                    if (bqds2.thread != null) {
                        bqds3 = bqds2;
                    } else if (bqds3 != null) {
                        bqds3.next = bqds4;
                        if (bqds3.thread == null) {
                        }
                    } else if (!f140526k.mo69129a(this, bqds2, bqds4)) {
                    }
                    bqds2 = bqds4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: a */
    public static void m112650a(bqdt bqdt) {
        bqdk bqdk;
        bqdk bqdk2 = null;
        while (true) {
            bqds bqds = bqdt.waiters;
            if (f140526k.mo69129a(bqdt, bqds, bqds.f140522a)) {
                while (bqds != null) {
                    Thread thread = bqds.thread;
                    if (thread != null) {
                        bqds.thread = null;
                        LockSupport.unpark(thread);
                    }
                    bqds = bqds.next;
                }
                bqdt.mo19850bc();
                do {
                    bqdk = bqdt.listeners;
                } while (!f140526k.mo69128a(bqdt, bqdk, bqdk.f140506a));
                bqdk bqdk3 = bqdk2;
                bqdk bqdk4 = bqdk;
                while (bqdk4 != null) {
                    bqdk bqdk5 = bqdk4.next;
                    bqdk4.next = bqdk3;
                    bqdk3 = bqdk4;
                    bqdk4 = bqdk5;
                }
                while (bqdk3 != null) {
                    bqdk2 = bqdk3.next;
                    Runnable runnable = bqdk3.f140507b;
                    if (runnable instanceof bqdm) {
                        bqdm bqdm = (bqdm) runnable;
                        bqdt = bqdm.f140514a;
                        if (bqdt.value == bqdm) {
                            if (f140526k.mo69130a(bqdt, bqdm, m112647a(bqdm.f140515b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m112654b(runnable, bqdk3.f140508c);
                    }
                    bqdk3 = bqdk2;
                }
                return;
            }
        }
    }

    /* renamed from: a */
    private final void m112651a(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof bqdm) {
            sb.append(", setFuture=[");
            m112652a(sb, ((bqdm) obj).f140515b);
            sb.append("]");
        } else {
            try {
                str = bmxx.m108579c(mo60815bi());
            } catch (RuntimeException | StackOverflowError e) {
                String valueOf = String.valueOf(e.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(valueOf);
                str = sb2.toString();
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m112655b(sb);
        }
    }

    /* renamed from: a */
    private final void m112652a(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    /* renamed from: a */
    public void mo741a(Runnable runnable, Executor executor) {
        bqdk bqdk;
        bmxy.m108582a(runnable, "Runnable was null.");
        bmxy.m108582a(executor, "Executor was null.");
        if (isDone() || (bqdk = this.listeners) == bqdk.f140506a) {
            m112654b(runnable, executor);
        }
        bqdk bqdk2 = new bqdk(runnable, executor);
        do {
            bqdk2.next = bqdk;
            if (!f140526k.mo69128a(this, bqdk, bqdk2)) {
                bqdk = this.listeners;
            } else {
                return;
            }
        } while (bqdk != bqdk.f140506a);
        m112654b(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69135a(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(mo69140e());
        }
    }

    /* renamed from: a */
    public final boolean mo69136a(Throwable th) {
        bmxy.m108581a(th);
        if (!f140526k.mo69130a(this, (Object) null, new bqdj(th))) {
            return false;
        }
        m112650a(this);
        return true;
    }
}
