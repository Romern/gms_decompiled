package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Logger;

/* renamed from: ciio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciio extends ConcurrentLinkedQueue implements Executor {

    /* renamed from: a */
    public static final Logger f190415a = Logger.getLogger(ciio.class.getName());

    /* renamed from: b */
    public volatile Thread f190416b;

    /* renamed from: a */
    public static void m150388a() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    public final void execute(Runnable runnable) {
        add(runnable);
        LockSupport.unpark(this.f190416b);
    }
}
