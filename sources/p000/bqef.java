package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bqef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bqef extends bqdp {

    /* renamed from: a */
    private static final Logger f140543a = Logger.getLogger(bqef.class.getName());

    /* renamed from: b */
    public static final bqec f140544b;
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    static {
        Throwable th;
        bqec bqec;
        try {
            bqec = new bqed(AtomicReferenceFieldUpdater.newUpdater(bqef.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(bqef.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            bqec = new bqee();
            th = th2;
        }
        f140544b = bqec;
        if (th != null) {
            f140543a.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public bqef(int i) {
        this.remaining = i;
    }

    /* renamed from: a */
    public abstract void mo69158a(Set set);
}
