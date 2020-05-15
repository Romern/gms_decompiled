package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: bqgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bqgf extends AtomicReference implements Runnable {

    /* renamed from: a */
    private static final Runnable f140617a = new bqge();

    /* renamed from: b */
    private static final Runnable f140618b = new bqge();

    /* renamed from: c */
    private static final Runnable f140619c = new bqge();

    /* renamed from: a */
    public abstract String mo69192a();

    /* renamed from: a */
    public abstract void mo69195a(Object obj, Throwable th);

    /* renamed from: b */
    public abstract Object mo69194b();

    /* renamed from: c */
    public abstract boolean mo69196c();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo69226e() {
        Runnable runnable = (Runnable) get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, f140618b)) {
            try {
                Thread thread = (Thread) runnable;
                thread.interrupt();
                if (((Runnable) getAndSet(f140617a)) == f140619c) {
                    LockSupport.unpark(thread);
                }
            } catch (Throwable th) {
                if (((Runnable) getAndSet(f140617a)) == f140619c) {
                    LockSupport.unpark((Thread) runnable);
                }
                throw th;
            }
        }
    }

    public final void run() {
        Object obj;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            boolean z = !mo69196c();
            if (z) {
                try {
                    obj = mo69194b();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f140617a)) {
                        Runnable runnable = (Runnable) get();
                        int i = 0;
                        boolean z2 = false;
                        while (true) {
                            if (runnable != f140618b && runnable != f140619c) {
                                break;
                            }
                            i++;
                            if (i <= 1000) {
                                Thread.yield();
                            } else {
                                Runnable runnable2 = f140619c;
                                if (runnable == runnable2 || compareAndSet(f140618b, runnable2)) {
                                    z2 = Thread.interrupted() ? true : z2;
                                    LockSupport.park(this);
                                }
                            }
                            runnable = (Runnable) get();
                        }
                        if (z2) {
                            currentThread.interrupt();
                        }
                    }
                    mo69195a(null, th);
                    return;
                }
            } else {
                obj = null;
            }
            if (!compareAndSet(currentThread, f140617a)) {
                Runnable runnable3 = (Runnable) get();
                int i2 = 0;
                boolean z3 = false;
                while (true) {
                    if (runnable3 != f140618b && runnable3 != f140619c) {
                        break;
                    }
                    i2++;
                    if (i2 <= 1000) {
                        Thread.yield();
                    } else {
                        Runnable runnable4 = f140619c;
                        if (runnable3 == runnable4 || compareAndSet(f140618b, runnable4)) {
                            z3 = Thread.interrupted() ? true : z3;
                            LockSupport.park(this);
                        }
                    }
                    runnable3 = (Runnable) get();
                }
                if (z3) {
                    currentThread.interrupt();
                }
            }
            if (z) {
                mo69195a(obj, null);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f140617a) {
            str = "running=[DONE]";
        } else if (runnable == f140618b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String a = mo69192a();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(a).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(a);
        return sb2.toString();
    }
}
